package com.insurancemanagement.Insurance.Bean;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class VehicleInsurance extends Insurance {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String vehicleNo;
	private String licenseNo;
	private String vehicleType;

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public String getLicenseNo() {
		return licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	@Override
	public String toString() {
		return "VehicleInsurance [vehicleNo=" + vehicleNo + ", licenseNo=" + licenseNo + ", vehicleType=" + vehicleType
				+ "]";
	}

}
