package com.group.libraryapp.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookLoanRequest {

	private String userName;
	private String bookName;

	public BookLoanRequest(String userName, String bookName) {
		this.userName = userName;
		this.bookName = bookName;
	}
	
	public BookLoanRequest(){
		
	}
}
