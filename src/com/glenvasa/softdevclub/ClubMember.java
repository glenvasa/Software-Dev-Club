package com.glenvasa.softdevclub;

public class ClubMember {

	private String memberName, location, favoriteLanguage;

	public ClubMember(String memberName, String location, String favoriteLanguage) {

		this.memberName = memberName;
		this.location = location;
		this.favoriteLanguage = favoriteLanguage;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

}
