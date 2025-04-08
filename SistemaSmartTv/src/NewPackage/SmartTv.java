package NewPackage;

public class SmartTv {
	
			boolean ligada=false;
			int canal=1;
			int volume=25;
			
			public void ligar() 
			{
				
				ligada=true;
			}
			
			
			
			public void desligar() 
			{
				
				ligada=false;
			}
			
			public void canal() 
			{
				
				canal=1;
				
			}
			
			public void aumentarVolume() 
			{
				
				volume++;
				System.out.println("Aumentar o volume para: "+ volume);
			}
			
			public void diminuirVolume() 
			{
				
				volume--;
				System.out.println("Diminuir o volume para: "+ volume);
			}
			
			public void aumentarCanal() 
			{
				
				canal++;
				System.out.println("Canal alternado para:  "+ canal);
			}
			
			public void diminuirCanal() 
			{
				
				canal--;
				System.out.println("Canal alternado para:  "+ canal);
			}
			
			public void mudarCanal(int novoCanal) 
			{
				
				canal=novoCanal;
				System.out.println("Canal alternado para:  "+ canal);
			}
			
			
			
			
			
			
}

			
				
				



