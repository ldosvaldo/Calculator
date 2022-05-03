
public class Potentiation {
//Declaração de propriedades / atributos
	public Double num1;
	public Double num2;
	
	// Constroi o objeto quando for instanciado
	public Potentiation(Double num1, Double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	// Metodo que retorna o resultado da multiplicação
	public Double calculatePotentiation(Double num1, Double num2) {
		Double resultado = Math.pow(num1, num2);
		return resultado;			
	}
}
