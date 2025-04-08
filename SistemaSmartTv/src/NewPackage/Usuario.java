package NewPackage;

public class Usuario {
	
		public static void main(String[] args) throws Exception {
			
			SmartTv  smartTv=new SmartTv();
			
			
			
			
			
			System.out.println("Tv ligada ? " + smartTv.ligada);
			System.out.println("Canal Atual ? "+ smartTv.canal);
			System.out.println("Volume Atual ? "+ smartTv.volume);
			
			smartTv.ligar();
			System.out.println("Novo status --> Tv ligada ?: " + smartTv.ligada);
			System.out.println("\n");
			
			smartTv.desligar();
			System.out.println("Novo status --> Tv ligada ?: " + smartTv.ligada);
			System.out.println("\n");
			
			
			smartTv.canal();
			System.out.println("Novo status --> Canal selecionado ?: " + smartTv.canal+"\n Volume atual: "+ smartTv.volume+"");
			System.out.println("\n");
			
			
			smartTv.diminuirVolume();
			smartTv.diminuirVolume();
			smartTv.diminuirVolume();
			smartTv.diminuirVolume();
				System.out.println(" o volume atual é de :"+smartTv.volume);
				System.out.println("\n");
			
			
			System.out.println("Canal atual: "+ smartTv.canal);
			System.out.println("\n");
				smartTv.mudarCanal(20);				
			System.out.println("Novo status --> Canal atual: "+ smartTv.canal);	
			System.out.println("\n");
				smartTv.aumentarCanal();				
			System.out.println("Novo status --> Canal atual: "+ smartTv.canal);
			System.out.println("\n");
				smartTv.diminuirCanal();
			System.out.println("Novo status --> Canal atual: "+ smartTv.canal);
			System.out.println("\n");
			
					System.out.println("Tv ligada ? " + smartTv.ligada);
					System.out.println("Canal Atual ? "+ smartTv.canal);
					System.out.println("Volume Atual ? "+ smartTv.volume);
			
			
			
			
			
			
			
			
			
		}

}
