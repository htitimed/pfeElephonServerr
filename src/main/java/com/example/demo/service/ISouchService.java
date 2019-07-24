package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Souch;

public interface ISouchService {
	List <Souch> getSouchs();
	void addSouch(Souch souch);
	void updateSouch(Souch souch);
	void deleteSouch(String strainCode);
}
