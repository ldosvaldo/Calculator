
public class Division {
//Declaração das  propriedades/metodos
	public Double num1;
	public Double num2;

	// Constroi o objeto quando for instanciado
	public Division(Double num1, Double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	// Metodo que retorno o resultado da divisão de dois numeros
	public Double calculateDivision(Double num1, Double num2) {
		Double resultado = num1 / num2;
		return resultado;
	}

}
