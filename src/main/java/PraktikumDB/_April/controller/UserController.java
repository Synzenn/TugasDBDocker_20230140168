package PraktikumDB._April.controller;

import PraktikumDB._April.Service.UserService;
import PraktikumDB._April.model.User;
import org.springframework.web.bind.annotation.*;
import org.aspectj.lang.annotation.DeclareWarning;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public String createUser(@RequestBody User request) {
        userService.addUser(request);
        return "User created successfully";
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUser();
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable String id) {
        userService.deleteUser(id);
        return "User deleted successfully";
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable String id) {
        return userService.getUserById(id);
    }

    @PutMapping("/{id}")
    public String updateUser(@PathVariable String id, @RequestBody User request) {
        userService.updateUser(id, request);
        return "user updated successfully";
    }
}