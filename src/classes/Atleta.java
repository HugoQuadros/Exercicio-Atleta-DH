package classes;

public class Atleta {

    private String nome;
    private int nivel;
    private int energia;

    //getters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public int getEnergia() {
        return energia;
    }
    public void setEnergia(int energia) {
        this.energia = energia;
    }

    //construtor
    public Atleta(String nomeAtleta, int nivelAtleta, int energiaAtleta){
        nome = nomeAtleta;
        nivel = nivelAtleta;
        energia = energiaAtleta;
    }
}
