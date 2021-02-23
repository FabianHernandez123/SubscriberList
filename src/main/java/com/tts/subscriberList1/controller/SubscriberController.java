package com.tts.subscriberList1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.tts.subscriberList1.model.Subscriber;

@Controller
public class SubscriberController {
	
	@GetMapping(value="/")
	public String index(Subscriber subscriber) {
		return "subscriber/index";
	}
}
