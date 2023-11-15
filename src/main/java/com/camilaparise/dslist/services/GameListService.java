package com.camilaparise.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.camilaparise.dslist.dto.GameDTO;
import com.camilaparise.dslist.dto.GameListDTO;
import com.camilaparise.dslist.dto.GameMinDTO;
import com.camilaparise.dslist.entities.Game;
import com.camilaparise.dslist.entities.GameList;
import com.camilaparise.dslist.repositories.GameListRepository;
import com.camilaparise.dslist.repositories.GameRepository;



@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result =  gameListRepository.findAll();
        List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
        return dto;

    }
}
