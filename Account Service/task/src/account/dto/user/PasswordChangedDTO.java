package account.dto.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class PasswordChangedDTO {
    private final String status = "The password has been updated successfully";
    private final String email;
}
