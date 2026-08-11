package mate.academy.springboot.web.controller;

import java.util.List;
import mate.academy.springboot.web.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @PostMapping
    public ResponseEntity<String> createUser(@RequestBody User user) {
        return ResponseEntity.ok(String.format("User created. Id: %s, email: %s",
                user.id(), user.email()));
    }

    @GetMapping
    public ResponseEntity<List<User>> getUsers() {
        return ResponseEntity.ok(List.of(new User(1L, "bob@i.ua"),
                new User(2L, "alice@i.ua")));
    }
}
