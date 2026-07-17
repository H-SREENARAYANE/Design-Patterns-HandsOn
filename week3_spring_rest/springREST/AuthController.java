import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {

    @PostMapping("/authenticate")
    public String authenticate() {
        return "JWT_TOKEN_GENERATED";
    }
}