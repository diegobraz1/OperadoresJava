package Models;



public class Jogador {
    
    private String nome;
    private int idade;
    private String posicao;
    private int numCamisa;
    private int altura;
    private int peso;
    
    public Jogador (String nome, int idade, String posicao, int numCamisa, int altura, int peso) {
        this.nome = nome;
        this.idade = idade;
        this.posicao = posicao;
        this.numCamisa = numCamisa;
        this.altura = altura;
        this.peso = peso;        
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getPosicao() {
        return posicao;
    }
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
    public int getNumCamisa() {
        return numCamisa;
    }
    public void setNumCamisa(int numCamisa) {
        this.numCamisa = numCamisa;
    }
    public int getAltura() {
        return altura;
    }
    public void setAtura(int altura) {
        this.altura = altura;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
}
  