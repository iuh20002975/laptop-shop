package iuh.fit.se.service;

import java.util.List;

import org.springframework.stereotype.Service;

import iuh.fit.se.domain.User;
import iuh.fit.se.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String handleHello() {
        return "hello from service";
    }

    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }

    public List<User> getAllUsersByEmail(String email) {
        return this.userRepository.findByEmail(email);
    }

    public User handleSaveUser(User user) {
        User long1 = this.userRepository.save(user);
        System.out.println(long1);
        return long1;
    }

}
