package com.farrano.microservicio.videojuego.service;

import com.farrano.microservicio.videojuego.model.VideoJuego;

public interface VideoJuegoService {

    VideoJuego crearVideoJuego(VideoJuego videoJuego);

    VideoJuego obtenerVideoJuego(int idVideoJuego);

    VideoJuego actualizarVideoJuego(VideoJuego videoJuego);

    Void eliminarVideoJuego(int idVideoJuego);
}
