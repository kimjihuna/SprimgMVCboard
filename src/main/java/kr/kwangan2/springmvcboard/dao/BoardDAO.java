package kr.kwangan2.springmvcboard.dao;

import java.util.List;

import kr.kwangan2.springmvcboard.domain.BoardVO;
import kr.kwangan2.springmvcboard.service.BoardService;

public interface BoardDAO extends BoardService{
	
	public List<BoardVO> boardVOList();

	public void insertBoardVO(BoardVO boardVO);

	public void insertBoardVOSelectKey(BoardVO boardVO);

	public BoardVO selectBoardVO(Long bon);

	public int deleteBoardVO(Long bon);

	public int updateBoardVO(BoardVO boardVO);
	
}
