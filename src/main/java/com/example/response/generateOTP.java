package com.example.response;

public class generateOTP {

	private int otp;
	private String portal;

	public generateOTP(int otp, String portal) {
		this.otp = otp;
		this.portal = portal;
	}

	public int getOtp() {
		return otp;
	}

	public void setOtp(int otp) {
		this.otp = otp;
	}

	public String getPortal() {
		return portal;
	}

	public void setPortal(String portal) {
		this.portal = portal;
	}
}
