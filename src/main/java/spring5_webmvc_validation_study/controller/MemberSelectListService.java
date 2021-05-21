package spring5_webmvc_validation_study.controller;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberSelectListService {
	@Autowired
	private MemberDao memberDao;

	public MemberSelectListService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	public void selectAll(){
		Map<String, Member> map = memberDao.selectListAll();
			
		Set<Entry<String,Member>> entrySet = map.entrySet();
		
		for(Entry<String, Member> entry : entrySet) {
			System.out.printf("키:%s, 값:%s%n", entry.getKey(), entry.getValue());
		}
	}
	
}
