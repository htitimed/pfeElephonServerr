package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Souch;

@Service

public class SouchMockServiceImpl implements ISouchService{

	private List<Souch> souchs;
	public SouchMockServiceImpl() {
		souchs = new ArrayList<Souch>();
		
		souchs.add(new Souch("EVCH0001",200,"VG2"));
		souchs.add(new Souch("EVCH0001",200,"VG2"));
		souchs.add(new Souch("EVCH0001",200,"VG2"));
	}
	
	@Override
	public List<Souch> getSouchs() {	
		return souchs;
	}

	@Override
	public void addSouch(Souch souch) {
		souchs.add(souch);
	}

	@Override
	public void updateSouch(Souch souch) {
		souchs.remove(souch);
		souchs.add(souch);
	}

	@Override
	public void deleteSouch(String strainCode) {
		Souch souch = new Souch();
		souch.setStrainCode(strainCode);
		souchs.remove(souch);
		
	}

}
