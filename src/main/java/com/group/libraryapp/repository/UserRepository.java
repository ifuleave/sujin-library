package com.group.libraryapp.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.group.libraryapp.domain.History;
import com.group.libraryapp.domain.Library;
import com.group.libraryapp.domain.User;
import com.group.libraryapp.dto.request.BookLoanRequest;
import com.group.libraryapp.dto.request.BookSaveRequest;
import com.group.libraryapp.dto.request.UserNameUpdateRequest;
import com.group.libraryapp.dto.request.UserSaveRequest;
import com.group.libraryapp.dto.response.UserListResponse;
import com.group.libraryapp.repository.mapper.UserMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class UserRepository {

	private final UserMapper userMapper;

	public void userSave(UserSaveRequest request) {
		// TODO Auto-generated method stub
		userMapper.userSave(request);
	}

	public List<User> userList() {
		// TODO Auto-generated method stub
		return userMapper.userList();
	}

	public void userNameUpdate(UserNameUpdateRequest request) {
		// TODO Auto-generated method stub
		userMapper.userNameUpdate(request);
	}

	public void deleteName(String name) {
		// TODO Auto-generated method stub
		userMapper.deleteName(name);
	}

	public void bookSave(String name) {
		// TODO Auto-generated method stub
		userMapper.bookSave(name);
	}

	public User getmemberId(String userName) {
		// TODO Auto-generated method stub
		return userMapper.getmemberId(userName);
	}

	public History getBookHistory(String bookName) {
		// TODO Auto-generated method stub
		return userMapper.getBookHistory(bookName);
	}

	public void bookLoan(Long memberId, String bookName) {
		// TODO Auto-generated method stub
		userMapper.bookLoan(memberId, bookName);
	}

}
