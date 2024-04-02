package com.group.libraryapp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.group.libraryapp.domain.User;
import com.group.libraryapp.dto.request.BookLoanRequest;
import com.group.libraryapp.dto.request.BookSaveRequest;
import com.group.libraryapp.dto.request.UserNameUpdateRequest;
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
	public List<UserListResponse> userList() {
		return userServie.userList();
	}

	@PutMapping("/user")
	public void userNameUpdate(@RequestBody UserNameUpdateRequest request) {
		userServie.userNameUpdate(request);
	}

	@DeleteMapping("/user")
	public void deleteName(@RequestParam("name") String name) {
		userServie.deleteName(name);
	}

	@PostMapping("/book")
	public void bookSave(@RequestBody BookSaveRequest request) {
		userServie.bookSave(request.getName());
	}

	@PostMapping("/book/loan")
	public void bookLoan(@RequestBody BookLoanRequest request) {
		userServie.bookLoan(request);
	}

}
