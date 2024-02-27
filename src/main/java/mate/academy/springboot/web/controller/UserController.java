package mate.academy.springboot.web.controller;

import java.util.List;
import mate.academy.springboot.web.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping
    public List<User> getAllUsers() {
        return List.of(new User(1L, "1567843@gmail.com"),
                new User(2L, "alice123@gmail.com"));
    }

    @PostMapping
    public String saveUser(@RequestBody User user) {
        return "User was saved. Id: %s, mail: %s".formatted(user.id(), user.email());
    }
}
