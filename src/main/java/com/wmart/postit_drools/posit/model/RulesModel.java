package com.wmart.postit_drools.posit.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RulesModel {
	
	private String id;
	private String country;
	
	@JsonProperty
	private String Concept;
	
	private String sourceId;
	private String fromData;
	private String toDate;
	private Double percentToTake;
	private String allocateToCode;
	private String allocateToProfitCenter;
	private String allocateToCostCenter;
	private String allocateToAcc;
	private int rule_seq_id;
	
	private String offsetToCode;
	private String offsetToProfitcenter;
	private String offsetToCostCenter;
	private String offsetToAccount;
	
	public String getOffsetToCode() {
		return offsetToCode;
	}
	public void setOffsetToCode(String offsetToCode) {
		this.offsetToCode = offsetToCode;
	}
	public String getOffsetToProfitcenter() {
		return offsetToProfitcenter;
	}
	public void setOffsetToProfitcenter(String offsetToProfitcenter) {
		this.offsetToProfitcenter = offsetToProfitcenter;
	}
	public String getOffsetToCostCenter() {
		return offsetToCostCenter;
	}
	public void setOffsetToCostCenter(String offsetToCostCenter) {
		this.offsetToCostCenter = offsetToCostCenter;
	}
	public String getOffsetToAccount() {
		return offsetToAccount;
	}
	public void setOffsetToAccount(String offsetToAccount) {
		this.offsetToAccount = offsetToAccount;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getConcept() {
		return Concept;
	}
	public void setConcept(String concept) {
		Concept = concept;
	}
	
	public String getSourceId() {
		return sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}
	public String getFromData() {
		return fromData;
	}
	public void setFromData(String fromData) {
		this.fromData = fromData;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	public Double getPercentToTake() {
		return percentToTake;
	}
	public void setPercentToTake(Double percentToTake) {
		this.percentToTake = percentToTake;
	}
	public String getAllocateToCode() {
		return allocateToCode;
	}
	public void setAllocateToCode(String allocateToCode) {
		this.allocateToCode = allocateToCode;
	}
	public String getAllocateToProfitCenter() {
		return allocateToProfitCenter;
	}
	public void setAllocateToProfitCenter(String allocateToProfitCenter) {
		this.allocateToProfitCenter = allocateToProfitCenter;
	}
	public String getAllocateToCostCenter() {
		return allocateToCostCenter;
	}
	public void setAllocateToCostCenter(String allocateToCostCenter) {
		this.allocateToCostCenter = allocateToCostCenter;
	}
	public String getAllocateToAcc() {
		return allocateToAcc;
	}
	public void setAllocateToAcc(String allocateToAcc) {
		this.allocateToAcc = allocateToAcc;
	}
	public int getRule_seq_id() {
		return rule_seq_id;
	}
	public void setRule_seq_id(int rule_seq_id) {
		this.rule_seq_id = rule_seq_id;
	}
	@Override
	public String toString() {
		return "RulesModel [id=" + id + ", country=" + country + ", concept=" + Concept + ", sourceId=" + sourceId
				+ ", fromData=" + fromData + ", toDate=" + toDate + ", percentToTake=" + percentToTake
				+ ", allocateToCode=" + allocateToCode + ", allocateToProfitCenter=" + allocateToProfitCenter
				+ ", allocateToCostCenter=" + allocateToCostCenter + ", allocateToAcc=" + allocateToAcc
				+ ", rule_seq_id=" + rule_seq_id + "]";
	}

}
