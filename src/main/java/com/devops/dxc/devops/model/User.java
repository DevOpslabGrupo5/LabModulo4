package com.devops.dxc.devops.model;

import java.sql.Date;

@SuppressWarnings("unused")
public class User {
  

    
    public float impuesto;
    public int sueldo;
    public int ahorro;
    public int diezxciento;
    
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

	     
    // override toString()
 
}