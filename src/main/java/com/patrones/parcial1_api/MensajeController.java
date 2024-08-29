package com.patrones.parcial1_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MensajeController {

    @Autowired
    private MensajeRepository mensajeRepository;

    @CrossOrigin(origins = {"http://24.199.65.203:3000", "*"})
    @GetMapping("/mensajes")
    public List<Mensaje> getAllMensajes(){
        return mensajeRepository.findAll();
    }

    @CrossOrigin(origins = {"http://24.199.65.203:3000", "*"})
    @PostMapping("/nuevo_mensaje")
    public Mensaje agregarMensaje(@RequestBody Mensaje mensaje){
        return mensajeRepository.save(mensaje);
    }

    @CrossOrigin(origins = {"http://24.199.65.203:3000", "*"})
    @DeleteMapping("/borrar")
    public void borrarMensajes() {
        mensajeRepository.deleteAll();
    }
}
