package com.farrano.microservicio.videojuego.service;

import com.farrano.microservicio.videojuego.model.VideoJuego;

public interface VideoJuegoService {

    Boolean crearVideoJuego(VideoJuego videoJuego);

    VideoJuego obtenerVideoJuego(int idVideoJuego);

    VideoJuego actualizarVideoJuego(VideoJuego videoJuego);

    Boolean eliminarVideoJuego(int idVideoJuego);
}
