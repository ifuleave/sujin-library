package com.group.libraryapp.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.group.libraryapp.domain.History;
import com.group.libraryapp.domain.Library;
import com.group.libraryapp.domain.User;
import com.group.libraryapp.dto.request.BookLoanRequest;
import com.group.libraryapp.dto.request.BookReturnRequest;
import com.group.libraryapp.dto.request.BookSaveRequest;
import com.group.libraryapp.dto.request.UserNameUpdateRequest;
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

	@Transactional
	public void userNameUpdate(UserNameUpdateRequest request) {
		// TODO Auto-generated method stub
		userRepository.userNameUpdate(request);
	}

	@Transactional
	public void deleteName(String name) {
		// TODO Auto-generated method stub
		userRepository.deleteName(name);
	}

	@Transactional
	public void bookSave(String name) {
		// TODO Auto-generated method stub
		userRepository.bookSave(name);
	}

	@Transactional
	public void bookLoan(BookLoanRequest request) {
		// TODO Auto-generated method stub

		User user = userRepository.getmemberId(request.getUserName());

		// 책 찾는거.. (추가)
		Library library = userRepository.findBook(request.getBookName());
		
		History history = userRepository.getBookHistory(request.getBookName());

		if (history != null) {
			throw new IllegalArgumentException("대여중인 책입니다.");
		}

		userRepository.bookLoan(user.getMemberId(), request.getBookName());
	}

	@Transactional
	public void bookRrturn(BookReturnRequest request) {
		// TODO Auto-generated method stub
		User user = userRepository.getmemberId(request.getUserName());
		
		userRepository.bookReturn(user.getMemberId(),request.getBookName());			
	}
	
	

}
