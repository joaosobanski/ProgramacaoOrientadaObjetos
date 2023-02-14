package aula1;

public class main {
	
	public static void print(String mensagem) {
		System.out.println(mensagem);
	}
	
	public static void print(int numero) {
		System.out.println(numero);
	}
	public static double print(double numeroDecimal) {
		System.out.println(numeroDecimal);
		return numeroDecimal;
	}

	public static int soma(int x, int y) {
		return x + y;
	}

	public static int subtracao(int x, int y) {
		return x - y;
	} 
	public static int divisao(int x, int y) {
		return x / y;
	}
	public static int restoDivisao(int x, int y) {
		return x % y;
	}
	public static int mult(int x, int y) {
		return x * y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		print("teste");
//		int resultado = soma(10, 5);
//		print(resultado);
		String a = "animal";
		print(a.substring(0, 3));
		char[] vet = {'a', 'n', 'i', 'm', 'a', 'l'};
		
		for(int c = 0; c < 3 ; c++) {
			System.out.print(vet[c]);
		}

//		int x = 2;
//		int y = 7;
//		int resultadoSoma = soma(x, y); 
//		print(x);
//		print(y);
//		print(resultadoSoma);
//		Animal
//		nome
//		raça
//		cor
//		AnimalPatas
//		numero de patas
//		AnimalNadadeiras
//		numero de nadadeiras
		
		
//		AnimalPatas exteder Animal imple AnimalPatas, AnimalNadadeiras
//		nome
//		raça
//		numero de patas
//		cor
		
//		AnimalPatas a = new AnimalPatas();
//		a.nome = "cachorro"
//		a.raça = "pitbull"
//		a.cor = "caramelo"
//		a.numeroPatas = 4;
		
//		for(int x = 0 ; x < numeros.length; x++) {
//			System.out.println(numeros[x]);
//		}
//		
//		int c=0;
//		do {
//			System.out.println(numeros[c]);
//			c++;
//		}while(c < numeros.length);
//
//		String a = "";
//		 
//		for(int item : numeros) {
//			System.out.println(item); 
//		}
		
		
//		double a = 1.1;
		
//		if(x+z >= 15) {
//			System.out.println("maior");
//		}else { 
//			System.out.println("menor");
//		}
		
	}

}
