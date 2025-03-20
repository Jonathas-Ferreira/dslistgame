package com.listgame.dslistgame.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.List;
import java.util.Objects;

@Embeddable
public class BelogingPK {

    //Usando a configuração da JPA para mapear o objeto relacional
    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;

    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameList list;

    public BelogingPK() {
    }

    //Construtor de argumentos
    public BelogingPK(Game game, GameList list) {
        this.game = game;
        this.list = list;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public GameList getList() {
        return list;
    }

    public void setList(GameList list) {
        this.list = list;
    }

    @Override
    public int hashCode() {
        return Objects.hash(game, list);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BelogingPK other = (BelogingPK) obj;
        return Objects.equals(game, other.game) && Objects.equals(list, other.list);
    }
}
