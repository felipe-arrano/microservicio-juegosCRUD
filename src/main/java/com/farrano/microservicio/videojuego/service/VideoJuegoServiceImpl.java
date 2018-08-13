package com.farrano.microservicio.videojuego.service;

import com.farrano.microservicio.videojuego.model.VideoJuego;
import com.farrano.microservicio.videojuego.repository.VideoJuegoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideoJuegoServiceImpl implements VideoJuegoService {

    @Autowired
    private VideoJuegoRepository videoJuegoRepository;

    @Override
    public Boolean crearVideoJuego(VideoJuego videoJuego){

        return videoJuegoRepository.insert();
    }

    @Override
    public VideoJuego obtenerVideoJuego(int idVideoJuego) {

        return null;
    }

    @Override
    public VideoJuego actualizarVideoJuego(VideoJuego videoJuego) {

        return null;
    }

    @Override
    public Boolean eliminarVideoJuego(int idVideoJuego) {

        return null;
    }
}
