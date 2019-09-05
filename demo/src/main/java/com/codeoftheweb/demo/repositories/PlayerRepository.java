package com.codeoftheweb.demo.repositories;

import com.codeoftheweb.demo.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource
public interface PlayerRepository  extends JpaRepository<Player,   Long> {
}

