package mate.academy.springboot.web.controller;

import mate.academy.springboot.web.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @GetMapping("/users")
    public List<User> getListOfUsers() {
        return List.of(new User(1L, "bob@i.ua"), new User(2L, "alice@i.ua"));
    }

    @PostMapping("/users")
    public String user(@RequestBody User user) {
        return "User created. Id: %s, email: %s".formatted(user.id(),user.email());
    }

}
