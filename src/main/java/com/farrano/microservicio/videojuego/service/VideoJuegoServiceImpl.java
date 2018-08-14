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
    public VideoJuego crearVideoJuego(VideoJuego videoJuego){

        return videoJuegoRepository.insert(videoJuego);
    }

    @Override
    public VideoJuego obtenerVideoJuego(int idVideoJuego) {

        return videoJuegoRepository.findById(idVideoJuego);
    }

    @Override
    public VideoJuego actualizarVideoJuego(VideoJuego videoJuego) {

        return videoJuegoRepository.save(videoJuego);
    }

    @Override
    public Void eliminarVideoJuego(int idVideoJuego) {

        videoJuegoRepository.deleteById(idVideoJuego);

        return null;
    }
}
