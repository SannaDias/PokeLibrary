package com.pokelibrary.auth.model;

import jakarta.persistence.*;
import java.util.Set;

@Entity // essa classe representa uma tabela no banco.
@Table(name = "users") //define o nome na tabela

public class User {
    @Id //define a chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // o banco gera o ID automaticamente
    private Long id;

    private String username;
    private String email;
    private String password;

    @ManyToMany(fetch = FetchType.EAGER) //usuario pode ter vários papeis
    @JoinTable(name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;

    // Construtor vazio
    public User() {}

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
