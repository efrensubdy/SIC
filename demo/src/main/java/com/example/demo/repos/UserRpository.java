package com.example.demo.repos;

import com.example.demo.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRpository extends JpaRepository<Usuario,Integer> {

    @Query("select u from Usuario u where u.username = :username and u.pasword = :password ")
    public  Usuario findFirstUserByUserNameAndPassword(@Param("username") String username, @Param("password")String password);
}
