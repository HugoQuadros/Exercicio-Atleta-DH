package classes;

public class Prova {

    private int dificuldade;
    private int energiaNecessaria;

    //getters e setters
    public int getDificuldade() {
        return dificuldade;
    }
    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }
    public int getEnergiaNecessaria() {
        return energiaNecessaria;
    }
    public void setEnergiaNecessaria(int energiaNecessaria) {
        this.energiaNecessaria = energiaNecessaria;
    }

    //construtor
    public Prova(int dificuldadeProva, int energiaProva){
        this.dificuldade = dificuldadeProva;
        this.energiaNecessaria = energiaProva;
    }

    public boolean podeRealizar(Atleta atleta){
        if(atleta.getNivel() >= getDificuldade()){
            System.out.println("A prova pode ser realizada pelo atleta " + atleta.getNome());
            return true;
        }
        else{
            System.out.println("A prova não pode ser realizada pelo atleta " + atleta.getNome());
            return false;
        }
    }
}
