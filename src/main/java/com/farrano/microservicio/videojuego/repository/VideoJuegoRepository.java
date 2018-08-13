package com.farrano.microservicio.videojuego.repository;

import com.farrano.microservicio.videojuego.model.VideoJuego;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoJuegoRepository extends MongoRepository<VideoJuego, String> {


}
