package com.example.web_project.services;

import com.example.web_project.entities.User;
import com.example.web_project.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EditServiceImpl implements EditService {

    private final UserRepository userRepository;

    public EditServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User updateUserProfile(Integer id, User updatedUser) {
        Optional<User> optionalUser = userRepository.findById(id);

        if (optionalUser.isPresent()) {
            User existingUser = optionalUser.get();

            // Cập nhật thông tin người dùng với dữ liệu mới từ updatedUser
            existingUser.setName(updatedUser.getName());
            existingUser.setEmail(updatedUser.getEmail());
            existingUser.setPhoneNumber(updatedUser.getPhoneNumber());
            existingUser.setPassword(updatedUser.getPassword());
            existingUser.setAddress(updatedUser.getAddress());

            // Lưu người dùng đã cập nhật vào cơ sở dữ liệu
            return userRepository.save(existingUser);
        } else {
            // Nếu không tìm thấy người dùng, bạn có thể xử lý theo ý muốn, ví dụ: ném một exception
            throw new RuntimeException("Không tìm thấy người dùng với id: " + id);
        }
    }
}
