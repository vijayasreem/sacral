package com.Sacral.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sacral.repository.SalesforceRepository;

@Service
public class SalesforceService {
	
	@Autowired
    private SalesforceRepository repository;
	
	public void saveApexControllerForLWC(String lwc) {
		repository.saveApexControllerForLWC(lwc);
	}
	
	public void generateXMLDependency(String lwc) {
		repository.generateXMLDependency(lwc);
	}
	
	public void generateCSSDependency(String lwc) {
		repository.generateCSSDependency(lwc);
	}
	
	public void checkNamingConvention(String lwc) {
		repository.checkNamingConvention(lwc);
	}
	
	public void generateErrorFreeCode(String lwc) {
		repository.generateErrorFreeCode(lwc);
	}
	
	public void saveControllerToProduction(String lwc) {
		repository.saveControllerToProduction(lwc);
	}
}