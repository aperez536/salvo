package com.codeoftheweb.demo.models;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;
    private String Username;

    public Player() { }

    public Player(String Username) {
        this.Username = Username;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public long getId() {
        return id;
    }

    public String getUsername() {
        return Username;
    }

    @Override
    public String toString() {
        return "Player{" +
                "Username='" + Username + '\'' +
                '}';
    }
}
