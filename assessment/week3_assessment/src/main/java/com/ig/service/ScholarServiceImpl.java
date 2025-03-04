package com.ig.service;

import java.util.List;

import com.ig.dao.ScholarDaoImpl;
import com.ig.model.Scholar;

public class ScholarServiceImpl implements ScholarService{
	ScholarDaoImpl sc=new ScholarDaoImpl();
	@Override
	public void addScholar(Scholar scholar) {
		sc.AddScholar(scholar);		
	}

	@Override
	public List<Scholar> listAllScholars() {
        return sc.ListAllScholars();
	}

	@Override
	public Scholar GetOneScholar(int scholarId) {
        return sc.GetOneScholar(scholarId);
	}

	@Override
	public void updateScholarEmail(int scholarId, String email) {
        sc.UpdateScholarEmail(scholarId, email);
		
	}

	@Override
	public void deleteScholarById(int scholarId) {
		sc.DeleteScholarById(scholarId);
		// TODO Auto-generated method stub
		
	}

}
