package com.camilaparise.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camilaparise.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

    
}
