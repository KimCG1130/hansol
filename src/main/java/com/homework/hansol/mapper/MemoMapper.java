package com.homework.hansol.mapper;


import com.homework.hansol.model.Memo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface MemoMapper {

    boolean insertMemo(Memo memo);

}
