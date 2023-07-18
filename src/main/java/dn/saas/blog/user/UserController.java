package dn.saas.blog.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired UserRepository userRepository;

    @GetMapping("/users")
    public List<User> getUser() {
        return userRepository.findAll();
    }

    @GetMapping("/users/save")
    public User randomUser() {
        User user = new User("User Name ", "email@gmail.com");
        userRepository.save(user);
        return user;
    }
}
