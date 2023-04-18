package com.april.jump.mapper;


import com.april.jump.vo.UserVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface MainMapper {
	UserVo getUser();
	int postUser(HashMap<String, Object> data);
	int putUser(HashMap<String, Object> data);
	int deleteUser(String userId);
}
