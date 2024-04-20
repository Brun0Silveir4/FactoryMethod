package factory;



// Aqui a classe abstrata é implementada, na qual é criado o método para que retorne um veículo criado com base na
// interface da fábrica. Também é definido que pode ser lançado um erro caso seja um veículo inexistente na fabrica.
// O veículo é passado como parâmetro em uma string, além de não poder ser instanciada por se tratar de uma
// classe abstrata.

public abstract class VehicleFactory {
	public abstract IFactory GetVehicle(String vehicle) throws Exception;

}