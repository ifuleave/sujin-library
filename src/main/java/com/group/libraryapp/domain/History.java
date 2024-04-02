package com.group.libraryapp.domain;

import lombok.Getter;

@Getter
public class History {
	
	private Long historyId;
	private Long memberId;
	private String libraryBookname;
	private Boolean returnyn;
	
}
