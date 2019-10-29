package com.boot.example.mapper;

import java.util.List;

import com.boot.example.dto.UserDto;

public interface UserMapper {
	public void insertUser (UserDto user);
    public void updateUser (UserDto user);
    public void deleteUser (String userId);
    public UserDto selectOneUser (String userId);
    public List<UserDto> selectAllUser();
}
