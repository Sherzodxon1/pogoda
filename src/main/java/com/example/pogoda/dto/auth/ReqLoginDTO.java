package com.example.pogoda.dto.auth;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ReqLoginDTO {

    private String username;

    private String password;

}
