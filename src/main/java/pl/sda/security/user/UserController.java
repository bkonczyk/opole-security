package pl.sda.security.user;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
class UserController {
    private final UserService userService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @GetMapping("/logged-in")
    public String confirmLogin(Principal principal) {
        return "You are logged in as: " + principal.getName();
    }

    @GetMapping("/admin")
    public String admin() {
        return "You are logged in as admin";
    }
}
