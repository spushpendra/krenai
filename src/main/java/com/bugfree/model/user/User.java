package com.bugfree.model.user;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import com.bugfree.common.KrenaiCONSTANTS;
import com.bugfree.model.status.Status;

@Entity
@Table(name="user")
public class User {

	@Id
	@GeneratedValue
	private int userId;
	
	private String firstName;
	
	private String lastName;
	
	private String emailId;
	
	private String profileImageUrl;
	
	private String profileStatus;
	
	@Column(length=512)
	private String deviceToken;

	
	/*@OneToOne
	@JoinColumn(name="user_personal_detail_id")
	private UserPersonalDetails userPersonalDetails;
	*/
	
	@Column(unique=true)
	private String contactNo;
	@Type(type="date")
	private Date dob;
	@Type(type="date")
	private Date createdDate;
	private String lastAccessUrl;
	/*@OneToOne
	@JoinColumn(name="user_address_id")
	private UserAddress userAddress;
	
	public UserAddress getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(UserAddress userAddress) {
		this.userAddress = userAddress;
	}*/
	@OneToOne
	@JoinColumn(name="default_user_addressbook_id")
	private UserAddressBook defaultUserAddressBook;

	@Column(length=1200)
	private String salt;
	@Column(length=1200)
	private String password;
	
	@ManyToOne
	@JoinColumn(name="status")
	private Status status;
	
	private int otp;
	
	@Type(type="date")
	private Date otpSessionDate;
	
	
	@PrePersist
	private void onCreate(){
		Date date =KrenaiCONSTANTS.getCurrentDate();
		this.createdDate=date;
	}
	
	public String getProfileStatus() {
		return profileStatus;
	}

	
	
	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public void setProfileStatus(String profileStatus) {
		this.profileStatus = profileStatus;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getLastAccessUrl() {
		return lastAccessUrl;
	}

	public void setLastAccessUrl(String lastAccessUrl) {
		this.lastAccessUrl = lastAccessUrl;
	}

	public UserAddressBook getDefaultUserAddressBook() {
		return defaultUserAddressBook;
	}

	public void setDefaultUserAddressBook(UserAddressBook defaultUserAddressBook) {
		this.defaultUserAddressBook = defaultUserAddressBook;
	}

	public String getProfileImageUrl() {
		return profileImageUrl;
	}

	public void setProfileImageUrl(String profileImageUrl) {
		this.profileImageUrl = profileImageUrl;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public int getOtp() {
		return otp;
	}

	public void setOtp(int otp) {
		this.otp = otp;
	}

	public Date getOtpSessionDate() {
		return otpSessionDate;
	}

	public void setOtpSessionDate(Date otpSessionDate) {
		this.otpSessionDate = otpSessionDate;
	}

	

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/*public UserPersonalDetails getUserPersonalDetails() {
		return userPersonalDetails;
	}

	public void setUserPersonalDetails(UserPersonalDetails userPersonalDetails) {
		this.userPersonalDetails = userPersonalDetails;
	}*/

	public String getDeviceToken() {
		return deviceToken;
	}

	public void setDeviceToken(String deviceToken) {
		this.deviceToken = deviceToken;
	}
	
	
	
}
