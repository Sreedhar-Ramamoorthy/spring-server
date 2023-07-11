package com.shell.employee.Repositary;

import com.shell.employee.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User save(User user);

    List<User> findAll();

    void deleteById(Long id);

    Optional<User> findById(Long id);

}
