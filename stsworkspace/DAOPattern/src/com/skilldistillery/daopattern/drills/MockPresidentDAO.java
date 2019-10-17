package com.skilldistillery.daopattern.drills;

import java.util.ArrayList;
import java.util.List;

public class MockPresidentDAO implements PresidentDAO{

	@Override
	public List<President> getPresidents() {
		
	List<President> pres = new ArrayList<>();
		
		pres.add(new President(1, null, null, "C", 0, null, "Dems"));
		pres.add(new President(2, null, null, "AAA", 0, null, "Whig"));
		pres.add(new President(3, null, null, "AAA", 0, null, "Whig"));
		
		return pres;
	}

}
