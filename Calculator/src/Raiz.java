
public class Raiz {
	// Declaração das propriedades/ atributos
	public Double num1;
	
	// Constroi o objeto quando for instanciado
	public Raiz(Double num1) {
		this.num1 = num1;
	}
	// Metodo que retorna a soma de dois numeros
	public Double calculateRaiz(Double num1) {
		Double resultado = Math.sqrt(num1);
		return resultado;
	}
	
}
