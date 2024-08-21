public class Login {
    String usuario;
    String senha = "oi123";

    public void validaSenha(String valor){
        if (senha.equals(valor)){ //equals verifica se dois valores são string
            System.out.println("Senha correta!");
        }
    }
}
