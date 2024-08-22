public class Login{
  private String usuario;
  private String senha;

  public boolean validaLogin(String user, String password){
    if (usuario.equals(user) && senha.equals(password)){
      return true;
    }
    else{
      return false;
    }
  }
  public void podeAcessarUser(String username){
    usuario = username;
  }
  public void podeAcessarPass(String chave){
    senha = chave;
  }
}
