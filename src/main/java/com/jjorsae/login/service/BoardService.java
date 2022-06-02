package com.jjorsae.login.service;

import com.jjorsae.login.domain.Board;
import com.jjorsae.login.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class BoardService {
   private final BoardMapper boardMapper;

   public int boardCount(){
       return boardMapper.boardCount();
   }

   public List<Board> boardList(){
       return boardMapper.getList();
   }
}
