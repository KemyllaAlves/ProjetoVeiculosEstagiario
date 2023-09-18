package uniderp.poo.dominio;

public class Caminhao extends baseVeiculo {
    private int assentos;
    private int portas;
    private String codigoRenavam;
    private String nomeProprietario;
    private String chassi;
    
    public int getAssentos() {
        return assentos;
    }
    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }
    public int getPortas() {
        return portas;
    }
    public void setPortas(int portas) {
        this.portas = portas;
    }
    public String getCodigoRenavam() {
        return codigoRenavam;
    }
    public void setCodigoRenavam(String codigoRenavam) {
        this.codigoRenavam = codigoRenavam;
    }
    public String getNomeProprietario() {
        return nomeProprietario;
    }
    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }
    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    
    public Caminhao(int codigo, String nome, String modelo, String cor, String placa, int anoModelo, int anoFabricação,
        int rodas, String fabricante, double potencia, String tipoCombustivel, String tipoVeiculo, int eixo,
        int qtdeOcupantes, String estadoUF, String cidadeUF, int assentos, int portas, String codigoRenavam,
        String nomeProprietario, String chassi) {
        super(codigo, nome, modelo, cor, placa, anoModelo, anoFabricação, rodas, fabricante, potencia, tipoCombustivel,
        tipoVeiculo, eixo, qtdeOcupantes, estadoUF, cidadeUF);
        this.assentos = assentos;
        this.portas = portas;
        this.codigoRenavam = codigoRenavam;
        this.nomeProprietario = nomeProprietario;
        this.chassi = chassi;
    }
    @Override
    public void imprimir() {
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Placa: " + this.placa);
        System.out.println("Ano do modelo: " + this.anoModelo);
        System.out.println("Ano de fabricação: " + this.anoFabricação);
        System.out.println("Quantidade de rodas: " + this.rodas);
        System.out.println("Nome do fabricante: " + this.fabricante);
        System.out.println("Potência: " + this.potencia);
        System.out.println("Tipo de combustível: " + this.tipoCombustivel);
        System.out.println("Eixo: " + this.eixo);
        System.out.println("Quantidade de ocupantes: " + this.qtdeOcupantes);
        System.out.println("Estado UF: " + this.estadoUF);
        System.out.println("Cidade UF: " + this.cidadeUF);
        System.out.println("Assentos: " + this.assentos);
        System.out.println("Portas: " + this.portas);
        System.out.println("Código Renavam: " + this.codigoRenavam);
        System.out.println("Nome do Proprietário: " + this.nomeProprietario);
        System.out.println("Chassi: " + this.chassi);
        System.out.println("\n --------------------------- " );
    
    }
    
   

}