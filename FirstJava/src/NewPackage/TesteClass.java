package Newpackage;

public class Testeclass {

	public static void main(String[] args) {
		//System.out.print("MEU PRIMEIRO PRINT EM JAVA, NOVO EINSTEIN DO JAVA");
		int incremento=10;
		boolean verdadeira=true;
		boolean falso=false;
		int idade=19;
			String primeiroNome="Pedro";
			String segundoNome="Augusto";	
			String nomeCompleto= nomeCompleto(primeiroNome,segundoNome,idade);
			System.out.println(nomeCompleto);
			
		System.out.println(falso);
			String resultDoNome=primeiroNome=="Pedro"  ? "Bem vindo novamente Pedro augusto"  : "Usuario não encontrado,crie um cadastro";
	
		
		if (idade==19){
			System.out.println("  Seu cadastro está validado");
			System.out.println(verdadeira);		
		}
		else {
			System.out.println("  Seu cadastro esta invalido");
			System.out.println(falso);			
		}
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	
	}
	
	public static String nomeCompleto (String primeiroNome,String segundoNome,int idade)
	{
		return "Resultado do método: "+primeiroNome.concat(" ").concat(segundoNome+("  idade:  "))+idade+(" anos ");
				
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
