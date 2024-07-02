package mate.academy.springboot.web.controller;

import java.util.List;
import mate.academy.springboot.web.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    private static final List<User> RESULT_LIST = List.of(new User(1L, "bob@i.ua"),
            new User(2L, "alice@i.ua"));
    private static final String RESPONSE_MSG = "User created. Id: %s, email: %s";

    @GetMapping
    List<User> getUsers() {
        return RESULT_LIST;
    }

    @PostMapping
    String accept(@RequestBody User user) {
        return String.format(RESPONSE_MSG, user.id(), user.email());
    }
}
