package com.test1;

public class DevFactoryTrackingAdvisor {
	private Integer advisorCode;
	private Integer devFactTrackingId;
	private Integer validityDays;
	private String department;
	private Integer baseReportingIndicator;
	private boolean devFactTrackingMappedToReport;
	private boolean isActive;
	private String authorityName;
	private String authorityType;
	private String creationCr;
	private String modifiedCr;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public DevFactoryTrackingAdvisor() {

	}

	public DevFactoryTrackingAdvisor(Integer advisorCode, Integer devFactTrackingId, Integer validityDays,
			String department, Integer baseReportingIndicator, boolean devFactTrackingMappedToReport, boolean isActive,
			String authorityName, String authorityType, String creationCr, String modifiedCr, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.advisorCode = advisorCode;
		this.devFactTrackingId = devFactTrackingId;
		this.validityDays = validityDays;
		this.department = department;
		this.baseReportingIndicator = baseReportingIndicator;
		this.devFactTrackingMappedToReport = devFactTrackingMappedToReport;
		this.isActive = isActive;
		this.authorityName = authorityName;
		this.authorityType = authorityType;
		this.creationCr = creationCr;
		this.modifiedCr = modifiedCr;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getAdvisorCode() {
		return advisorCode;
	}

	public void setAdvisorCode(Integer advisorCode) {
		this.advisorCode = advisorCode;
	}

	public Integer getDevFactTrackingId() {
		return devFactTrackingId;
	}

	public void setDevFactTrackingId(Integer devFactTrackingId) {
		this.devFactTrackingId = devFactTrackingId;
	}

	public Integer getValidityDays() {
		return validityDays;
	}

	public void setValidityDays(Integer validityDays) {
		this.validityDays = validityDays;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Integer getBaseReportingIndicator() {
		return baseReportingIndicator;
	}

	public void setBaseReportingIndicator(Integer baseReportingIndicator) {
		this.baseReportingIndicator = baseReportingIndicator;
	}

	public boolean isDevFactTrackingMappedToReport() {
		return devFactTrackingMappedToReport;
	}

	public void setDevFactTrackingMappedToReport(boolean devFactTrackingMappedToReport) {
		this.devFactTrackingMappedToReport = devFactTrackingMappedToReport;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getAuthorityName() {
		return authorityName;
	}

	public void setAuthorityName(String authorityName) {
		this.authorityName = authorityName;
	}

	public String getAuthorityType() {
		return authorityType;
	}

	public void setAuthorityType(String authorityType) {
		this.authorityType = authorityType;
	}

	public String getCreationCr() {
		return creationCr;
	}

	public void setCreationCr(String creationCr) {
		this.creationCr = creationCr;
	}

	public String getModifiedCr() {
		return modifiedCr;
	}

	public void setModifiedCr(String modifiedCr) {
		this.modifiedCr = modifiedCr;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
