//package com.homework.hansol.controller;
//
//import com.homework.hansol.model.Memo;
//import com.homework.hansol.service.MemoService;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//@RequestMapping(value = "/hansol")
//@Api(tags = {"Test API"})
//@RequiredArgsConstructor
//public class TaskController {
//
//    private final MemoService memoService;
//
//    @GetMapping
//    public List<Memo> findAllMemos() {
//        return memoService.getMemoList();
//    }
//
//
//    @GetMapping(value = "/getTest")
//    @ApiOperation(value = "get 테스트")
//    public ResponseEntity<?> getTest() {
//
//        return null;
//    }
//
//    @PostMapping(value = "/postTest")
//    @ApiOperation(value = "post 테스트")
//    public ResponseEntity<?> postTest() {
//
//        return null;
//    }
//
//}
//
