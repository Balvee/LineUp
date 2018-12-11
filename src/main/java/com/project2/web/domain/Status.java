package com.project2.web.domain;

import javax.persistence.*;

@Entity
@Table(name="STATUS")
public class Status {

    @Id
    @Column(name="STATUS_ID")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int id;
    @Column(name="NAME")
    String name;

    public Status(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Status() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Status{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
