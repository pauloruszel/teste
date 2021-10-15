/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	protected BigDecimal valorTarifa;
	private void calculaNumero(BigDecimal numero) {
	    double parteNumero = numero.doubleValue() - Math.floor(numero.doubleValue());
		String str = String.valueOf(parteNumero).replaceAll("0.", "");
		String str1 = str.substring(0, 3);
		BigDecimal novo = new BigDecimal(str1);
		System.out.println(" Novo: " + novo);
		int beforeLast = (novo.intValue() % 100) / 10;
		if (beforeLast >= 5) {
			this.valorTarifa = numero.setScale(2, RoundingMode.HALF_DOWN);
		} else {
			this.valorTarifa = numero.setScale(2, RoundingMode.HALF_UP);
		}
		System.out.println(" Valor Tarifa: " + this.valorTarifa);
	}

	public static void main(String[] args) {
		Ideone id = new Ideone();
		id.calculaNumero(new BigDecimal("298.851"));
	}
}