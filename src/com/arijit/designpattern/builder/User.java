package com.arijit.designpattern.builder;

public class User {
	
	private String firstName; //Required
	private String lastname; //Required
	private String phoneNumber; //Required
	private String homeTown; //Optional
	private String zipcode; //Optional
	private String emailId; //Optional
	
	public String getFirstName() { return firstName; }
	public String getLastname() { return lastname; }
	public String getPhoneNumber() { return phoneNumber; }
	public String getHomeTown() { return homeTown; }
	public String getZipcode() { return zipcode; }
	public String getEmailId() { return emailId; }
	
	public User(UserBuilder userBuilder) {
		this.firstName = userBuilder.firstName;
		this.lastname = userBuilder.lastname;
		this.phoneNumber = userBuilder.phoneNumber;
		this.homeTown = userBuilder.homeTown;
		this.zipcode = userBuilder.zipcode;
		this.emailId = userBuilder.emailId;
	}
	
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastname=" + lastname + ", phoneNumber=" + phoneNumber
				+ ", homeTown=" + homeTown + ", zipcode=" + zipcode + ", emailId=" + emailId + "]";
	}

	public static class UserBuilder {
		private String firstName; //Required
		private String lastname; //Required
		private String phoneNumber; //Required
		private String homeTown; //Optional
		private String zipcode; //Optional
		private String emailId; //Optional
		
		public UserBuilder(String firstName, String lastName, String phoneNumber) {
			this.firstName = firstName;
			this.lastname = lastName;
			this.phoneNumber = phoneNumber;
		}

		public UserBuilder setHomeTown(String homeTown) {
			this.homeTown = homeTown;
			return this;
		}

		public UserBuilder setZipcode(String zipcode) {
			this.zipcode = zipcode;
			return this;
		}

		public UserBuilder setEmailId(String emailId) {
			this.emailId = emailId;
			return this;
		}
		
		public User build() {
			return new User(this);
		}
	}
}
