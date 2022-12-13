package com.example.howtime.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "reportanswer")
public class ReportAnswerCreation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; // 답글아이디

    private String content; // 내용

    @Column(name = "createdate")
    private String createDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss"));

    @Column(name = "memberid")
    private String memberId; // 답글 쓴 사람 정보

    @Column(name = "reportid")
    private Integer reportId; // 답글 쓰는 게시판 아이디
}
