package kr.kwangan2.springmvcboard.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.kwangan2.springmvcboard.domain.BoardVO;
import kr.kwangan2.springmvcboard.mapper.BoardMapper;
import lombok.Setter;

@Service
public class BoardDAOImpl extends AbstractBoardDAO {

	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;

	public List<BoardVO> boardVOList() {
		return mapper.boardVOList();
	}

	public void insertBoardVO(BoardVO boardVO) {
		mapper.insertBoardVO(boardVO);
	}

	public void insertBoardVOSelectKey(BoardVO boardVO) {
		mapper.insertBoardVOSelectKey(boardVO);
	}

	public BoardVO selectBoardVO(Long bon) {
		return mapper.selectBoardVO(bon);
	}

	public int deleteBoardVO(Long bon) {
		return mapper.deleteBoardVO(bon);
	}

	public int updateBoardVO(BoardVO boardVO) {
		return mapper.updateBoardVO(boardVO);
	}

}
