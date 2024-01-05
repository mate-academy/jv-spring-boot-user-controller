package mate.academy.springboot.web.controller;

import mate.academy.springboot.web.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping
    public User save(@RequestBody User user) {
        return new User(user.id(), user.email());
    }

    @GetMapping
    public List<User> getAllUsers() {
        return List.of(new User(1L, "bob@gmail.com"), new User(2L, "alice@gmail.com"));
    }
}
