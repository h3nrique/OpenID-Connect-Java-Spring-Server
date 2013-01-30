package org.mitre.openid.connect.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

public interface UserInfo {

	/**
	 * @return the userId
	 */
	public abstract String getSub();

	/**
	 * @param sub the userId to set
	 */
	public abstract void setSub(String sub);
	
	/**
	 * @return the preferred username
	 */
	public abstract String getPreferredUsername();
	
	/**
	 * @param preferredUsername the preferredUsername to set
	 */
	public abstract void setPreferredUsername(String preferredUsername);

	/**
	 * @return the name
	 */
	public abstract String getName();

	/**
	 * @param name the name to set
	 */
	public abstract void setName(String name);

	/**
	 * @return the givenName
	 */
	public abstract String getGivenName();

	/**
	 * @param givenName the givenName to set
	 */
	public abstract void setGivenName(String givenName);

	/**
	 * @return the familyName
	 */
	public abstract String getFamilyName();

	/**
	 * @param familyName the familyName to set
	 */
	public abstract void setFamilyName(String familyName);

	/**
	 * @return the middleName
	 */
	public abstract String getMiddleName();

	/**
	 * @param middleName the middleName to set
	 */
	public abstract void setMiddleName(String middleName);

	/**
	 * @return the nickname
	 */
	public abstract String getNickname();

	/**
	 * @param nickname the nickname to set
	 */
	public abstract void setNickname(String nickname);

	/**
	 * @return the profile
	 */
	public abstract String getProfile();

	/**
	 * @param profile the profile to set
	 */
	public abstract void setProfile(String profile);

	/**
	 * @return the picture
	 */
	public abstract String getPicture();

	/**
	 * @param picture the picture to set
	 */
	public abstract void setPicture(String picture);

	/**
	 * @return the website
	 */
	public abstract String getWebsite();

	/**
	 * @param website the website to set
	 */
	public abstract void setWebsite(String website);

	/**
	 * @return the email
	 */
	public abstract String getEmail();

	/**
	 * @param email the email to set
	 */
	public abstract void setEmail(String email);

	/**
	 * @return the verified
	 */
	public abstract Boolean getEmailVerified();

	/**
	 * @param verified the verified to set
	 */
	public abstract void setEmailVerified(Boolean emailVerified);

	/**
	 * @return the gender
	 */
	public abstract String getGender();

	/**
	 * @param gender the gender to set
	 */
	public abstract void setGender(String gender);

	/**
	 * @return the zoneinfo
	 */
	public abstract String getZoneinfo();

	/**
	 * @param zoneinfo the zoneinfo to set
	 */
	public abstract void setZoneinfo(String zoneinfo);

	/**
	 * @return the locale
	 */
	public abstract String getLocale();

	/**
	 * @param locale the locale to set
	 */
	public abstract void setLocale(String locale);

	/**
	 * @return the phoneNumber
	 */
	public abstract String getPhoneNumber();

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public abstract void setPhoneNumber(String phoneNumber);

	/**
	 * @return the address
	 */
	public abstract Address getAddress();

	/**
	 * @param address the address to set
	 */
	public abstract void setAddress(Address address);

	/**
	 * @return the updatedTime
	 */
	public abstract String getUpdatedTime();

	/**
	 * @param updatedTime the updatedTime to set
	 */
	public abstract void setUpdatedTime(String updatedTime);


	/**
	 * 
	 * @return
	 */
	public abstract String getBirthdate();
	
	/**
	 * 
	 * @param birthdate
	 */
	public abstract void setBirthdate(String birthdate);
}