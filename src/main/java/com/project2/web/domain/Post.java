package com.project2.web.domain;

import javax.persistence.*;
import java.security.Timestamp;

@Entity
@Table(name="POST")
public class Post {
    @Id
    @Column(name="POST_ID")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int id;
    @Column(name="DESCRIPTION")
    String description;
    @Column(name="LOCATION")
    String Location;
    @Column(name="TIME_CREATED")
    Timestamp timeCreated;
    @Column(name="START_TIME")
    Timestamp startTime;
    @Column(name="END_TIME")
    Timestamp endTime;
    @OneToOne(cascade= CascadeType.ALL, fetch= FetchType.EAGER)
    @JoinColumn(name="GAME_ID")
    Game game;
    @OneToOne(cascade= CascadeType.ALL, fetch= FetchType.EAGER)
    @JoinColumn(name="USER_ID")
    User user;


    public Post(String description, Timestamp timeCreated, Timestamp startTime, Timestamp endTime, Game game, User user) {
        this.description = description;
        this.timeCreated = timeCreated;
        this.startTime = startTime;
        this.endTime = endTime;
        this.game = game;
        this.user = user;
    }

    public Post() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Timestamp timeCreated) {
        this.timeCreated = timeCreated;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", Location='" + Location + '\'' +
                ", timeCreated=" + timeCreated +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", game=" + game +
                ", user=" + user +
                '}';
    }
}
