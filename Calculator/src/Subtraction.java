
public class Subtraction {
	// Declaraçao das propriedades / atributos
	public Double num1;
	public Double num2;

	// Constroi o objeto quando for instanciado
	public Subtraction(Double num1, Double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	// Metodo que retorna a subtracao dos numeros
	public Double calculateSubtraction(Double num1, Double num2) {
		Double resultado = num1 - num2;
		return resultado;
	}
}
