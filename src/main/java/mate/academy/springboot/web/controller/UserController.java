package mate.academy.springboot.web.controller;

import jakarta.annotation.Nullable;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import mate.academy.springboot.web.model.User;
import mate.academy.springboot.web.model.dto.UserDto;
import mate.academy.springboot.web.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@RestController
//@RequestMapping("/users")
//@RequiredArgsConstructor
//public class UserController {
//
//    private final UserService userService;
//
////    @GetMapping
////    public List<User> getAll() {
////        return userService.getAll();
////    }
////
////    @PostMapping
////    public String createUser(@RequestBody @Nullable UserDto userDto) {
////        User user = userService.createUser(userDto.getId(), userDto.getEmail());
////        return String.format("User created. Id: %s, email: %s", user.id(), user.email());
////    }
//
//    @GetMapping
//    public List<User> getAll() {
//        return List.of(new User(1L, "bob@i.ua"), new User(2L, "alice@i.ua"));
//    }
//
//    @PostMapping
//    public String createUser(@RequestBody User user) {
//        return "User created. Id: %s, email: %s".formatted(user.id(), user.email());
//    }
//}

@RestController
@RequestMapping("/users")
public class UserController {
    @GetMapping
    public List<User> getAll() {
        return List.of(new User(1L, "bob@i.ua"), new User(2L, "alice@i.ua"));
    }

    @PostMapping
    public String createUser(@RequestBody User user) {
        return String.format("User created. Id: %s, email: %s", user.id(), user.email());
    }
}
