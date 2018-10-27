package com.rococo.springboot.service;

import java.util.List;

import com.rococo.springboot.model.DiseaseModel;

public interface PersonService {
	
	public DiseaseModel getPersonInfo(DiseaseModel personModel);	
	public List<DiseaseModel> getAll();
	public void registerPerson(DiseaseModel personModel);
}
