package com.group.libraryapp.repository.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.group.libraryapp.domain.History;
import com.group.libraryapp.domain.Library;
import com.group.libraryapp.domain.User;
import com.group.libraryapp.dto.request.BookLoanRequest;
import com.group.libraryapp.dto.request.BookReturnRequest;
import com.group.libraryapp.dto.request.BookSaveRequest;
import com.group.libraryapp.dto.request.UserNameUpdateRequest;
import com.group.libraryapp.dto.request.UserSaveRequest;

@Mapper
public interface UserMapper {

	void userSave(UserSaveRequest request);

	List<User> userList();

	void userNameUpdate(UserNameUpdateRequest request);

	void deleteName(String name);

	void bookSave(String name);

	User getmemberId(String userName);

	History getBookHistory(String bookName);

	void bookLoan(@Param("memberId") Long memberId, @Param("bookName") String bookName);

	Library findBook(String bookName);

	void bookReturn(@Param("memberId")Long memberId,@Param("bookName") String bookName);

}
