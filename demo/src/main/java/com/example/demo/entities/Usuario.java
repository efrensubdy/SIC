package com.example.demo.entities;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Objects;
@Entity
@Table(name="usuario")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Usuario {

    private Integer id;
    private String username;
    private String pasword;


    @Id
    @SequenceGenerator(
            name="usuario_sequence",
            sequenceName="usuario_sequence",
            allocationSize=1)
    @GeneratedValue(strategy= GenerationType.SEQUENCE,
            generator="usuario_sequence")
    @Column(name = "id_usuario")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(id, usuario.id) &&
                Objects.equals(username, usuario.username) &&
                Objects.equals(pasword, usuario.pasword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, pasword);
    }
}
