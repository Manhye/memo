package com.example.memo.dto;

public class MemoRequestDto {
    private String title;
    private String contents; //요청받을 데이터

    public String getTitle(){
        return title;
    }

    public String getContents(){
        return contents;
    }

}
