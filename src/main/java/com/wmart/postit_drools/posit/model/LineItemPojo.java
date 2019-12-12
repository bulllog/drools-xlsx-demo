package com.wmart.postit_drools.posit.model;

public class LineItemPojo implements Cloneable{

	private String budgetLine;
	private String assignmentNbr;
	private String quantityAmount;
	private String quantityUOM;
	private String taxtype;
	private String referenceNbr;
	private String docInfo;
	private String determineTaxBase;
	private String baseAmount;
	private String jurisdiction;
	private String item;
	private String department;
	private String legacyPO;
	private String internalOrder;
	private String tradingPartner;
	private String businessTransaction;

	
	
	private String accountType;
	private String accountID;
	private String company;
	private String profitCenter;
	private String costCenter;
	private String costAmount;
	private String retailAmount;
	private String conceptCode;
	private String statusCode;
	
	private String additionalField1;
	private String additionalField2;
	private String additionalField3;
	private String additionalField4;
	private String additionalField5;
	

	
	public LineItemPojo(String budgetLine, String assignmentNbr, String quantityAmount, String quantityUOM,
			String taxtype, String referenceNbr, String docInfo, String determineTaxBase, String baseAmount,
			String jurisdiction, String item, String department, String legacyPO, String internalOrder,
			String tradingPartner, String businessTransaction, String accountType, String accountID, String company,
			String profitCenter, String costCenter, String costAmount, String retailAmount, String conceptCode,
			String statusCode, String additionalField1, String additionalField2, String additionalField3,
			String additionalField4, String additionalField5) {
		super();
		this.budgetLine = budgetLine;
		this.assignmentNbr = assignmentNbr;
		this.quantityAmount = quantityAmount;
		this.quantityUOM = quantityUOM;
		this.taxtype = taxtype;
		this.referenceNbr = referenceNbr;
		this.docInfo = docInfo;
		
		this.determineTaxBase = determineTaxBase;
		this.baseAmount = baseAmount;
		this.jurisdiction = jurisdiction;
		this.item = item;
		this.department = department;
		this.legacyPO = legacyPO;
		this.internalOrder = internalOrder;
		this.tradingPartner = tradingPartner;
		this.businessTransaction = businessTransaction;
		
		this.accountType = accountType;
		this.accountID = accountID;
		this.company = company;
		this.profitCenter = profitCenter;
		this.costCenter = costCenter;
		this.costAmount = costAmount;
		this.retailAmount = retailAmount;
		this.conceptCode = conceptCode;
		this.statusCode = statusCode;
		this.additionalField1 = additionalField1;
		this.additionalField2 = additionalField2;
		this.additionalField3 = additionalField3;
		this.additionalField4 = additionalField4;
		this.additionalField5 = additionalField5;
	}




	public String getBudgetLine() {
		return budgetLine;
	}




	public void setBudgetLine(String budgetLine) {
		this.budgetLine = budgetLine;
	}




	public String getAssignmentNbr() {
		return assignmentNbr;
	}




	public void setAssignmentNbr(String assignmentNbr) {
		this.assignmentNbr = assignmentNbr;
	}




	public String getQuantityAmount() {
		return quantityAmount;
	}




	public void setQuantityAmount(String quantityAmount) {
		this.quantityAmount = quantityAmount;
	}




	public String getQuantityUOM() {
		return quantityUOM;
	}




	public void setQuantityUOM(String quantityUOM) {
		this.quantityUOM = quantityUOM;
	}




	public String getTaxtype() {
		return taxtype;
	}




	public void setTaxtype(String taxtype) {
		this.taxtype = taxtype;
	}




	public String getReferenceNbr() {
		return referenceNbr;
	}




	public void setReferenceNbr(String referenceNbr) {
		this.referenceNbr = referenceNbr;
	}




	public String getDocInfo() {
		return docInfo;
	}




	public void setDocInfo(String docInfo) {
		this.docInfo = docInfo;
	}




	public String getDetermineTaxBase() {
		return determineTaxBase;
	}




	public void setDetermineTaxBase(String determineTaxBase) {
		this.determineTaxBase = determineTaxBase;
	}




	public String getBaseAmount() {
		return baseAmount;
	}




	public void setBaseAmount(String baseAmount) {
		this.baseAmount = baseAmount;
	}




	public String getJurisdiction() {
		return jurisdiction;
	}




	public void setJurisdiction(String jurisdiction) {
		this.jurisdiction = jurisdiction;
	}




	public String getItem() {
		return item;
	}




	public void setItem(String item) {
		this.item = item;
	}




	public String getDepartment() {
		return department;
	}




	public void setDepartment(String department) {
		this.department = department;
	}




	public String getLegacyPO() {
		return legacyPO;
	}




	public void setLegacyPO(String legacyPO) {
		this.legacyPO = legacyPO;
	}




	public String getInternalOrder() {
		return internalOrder;
	}




	public void setInternalOrder(String internalOrder) {
		this.internalOrder = internalOrder;
	}




	public String getTradingPartner() {
		return tradingPartner;
	}




	public void setTradingPartner(String tradingPartner) {
		this.tradingPartner = tradingPartner;
	}




	public String getBusinessTransaction() {
		return businessTransaction;
	}




	public void setBusinessTransaction(String businessTransaction) {
		this.businessTransaction = businessTransaction;
	}




	public String getAdditionalField1() {
		return additionalField1;
	}




	public void setAdditionalField1(String additionalField1) {
		this.additionalField1 = additionalField1;
	}




	public String getAdditionalField2() {
		return additionalField2;
	}




	public void setAdditionalField2(String additionalField2) {
		this.additionalField2 = additionalField2;
	}




	public String getAdditionalField3() {
		return additionalField3;
	}




	public void setAdditionalField3(String additionalField3) {
		this.additionalField3 = additionalField3;
	}




	public String getAdditionalField4() {
		return additionalField4;
	}




	public void setAdditionalField4(String additionalField4) {
		this.additionalField4 = additionalField4;
	}




	public String getAdditionalField5() {
		return additionalField5;
	}




	public void setAdditionalField5(String additionalField5) {
		this.additionalField5 = additionalField5;
	}




	public LineItemPojo() {
		super();
	}

	
	
	
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountID() {
		return accountID;
	}
	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getProfitCenter() {
		return profitCenter;
	}
	public void setProfitCenter(String profitCenter) {
		this.profitCenter = profitCenter;
	}
	public String getCostCenter() {
		return costCenter;
	}
	public void setCostCenter(String costCenter) {
		this.costCenter = costCenter;
	}
	public String getCostAmount() {
		return costAmount;
	}
	public void setCostAmount(String costAmount) {
		this.costAmount = costAmount;
	}
	public String getRetailAmount() {
		return retailAmount;
	}
	public void setRetailAmount(String retailAmount) {
		this.retailAmount = retailAmount;
	}
	public String getConceptCode() {
		return conceptCode;
	}
	public void setConceptCode(String conceptCode) {
		this.conceptCode = conceptCode;
	}
	public String getStatusCode() {
		return statusCode;
	}
	
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	@Override
	public String toString() {
		return "LineItemPojo [accountType=" + accountType + ", accountID=" + accountID + ", company=" + company
				+ ", profitCenter=" + profitCenter + ", costCenter=" + costCenter + ", costAmount=" + costAmount
				+ ", retailAmount=" + retailAmount + ", conceptCode=" + conceptCode + ", statusCode=" + statusCode
				+ "]";
	}
	
    public LineItemPojo clone() throws CloneNotSupportedException {
        return (LineItemPojo)super.clone();
    }


    public String getGlobalAccountType(String id) {
		return "G";
	}
	
}
