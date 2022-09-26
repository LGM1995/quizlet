package com.example.quizlet.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class User {
    @Id // 대표값을 지정! like a 주민등록번호
    @GeneratedValue(strategy = GenerationType.IDENTITY) // DB가 id를 자동 생성 에노테이션!
    private Long id;

    @Column
    private String title;

    @Column
    private String content;


}
