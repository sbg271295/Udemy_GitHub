package service;

public class CalculadoraService {
	
	public int sumar(int a, int b) {
		return a+b;
	}
	
	public int restar(int a, int b) {
		return a-b;
	}
	
	public int multiplicar(int a, int b) {
		
		return a*b;
	}
	public int dividir(int a, int b) {
		
		return a/b;
	}
	public int potencia(int a, int b) {
		
		return (int)Math.pow(a,b);
	}

}
