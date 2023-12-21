package com.bs.firstboot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bs.firstboot.model.dto.Food;

@RestController
public class BasicController {
	
	@GetMapping("/")
	public String helloBoot() {
		return "HelloBoot";
	}
	
	@GetMapping("/foods")
	public List<Food> myfood() {
		return List.of(
				Food.builder().name("국밥").price(10000).type("한식").build(),
				Food.builder().name("짜글이").price(9000).type("한식").build(),
				Food.builder().name("김밥").price(6500).type("한식").build(),
				Food.builder().name("짬뽕").price(10000).type("중식").build()
				);
	}
}



