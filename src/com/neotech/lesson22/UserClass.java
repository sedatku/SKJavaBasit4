package com.neotech.lesson22;

public class UserClass {
//    Write program: UserClass that has a constructor that
//    initializes instance variable name and mobile number.
//    Create a subclass UserInfo that will have user address
//    variable and it also being initialized through constructor
//    call. Print users name, mobile number and address in
//    userDetails method. Test your code.
	String name;
	String mobileNumber;

	UserClass(String name, String mobileNumber) {
		this.name = name;
		this.mobileNumber = mobileNumber;
	}
}

class UserInfo extends UserClass {
	String userAddress;

	UserInfo(String name, String mobileNumber, String userAddress) {
		super(name, mobileNumber);
		this.userAddress = userAddress;
	}

	void userDetails() {

		System.out.println("User name: " + name + ", mobil number: " 
		+ mobileNumber + ", address: " + userAddress);
	}

}