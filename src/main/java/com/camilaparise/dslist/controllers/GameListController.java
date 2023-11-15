package com.camilaparise.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.camilaparise.dslist.dto.GameDTO;
import com.camilaparise.dslist.dto.GameListDTO;
import com.camilaparise.dslist.dto.GameMinDTO;
import com.camilaparise.dslist.entities.Game;
import com.camilaparise.dslist.services.GameListService;
import com.camilaparise.dslist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

   

    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }
    
}
