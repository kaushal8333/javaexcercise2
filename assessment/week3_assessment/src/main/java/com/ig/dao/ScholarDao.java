package com.ig.dao;

import java.util.List;

import com.ig.model.Scholar;

public interface ScholarDao{
	public List<Scholar> ListAllScholars();
	public Scholar GetOneScholar(int scholarId);
	public void AddScholar(Scholar scholar);
	public void UpdateScholarEmail(int scholarId,String email);
	public void DeleteScholarById(int scholarId);

}
