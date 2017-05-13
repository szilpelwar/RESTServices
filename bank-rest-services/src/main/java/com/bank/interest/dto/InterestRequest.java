package com.bank.interest.dto;

public class InterestRequest {
private Float principal;
private Float rate;
private Float time;
private String interestType;
private String baseCurrency;
public Float getPrincipal() {
	return principal;
}
public void setPrincipal(Float principal) {
	this.principal = principal;
}
public Float getRate() {
	return rate;
}
public void setRate(Float rate) {
	this.rate = rate;
}
public Float getTime() {
	return time;
}
public void setTime(Float time) {
	this.time = time;
}
public String getInterestType() {
	return interestType;
}
public void setInterestType(String interestType) {
	this.interestType = interestType;
}
public String getBaseCurrency() {
	return baseCurrency;
}
public void setBaseCurrency(String baseCurrency) {
	this.baseCurrency = baseCurrency;
}
@Override
public String toString() {
	return "InterestRequest [principal=" + principal + ", rate=" + rate + ", time=" + time + ", interestType="
			+ interestType + ", baseCurrency=" + baseCurrency + "]";
}


}
