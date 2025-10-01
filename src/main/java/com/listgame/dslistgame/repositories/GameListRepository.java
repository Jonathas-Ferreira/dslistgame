package com.listgame.dslistgame.repositories;

import com.listgame.dslistgame.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository <GameList, Long>{
}
