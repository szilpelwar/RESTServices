package com.bank.interest.dto;

public class InterestReturnsResponse {
private Float returnBaseCurrency;
private Float returnUSD;
public InterestReturnsResponse(Float returnBaseCurrency,Float returnUSD){
	this.returnBaseCurrency=returnBaseCurrency;
	this.returnUSD = returnUSD;
}
public Float getReturnBaseCurrency() {
	return returnBaseCurrency;
}
public void setReturnBaseCurrency(Float returnBaseCurrency) {
	this.returnBaseCurrency = returnBaseCurrency;
}
public Float getReturnUSD() {
	return returnUSD;
}
public void setReturnUSD(Float returnUSD) {
	this.returnUSD = returnUSD;
}
}
