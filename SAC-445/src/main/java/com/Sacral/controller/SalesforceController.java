package com.Sacral.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Sacral.service.SalesforceService;

@RestController
public class SalesforceController {
	
	@Autowired
	private SalesforceService service;
	
	@PostMapping("/saveApexControllerForLWC")
	public void saveApexControllerForLWC(@RequestBody String lwc) {
		service.saveApexControllerForLWC(lwc);
	}
	
	@PostMapping("/generateXMLDependency")
	public void generateXMLDependency(@RequestBody String lwc) {
		service.generateXMLDependency(lwc);
	}
	
	@PostMapping("/generateCSSDependency")
	public void generateCSSDependency(@RequestBody String lwc) {
		service.generateCSSDependency(lwc);
	}
	
	@PostMapping("/checkNamingConvention")
	public void checkNamingConvention(@RequestBody String lwc) {
		service.checkNamingConvention(lwc);
	}
	
	@PostMapping("/generateErrorFreeCode")
	public void generateErrorFreeCode(@RequestBody String lwc) {
		service.generateErrorFreeCode(lwc);
	}
	
	@PostMapping("/saveControllerToProduction")
	public void saveControllerToProduction(@RequestBody String lwc) {
		service.saveControllerToProduction(lwc);
	}
	
}