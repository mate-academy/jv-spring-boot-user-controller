package mate.academy.springboot.web.controller;

import mate.academy.springboot.web.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User(1L, "bob@i.ua"));
        users.add(new User(2L, "alice@i.ua"));
        return users;
    }

    @PostMapping
    public String createUser(@RequestBody User user) {
        return String.format(
                "User created. Id: %s, email: %s",
                user.id(),
                user.email()
        );
    }
}
