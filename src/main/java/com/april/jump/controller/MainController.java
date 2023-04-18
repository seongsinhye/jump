package com.april.jump.controller;

import com.april.jump.service.MainService;
import com.april.jump.vo.UserVo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@AllArgsConstructor
public class MainController {
	MainService mainService;
	@GetMapping("/user")
	public UserVo getUser() {
		return mainService.getUser();
	}

	@PostMapping("/user")
	public int postUser(@RequestBody HashMap<String, Object> data) {
		return mainService.postUser(data);
	}

	@PutMapping("/user/{userId}")
	public int putUser(@PathVariable String userId, @RequestBody HashMap<String, Object> data) {
		return mainService.putUser(userId, data);
	}

	@DeleteMapping("/user/{userId}")
	public int deleteUser(@PathVariable String userId) {
		return mainService.deleteUser(userId);
	}
}
