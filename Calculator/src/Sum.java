
public class Sum {
	// Declaração das propriedades/ atributos
	public Double num1;
	public Double num2;

	// Constroi o objeto quando for instanciado
	public Sum(Double num1, Double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	// Metodo que retorna a soma de dois numeros
	public Double calculateSum(Double num1, Double num2) {
		Double resultado = num1 + num2;
		return resultado;

	}
}
