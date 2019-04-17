package com.capgemini.employeeonetoone.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Profile {

	@Id
	private int profileId;
	private String profileDescription;

	@OneToOne(mappedBy = "profile")
	private Employee employee;

	public Profile() {
		super();
	}

	public Profile(int profileId, String profileDescription) {
		super();
		this.profileId = profileId;
		this.profileDescription = profileDescription;
	}

	public int getProfileId() {
		return profileId;
	}

	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}

	public String getProfileDescription() {
		return profileDescription;
	}

	public void setProfileDescription(String profileDescription) {
		this.profileDescription = profileDescription;
	}

	@Override
	public String toString() {
		return "Profile [profileId=" + profileId + ", profileDescription=" + profileDescription + ", employee="
				+ employee + "]";
	}

}
