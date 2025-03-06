package com.listgame.dslistgame.entities;

import java.util.Objects;

public class GameList {

    private Long id;
    private String name;

    public GameList(){
    }

    public GameList(Long id, String name){
        this.id = id;
        this.name = name;
    }

    public Long id(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String name(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    // Comparar duas list usando equals hascode, usando somente id
    @Override
    public int hashcode(){
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        GameList other = (GameList) obj;
        return Objects.equals(id, other.id);
    }
}
