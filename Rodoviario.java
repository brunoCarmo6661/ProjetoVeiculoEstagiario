public class Rodoviario extends BaseVeiculo {
    protected String placa;
    protected double pesoLiquido;
    protected double pesoTotal;
    protected String tipoCombustível;
    protected String codigoRenavam;
    protected String chassi;

public String getPlaca(){
    return placa;
}
public double getPesoLiquido(){
    return pesoLiquido;
}
public double getPesototal(){
    return pesoTotal;
}
public String getTipoCombustivel(){
    return tipoCombustível;
}
public String getCodigoRenavam(){
    return codigoRenavam;
}
public String getChassi(){
    return chassi;
}

public Rodoviario (int codigo, String modelo, String marca, String cor, int anoModelo, int anoFabricacao, double potência, String tipoVeiculo, String nomeProprietário, String  estadoUF, String cidadeUF, int qtdeOcupantes,String placa, double pesoLiquido, double pesoTotal, String tipoCombustível, String codigoRenavam, String chassi){
    super(codigo, modelo, marca, cor, anoModelo, anoFabricacao, potência, tipoVeiculo, nomeProprietário, estadoUF, cidadeUF, qtdeOcupantes);
    this.placa = placa;
    this.pesoLiquido = pesoLiquido;
    this.pesoTotal = pesoTotal;
    this.tipoCombustível = tipoCombustível;
    this.codigoRenavam = codigoRenavam;
    this.chassi = chassi;
}
}
