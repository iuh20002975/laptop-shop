package iuh.fit.se;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "Khoi tao du an laptopshop, hello";
    }

    @GetMapping("/user")
    public String userPage() {
        return "only user can access";
    }

    @GetMapping("/admin")
    public String adminPage() {
        return "only admin can access";
    }

}
