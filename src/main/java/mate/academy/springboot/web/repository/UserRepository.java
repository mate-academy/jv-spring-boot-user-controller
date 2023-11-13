package mate.academy.springboot.web.repository;

import mate.academy.springboot.web.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class UserRepository {
    private static List<User> users = new ArrayList<>();
    public List<User> getAll() {
        return users;
    }

    public User createUseer(Long id, String email) {
        User user = new User(id, email);
        users.add(user);
        return user;
    }

}
