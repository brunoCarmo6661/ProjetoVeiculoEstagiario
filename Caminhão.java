public class Caminhão extends Rodoviario {
    private int eixo;
    private int rodas;

public int getEixo(){
    return eixo;
}
public int getRodas(){
    return rodas;
}
public Caminhão (int codigo, String modelo, String marca, String cor, int anoModelo, int anoFabricacao, double potência, String tipoVeiculo, String nomeProprietário, String  estadoUF, String cidadeUF, int qtdeOcupantes,String placa, double pesoLiquido, double pesoTotal, String tipoCombustível, String codigoRenavam, String chassi, int eixo, int rodas){
    super(codigo, modelo, marca, cor, anoModelo, anoFabricacao, potência, tipoVeiculo, nomeProprietário, estadoUF, cidadeUF, qtdeOcupantes, placa, pesoLiquido, pesoTotal, tipoCombustível, codigoRenavam, chassi);

this.eixo = eixo;
this.rodas = rodas;
}
}