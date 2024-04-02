package com.group.libraryapp.domain;

import lombok.Getter;

@Getter
public class User {
	
	private Long memberId;
	private String memberName;
	private int memberAge;
	
	public User(Long memberId, String memberName, int memberAge) {

		this.memberId = memberId;
		this.memberName = memberName;
		this.memberAge = memberAge;
	}
	

	
}
