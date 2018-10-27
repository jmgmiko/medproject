package com.rococo.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.rococo.springboot.model.DiseaseModel;

public interface PersonRepository extends CrudRepository<DiseaseModel, Integer>{

}
