package factory;


// Por meio da herança, essa classe em questão consegue herdar a classe abstrata "VehicleFactory".
// Nessa implementação, o método deve receber uma string, na qual decide qual objeto (ou veículo) deverá
// ser retornado. Caso for passado como parâmetro um valor (ou classe) inexistente, será retornado um erro.

public class ConcreteVehicleFactory extends VehicleFactory {

	@Override
	public IFactory GetVehicle(String vehicle) throws Exception {
		switch (vehicle)
		{
		case "Scooter":
			return new Scooter();
		case "Bike":
			return new Bike();
		default:
			throw new Exception("Vehicle"+ vehicle+ "cannot be created");
		}
	}

}