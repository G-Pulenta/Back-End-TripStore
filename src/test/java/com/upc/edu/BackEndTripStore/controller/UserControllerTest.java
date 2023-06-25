package com.upc.edu.BackEndTripStore.controller;

import com.upc.edu.BackEndTripStore.exception.ValidationException;
import org.junit.jupiter.api.Test;
import com.upc.edu.BackEndTripStore.model.User;
import static org.junit.jupiter.api.Assertions.*;
import com.upc.edu.BackEndTripStore.service.UserService;

import java.util.List;

class UserControllerTest {


    @Test
    void testValidarExcepcionUsername() {
        var user=new User();
        var userService= new UserService() {
            @Override
            public List<User> getAllUsers() {
                return null;
            }

            @Override
            public User getUserById(int id) {
                return null;
            }

            @Override
            public User createUser(User user) {
                return null;
            }

            @Override
            public User updateUser(int id, User updatedUser) {
                return null;
            }

            @Override
            public void deleteUser(int id) {

            }

            @Override
            public User getUserByUsernameAndPassword(String username, String password) {
                return null;
            }
        };
        UserController instancia = new UserController(userService);
        Exception exception = assertThrows(ValidationException.class, () -> {instancia.validateUser(user); });

        String expectedMessage = "Username is required";
        String actualMessage = exception.getMessage();
        user.setUsername("");
        assertTrue(actualMessage.contains(expectedMessage));
    }
    @Test
    void testValidateNoUsername() {
        var user=new User();
        var userService= new UserService() {
            @Override
            public List<User> getAllUsers() {
                return null;
            }

            @Override
            public User getUserById(int id) {
                return null;
            }

            @Override
            public User createUser(User user) {
                return null;
            }

            @Override
            public User updateUser(int id, User updatedUser) {
                return null;
            }

            @Override
            public void deleteUser(int id) {

            }

            @Override
            public User getUserByUsernameAndPassword(String username, String password) {
                return null;
            }
        };
        UserController instancia = new UserController(userService);


        user.setPassword("Haro");
        user.setName("Nicolas");
        user.setPhone("123456789");
        user.setEmail("Nickhardav@gamil.com");
        user.setLastname("Dávila");

         assertThrows(ValidationException.class, () -> {instancia.validateUser(user); });

    }
    @Test
    void testValidateNoPassword() {
        var user=new User();
        var userService= new UserService() {
            @Override
            public List<User> getAllUsers() {
                return null;
            }

            @Override
            public User getUserById(int id) {
                return null;
            }

            @Override
            public User createUser(User user) {
                return null;
            }

            @Override
            public User updateUser(int id, User updatedUser) {
                return null;
            }

            @Override
            public void deleteUser(int id) {

            }

            @Override
            public User getUserByUsernameAndPassword(String username, String password) {
                return null;
            }
        };
        UserController instancia = new UserController(userService);

        user.setUsername("Nicolas420");

        user.setName("Nicolas");
        user.setPhone("123456789");
        user.setEmail("Nickhardav@gamil.com");
        user.setLastname("Dávila");

        assertThrows(ValidationException.class, () -> {instancia.validateUser(user); });

    }

    @Test
    void testValidateNoEmail() {
        var user=new User();
        var userService= new UserService() {
            @Override
            public List<User> getAllUsers() {
                return null;
            }

            @Override
            public User getUserById(int id) {
                return null;
            }

            @Override
            public User createUser(User user) {
                return null;
            }

            @Override
            public User updateUser(int id, User updatedUser) {
                return null;
            }

            @Override
            public void deleteUser(int id) {

            }

            @Override
            public User getUserByUsernameAndPassword(String username, String password) {
                return null;
            }
        };
        UserController instancia = new UserController(userService);

        user.setUsername("Nicolas420");
        user.setPassword("Haro");
        user.setName("Nicolas");
        user.setPhone("123456789");

        user.setLastname("Dávila");

        assertThrows(ValidationException.class, () -> {instancia.validateUser(user); });

    }
    @Test
    void testValidateNoLastName() {
        var user=new User();
        var userService= new UserService() {
            @Override
            public List<User> getAllUsers() {
                return null;
            }

            @Override
            public User getUserById(int id) {
                return null;
            }

            @Override
            public User createUser(User user) {
                return null;
            }

            @Override
            public User updateUser(int id, User updatedUser) {
                return null;
            }

            @Override
            public void deleteUser(int id) {

            }

            @Override
            public User getUserByUsernameAndPassword(String username, String password) {
                return null;
            }
        };
        UserController instancia = new UserController(userService);

        user.setUsername("Nicolas420");
        user.setPassword("Haro");
        user.setName("Nicolas");
        user.setPhone("123456789");
        user.setEmail("Nickhardav@gamil.com");


        assertThrows(ValidationException.class, () -> {instancia.validateUser(user); });

    }


}