package com.group.libraryapp.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookReturnRequest {

	private String userName;
	private String bookName;

	public BookReturnRequest(String userName, String bookName) {
		this.userName = userName;
		this.bookName = bookName;
	}
	
	public BookReturnRequest(){
		
	}
}
