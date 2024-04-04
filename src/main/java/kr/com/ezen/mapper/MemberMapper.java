package kr.com.ezen.mapper;

import java.util.List;

import kr.com.ezen.dto.MemberVO;

public interface MemberMapper {

	public String getTime();
	
	public int insertMember(MemberVO vo);
	public int updateMember(MemberVO vo);
	public int delectMember(int id);
	public MemberVO selectOneMember(int id);
	public List<MemberVO> selectAllList();
}
