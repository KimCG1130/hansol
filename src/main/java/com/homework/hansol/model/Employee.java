package com.homework.hansol.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "직원 객체")
public class Employee {

    @ApiModelProperty(notes = "직원 id", example = "1", position = 1)
    long id;

    @ApiModelProperty(notes = "직원 이름(담당자)", example = "손흥민", position = 2)
    String name;

    @ApiModelProperty(notes = "직급", example = "선임", position = 3)
    String position;

    @ApiModelProperty(notes = "회사", example = "PNS, 인티큐브", position = 4)
    String company;

    @ApiModelProperty(notes = "전화번호", example = "08-011-0002", position = 5)
    String telephone;

    @ApiModelProperty(notes = "업무명", example = "인사기획/노무", position = 6)
    String task_name;

    @ApiModelProperty(notes = "종류", example = "소모품/자산", position = 7)
    String sort;
}
