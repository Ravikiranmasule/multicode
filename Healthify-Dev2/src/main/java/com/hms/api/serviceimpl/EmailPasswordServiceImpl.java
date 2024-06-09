// Java Program to Illustrate Creation Of
// Service implementation class

package com.hms.api.serviceimpl;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.hms.api.dao.UserDao;
import com.hms.api.entity.Otp;
import com.hms.api.entity.User;
import com.hms.api.model.EmailDetails;
import com.hms.api.model.ResetPasswordDetail;
import com.hms.api.service.EmailPasswordService;
import com.hms.api.service.UserService;
import com.hms.api.utility.OTPGenerator;

@Service
public class EmailPasswordServiceImpl implements EmailPasswordService {

	@Autowired
	private JavaMailSender javaMailSender;

	@Autowired
	private UserDao userDao;
	
	@Autowired
	private UserService userService;

	
	// Method 1
	// To send a simple email
	public boolean sendMail(EmailDetails details) {
		return false;
	}

	@Override
	public String resetPasswordByQA(ResetPasswordDetail detail) {
		return null;
	}

	@Override
	public String sendOtp(String UserId) {
		return null;
	}

	@Override
	public String resetPasswordByOtp(ResetPasswordDetail detail) {
		return null;
	}

}
