package mse.blogproject.dto.board;

import mse.blogproject.domain.board.Board;
import mse.blogproject.domain.user.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BoardSaveRequestDto {
    private String title;
    private String content;
    private int count;
    private User user;

    public Board toEntity(){
        return Board.builder()
                .title(title)
                .content(content)
                .count(0)
                .user(user)
                .build();
    }

    public void setUser(User user){
        this.user = user;
    }
}
