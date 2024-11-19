import java.util.ArrayList;

public class BibliotecaApp{
    public static void main(String[] args) {

        ArrayList<Emprestavel> emprestimos = new ArrayList<>();
        
        Biblioteca bib = new Biblioteca();
        Livro livro = new Livro(TipoLivro.BIOGRAFIA);
        Livro livro2 = new Livro(TipoLivro.TECNICO);
        Livro livro3 = new Livro(TipoLivro.FICCAO);
        Livro livro4 = new Livro(TipoLivro.TECNICO);
        Livro livro5 = new Livro(TipoLivro.NAO_FICCAO);
        Livro livro6 = new Livro(TipoLivro.BIOGRAFIA);
        Livro livro7 = new Livro(TipoLivro.FICCAO);
        Livro livro8 = new Livro(TipoLivro.TECNICO);
        Livro livro9 = new Livro(TipoLivro.FICCAO);
        Livro livro10 = new Livro(TipoLivro.BIOGRAFIA);
        Livro livro11 = new Livro(TipoLivro.NAO_FICCAO);

        System.out.println("Livro adicionado do tipo " + bib.adicionarLivro(livro.tipolivro));
        System.out.println("Livro adicionado do tipo " + bib.adicionarLivro(livro2.tipolivro));
        System.out.println("Livro adicionado do tipo " + bib.adicionarLivro(livro3.tipolivro));
        
        //Emprestando e devolvendo livros

        emprestimos.add(livro);
        emprestimos.add(livro2);
        emprestimos.add(livro3);
        emprestimos.add(livro4);
        emprestimos.add(livro5);
        emprestimos.add(livro6);
        emprestimos.add(livro7);
        emprestimos.add(livro8);
        emprestimos.add(livro9);
        emprestimos.add(livro10);
        emprestimos.add(livro11);

        System.out.println("Valor da multa do empréstimo do livro: " + bib.calcularMulta(5, TipoLivro.BIOGRAFIA, "bom"));

        System.out.println("Livro emprestado do tipo " + bib.emprestarLivro(livro2.tipolivro));

        System.out.println();

        emprestimos.remove(livro2);
        
        System.out.println("Livro devoldido do tipo " + bib.devolverLivro(livro2.tipolivro));

        try{
            emprestimos.add(livro);
            emprestimos.add(livro2);
            emprestimos.add(livro3);
            emprestimos.add(livro4);
            emprestimos.add(livro5);
            emprestimos.add(livro6);
            emprestimos.add(livro7);
            emprestimos.add(livro8);
            emprestimos.add(livro9);
            emprestimos.add(livro10);
            emprestimos.add(livro11);
            
            if(emprestimos.size() > 10){
                throw new LivroIndisponivelException("QUANTIDADE MÁXIMA DE EMPRÉSTIMOS POR MÊS");
            }
        
        }catch(LivroIndisponivelException le){
            System.out.println("\nERRO: " + le.getMessage());
        }

    }
}