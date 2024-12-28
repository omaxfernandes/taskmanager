package br.com.omaxfernandess.taskmanager.user;

import lombok.Data;

@Data
public class UserModel {

    private String name;
    private String password;
    private String email;
}
