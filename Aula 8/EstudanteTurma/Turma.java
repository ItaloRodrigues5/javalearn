public class Turma {
    private Estudante[] estudantes;
    
    public Turma(int numeroEstudantes) {
        estudantes = new Estudante[numeroEstudantes];
    }
    
    public void addEstudante(Estudante estudante, int index){
        estudantes[index] = estudante;
    }
    
    public Estudante getEstudante(int index) {
        return estudantes[index];
    }
}
