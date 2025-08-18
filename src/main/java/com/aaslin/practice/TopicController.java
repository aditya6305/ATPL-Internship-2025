package com.aaslin.practice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@RequestMapping("/topics")
	 public String getAllTopicsString() {
		 return "All topics";
	 }
}
