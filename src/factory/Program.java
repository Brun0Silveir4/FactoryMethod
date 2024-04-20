package factory;

public class Program {


	// Aqui será feito a definição da fábrica em questão. A fábrica será instanciada, juntamente dos veículos
	// sendo criados. Cada veículo tem seus métodos baseados na interface chamada, assim passando um parâmetro.
	// Os objetos faricados serão baseados em uma interface. A fábrica é em base de uma classe abstrata e seus objetos são feitos em base na fabrica.

	public static void main(String[] args) throws Exception
	{
		VehicleFactory factory = new ConcreteVehicleFactory();

		IFactory scooter = factory.GetVehicle("Scooter");
		scooter.Drive(10);

		IFactory bike = factory.GetVehicle("Bike");
		bike.Drive(20);

	}
}
