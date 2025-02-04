package com.listgame.dslistgame.services;

import com.listgame.dslistgame.dto.GameMinDTO;
import com.listgame.dslistgame.entities.Game;
import com.listgame.dslistgame.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<Game> findAll(){
        List<Game> result = gameRepository.findAll();
        return result;
    }
}
