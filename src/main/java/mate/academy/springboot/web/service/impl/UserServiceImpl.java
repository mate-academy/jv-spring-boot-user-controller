package mate.academy.springboot.web.service.impl;

import lombok.RequiredArgsConstructor;
import mate.academy.springboot.web.model.User;
import mate.academy.springboot.web.repository.UserRepository;
import mate.academy.springboot.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public List<User> getAll() {
        return repository.getAll();
    }

    @Override
    public User createUser(Long id, String email) {
        return repository.createUseer(id, email);
    }
}
