package mse.blogproject.dto.user;


import mse.blogproject.domain.Role;
import mse.blogproject.domain.user.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@Getter
@NoArgsConstructor
public class UserSaveRequestDto {

    private String username;
    private String password;
    private String email;
    private String nickname;
    private Role role;

    public User toEntity() {
        return User.builder()
                .username(username)
                .password(password)
                .email(email)
                .nickname(nickname)
                .role(Role.USER)
                .build();
    }
}