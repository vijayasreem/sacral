package com.Sacral.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesforceRepository extends JpaRepository<Object, Long> {

    void saveApexControllerForLWC(String lwc);
    void generateXMLDependency(String lwc);
    void generateCSSDependency(String lwc);
    void checkNamingConvention(String lwc);
    void generateErrorFreeCode(String lwc);
    void saveControllerToProduction(String lwc);
}