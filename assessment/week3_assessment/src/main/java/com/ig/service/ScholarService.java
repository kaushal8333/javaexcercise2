package com.ig.service;

import java.util.List;

import com.ig.model.Scholar;

public interface ScholarService {
	public void addScholar(Scholar scholar);
	public List<Scholar> listAllScholars();
	public Scholar GetOneScholar(int scholarId);
	public void updateScholarEmail(int scholarId, String email);
	public void deleteScholarById(int scholarId);
}
