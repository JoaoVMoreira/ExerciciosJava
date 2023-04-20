package Ex1Classe;

public class ex1Classe {

	public static void main(String[] args) {
		/*******************************************************************************
		* 1) Implementar uma classe Caneta que deve possuir como características marca,
		*	cor e tamanho. Nesta classe devem ser implementados os métodos construtores,
		*	getters, setters e toString. Em uma outra classe chamada CanetaTeste deverá
		*	ser criado um objeto do tipo Caneta, atribuir valores e exibir os dados
		*	deste objeto.
		*******************************************************************************/
		
		Caneta caneta = new Caneta();
		
		caneta.setMarca("Bic");
		caneta.setCor("Azul");
		caneta.setTamanho(10);
		
		System.out.println(caneta.getCor());
		System.out.println(caneta.getMarca());
		System.out.println(caneta.getTamanho());
		
	}

}
