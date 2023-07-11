package com.shell.employee.Service;

import com.shell.employee.Entity.User;
import com.shell.employee.Repositary.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class UserService {
    @Autowired
    private UserRepository userRepository;

//    public User createUser(User user) {
//        return userRepository.save(user);
//    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getList() {
        return userRepository.findAll();
    }

    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    public Optional<User> getById(Long id) {
        return userRepository.findById(id);
    }


    public Optional<User> updateUserById(User user, Long id) {
        Optional<User> existingUser = userRepository.findById(id);
        if (existingUser.isPresent()) {
            User userToUpdate = existingUser.get();
            if (user.getFirstName() != null) {
                userToUpdate.setFirstName(user.getFirstName());
            }
            if (user.getLastName() != null) {
                userToUpdate.setLastName(user.getLastName());
            }
            if (user.getEmail() != null) {
                userToUpdate.setEmail(user.getEmail());
            }
            return Optional.of(userRepository.save(userToUpdate));
        } else {
            return Optional.empty();
        }
    }
}
