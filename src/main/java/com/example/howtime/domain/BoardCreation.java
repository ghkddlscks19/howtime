package com.example.howtime.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "board")
public class BoardCreation{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    @Column(columnDefinition = "TEXT")
    private String content;

    private String hashtag;

    private int price;

    @Column(name = "createdate")
    private String createDate = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy.MM.dd"));

    @Column(name = "modifydate")
    private String modifyDate = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy.MM.dd"));

    private String requirement;

    @Column(name = "memberid")
    private String memberId;

}
