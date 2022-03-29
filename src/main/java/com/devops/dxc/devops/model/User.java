package com.devops.dxc.devops.model;

public class User {
    
    private float impuesto;
    private int sueldo;
    private int ahorro;
    private int diezxciento;
    
    public int getDiezxciento() {
		return diezxciento;
	}

	public void setDiezxciento(int diezxciento) {
		this.diezxciento = diezxciento;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	int saldo;
    
    public double getImpuesto() {
		return impuesto;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public int getAhorro() {
		return ahorro;
	}

	public void setAhorro(int ahorro) {
		this.ahorro = ahorro;
	}

	public void setImpuesto(float impu) {
		this.impuesto = impu;
	}

	@Override
	public String toString() {
		return "User [ahorro=" + ahorro + ", diezxciento=" + diezxciento + ", impuesto=" + impuesto + ", saldo=" + saldo
				+ ", sueldo=" + sueldo + "]";
	}


	
}