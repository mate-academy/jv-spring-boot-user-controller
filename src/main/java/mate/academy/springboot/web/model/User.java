package mate.academy.springboot.web.model;

public record User(Long id, String email) {
    public User(Long id, String email) {
        this.id = id;
        this.email = email;
    }
    //code
}
