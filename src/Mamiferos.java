public class Mamiferos extends Animais implements AnimaisVoadores 
{

	
	
	
	public Mamiferos(int idade, double tamanho, int sons, String cor) {
		super(idade, tamanho, sons, cor);
		// TODO Auto-generated constructor stub
		IndetificadoAnimal();
	}
	
	private String NomeDoMamifero;
	public void IndetificadoAnimal() 
	{
		   if(Sons == 3)
			{
				if(Cor == "branco" || Cor == "preto") //Informa��o pesquisa do Google
				{
					NomeDoMamifero ="Vaca";
				}
				else NomeDoMamifero ="";
			}
		   else	if(Sons == 4) 
			{
				if(Cor == "marrom") //Informa��o pesquisa do Google
				{
					
					NomeDoMamifero = "Morcego";
				}
				else NomeDoMamifero ="";			
			 } 
	} 	
  	public String toString() {
  		// TODO Auto-generated method stub
  		
  		if(NomeDoMamifero == "Morcego") 
  		{
  			return "Morcego\r\n" + 
  					"- Com idade: " + Idade + "\n" +
  					"- Tamanho: " + Tamanho + "\n" +
  					"- Cor da pena: " + Cor + "\n" +
  					"- O som emitido � um farfalho." +
  					"- Altitude do voou: " + Voou() + " Metros";
  		}
  		else if(NomeDoMamifero == "Vaca") 
  		{
  			return "Vaca\r\n" + 
  					"- Com idade: " + Idade + "\n" +
  					"- Tamanho: " + Tamanho + "\n" +
  					"- Cor da pena: " + Cor + "\n" +
  					"- O som emitido � o mugido.";
  		}
  		else
  		{
  			return "Mam�fero n�o encontrado";
  		}
  	}
	@Override
	public double Voou() {
		// TODO Auto-generated method stub
		return 10;
	}
	
}
