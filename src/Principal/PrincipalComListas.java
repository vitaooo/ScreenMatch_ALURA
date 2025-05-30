package Principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Missão impossível 007", 2022);
        meuFilme.avalia(9);
        Filme outrofilme = new Filme("Missão possível 009", 2008);
        outrofilme.avalia(8);
        Filme filmeDoVictor = new Filme("Senhor dos Anéis", 2000);
        filmeDoVictor.avalia(7);
        Serie lost = new Serie("Lost", 2020);
        lost.avalia(9);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoVictor);
        lista.add(meuFilme);
        lista.add(outrofilme);
        lista.add(lost);
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            Filme filme = (Filme) item;
            System.out.println("Classificação: " + filme.getClassificacao());


        }
    }
}
