package com.jjorsae.login.mapper;

import com.jjorsae.login.domain.Board;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardMapper {
    int boardCount();
    List<Board> getList();
}
