package com.todolist.web.dto;

import com.todolist.web.domain.list.MyList;

import lombok.Getter;

@Getter
public class ListsAllResponseDto {
    private Long id;
    private String content;

    public ListsAllResponseDto (MyList entity) {
        this.id = entity.getId();
        this.content = entity.getContent();
    }
}
