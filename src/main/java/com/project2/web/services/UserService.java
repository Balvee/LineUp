package com.project2.web.services;

import com.project2.web.data.UserDao;
import com.project2.web.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserService {
    UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) { this.userDao = userDao;}

    @Transactional
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Transactional
    public User getOne(Integer integer) {
        return userDao.getOne(integer);
    }

    public Integer save(User u) {
        return userDao.save(u).getId();
    }

    public User findById(Integer integer) {
        Optional<User> u = userDao.findById(integer);
        if(u.isPresent()){
            return u.get();
        } else {
            return null;
        }
    }

    public boolean existsById(Integer integer) {
        return userDao.existsById(integer);
    }

    public void delete(User user) {
        userDao.delete(user);
    }

    public void deleteById(Integer id) {
        userDao.deleteById(id);
    }

}
