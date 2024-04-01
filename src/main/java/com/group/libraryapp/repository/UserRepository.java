package com.group.libraryapp.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.group.libraryapp.domain.User;
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
	
}
