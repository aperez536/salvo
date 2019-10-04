package com.codeoftheweb.demo.repositories;

import com.codeoftheweb.demo.models.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface GameRepository extends JpaRepository<Game,Long> {

}
