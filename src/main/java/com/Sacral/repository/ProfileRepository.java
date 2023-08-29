package com.Sacral.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Sacral.model.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {

	@Query("SELECT p FROM Profile p WHERE p.loginId = :loginId")
	Profile getProfileByLoginId(@Param("loginId") String loginId);

	@Query("SELECT p FROM Profile p WHERE p.email = :email")
	Profile getProfileByEmail(@Param("email") String email);
	
	@Query("SELECT p FROM Profile p WHERE p.phoneNumber = :phoneNumber")
	Profile getProfileByPhoneNumber(@Param("phoneNumber") String phoneNumber);
	
	@Query("SELECT p FROM Profile p WHERE p.mobileNumber = :mobileNumber")
	Profile getProfileByMobileNumber(@Param("mobileNumber") String mobileNumber);
	
	@Query("UPDATE Profile p SET p.password = :password WHERE p.loginId = :loginId")
	void updatePasswordByLoginId(@Param("password") String password, @Param("loginId") String loginId);
	
	@Query("UPDATE Profile p SET p.password = :password WHERE p.email = :email")
	void updatePasswordByEmail(@Param("password") String password, @Param("email") String email);
	
	@Query("UPDATE Profile p SET p.password = :password WHERE p.phoneNumber = :phoneNumber")
	void updatePasswordByPhoneNumber(@Param("password") String password, @Param("phoneNumber") String phoneNumber);
	
	@Query("UPDATE Profile p SET p.password = :password WHERE p.mobileNumber = :mobileNumber")
	void updatePasswordByMobileNumber(@Param("password") String password, @Param("mobileNumber") String mobileNumber);
	
	@Query("UPDATE Profile p SET p.loginId = :loginId WHERE p.loginId = :oldLoginId")
	void updateLoginIdByLoginId(@Param("loginId") String loginId, @Param("oldLoginId") String oldLoginId);
	
	@Query("UPDATE Profile p SET p.email = :email WHERE p.email = :oldEmail")
	void updateEmailByEmail(@Param("email") String email, @Param("oldEmail") String oldEmail);
	
	@Query("UPDATE Profile p SET p.phoneNumber = :phoneNumber WHERE p.phoneNumber = :oldPhoneNumber")
	void updatePhoneNumberByPhoneNumber(@Param("phoneNumber") String phoneNumber, @Param("oldPhoneNumber") String oldPhoneNumber);
	
	@Query("UPDATE Profile p SET p.mobileNumber = :mobileNumber WHERE p.mobileNumber = :oldMobileNumber")
	void updateMobileNumberByMobileNumber(@Param("mobileNumber") String mobileNumber, @Param("oldMobileNumber") String oldMobileNumber);
	
	@Query("UPDATE Profile p SET p.title = :title, p.firstName = :firstName, p.lastName = :lastName, p.email = :email, p.phoneNumber = :phoneNumber, p.mobileNumber = :mobileNumber WHERE p.loginId = :loginId")
	void updateProfileByLoginId(@Param("title") String title, @Param("firstName") String firstName, @Param("lastName") String lastName, @Param("email") String email, @Param("phoneNumber") String phoneNumber, @Param("mobileNumber") String mobileNumber, @Param("loginId") String loginId);
	
	@Query("UPDATE Profile p SET p.title = :title, p.firstName = :firstName, p.lastName = :lastName, p.email = :email, p.phoneNumber = :phoneNumber, p.mobileNumber = :mobileNumber WHERE p.email = :email")
	void updateProfileByEmail(@Param("title") String title, @Param("firstName") String firstName, @Param("lastName") String lastName, @Param("email") String email, @Param("phoneNumber") String phoneNumber, @Param("mobileNumber") String mobileNumber, @Param("email") String email);
	
	@Query("UPDATE Profile p SET p.title = :title,