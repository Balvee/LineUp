package com.project2.web.web;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.project2.web.domain.User;
import com.project2.web.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@RestController
@RequestMapping("/user-api")
public class UserController {

    UserService userService;

    @Autowired
    public void setUserService(UserService userService){ this.userService = userService;}

    @GetMapping(produces= MediaType.APPLICATION_JSON_VALUE)
    public List<User> getAllUsers() {
        System.out.println("***************** Made it here (All Mapping) ******************");
        return userService.findAll();
    }

    @PostMapping(value = "/create_user", consumes="application/json")
    public void addUser(@RequestBody User u) throws IOException {
        System.out.println("***************** Made it here (Post Mapping) ******************");
        userService.save((User) u);

    }

    @GetMapping(value = "/user/{id}", produces="application/json")
    public ResponseEntity<User> getUser(@PathVariable Integer id) {
        System.out.println("***************** Made it here (Get Mapping) ******************");
        User u = userService.getOne(id);

        if(u == null) return new ResponseEntity<>((User)null, HttpStatus.NOT_FOUND);
        else return new ResponseEntity<>(u, HttpStatus.OK);
    }

    @DeleteMapping(value = "/user/{id}")
    public void deleteUser(@PathVariable Integer id) {
        System.out.println("***************** Made it here (Delete Mapping) ******************");
        userService.deleteById(id);
    }

    @PutMapping("/user/{id}")
    public ResponseEntity updateUser(@PathVariable Integer id, @RequestBody User u) {
        System.out.println("***************** Made it here (Put Mapping) ******************");
        userService.save(u);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
