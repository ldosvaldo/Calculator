
public class ModificadoresExemplos {
	
	//public = visivel para todos, ate em outros pacotes
	
	//protected = Visivel apenas DENTRO do pacote ou por HERANÇA(mas dentro do pct)
	
			//private = so pode ser usado na mesma CLASSE - Usar qd uma função tem q ser realizada
	//apenas naqle metodo (como um calculo interno)
		void ModificadoresDeMetodos() {
			
			Sum obj = new Sum(1.0, 2.0);
			obj.calculateSum(null, null);
		}
	
}
