package kz.shyngys.springsecuritytests.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Developer {
    private String username;
    private String password;
}
