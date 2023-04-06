package com.April.jump.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class MainController {
	@GetMapping("/user")
	public HashMap<String, Object> getUser() {
		return null;
	}

	@PostMapping("/user")
	public int postUser(@RequestBody HashMap<String, Object> data) {
		return -1;
	}

	@PutMapping("/user/{userId}")
	public HashMap<String, Object> putUser(@PathVariable String userId, @RequestBody HashMap<String, Object> data) {
		return null;
	}

	@DeleteMapping("/user/{userId}")
	public int putUser(@PathVariable String userId) {
		return -1;
	}
}
