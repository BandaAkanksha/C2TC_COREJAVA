package com.hyd10.tns.userrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hyd10.tns.userentity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long>{

}
