package com.example.demo.entity;

public class Souch {
	public String getStrainCode() {
		return strainCode;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((strainCode == null) ? 0 : strainCode.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Souch other = (Souch) obj;
		if (strainCode == null) {
			if (other.strainCode != null)
				return false;
		} else if (!strainCode.equals(other.strainCode))
			return false;
		return true;
	}
	public void setStrainCode(String strainCode) {
		this.strainCode = strainCode;
	}
	public int getQuantityOfStorage() {
		return quantityOfStorage;
	}
	public void setQuantityOfStorage(int quantityOfStorage) {
		this.quantityOfStorage = quantityOfStorage;
	}
	public String getOriginalCode() {
		return originalCode;
	}
	public void setOriginalCode(String originalCode) {
		this.originalCode = originalCode;
	}
	public Souch(String strainCode, int quantityOfStorage, String originalCode) {
		super();
		this.strainCode = strainCode;
		this.quantityOfStorage = quantityOfStorage;
		this.originalCode = originalCode;
	}
	private String strainCode;
	private int quantityOfStorage;
	private String originalCode;
	public Souch() {
		super();
		// TODO Auto-generated constructor stub
	}
}
