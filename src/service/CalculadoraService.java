package service;

import utilidades.util;
public class CalculadoraService {
	
	util util= new util();
	
	public int sumar(int a, int b) {
		return a+b;
	}
	
	public int restar(int a, int b) {
		return util.mayor(a, b)-util.min(a, b);
	}
	
	public int multiplicar(int a, int b) {
		
		return a*b;
	}
	public int dividir(int a, int b) {
		
<<<<<<< HEAD
		return a/b;
	}
	public int potenciaymulti (int a, int b) {
		
		return (int)Math.pow(a,b)*a;
=======
		return util.mayor(a, b)/util.min(a, b);
>>>>>>> development
	}

}
