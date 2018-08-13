package com.farrano.microservicio.videojuego.controller;

import com.farrano.microservicio.videojuego.model.VideoJuego;
import com.farrano.microservicio.videojuego.service.VideoJuegoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/video-juego")
public class VideoJuegoController {

    @Autowired
    private VideoJuegoService videoJuegoService;

    @PostMapping
    public ResponseEntity<Boolean> crearVideoJuego(@RequestBody VideoJuego videoJuego){
        System.out.println("-> crearVideoJuego");

        return ResponseEntity.ok(videoJuegoService.crearVideoJuego(videoJuego));
    }

    @GetMapping(value = "/idVideoJuego")
    public ResponseEntity<VideoJuego> obtenerVideoJuego(@PathVariable("id") int idVideoJuego){
        System.out.println("-> obtenerVideoJuego");

        return ResponseEntity.ok(videoJuegoService.obtenerVideoJuego(idVideoJuego));
    }

    @PutMapping
    public  ResponseEntity<VideoJuego> actualizarVideoJuego(@RequestBody VideoJuego videoJuego){
        System.out.println("-> actualizarVideoJuego");

        return ResponseEntity.ok(videoJuegoService.actualizarVideoJuego(videoJuego));
    }

    @DeleteMapping(params = {"idVideoJuego"})
    public ResponseEntity<Boolean> eliminarVideoJuego(@RequestParam("idVideoJuego") int idVideoJuego){
        System.out.println("-> eliminarVideoJuego");

        return ResponseEntity.ok(videoJuegoService.eliminarVideoJuego(idVideoJuego));
    }

}
