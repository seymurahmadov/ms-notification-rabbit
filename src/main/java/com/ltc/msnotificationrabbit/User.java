package com.ltc.msnotificationrabbit;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class User implements Serializable {
    private static final long serialVersionUID = 1L; // Add a serialVersionUID for serialization

    private String username;
    private String email;
}