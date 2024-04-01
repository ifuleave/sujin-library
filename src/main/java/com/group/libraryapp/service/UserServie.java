package com.group.libraryapp.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.group.libraryapp.domain.User;
import com.group.libraryapp.dto.request.UserSaveRequest;
import com.group.libraryapp.dto.response.UserListResponse;
import com.group.libraryapp.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class UserServie {

	private final UserRepository userRepository;

	@Transactional
	public void userSave(UserSaveRequest request) {
		// TODO Auto-generated method stub
		userRepository.userSave(request);
	}

	public List<UserListResponse> userList() {
		// TODO Auto-generated method stub

		List<User> users = userRepository.userList();
		List<UserListResponse> list = new ArrayList<>();
		

		for (int i = 0; i < users.size(); i++) {
			UserListResponse userList = new UserListResponse();
			userList.setId(users.get(i).getMemberId());
			userList.setName(users.get(i).getMemberName());
			userList.setAge(users.get(i).getMemberAge());

			list.add(userList);

		}

		return list;
	}

}
