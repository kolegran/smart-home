package com.github.kolegran.smarthome.user;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

@Data
public class CreateUpdateUserCommand {
    @NotNull
    @Length(min = 2, max = 20)
    private String login;
    @NotNull
    @Length(min = 6, max = 40)
    private String password;
    @NotNull
    @Length(min = 10, max = 50)
    private String email;
}
