package com.project2.web.domain;

import javax.persistence.*;

@Entity
@Table(name="USER")
public class User {

    @Id
    @Column(name="USER_ID")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int id;
    @Column(name="EMAIL")
    String email;
    @Column(name="FIRST_NAME")
    String firstName;
    @Column(name="LAST_NAME")
    String lastName;
    @Column(name="PASSWORD")
    String password;
    @Column(name="USER_NAME")
    String userName;

    public User(String email, String firstName, String lastName, String password, String userName) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.userName = userName;
    }

    public User() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
