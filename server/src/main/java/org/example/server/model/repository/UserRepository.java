package org.example.server.model.repository;

import org.example.server.model.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {


    @Query("SELECT u FROM User u WHERE u.username = :username")
    User findByUsername(String username);

    @Query("SELECT new User(u.idUser, u.username, u.password,u.role) FROM User u WHERE u.role = :role")
    List<User> findAllByRole(Integer role);

    @Query("select u from User u where u.idUser = :idUser")
    User findByIdUser(Integer idUser);
}
