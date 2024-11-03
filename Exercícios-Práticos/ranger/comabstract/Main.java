public class Main {
    public static void main(String[] args) {

        //Criação das instâncias do tipo Ranger por meio da classe filha que possui atributo na classe mãe que é asbtrata
        //AbstractRanger abranger = new RangerAzul("severina", "azul", "lança");

        Ranger r1 = new RangerAzul("xuxa", "Simples", "espada");
        Ranger r2 = new RangerVermelho("sebastão", "fortificada", "espadão");
        Ranger r3 = new RangerPreto("Shadow", "Sem", "Pistola");
        //Ranger r4 = new Ranger("Irineu"); Não possui identificação de cor do Power Ranger

        //Criação da instância de PilotoRanger
        PilotoRanger pr = new PilotoRanger(r3);
        PilotoRanger pr1 = new PilotoRanger(r2);
        PilotoRanger pr2 = new PilotoRanger(r1);
        //PilotoRanger pr3 = new PilotoRanger(r4);

        //Criação da instância dos Zords e MegaZord

        Zords tigre = new Zords(pr);
        Zords leao = new Zords(pr1);
        Zords tuba = new Zords(pr2);
        //Zords semzord = new Zords(pr3);
        
        tigre.setNomeZord(NomeZord.TIGRE);
        leao.setNomeZord(NomeZord.LEAO);
        tuba.setNomeZord(NomeZord.TUBARAO);
        //semzord.setNomeZord(NomeZord.SEMZORD);

        MegaZord mz = new MegaZord();
    
        //Print dos Rangers com Morfar e sem Morfar
        System.out.println("\n"+r1.getNome());
        r1.MorfarArmadura();

        System.out.println();

        System.out.println(r2.getNome());
        r2.MorfarArmaArmadura();
        
        System.out.println();

        System.out.println(r3.getNome());
        r3.Morfar();

        //Piloto Ranger do MegaZord.

        //pr.getPiloto();

        System.out.println(pr.toString());

        //Sem o getNome(), ele passa apenas a referência do espaço de memória onde tá armazenado o valor do atributo.
        System.out.println("Nome do pilotoX: " + pr.getRanger().getNome());

        System.out.println();

        tigre.atirar();
        leao.correr();
        tuba.voar();
        //semzord.pilotar();

        System.out.println();

        mz.adicionarZord(tigre);
        mz.adicionarZord(tuba);
        mz.adicionarZord(leao);

        mz.listarZords();
        
        System.out.println();
        
        mz.atacar();

    }
}