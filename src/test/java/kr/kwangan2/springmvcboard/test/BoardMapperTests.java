package kr.kwangan2.springmvcboard.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.kwangan2.springmvcboard.domain.BoardVO;
import kr.kwangan2.springmvcboard.mapper.BoardMapper;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
	
	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;
	
//	@Test
//	public void testGetList() {
//		mapper.boardVOList().forEach(board -> log.info(board));
//	}
//	
//	@Test
//	public void testInsert() {
//		BoardVO boardvo = new BoardVO();
//		boardvo.setTitle("new title");
//		boardvo.setContent("new content");
//		boardvo.setWriter("newid");
//		
//		//mapper.insertBoardVO(boardvo);
//		mapper.insertBoardVOSelectKey(boardvo);
//		
//		log.info(boardvo);
//	}
	
//	@Test
//	public void testSelect() {
//		BoardVO boardVO = mapper.selectBoardVO(4L);
//		log.info(boardVO);
//	}
	
//	@Test
//	public void testDelete() {
//		int result = mapper.deleteBoardVO(5L);
//		log.info(result);
//	}
	@Test
	public void testUpdate() {
		BoardVO boardVO = new BoardVO();
		boardVO.setBno(3);
		boardVO.setTitle("update Test");
		boardVO.setContent("update content");
		boardVO.setWriter("update writer");
		int resutl = mapper.updateBoardVO(boardVO);
		log.info(resutl);
	}
}
