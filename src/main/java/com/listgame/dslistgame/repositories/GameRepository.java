package com.listgame.dslistgame.repositories;

import com.listgame.dslistgame.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

// Consultar, excluir, inserir, atualizar no banco de dados
public interface GameRepository extends JpaRepository<Game, Long> {
}
