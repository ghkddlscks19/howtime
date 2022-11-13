package com.example.howtime.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Member {

    @Id
    @Column(length = 10)
    private String studentNum;

    private String password;

    private String name;

    @Column(unique = true)
    private String nickname;

    private String gender;

    @Column(unique = true)
    private String email;




}
