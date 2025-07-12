package com.CodeLab.Auth_Service.requestDTO;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString


public class AdminResponse {

    private UUID adminId;

    private String name;


    private String email;


    private String password;
}

