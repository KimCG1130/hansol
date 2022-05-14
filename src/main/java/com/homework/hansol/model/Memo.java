package com.homework.hansol.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;

@Data
@ApiModel(description = "메모 객체")
public class Memo {

    @ApiModelProperty(notes = "메모 아이디", example = "1592827184", position = 1)
    long id;

    @ApiModelProperty(notes = "메모 제목", example = "title", position = 2)
    String title;

    @ApiModelProperty(notes = "메모 내용", example = "Hello", position = 3)
    @Column(name="modified_at")
    String content;
}
