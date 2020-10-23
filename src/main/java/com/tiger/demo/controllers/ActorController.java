package com.tiger.demo.controllers;

import com.tiger.demo.dtos.actor.ActorGetDto;
import com.tiger.demo.services.ActorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/actors")
@RequiredArgsConstructor
public class ActorController {

    private final ActorService actorService;

    @GetMapping
    public ResponseEntity<List<ActorGetDto>> find() {
        return ResponseEntity.ok(actorService.getAllActors());
    }
}
