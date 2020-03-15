package com.project.airportM.Entity;

import javax.persistence.*;

@Entity
@Table(name="user")
public class User extends SuperEntity {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="USERNAME",unique = true)
    private String username;

    @Column(name="PASSWORD")
    private String password;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "FK_UserRole"), name = "role", referencedColumnName = "ID")
    private Role role;

    public User() {
    }

    public User(String username, String password, Role role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    public static UserBuilder builder() {

        return new UserBuilder();
    }
    public static class UserBuilder{
        private User user;

        public UserBuilder() {
            user = new User();
        }
        public UserBuilder username(String username){
            user.setUsername(username);
            return this;
        }
        public UserBuilder password(String password){
            user.setPassword(password);
            return this;
        }
        public UserBuilder role(Role role){
            user.setRole(role);
            return this;
        }
        public User build() {
            return user;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                '}';
    }
}

