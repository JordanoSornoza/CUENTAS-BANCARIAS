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
public class CuentaAhorro  extends CuentaBancaria {
    double aumentoCa = 0;
	public void deposito(double dinero) {
		
		if(dinero < 1000) {
			aumentoCa = dinero*0.02;
			saldo +=(dinero + aumentoCa);
		
		}else {
			saldo+= dinero;
		}	
		}
}
