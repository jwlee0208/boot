package com.boot.example.service;

import java.util.List;

import com.boot.example.dto.UserDto;

public interface UserService {
	public boolean login (String userId, String userPw);
    public boolean join (UserDto user);
    public void modify (UserDto user);
    public void withdraw (String userId);
    public UserDto getUser (String userId);
    public List<UserDto> getUserList();
}
