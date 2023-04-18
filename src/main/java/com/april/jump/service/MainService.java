package com.april.jump.service;

import com.april.jump.mapper.MainMapper;
import com.april.jump.vo.UserVo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@AllArgsConstructor
@Service
public class MainService {
	MainMapper mainMapper;
	public UserVo getUser() {
		return mainMapper.getUser();
	}

	public int postUser(HashMap<String, Object> data) {
		return mainMapper.postUser(data);
	}

	public int putUser(String userId, HashMap<String, Object> data) {
		data.put("userId", userId);
		return mainMapper.putUser(data);
	}

	public int deleteUser(String userId) {
		return mainMapper.deleteUser(userId);
	}
}
