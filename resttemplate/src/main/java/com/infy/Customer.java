package com.infy;

public class Customer {

	
int custId;
String custName ;
int custAge ;
String custAddress ;
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
public Customer(int custId, String custName, int custAge, String custAddress) {
	super();
	this.custId = custId;
	this.custName = custName;
	this.custAge = custAge;
	this.custAddress = custAddress;
}
public int getCustId() {
	return custId;
}
public void setCustId(int custId) {
	this.custId = custId;
}
public String getCustName() {
	return custName;
}
public void setCustName(String custName) {
	this.custName = custName;
}
public int getCustAge() {
	return custAge;
}
public void setCustAge(int custAge) {
	this.custAge = custAge;
}
public String getCustAddress() {
	return custAddress;
}
public void setCustAddress(String custAddress) {
	this.custAddress = custAddress;
}
@Override
public String toString() {
	return "Customer [custId=" + custId + ", custName=" + custName + ", custAge=" + custAge + ", custAddress="
			+ custAddress + "]";
}


}
