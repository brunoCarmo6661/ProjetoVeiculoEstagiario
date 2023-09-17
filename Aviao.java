public class Aviao extends BaseVeiculo {
    
    private int qtdeMotores;
    private String prefixoAeronautico;

    public int getQtdeMotores(){
    return qtdeMotores;
}
public String getPrefixoAeronautico(){
    return prefixoAeronautico;
}
 public Aviao(int codigo, String modelo, String marca, String cor, int anoModelo, int anoFabricacao, double potência, String tipoVeiculo, String nomeProprietário, String  estadoUF, String cidadeUF, int qtdeOcupantes, int qtdeMotores, String prefixoAeronautico){
super(codigo, modelo, marca, cor, anoModelo, anoFabricacao, potência, tipoVeiculo, nomeProprietário, estadoUF, cidadeUF, qtdeOcupantes);
this.qtdeMotores = qtdeMotores;
this.prefixoAeronautico = prefixoAeronautico;
}
}