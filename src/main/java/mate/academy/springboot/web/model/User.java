package mate.academy.springboot.web.model;

public record User(Long id, String email) {
    @Override
    public Long id() {
        return id;
    }

    @Override
    public String email() {
        return email;
    }
}
