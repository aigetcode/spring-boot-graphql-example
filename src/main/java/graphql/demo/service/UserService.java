package graphql.demo.service;

import graphql.demo.dao.UserRepository;
import graphql.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getById(long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User addUser(User user) {
        return userRepository.saveAndFlush(user);
    }

    public User editBank(User user) {
        return userRepository.saveAndFlush(user);
    }

    public void remove(long id) {
        userRepository.deleteById(id);
    }

}