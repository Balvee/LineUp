package com.project2.web.domain;

import javax.persistence.*;

@Entity
@Table(name="GAME")
public class Game {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int id;
    String platform;
    String title;

    public Game(int id, String platform, String title) {
        this.id = id;
        this.platform = platform;
        this.title = title;
    }

    public Game() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", platform='" + platform + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
