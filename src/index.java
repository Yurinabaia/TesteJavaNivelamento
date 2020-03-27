import java.io.*;
import java.util.*;

public class index 
{
	
	public static void clearConsole() 
	{
		for (int i = 0; i < 50; ++i) System.out.println();
	}
	
	public static int SomAnimais() 
	{
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		System.out.print("1 - Som emitido � um grasnido\n");
		System.out.print("2 - Som emitido � um cacarejo\n");
		System.out.print("3 - Som emitido � o mugido.\n");
		System.out.print("4 - Som emitido � um farfalho.\n");
		int Valor = Integer.parseInt(entrada.next());
		return Valor;
	}
	public static String CorAnimal () 
	{
		String Cor;
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		System.out.print("\nObserva��es: Pato tem as cores verdes ou azul\n");
		System.out.print("Observa��es: Morcego tem cor marrom\n");
		System.out.print("Observa��es: Vaca tem as cores branco ou preto\n");
		System.out.print("Observa��es: Galinha tem as cores marron, branco ou preto\n");
		System.out.print("Caso escolha uma cor que o animal n�o possuir o resultado "
				+ "ser� o animal n�o encontrado\n\n\n");

		System.out.print("1 - A cor do pelo/pena � verdes;\n");
		System.out.print("2 - A cor do pelo/pena � azul;\n");
		System.out.print("3 - A cor do pelo/pena � marrom;\n");
		System.out.print("4 - A cor do pelo/pena � branco;\n");
		System.out.print("5 - A cor do pelo/pena � preto;\n");
		int Valor = Integer.parseInt(entrada.next());
		if(Valor ==1) Cor = "verdes";
		else if(Valor ==2) Cor ="azul";
		else if(Valor ==3) Cor = "marrom";
		else if(Valor ==4) Cor = "branco";
		else if(Valor ==5) Cor = "preto";
		else Cor = "";
		return Cor;
	}
	public static void main(String[] args) throws IOException
	{
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int cont = 0;
		int QtdAnimais = 0;
		try 
		{
			System.out.println("Quantos animais possuir na fazenda ");
			QtdAnimais = Integer.parseInt(entrada.readLine());
			List<Animais> ANIMAIS = new ArrayList<Animais>();			
			while(QtdAnimais != 0) 
			{
				System.out.println("Digite a idade do animal");
				int Idade = Integer.parseInt(entrada.readLine());
				System.out.println("Digite o tamanho do animal");
				double Tamanho = Double.parseDouble(entrada.readLine());
				System.out.println("Digite um n�mero para a escolha do som do animal");
				int Sons = SomAnimais();	
				if(Sons <= 4 && Sons > 0) 
				{
					System.out.println("Digite um n�mero para a escolha da cor do animal");
					String Cor = CorAnimal();
					if(Cor!= "") 
					{
						if(Sons ==1 || Sons ==2)
						ANIMAIS.add(new Aves(Idade, Tamanho, Sons, Cor));
						else 
						ANIMAIS.add(new Mamiferos(Idade, Tamanho, Sons, Cor));
					}
					else 
					{
						System.out.println("Digite 1,2,3,4 ou 5 para a escolha da cor do animal"); QtdAnimais = QtdAnimais +1;//Caso o usuario digite um n�mero que 4 
						cont= cont -1;                                                                          //ou menor que 1 quantidade de animais ir� continuar o mesmo
						entrada.readLine();
	
					}
				}
				else 
				{
					System.out.println("Digite 1,2,3 ou 4 para a escolha do som do animal");QtdAnimais = QtdAnimais +1;//Caso o usuario digite um n�mero maior que 4 
	                   cont = cont -1;                                                                     //ou menor que 1 a quantidade de animais ir� continuar o mesmo	
	                 entrada.readLine();
				}
				QtdAnimais--;
				cont++;
				clearConsole();
			}

			///////////////////////////////////Resultado//////////////////////
			System.out.println("-------------------------------------------------------------------------------------");
			System.out.println("Resultados dos animais");
			for (Animais obj : ANIMAIS) 
			{
				if(obj != null) 
				{
				System.out.println(obj.toString());
				System.out.println("-------------------------------------------------------------------------------------");
				}
			}
		
		
		}
		catch(NumberFormatException e) 
		{
			System.out.println("Digite apenas n�meros!!! " + e);
		}
	}

}
