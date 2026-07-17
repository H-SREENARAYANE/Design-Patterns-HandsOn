import org.springframework.web.bind.annotation.*;

@RestController
public class CountryController {

    @GetMapping("/country")
    public String country() {
        return "India";
    }

    @GetMapping("/country/{code}")
    public String getCountry(@PathVariable String code) {
        return "Country Code : " + code;
    }
}