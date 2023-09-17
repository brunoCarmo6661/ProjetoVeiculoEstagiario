public class Carro extends Rodoviario {
    private int portas;
public int getPortas(){
    return portas;
}
public Carro (int codigo, String modelo, String marca, String cor, int anoModelo, int anoFabricacao, double potência, String tipoVeiculo, String nomeProprietário, String  estadoUF, String cidadeRegistro, int qtdeOcupantes,String placa, double pesoLiquido, double pesoTotal, String tipoCombustível, String codigoRenavam, String chassi, int portas){
    super(codigo, modelo, marca, cor, anoModelo, anoFabricacao, potência, tipoVeiculo, nomeProprietário, estadoUF, cidadeRegistro, qtdeOcupantes, placa, pesoLiquido, pesoTotal, tipoCombustível, codigoRenavam, chassi);

this.portas = portas;
}
}
