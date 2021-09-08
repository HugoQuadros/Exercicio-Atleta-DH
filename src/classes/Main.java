package classes;

public class Main {

    public static void main(String[] args) {

        Atleta atleta1 = new Atleta("Joaozinho", 10, 100);
        Atleta atleta2 = new Atleta("Mariazinha", 15, 100);

        Prova prova1A = new Prova(4, 10);
        Prova prova1B = new Prova(10, 10);
        Prova prova1C = new Prova(15, 10);

        Prova prova2A = new Prova(8, 10);
        Prova prova2B = new Prova(15, 10);
        Prova prova2C = new Prova(20, 10);

        prova1A.podeRealizar(atleta1);
        prova1B.podeRealizar(atleta1);
        prova1C.podeRealizar(atleta1);

        prova2A.podeRealizar(atleta2);
        prova2B.podeRealizar(atleta2);
        prova2C.podeRealizar(atleta2);
    }
}
