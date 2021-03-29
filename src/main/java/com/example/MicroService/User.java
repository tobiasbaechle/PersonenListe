package com.example.MicroService;


import lombok.Data;

import java.time.LocalDateTime;

@Data
public class User {
    private String name = "";
    private LocalDateTime timestamp = LocalDateTime.now();

}
