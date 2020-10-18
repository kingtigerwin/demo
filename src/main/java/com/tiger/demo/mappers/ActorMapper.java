package com.tiger.demo.mappers;

import com.tiger.demo.dtos.actor.ActorGetDto;
import com.tiger.demo.dtos.actor.ActorPostDto;
import com.tiger.demo.dtos.actor.ActorPutDto;
import com.tiger.demo.entities.Actor;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ActorMapper {

    Actor toEntity(ActorPostDto actorPostDto);

    ActorGetDto fromEntity(Actor person);

    void copy(ActorPutDto actorPutDto, @MappingTarget Actor actor);
}
