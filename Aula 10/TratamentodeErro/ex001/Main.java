public class Main{
    public static void main(String[] args) {

        Aluno a1 = new Aluno(123, "xuxa");
        Aluno a2 = new Aluno(123, "Leno Brega");

        System.out.println(Aluno.quantAluno());

        int mat1 = a1.getMatricula();
        int mat2 = a2.getMatricula();

        try{
            if (mat1 == mat2) {
                throw new IllegalArgumentException("Já existe uma matrícula cadastrada");
            }
        }catch(IllegalArgumentException ae){
            System.err.println(ae.getMessage());
            ae.printStackTrace();
        }
        finally {
            System.out.println("Macacos me mordam, deu erro!");
        }

        System.out.println(Aluno.quantAluno());
    }
}
