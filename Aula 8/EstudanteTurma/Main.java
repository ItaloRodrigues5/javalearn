public class Main {
 public static void main(String[] args) {
    
    Estudante estudante1 = new Estudante();
    estudante1.setNome("João");
    estudante1.setCurso("Engenharia");
    
    Estudante estudante2 = new Estudante();
    estudante2.setNome("Pedro");
    estudante2.setCurso("Medicina");
    
    Turma turma = new Turma(2);
    turma.addEstudante(estudante1, 0);
    turma.addEstudante(estudante2, 1);
 
    System.out.println(turma.getEstudante(1).getNome());
 }
}
