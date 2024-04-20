package factory;




// Aqui se cria uma outra classe que reescreve o método da interface principal (IFactory). Novamente,
// o método apenas retorna apenas uma mensagem sobre o seu parâmetro.

public class Scooter implements IFactory {
	public void Drive(int miles)
	{
		System.out.println("Drive the Scooter : " + miles + " km");
	}


}
