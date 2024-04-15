package mate.academy.springboot.web.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

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
    private static final Long BOB_ID = 1L;
    private static final Long ALICE_ID = 2L;
    private static final String BOB_EMAIL = "bob@i.ua";
    private static final String ALICE_EMAIL = "alice@i.ua";

    @GetMapping
    List<User> getAll() {
        return List.of(new User(BOB_ID, BOB_EMAIL), new User(ALICE_ID, ALICE_EMAIL));
    }

    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    String save(@RequestBody final User user) {
        return String.format("User created. Id: %s, email: %s", user.id(), user.email());
    }
}
