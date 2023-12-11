package mse.blogproject.controller.api;


import mse.blogproject.dto.user.UserSaveRequestDto;
import mse.blogproject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class UserApiController {

    private final UserService userService;

    @PostMapping("/api/v1/user")
    public Long save(@RequestBody UserSaveRequestDto userSaveRequestDto) {
        return userService.save(userSaveRequestDto.toEntity());
    }
}