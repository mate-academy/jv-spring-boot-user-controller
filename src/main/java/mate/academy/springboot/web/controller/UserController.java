package mate.academy.springboot.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import mate.academy.springboot.web.model.User;

import java.util.List;

@RestController
public class UserController {

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return List.of(new User(1L, "bob@i.ua"), new User(2L, "alice@i.ua"));
    }

    @PostMapping("/users")
    public String createUser(@RequestBody User user) {
        return String.format("User created. Id: %s, email: %s", user.id(), user.email());
    }
}
