package com.group.libraryapp.repository.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.group.libraryapp.domain.User;
import com.group.libraryapp.dto.request.UserSaveRequest;

@Mapper
public interface UserMapper {

	void userSave(UserSaveRequest request);

	List<User> userList();


}
