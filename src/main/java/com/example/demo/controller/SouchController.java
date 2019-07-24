package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Souch;
import com.example.demo.service.ISouchService;

@RestController
@RequestMapping("/api/souch") 
@CrossOrigin

public class SouchController {
	
	@Autowired
	private ISouchService souchService;
	public List<Souch> getSouchs(){
		return souchService.getSouchs();
	}
	@PostMapping
	public void addSouch(@RequestBody Souch souch) {
		souchService.addSouch(souch);
	}
	
	@PutMapping
	public void updateSouch(@RequestBody Souch souch) {
		souchService.updateSouch(souch);
	}
	
	@DeleteMapping("/strainCode")
	public void deleteSouch(@PathVariable String strainCode) {
		souchService.deleteSouch(strainCode);
	}
}


