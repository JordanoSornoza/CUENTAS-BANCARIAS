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
public class CuentaCorriente extends CuentaBancaria {
    double aumentoCc = 0;
	public void deposito(double dinero) {
		
		if(dinero <= 1000) {
			aumentoCc = (dinero*0.01);
			saldo +=(dinero +aumentoCc);
			
		}else {
			saldo+= dinero;
		}	
		}
}