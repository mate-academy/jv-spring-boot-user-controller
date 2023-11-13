package mate.academy.springboot.web.service;

import mate.academy.springboot.web.model.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
    User createUser(Long id, String email);
}
