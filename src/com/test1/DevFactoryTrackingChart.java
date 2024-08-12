package com.test1;

public class DevFactoryTrackingChart {
	private Integer chartDesignCode;
	private Integer devFactTrackingId;
	private String devFactTrackingBudgetIndicator;
	private String devFactTrackingSheet;
	private String devFactTrackingControlFlag;
	private String devFactTrackingDesc;
	private String devFactTrackingShortDesc;
	private String devFactTrackingType;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public DevFactoryTrackingChart() {

	}

	public DevFactoryTrackingChart(Integer chartDesignCode, Integer devFactTrackingId,
			String devFactTrackingBudgetIndicator, String devFactTrackingSheet, String devFactTrackingControlFlag,
			String devFactTrackingDesc, String devFactTrackingShortDesc, String devFactTrackingType,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.chartDesignCode = chartDesignCode;
		this.devFactTrackingId = devFactTrackingId;
		this.devFactTrackingBudgetIndicator = devFactTrackingBudgetIndicator;
		this.devFactTrackingSheet = devFactTrackingSheet;
		this.devFactTrackingControlFlag = devFactTrackingControlFlag;
		this.devFactTrackingDesc = devFactTrackingDesc;
		this.devFactTrackingShortDesc = devFactTrackingShortDesc;
		this.devFactTrackingType = devFactTrackingType;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getChartDesignCode() {
		return chartDesignCode;
	}

	public void setChartDesignCode(Integer chartDesignCode) {
		this.chartDesignCode = chartDesignCode;
	}

	public Integer getDevFactTrackingId() {
		return devFactTrackingId;
	}

	public void setDevFactTrackingId(Integer devFactTrackingId) {
		this.devFactTrackingId = devFactTrackingId;
	}

	public String getDevFactTrackingBudgetIndicator() {
		return devFactTrackingBudgetIndicator;
	}

	public void setDevFactTrackingBudgetIndicator(String devFactTrackingBudgetIndicator) {
		this.devFactTrackingBudgetIndicator = devFactTrackingBudgetIndicator;
	}

	public String getDevFactTrackingSheet() {
		return devFactTrackingSheet;
	}

	public void setDevFactTrackingSheet(String devFactTrackingSheet) {
		this.devFactTrackingSheet = devFactTrackingSheet;
	}

	public String getDevFactTrackingControlFlag() {
		return devFactTrackingControlFlag;
	}

	public void setDevFactTrackingControlFlag(String devFactTrackingControlFlag) {
		this.devFactTrackingControlFlag = devFactTrackingControlFlag;
	}

	public String getDevFactTrackingDesc() {
		return devFactTrackingDesc;
	}

	public void setDevFactTrackingDesc(String devFactTrackingDesc) {
		this.devFactTrackingDesc = devFactTrackingDesc;
	}

	public String getDevFactTrackingShortDesc() {
		return devFactTrackingShortDesc;
	}

	public void setDevFactTrackingShortDesc(String devFactTrackingShortDesc) {
		this.devFactTrackingShortDesc = devFactTrackingShortDesc;
	}

	public String getDevFactTrackingType() {
		return devFactTrackingType;
	}

	public void setDevFactTrackingType(String devFactTrackingType) {
		this.devFactTrackingType = devFactTrackingType;
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
