import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController {

    @GetMapping
    public String getAccount() {
        return "Account Service Running";
    }
}