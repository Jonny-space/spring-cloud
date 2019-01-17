package com.jonny.spring.eureka.service.impl;

import com.jonny.spring.eureka.entity.User;
import com.jonny.spring.eureka.repository.UserRepository;
import com.jonny.spring.eureka.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public User login(String name, String password) {
        return userRepository.findByNameAndPassword(name,password);
    }

    @Override
    public User register(User user) {
        return userRepository.save(user);
    }

    @Override
    public void writeOff(User user) {
        userRepository.delete(user);
    }

    @Override
    public boolean isExists(User user) {
        return userRepository.getOne(user.getId())==null?true:false;
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.getOne(id);
    }
}
