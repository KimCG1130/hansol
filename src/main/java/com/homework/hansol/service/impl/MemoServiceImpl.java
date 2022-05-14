package com.homework.hansol.service.impl;


import com.homework.hansol.service.MemoService;
import com.homework.hansol.model.Memo;
import com.homework.hansol.mapper.MemoMapper;
import org.springframework.stereotype.Service;


@Service
public class MemoServiceImpl implements MemoService {


    private MemoMapper memoMapper;//final x


    public boolean insertMemo(Memo memo) {
        return this.memoMapper.insertMemo(memo);
    }

}
