
package com.example.web_project.services;
import com.example.web_project.entities.User;
import com.example.web_project.repository.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class RegisterService {

    private final RegisterRepository registerRepository;

    @Autowired
    public RegisterService(RegisterRepository registerRepository) {
        this.registerRepository = registerRepository;
    }

    public User registerUser(User user, String confirmPassword) {

        if (!user.getPassword().equals(confirmPassword)) {
            throw new IllegalArgumentException("Password and confirmPassword do not match");
        }

        return registerRepository.save(user);
    }
}
