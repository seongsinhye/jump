package com.april.jump.mapper;

import com.april.jump.vo.UserVo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;


@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class MapperTest {
	@Autowired
	MainMapper mainMapper;
	@Test
	@DisplayName("mapper test")
	public void MapperTest() throws Exception{
		System.out.println("----------------------");
		UserVo user = mainMapper.getUser();
		System.out.println(user.id);
	}
}
