public class Main{
  public static void main(String[] args){
    //JUnit - Testes unitários de Java
    
    //Teste de erro em execução;

        int a[] = new int[2];

        try{
            a[9] = 23;
            System.out.println(5/0);
        }catch(ArithmeticException ae){
            System.err.println(ae.getMessage());
        }catch(IndexOutOfBoundsException ie){
            System.err.println(ie.getMessage());
            ie.printStackTrace();
        }finally {
            System.out.println("Deu merda!");
        }
  }
}
