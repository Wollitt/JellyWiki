package Jelly.Wollit.JellyWiki.users.model;

import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {
    private String name;
    private String password;
    private String email;
}
