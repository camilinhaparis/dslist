package com.camilaparise.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camilaparise.dslist.entities.Game;
import com.camilaparise.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

    
}
