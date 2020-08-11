/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author PC-Admin
 */
public abstract class CuentaBancaria {
	private String propietario;
	public double saldo;
	
	public abstract void deposito(double dinero);
	
	public void retiro(double dinero) {
		if(saldo >= dinero) 
			saldo -= dinero;
		else {
			System.out.println("SALDO INSUFICIENTE");
		}
	}
	
	public String getPropietario() {
		return propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

}