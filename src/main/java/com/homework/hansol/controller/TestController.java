package com.homework.hansol.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/hansol")
@Api(tags = {"Test API"})
@RequiredArgsConstructor
public class TestController {


    @GetMapping(value = "/getTest")
    @ApiOperation(value = "get 테스트")
    public ResponseEntity<?> getTest() {

        return null;
    }

    @PostMapping(value = "/postTest")
    @ApiOperation(value = "post 테스트")
    public ResponseEntity<?> postTest() {

        return null;
    }

}

