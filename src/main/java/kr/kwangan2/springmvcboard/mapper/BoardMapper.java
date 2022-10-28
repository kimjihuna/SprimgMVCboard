package kr.kwangan2.springmvcboard.mapper;

import java.util.List;

import kr.kwangan2.springmvcboard.domain.BoardVO;

public interface BoardMapper {

	// @Select(" SELECT * FROM board WHERE bno>0 ")
	public List<BoardVO> boardVOList();

	public void insertBoardVO(BoardVO boardVO);

	public void insertBoardVOSelectKey(BoardVO boardVO);

	public BoardVO selectBoardVO(Long bon);
	
	public int deleteBoardVO(Long bon);
	
	public int updateBoardVO(BoardVO boardVO);
}
