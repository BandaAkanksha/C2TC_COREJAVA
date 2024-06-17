package com.hyd10.tns.userservice;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hyd10.tns.userentity.UserEntity;
import com.hyd10.tns.userrepository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;

	@Override
	public UserEntity saveUserEntity(UserEntity user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public List<UserEntity> fetchUserList() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public UserEntity fetchUserById(Long userId) {
		// TODO Auto-generated method stub
		return userRepository.findById(userId).get();
	}

	@Override
	public void deleteUserById(Long userId) {
		// TODO Auto-generated method stub
		userRepository.deleteById(userId);
	}

	@Override
	public UserEntity updateuserEntity(Long userId, UserEntity user) {
		// TODO Auto-generated method stub
		UserEntity depDB = userRepository.findById(userId).get();

	      if(Objects.nonNull(user.getName()) &&
	      !"".equalsIgnoreCase(user.getName())) {
	          depDB.setName(user.getName());
	      }

	      if(Objects.nonNull(user.getType()) &&
	              !"".equalsIgnoreCase(user.getType())) {
	          depDB.setType(user.getType());
	      }

	      if(Objects.nonNull(user.getPassword()) &&
	              !"".equalsIgnoreCase(user.getPassword())) {
	          depDB.setPassword(user.getPassword());
	      }

	      return userRepository.save(depDB);
	}
	
	
}
