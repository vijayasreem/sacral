package com.Sacral.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Salesforce {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String apexControllerForLWC;
    private String xmldependency;
    private String cssDependency;
    private boolean namingConvention;
    private boolean errorFreeCode;
    private boolean controllerToProduction;

    public Salesforce() {

    }

    public Salesforce(String apexControllerForLWC, String xmldependency, String cssDependency, boolean namingConvention, boolean errorFreeCode, boolean controllerToProduction) {
        this.apexControllerForLWC = apexControllerForLWC;
        this.xmldependency = xmldependency;
        this.cssDependency = cssDependency;
        this.namingConvention = namingConvention;
        this.errorFreeCode = errorFreeCode;
        this.controllerToProduction = controllerToProduction;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApexControllerForLWC() {
        return apexControllerForLWC;
    }

    public void setApexControllerForLWC(String apexControllerForLWC) {
        this.apexControllerForLWC = apexControllerForLWC;
    }

    public String getXmldependency() {
        return xmldependency;
    }

    public void setXmldependency(String xmldependency) {
        this.xmldependency = xmldependency;
    }

    public String getCssDependency() {
        return cssDependency;
    }

    public void setCssDependency(String cssDependency) {
        this.cssDependency = cssDependency;
    }

    public boolean isNamingConvention() {
        return namingConvention;
    }

    public void setNamingConvention(boolean namingConvention) {
        this.namingConvention = namingConvention;
    }

    public boolean isErrorFreeCode() {
        return errorFreeCode;
    }

    public void setErrorFreeCode(boolean errorFreeCode) {
        this.errorFreeCode = errorFreeCode;
    }

    public boolean isControllerToProduction() {
        return controllerToProduction;
    }

    public void setControllerToProduction(boolean controllerToProduction) {
        this.controllerToProduction = controllerToProduction;
    }
}