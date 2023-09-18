
package uniderp.poo.dominio;

public abstract class baseVeiculo implements IImpressao {
    
    protected int codigo;
    protected String nome;
    protected String modelo;
    protected String cor;
    protected String placa;
    protected int anoModelo;
    protected int anoFabricação;
    protected int rodas;
    protected String fabricante;
    protected double potencia;
    protected String tipoCombustivel;
    protected String tipoVeiculo;
    protected int eixo;
    protected int qtdeOcupantes;
    protected String estadoUF;
    protected String cidadeUF;
    
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public int getAnoModelo() {
        return anoModelo;
    }
    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }
    public int getAnoFabricação() {
        return anoFabricação;
    }
    public void setAnoFabricação(int anoFabricação) {
        this.anoFabricação = anoFabricação;
    }
    public int getRodas() {
        return rodas;
    }
    public void setRodas(int rodas) {
        this.rodas = rodas;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public double getPotencia() {
        return potencia;
    }
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }
    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    public String getTipoVeiculo() {
        return tipoVeiculo;
    }
    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }
    public int getEixo() {
        return eixo;
    }
    public void setEixo(int eixo) {
        this.eixo = eixo;
    }
    public int getQtdeOcupantes() {
        return qtdeOcupantes;
    }
    public void setQtdeOcupantes(int qtdeOcupantes) {
        this.qtdeOcupantes = qtdeOcupantes;
    }
    public String getEstadoUF() {
        return estadoUF;
    }
    public void setEstadoUF(String estadoUF) {
        this.estadoUF = estadoUF;
    }
    public String getCidadeUF() {
        return cidadeUF;
    }
    public void setCidadeUF(String cidadeUF) {
        this.cidadeUF = cidadeUF;
    }

    public baseVeiculo(int codigo, String nome, String modelo, String cor, String placa, int anoModelo,
    int anoFabricação, int rodas, String fabricante, double potencia, String tipoCombustivel,
    String tipoVeiculo, int eixo, int qtdeOcupantes, String estadoUF, String cidadeUF) {
        this.codigo = codigo;
        this.nome = nome;
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
        this.anoModelo = anoModelo;
        this.anoFabricação = anoFabricação;
        this.rodas = rodas;
        this.fabricante = fabricante;
        this.potencia = potencia;
        this.tipoCombustivel = tipoCombustivel;
        this.tipoVeiculo = tipoVeiculo;
        this.eixo = eixo;
        this.qtdeOcupantes = qtdeOcupantes;
        this.estadoUF = estadoUF;
        this.cidadeUF = cidadeUF;
    }
    
  



}