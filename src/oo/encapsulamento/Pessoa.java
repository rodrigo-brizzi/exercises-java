package oo.encapsulamento;

public class Pessoa {

    private int idade;
    private String nome;

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    private String sobrenome;

    public Pessoa(String nome, String sobrenome, int idade){
        setIdade(idade);
        setNome(nome);
        setSobrenome(sobrenome);
    }

    // Getter
    public int getIdade(){
        return idade;
    }

    // Setter
    public void setIdade(int novaIdade){
        novaIdade = Math.abs(novaIdade);
        if(novaIdade >= 0) {
            this.idade = novaIdade;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString(){
        return getNome() + " " + getSobrenome() + " " + getIdade();
    }
}
