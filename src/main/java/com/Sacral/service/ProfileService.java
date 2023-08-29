firstName = :firstName, p.lastName = :lastName, p.email = :email, p.phoneNumber = :phoneNumber, p.mobileNumber = :mobileNumber WHERE p.phoneNumber = :phoneNumber")
	void updateProfileByPhoneNumber(@Param("title") String title, @Param("firstName") String firstName, @Param("lastName") String lastName, @Param("email") String email, @Param("phoneNumber") String phoneNumber, @Param("mobileNumber") String mobileNumber, @Param("phoneNumber") String phoneNumber);
	
	@Query("UPDATE Profile p SET p.title = :title, p.firstName = :firstName, p.lastName = :lastName, p.email = :email, p.phoneNumber = :phoneNumber, p.mobileNumber = :mobileNumber WHERE p.mobileNumber = :mobileNumber")
	void updateProfileByMobileNumber(@Param("title") String title, @Param("firstName") String firstName, @Param("lastName") String lastName, @Param("email") String email, @Param("phoneNumber") String phoneNumber, @Param("mobileNumber") String mobileNumber, @Param("mobileNumber") String mobileNumber);
	
}

package com.Sacral.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sacral.model.Profile;
import com.Sacral.repository.ProfileRepository;

@Service
public class ProfileService {
	
	@Autowired
	private ProfileRepository profileRepository;
	
	public Profile getProfileByLoginId(String loginId) {
		return profileRepository.getProfileByLoginId(loginId);
	}
	
	public Profile getProfileByEmail(String email) {
		return profileRepository.getProfileByEmail(email);
	}
	
	public Profile getProfileByPhoneNumber(String phoneNumber) {
		return profileRepository.getProfileByPhoneNumber(phoneNumber);
	}
	
	public Profile getProfileByMobileNumber(String mobileNumber) {
		return profileRepository.getProfileByMobileNumber(mobileNumber);
	}
	
	public void updatePasswordByLoginId(String password, String loginId) {
		profileRepository.updatePasswordByLoginId(password, loginId);
	}
	
	public void updatePasswordByEmail(String password, String email) {
		profileRepository.updatePasswordByEmail(password, email);
	}
	
	public void updatePasswordByPhoneNumber(String password, String phoneNumber) {
		profileRepository.updatePasswordByPhoneNumber(password, phoneNumber);
	}
	
	public void updatePasswordByMobileNumber(String password, String mobileNumber) {
		profileRepository.updatePasswordByMobileNumber(password, mobileNumber);
	}
	
	public void updateLoginIdByLoginId(String loginId, String oldLoginId) {
		profileRepository.updateLoginIdByLoginId(loginId, oldLoginId);
	}
	
	public void updateEmailByEmail(String email, String oldEmail) {
		profileRepository.updateEmailByEmail(email, oldEmail);
	}
	
	public void updatePhoneNumberByPhoneNumber(String phoneNumber, String oldPhoneNumber) {
		profileRepository.updatePhoneNumberByPhoneNumber(phoneNumber, oldPhoneNumber);
	}
	
	public void updateMobileNumberByMobileNumber(String mobileNumber, String oldMobileNumber) {
		profileRepository.updateMobileNumberByMobileNumber(mobileNumber, oldMobileNumber);
	}
	
	public void updateProfileByLoginId(String title, String firstName, String lastName, String email, String phoneNumber, String mobileNumber, String loginId) {
		profileRepository.updateProfileByLoginId(title, firstName, lastName, email, phoneNumber, mobileNumber, loginId);
	}
	
	public void updateProfileByEmail(String title, String firstName, String lastName, String email, String phoneNumber, String mobileNumber, String email) {
		profileRepository.updateProfileByEmail(title, firstName, lastName, email, phoneNumber, mobileNumber, email);
	}
	
	public void updateProfileByPhoneNumber(String