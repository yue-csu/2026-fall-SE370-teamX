src {
  
  controller {
    package controller;

import service.AuthService;

// handles login requests from the user interface
public class LoginController {
    
    private AuthService authService;

    public LoginController(AuthService authService) {
        this.authService = authService;
    }

    // authenticates a user by email and password
    public boolean login(String email, String password) {
        return authService.authenticate(email, password);
    }
}

DAO{
  package dao;

import model.User;

//handles access to user data
public class UserDAO implements UserDAOInterface {
    // temporay for testing
    private User testUser;

     public UserDAO() {
        testUser = new User(
            1,
            "Test User",
            "test@email.com",
            "password123"
        );
    }

//searches for a user by email
@Override 
public User findByEmail(String email) {

    if(testUser.getEmail().equalsIgnoreCase(email)){
        return testUser;

        }
    return null;
    }
}
package dao;

import model.User;

// Defines the methods needed to access user data
public interface UserDAOInterface {

    // Finds a user by their email address
    User findByEmail(String email);
}

model{
  package model;

public class User {

    private int userId;
    private String name;
    private String email; 
    private String password; 

    public User(int userId, String name, String email, String password) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }

}
package service;

import dao.UserDAOInterface;
import model.User;

//handles login authentication

public class AuthService {

    private UserDAOInterface userDAO;

    public AuthService(UserDAOInterface userDAO) {
        this.userDAO = userDAO;
    }

    // authenticates a user by email and password
    public boolean authenticate(String email, String password) {
        User user = userDAO.findByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            return true;
        }
        return false;
    }
}

  import controller.LoginController;
import dao.UserDAO;
import service.AuthService;
import view.LoginPage;

import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            UserDAO userDAO = new UserDAO();

            AuthService authService =
                    new AuthService(userDAO);

            LoginController loginController =
                    new LoginController(authService);

            LoginPage loginPage =
                    new LoginPage(loginController);

            loginPage.setVisible(true);
        });
    }
}
