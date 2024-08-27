public class Login{
    private String usuario;
    private String senha;

    public Login(String usuario, String senha){
        this.usuario = usuario;
        this.senha = senha;
    }

    public boolean validaLogin(String user, String password){
        if (this.usuario.equals(user) && this.senha.equals(password)){
            return true;
        }
        else{
            return false;
        }
    }
    public void podeAcessarUser(String username){
        this.usuario = username;
    }
    public void podeAcessarPass(String chave){
        this.senha = chave;
    }

    public void verificaSenha(String senha, String novasenha){
        if(this.validaSenha(senha)){
            this.alteraSenha(novasenha);
        }
    }
    public boolean validaSenha(String senha){
        if (senha.equals(this.senha)){
            return true;
        }
        else {
            return false;
        }
    }

    public void exibirDados(){
        System.out.println(this.senha);
    }

    public String toString(){
        return "=====Login=====\n\nUsuário: " + usuario + "\nSenha: " + senha;
    }

    public void alteraUsuario(String usuario){
        this.usuario = usuario;
    }

    public void alteraSenha(String senha){
        this.senha = senha;
    }

    public String setUsuario(String usuario){
        return this.usuario = usuario;
    }
    public String getUsuario(){
        return this.usuario;
    }
}
