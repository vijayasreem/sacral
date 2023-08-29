title, String firstName, String lastName, String email, String phoneNumber, String mobileNumber, String phoneNumber) {
		profileRepository.updateProfileByPhoneNumber(title, firstName, lastName, email, phoneNumber, mobileNumber, phoneNumber);
	}
	
	public void updateProfileByMobileNumber(String title, String firstName, String lastName, String email, String phoneNumber, String mobileNumber, String mobileNumber) {
		profileRepository.updateProfileByMobileNumber(title, firstName, lastName, email, phoneNumber, mobileNumber, mobileNumber);
	}
}

package com.Sacral.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Sacral.model.Profile;
import com.Sacral.service.ProfileService;

@RestController
@RequestMapping("/api/profile")
public class ProfileController {
	
	@Autowired
	private ProfileService profileService;
	
	@GetMapping("/byLoginId/{loginId}")
	public Profile getProfileByLoginId(@PathVariable String loginId) {
		return profileService.getProfileByLoginId(loginId);
	}
	
	@GetMapping("/byEmail/{email}")
	public Profile getProfileByEmail(@PathVariable String email) {
		return profileService.getProfileByEmail(email);
	}
	
	@GetMapping("/byPhoneNumber/{phoneNumber}")
	public Profile getProfileByPhoneNumber(@PathVariable String phoneNumber) {
		return profileService.getProfileByPhoneNumber(phoneNumber);
	}
	
	@GetMapping("/byMobileNumber/{mobileNumber}")
	public Profile getProfileByMobileNumber(@PathVariable String mobileNumber) {
		return profileService.getProfileByMobileNumber(mobileNumber);
	}
	
	@PostMapping("/updatePasswordByLoginId")
	public void updatePasswordByLoginId(@RequestParam String password, @RequestParam String loginId) {
		profileService.updatePasswordByLoginId(password, loginId);
	}
	
	@PostMapping("/updatePasswordByEmail")
	public void updatePasswordByEmail(@RequestParam String password, @RequestParam String email) {
		profileService.updatePasswordByEmail(password, email);
	}
	
	@PostMapping("/updatePasswordByPhoneNumber")
	public void updatePasswordByPhoneNumber(@RequestParam String password, @RequestParam String phoneNumber) {
		profileService.updatePasswordByPhoneNumber(password, phoneNumber);
	}
	
	@PostMapping("/updatePasswordByMobileNumber")
	public void updatePasswordByMobileNumber(@RequestParam String password, @RequestParam String mobileNumber) {
		profileService.updatePasswordByMobileNumber(password, mobileNumber);
	}
	
	@PostMapping("/updateLoginIdByLoginId")
	public void updateLoginIdByLoginId(@RequestParam String loginId, @RequestParam String oldLoginId) {
		profileService.updateLoginIdByLoginId(loginId, oldLoginId);
	}
	
	@PostMapping("/updateEmailByEmail")
	public void updateEmailByEmail(@RequestParam String email, @RequestParam String oldEmail) {
		profileService.updateEmailByEmail(email, oldEmail);
	}
	
	@PostMapping("/updatePhoneNumberByPhoneNumber")
	public void updatePhoneNumberByPhoneNumber(@RequestParam String phoneNumber, @RequestParam String oldPhoneNumber) {
		profileService.updatePhoneNumberByPhoneNumber(phoneNumber, oldPhoneNumber);
	}
	
	@PostMapping("/updateMobileNumberByMobileNumber")
	public void updateMobileNumberByMobileNumber(@RequestParam String mobileNumber, @Request