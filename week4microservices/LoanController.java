import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/loan")
public class LoanController {

    @GetMapping
    public String getLoan() {
        return "Loan Service Running";
    }
}