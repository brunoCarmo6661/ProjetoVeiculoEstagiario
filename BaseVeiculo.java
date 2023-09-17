public abstract class BaseVeiculo {
    protected int codigo;
    protected String modelo;
    protected String marca;
    protected String cor;
    protected int anoModelo;
    protected int anoFabricacao;
    protected double potência;
    protected String tipoVeiculo;
    protected String nomeProprietário;
    protected String estadoUF;
    protected String cidadeRegistro;
    protected int qtdeOcupantes;

   public BaseVeiculo(String estadoUF){
      if (estadoUF.length() == 2){
      this.estadoUF= estadoUF;
      }
      else{
         throw new IllegalArgumentException("Informar somente a sigla do estado");
      }
}

   public int getCodigo(){
      return codigo;
   }
   public String getModelo(){
      return modelo;
   }
   public String getMarca(){
      return marca;
   }
   public String getCor(){
      return cor;
   }
   public int getAnoModelo(){
      return anoModelo;
   }
   public int getAnoFabricação(){
      return anoFabricacao;
   }
   public double getPotencia(){
      return potência;
   }
   public String getTipoVeiculo(){
      return tipoVeiculo;
   }
   public String getNomeProprietario(){
      return nomeProprietário;
   }
   public String getCidadeUF(){
      return cidadeRegistro;
   }
   public String getEstadoUF(){
      return estadoUF;
   }
   public int getQtdeOcupantes(){
      return qtdeOcupantes;
   }

   public BaseVeiculo( int codigo, String modelo, String marca, String cor, int anoModelo, int anoFabricacao, double potência, String tipoVeiculo, String nomeProprietário, String estadoUF,String cidadeRegistro,int qtdeOcupantes){
      this.codigo = codigo;
      this.modelo = modelo;
      this.marca = marca;
      this.cor = cor;
      this. anoModelo = anoModelo;
      this.anoFabricacao = anoFabricacao;
      this.potência = potência;
      this.tipoVeiculo = tipoVeiculo;
      this.nomeProprietário = nomeProprietário;
      this.estadoUF = estadoUF;
      this.cidadeRegistro = cidadeRegistro;
      this.qtdeOcupantes = qtdeOcupantes;
   }
}

