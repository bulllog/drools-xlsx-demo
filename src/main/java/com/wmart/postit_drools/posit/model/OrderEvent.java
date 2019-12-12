package com.wmart.postit_drools.posit.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class OrderEvent {
	@JsonProperty("In Reference To")
	private String in_Reference_To;
	
	private String docDate;
	private String docHeaderText;
	private String sourceId;
	private String centralBuyingRegion;
	private String currency;
	private String country;
	private String reversalDate;
	private String reversalReason;
	private String accountingPrinciple;
	private String postingDate;
	private String docReferenceNumber;
	private String exchangeRate;
	private String ingestLinkID;
	
	private List<String> budgetLine;
	private List<String> assignmentNbr;
	private List<String> quantityAmount;
	private List<String> quantityUOM;
	private List<String> taxtype;
	private List<String> referenceNbr;
	private List<String> docInfo;
	private List<String> determineTaxBase;
	private List<String> baseAmount;
	private List<String> jurisdiction;
	private List<String> item;
	private List<String> department;
	private List<String> legacyPO;
	private List<String> internalOrder;
	private List<String> tradingPartner;
	private List<String> businessTransaction;
	
	private List<String> accountType;
	private List<String> accountID;
	private List<String> company;
	private List<String> profitCenter;
	private List<String> costCenter;
	private List<String> costAmount;
	private List<String> retailAmount;
	private List<String> conceptCode;
	
	private List<String> additionalField1;
	private List<String> additionalField2;
	private List<String> additionalField3;
	private List<String> additionalField4;
	private List<String> additionalField5;
	
	private List<String> statusCode;
	
	
	public List<String> getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(List<String> statusCode) {
		this.statusCode = statusCode;
	}
	
	@JsonProperty("In Reference To")
	public String getIn_Reference_To() {
		return in_Reference_To;
	}
	
	@JsonProperty("In Reference To")
	public void setIn_Reference_To(String in_Reference_To) {
		this.in_Reference_To = in_Reference_To;
	}
	public String getDocDate() {
		return docDate;
	}
	public void setDocDate(String docDate) {
		this.docDate = docDate;
	}
	public String getDocHeaderText() {
		return docHeaderText;
	}
	public void setDocHeaderText(String docHeaderText) {
		this.docHeaderText = docHeaderText;
	}
	public String getSourceId() {
		return sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}
	public String getCentralBuyingRegion() {
		return centralBuyingRegion;
	}
	public void setCentralBuyingRegion(String centralBuyingRegion) {
		this.centralBuyingRegion = centralBuyingRegion;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getReversalDate() {
		return reversalDate;
	}
	public void setReversalDate(String reversalDate) {
		this.reversalDate = reversalDate;
	}
	public String getReversalReason() {
		return reversalReason;
	}
	public void setReversalReason(String reversalReason) {
		this.reversalReason = reversalReason;
	}
	public String getAccountingPrinciple() {
		return accountingPrinciple;
	}
	public void setAccountingPrinciple(String accountingPrinciple) {
		this.accountingPrinciple = accountingPrinciple;
	}
	public String getPostingDate() {
		return postingDate;
	}
	public void setPostingDate(String postingDate) {
		this.postingDate = postingDate;
	}
	public String getDocReferenceNumber() {
		return docReferenceNumber;
	}
	public void setDocReferenceNumber(String docReferenceNumber) {
		this.docReferenceNumber = docReferenceNumber;
	}
	public String getExchangeRate() {
		return exchangeRate;
	}
	public void setExchangeRate(String exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	public List<String> getBudgetLine() {
		return budgetLine;
	}
	public void setBudgetLine(List<String> budgetLine) {
		this.budgetLine = budgetLine;
	}
	public List<String> getAssignmentNbr() {
		return assignmentNbr;
	}
	public void setAssignmentNbr(List<String> assignmentNbr) {
		this.assignmentNbr = assignmentNbr;
	}
	public List<String> getQuantityAmount() {
		return quantityAmount;
	}
	public void setQuantityAmount(List<String> quantityAmount) {
		this.quantityAmount = quantityAmount;
	}
	public List<String> getQuantityUOM() {
		return quantityUOM;
	}
	public void setQuantityUOM(List<String> quantityUOM) {
		this.quantityUOM = quantityUOM;
	}
	public List<String> getTaxtype() {
		return taxtype;
	}
	public void setTaxtype(List<String> taxtype) {
		this.taxtype = taxtype;
	}
	public List<String> getReferenceNbr() {
		return referenceNbr;
	}
	public void setReferenceNbr(List<String> referenceNbr) {
		this.referenceNbr = referenceNbr;
	}
	public List<String> getDocInfo() {
		return docInfo;
	}
	public void setDocInfo(List<String> docInfo) {
		this.docInfo = docInfo;
	}
	public List<String> getDetermineTaxBase() {
		return determineTaxBase;
	}
	public void setDetermineTaxBase(List<String> determineTaxBase) {
		this.determineTaxBase = determineTaxBase;
	}
	public List<String> getBaseAmount() {
		return baseAmount;
	}
	public void setBaseAmount(List<String> baseAmount) {
		this.baseAmount = baseAmount;
	}
	public List<String> getJurisdiction() {
		return jurisdiction;
	}
	public void setJurisdiction(List<String> jurisdiction) {
		this.jurisdiction = jurisdiction;
	}
	public List<String> getItem() {
		return item;
	}
	public void setItem(List<String> item) {
		this.item = item;
	}
	public List<String> getDepartment() {
		return department;
	}
	public void setDepartment(List<String> department) {
		this.department = department;
	}
	public List<String> getLegacyPO() {
		return legacyPO;
	}
	public void setLegacyPO(List<String> legacyPO) {
		this.legacyPO = legacyPO;
	}
	public List<String> getInternalOrder() {
		return internalOrder;
	}
	public void setInternalOrder(List<String> internalOrder) {
		this.internalOrder = internalOrder;
	}
	public List<String> getTradingPartner() {
		return tradingPartner;
	}
	public void setTradingPartner(List<String> tradingPartner) {
		this.tradingPartner = tradingPartner;
	}
	public List<String> getBusinessTransaction() {
		return businessTransaction;
	}
	public void setBusinessTransaction(List<String> businessTransaction) {
		this.businessTransaction = businessTransaction;
	}
	public List<String> getAccountType() {
		return accountType;
	}
	public void setAccountType(List<String> accountType) {
		this.accountType = accountType;
	}
	public List<String> getAccountID() {
		return accountID;
	}
	public void setAccountID(List<String> accountID) {
		this.accountID = accountID;
	}
	public List<String> getCompany() {
		return company;
	}
	public void setCompany(List<String> company) {
		this.company = company;
	}
	public List<String> getProfitCenter() {
		return profitCenter;
	}
	public void setProfitCenter(List<String> profitCenter) {
		this.profitCenter = profitCenter;
	}
	public List<String> getCostCenter() {
		return costCenter;
	}
	public void setCostCenter(List<String> costCenter) {
		this.costCenter = costCenter;
	}
	public List<String> getCostAmount() {
		return costAmount;
	}
	public void setCostAmount(List<String> costAmount) {
		this.costAmount = costAmount;
	}
	public List<String> getRetailAmount() {
		return retailAmount;
	}
	public void setRetailAmount(List<String> retailAmount) {
		this.retailAmount = retailAmount;
	}
	public List<String> getConceptCode() {
		return conceptCode;
	}
	public void setConceptCode(List<String> conceptCode) {
		this.conceptCode = conceptCode;
	}
	public String getIngestLinkID() {
		return ingestLinkID;
	}
	public void setIngestLinkID(String ingestLinkID) {
		this.ingestLinkID = ingestLinkID;
	}
	public List<String> getAdditionalField1() {
		return additionalField1;
	}
	public void setAdditionalField1(List<String> additionalField1) {
		this.additionalField1 = additionalField1;
	}
	public List<String> getAdditionalField2() {
		return additionalField2;
	}
	public void setAdditionalField2(List<String> additionalField2) {
		this.additionalField2 = additionalField2;
	}
	public List<String> getAdditionalField3() {
		return additionalField3;
	}
	public void setAdditionalField3(List<String> additionalField3) {
		this.additionalField3 = additionalField3;
	}
	public List<String> getAdditionalField4() {
		return additionalField4;
	}
	public void setAdditionalField4(List<String> additionalField4) {
		this.additionalField4 = additionalField4;
	}
	public List<String> getAdditionalField5() {
		return additionalField5;
	}
	public void setAdditionalField5(List<String> additionalField5) {
		this.additionalField5 = additionalField5;
	}


}
