package com.listgame.dslistgame.services;

import com.listgame.dslistgame.dto.GameDTO;
import com.listgame.dslistgame.dto.GameListDTO;
import com.listgame.dslistgame.dto.GameMinDTO;
import com.listgame.dslistgame.entities.Game;
import com.listgame.dslistgame.entities.GameList;
import com.listgame.dslistgame.repositories.GameListRepository;
import com.listgame.dslistgame.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class GameListService {


    @Service
    public class GameService {

        @Autowired
        private GameListRepository gameListRepository;

        @Transactional(readOnly = true)
        public List<GameListDTO> findAll() {
            List<GameList> result = gameListRepository.findAll();
            return result.stream().map(x -> new GameListDTO(x)).toList();
        }
    }
}
