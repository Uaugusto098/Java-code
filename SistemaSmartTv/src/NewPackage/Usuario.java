package NewPackage;

public class Usuario {
	
		public static void main(String[] args) throws Exception {
			
			SmartTv  smartTv=new SmartTv();
			
			
			smartTv.diminuirVolume();
			smartTv.diminuirVolume();
			smartTv.diminuirVolume();
			smartTv.diminuirVolume();
			
			
			System.out.println("Tv ligada ? " + smartTv.ligada);
			System.out.println("Canal Atual ? "+ smartTv.canal);
			System.out.println("Volume Atual ? "+ smartTv.volume);
			
			smartTv.ligar();
			System.out.println("Novo status --> Tv ligada ?: " + smartTv.ligada);
			
			smartTv.desligar();
			System.out.println("Novo status --> Tv ligada ?: " + smartTv.ligada);
			
			
			smartTv.canal();
			System.out.println("Novo status --> Canal selecionado ?: " + smartTv.canal+"\n Volume atual: "+ smartTv.volume+"");
			
			
			
		}

}
