public class Login{
  private String usuario;
  private String senha;

  public void validaLogin(String user, String password){
    if (usuario.equals(user) && senha.equals(password)){
      System.out.println("\nUsuário Logado com sucesso!");
    }
    else{
      System.out.println("\nUsuário ou senha inválidos!");
    }
  }
  public void podeAcessarUser(String username){
    usuario = username;
  }
  public void podeAcessarPass(String chave){
    senha = chave;
  }
}
