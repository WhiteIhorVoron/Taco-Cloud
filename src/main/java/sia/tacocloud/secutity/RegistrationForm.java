package sia.tacocloud.secutity;

import lombok.Data;
import org.springframework.security.crypto.password.PasswordEncoder;
import sia.tacocloud.entity.UserTaco;

@Data
public class RegistrationForm {
    private String username;
    private String password;
    private String fullname;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String phone;
    public UserTaco toUser(PasswordEncoder passwordEncoder) {
        return new UserTaco(
                username, passwordEncoder.encode(password),
                fullname, street, city, state, zip, phone);
    }
}
