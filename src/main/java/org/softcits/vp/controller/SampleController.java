package org.softcits.vp.controller;

import org.softcits.vp.model.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class SampleController {
	@RequestMapping(value = { "/restfull" }, method = { RequestMethod.GET })
	public ResponseEntity<Person> getPerson(){
		Person p = new Person();
		p.setId(1);
		p.setName("zhangsan");
		System.out.println("sssssss");
		return new ResponseEntity<Person>(p, HttpStatus.OK);
	}
}
