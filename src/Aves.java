
public class Aves extends Animais implements AnimaisVoadores 
{
	public Aves(int idade, double tamanho, int sons, String cor) {
		super(idade, tamanho, sons, cor);
		// TODO Auto-generated constructor stub
		IndetificadoAnimal();
	}
	private String NomeDaAve;
	
	public void IndetificadoAnimal() 
	{
		if(Sons ==1) 
		{
			if( Cor =="verdes" ||Cor == "azul" ) //Informação pesquisa do Google
			{
				
				NomeDaAve = "Pato";
			}
			else NomeDaAve = "";
		}
		else if(Sons == 2) 
		{
			if(Cor == "marrom" || Cor == "branco" || Cor == "preto" ) //Informação pesquisa do Google
			{
				NomeDaAve ="Galinha";
			}
			else NomeDaAve = "";
		}
	}
	
	
	@Override
  	public String toString() {
  		// TODO Auto-generated method stub
  		
  		if(NomeDaAve == "Pato") 
  		{
  			return "Pato\r\n" + 
  					"- Com idade: " + Idade + "\n" +
  					"- Tamanho: " + Tamanho + "\n" +
  					"- Cor da pena: " + Cor + "\n" +
  					"- O som emitido é um grasnido. \n" +
  					"- Altitude do voou: " + Voou() + " Metros";
  		}
  		else if(NomeDaAve == "Galinha") 
  		{
  			return "Galinha\r\n" + 
  					"- Com idade: " + Idade + "\n" +
  					"- Tamanho: " + Tamanho + "\n" +
  					"- Cor da pena: " + Cor + "\n" +
  					"- O som emitido é um cacarejo";
  		}
  		else 
  		{
  			return "Ave não encontrada";
  		}
  	}


	@Override
	public double Voou() {
		// TODO Auto-generated method stub
		return 6800;
	}

}
