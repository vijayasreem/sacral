p.firstName = :firstName, p.lastName = :lastName, p.email = :email, p.phoneNumber = :phoneNumber, p.mobileNumber = :mobileNumber WHERE p.phoneNumber = :phoneNumber")
	void updateProfileByPhoneNumber(@Param("title") String title, @Param("firstName") String firstName, @Param("lastName") String lastName, @Param("email") String email, @Param("phoneNumber") String phoneNumber, @Param("mobileNumber") String mobileNumber, @Param("phoneNumber") String phoneNumber);
	
	@Query("UPDATE Profile p SET p.title = :title, p.firstName = :firstName, p.lastName = :lastName, p.email = :email, p.phoneNumber = :phoneNumber, p.mobileNumber = :mobileNumber WHERE p.mobileNumber = :mobileNumber")
	void updateProfileByMobileNumber(@Param("title") String title, @Param("firstName") String firstName, @Param("lastName") String lastName, @Param("email") String email, @Param("phoneNumber") String phoneNumber, @Param("mobileNumber") String mobileNumber, @Param("mobileNumber") String mobileNumber);
	
	@Query("DELETE FROM Profile p WHERE p.loginId = :loginId")
	void deleteProfileByLoginId(@Param("loginId") String loginId);
	
	@Query("DELETE FROM Profile p WHERE p.email = :email")
	void deleteProfileByEmail(@Param("email") String email);
	
	@Query("DELETE FROM Profile p WHERE p.phoneNumber = :phoneNumber")
	void deleteProfileByPhoneNumber(@Param("phoneNumber") String phoneNumber);
	
	@Query("DELETE FROM Profile p WHERE p.mobileNumber = :mobileNumber")
	void deleteProfileByMobileNumber(@Param("mobileNumber") String mobileNumber);
}

package com.Sacral.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Profile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String title;
	private String firstName;
	private String lastName;
	private String loginId;
	private String password;
	private String email;
	private String phoneNumber;
	private String mobileNumber;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	

}