package mate.academy.springboot.web.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.stream.Stream;
import com.fasterxml.jackson.databind.ObjectMapper;
import mate.academy.springboot.web.model.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(UserController.class)
class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    static Stream<Arguments> userProvider() {
        return Stream.of(
                Arguments.of(1L, "james@i.ua"),
                Arguments.of(2L, "kane@i.ua"),
                Arguments.of(3L, "charlie@i.ua"),
                Arguments.of(4L, "dave@i.ua"),
                Arguments.of(5L, "bill@gmail.com")
        );
    }

    @Test
    void shouldGetAllUsers() throws Exception {
        mockMvc.perform(get("/users"))
                .andExpect(status().isOk())
                .andExpect(content().json("[{'id': 1, 'email': 'bob@i.ua'}, {'id': 2, 'email': 'alice@i.ua'}]"));
    }

    @ParameterizedTest
    @MethodSource("userProvider")
    void shouldCreateUser(Long id, String email) throws Exception {
        User user = new User(id, email);
        String userJson = objectMapper.writeValueAsString(user);

        mockMvc.perform(post("/users")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(userJson))
                .andExpect(status().isOk())
                .andExpect(content().string(String.format("User created. Id: %s, email: %s", id, email)));
    }
}
