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

    @GetMapping
    public ResponseEntity<List<User>> getAllUser() {
        List<User> usersList = List.of(new User(1L, "bob@i.ua"), new User(2L, "alice@i.ua"));
        return ResponseEntity.ok(usersList);
    }

    @PostMapping
    public ResponseEntity<String> saveUser(@RequestBody User user) {
        return ResponseEntity.ok("User created. Id: " + user.id() + ", email: " + user.email());
    }
}
