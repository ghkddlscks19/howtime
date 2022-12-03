package com.example.howtime.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table (name ="member")
public class Member {

    @Id
    @Column(length = 10, name = "studentnum")
    private String studentNum;

    private String password;

    private String name;

    @Column(unique = true)
    private String nickname;

    private String gender;

    @Column(unique = true)
    private String email;



}
