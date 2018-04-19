package org.softcits.vp.controller;

import org.softcits.vp.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.softcits.vp.model.MbgComputer;
@RestController
@RequestMapping("/admin/pc")
public class ComputerController {
	
	@Autowired
	private ComputerService computerService;

	@RequestMapping(value = { "/getAll" }, method = { RequestMethod.GET })
	public ResponseEntity<List<MbgComputer>> getAll(){
		return new ResponseEntity<>(computerService.getComputers(),HttpStatus.OK);
	}
	
	@RequestMapping(value ="/add", method = RequestMethod.POST)
	public ResponseEntity<String> addComputer(@RequestBody MbgComputer mbgComputer){
		
		computerService.addComputer(mbgComputer);
		
		return new ResponseEntity<String>("Success", HttpStatus.OK);
	}
}
