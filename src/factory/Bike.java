package factory;

//cria-se uma classe Bike que implementa o m�todo da interface IFactory, 
//o m�todo � apenas um log do parametro passado

// Na classe de Bike é reescrito o método definido na Interface IFactory. O método retorna apenas uma
// mensagem sobre o parâmetro passado.

public class Bike implements IFactory {

	public void Drive(int miles){
		System.out.println("Drive the Bike : " + miles + " km");
	}

}
