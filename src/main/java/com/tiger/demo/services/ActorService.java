package com.tiger.demo.services;

import com.tiger.demo.dtos.actor.ActorGetDto;
import com.tiger.demo.entities.Actor;
import com.tiger.demo.mappers.ActorMapper;
import com.tiger.demo.repositories.ActorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ActorService {

    private final ActorRepository actorRepository;

    private final ActorMapper actorMapper;

    public List<ActorGetDto> getAllActors() {
        return actorRepository.findAll().stream()
                .map(actor -> actorMapper.fromEntity(actor))
                .collect(Collectors.toList());
    }
}
