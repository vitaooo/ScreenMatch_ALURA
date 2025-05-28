import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Missão impossível 007");
        meuFilme.setAnoDeLancamento(2022);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(7);
        System.out.println("Total de avaliações: "+ meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());



    }
}