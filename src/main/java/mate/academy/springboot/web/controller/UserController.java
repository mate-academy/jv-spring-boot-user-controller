package mate.academy.springboot.web.controller;

import mate.academy.springboot.web.model.User;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @GetMapping
    public List<User> getAll() {
        return List.of(
                new User(1L, "1@gmail.com"),
                new User(2L, "2@gmail.com")
        );
    }

    @PostMapping
    public String save(@RequestBody User user) {
        return "User was saved. Id: %s, name: %s".formatted(user.id(), user.email());
    }
}
