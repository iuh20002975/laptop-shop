package iuh.fit.se.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import iuh.fit.se.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User save(User user1);

    List<User> findByEmail(String email);

    List<User> findAll();

}
