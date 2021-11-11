package com.eventosapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.eventapp.eventapp.models.Evento;

public interface EventoRepository extends CrudRepository<Evento, String> {

}
