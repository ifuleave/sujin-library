package com.group.libraryapp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.group.libraryapp.dto.request.UserSaveRequest;
import com.group.libraryapp.dto.response.UserListResponse;
import com.group.libraryapp.service.UserServie;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class UserController {

	private final UserServie userServie;
	
	@PostMapping("/user")
	public void userSave(@RequestBody UserSaveRequest request) {
		userServie.userSave(request);
	}
	
	@GetMapping("/user")
	public List<UserListResponse> userList(){
		return userServie.userList();
	}
	
}
