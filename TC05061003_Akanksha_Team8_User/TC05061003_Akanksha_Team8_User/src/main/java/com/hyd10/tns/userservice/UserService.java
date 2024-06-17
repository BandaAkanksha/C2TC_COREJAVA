package com.hyd10.tns.userservice;

import java.util.List;

import com.hyd10.tns.userentity.UserEntity;

public interface UserService {
	UserEntity saveUserEntity(UserEntity user);
	
	public List<UserEntity> fetchUserList();

	public UserEntity fetchUserById(Long userId);

	public void deleteUserById(Long userId);

	public UserEntity updateuserEntity(Long userId, UserEntity user);


}
