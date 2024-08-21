public class Login {
    private String usuario;
    private String senha;

    public boolean validaUsuario(String username, String password) {
        if (usuario.equals(username) && senha.equals(password)) {
            return true;
        } else {
            return false;
        }
    }
    void podeAcessarUser(String user){
        usuario = user;
    }
    void podeAcessarSenha(String chave){
        senha = chave;
    }
}
