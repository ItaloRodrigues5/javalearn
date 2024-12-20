public class Main {
    public static void main(String[] args) {

        //Criação das instâncias de Ranger colocando o nome
        Ranger r1 = new Ranger("xuxa");
        Ranger r2 = new Ranger("sebastão");
        Ranger r3 = new Ranger("Shadow");
        Ranger r4 = new Ranger("Irineu");

        //Criação da instância de PilotoRanger
        PilotoRanger pr = new PilotoRanger(r3);
        PilotoRanger pr1 = new PilotoRanger(r2);
        PilotoRanger pr2 = new PilotoRanger(r1);
        PilotoRanger pr3 = new PilotoRanger(r4);

        //Criação da instância dos Zords e MegaZord

        Zords tigre = new Zords(pr);
        Zords leao = new Zords(pr1);
        Zords tuba = new Zords(pr2);
        Zords semzord = new Zords(pr3);
        
        tigre.setNomeZord(NomeZord.TIGRE);
        leao.setNomeZord(NomeZord.LEAO);
        tuba.setNomeZord(NomeZord.TUBARAO);
        semzord.setNomeZord(NomeZord.SEMZORD);

        MegaZord mz = new MegaZord();
        
        //Set dos Rangers para sua identificação em suas classes trazendo das instâcias de cima
        RangerAzul ra = new RangerAzul(r1.getNome(), "Simples", "espada");
        RangerVermelho rv = new RangerVermelho(r2.getNome(), "fortificada", "espadão");
        RangerPreto rp = new RangerPreto(r3.getNome(), "sem", "Pistola");
        
        //Print dos Rangers com Morfar e sem Morfar
        System.out.println("\n"+ra.getNome());
        ra.MorfarArmadura();

        System.out.println();

        System.out.println(rv.getNome());
        rv.MorfarArmaArmadura();
        
        System.out.println();

        System.out.println(rp.getNome());
        rp.Morfar();

        //Piloto Ranger do MegaZord.

        //pr.getPiloto();

        System.out.println(pr.toString());

        //Sem o getNome(), ele passa apenas a referência do espaço de memória onde tá armazenado o valor do atributo.
        System.out.println("Nome do pilotoX: " + pr.getRanger().getNome());

        System.out.println();

        tigre.atirar();
        leao.correr();
        tuba.voar();
        semzord.pilotar();

        System.out.println();

        mz.adicionarZord(tigre);
        mz.adicionarZord(tuba);
        mz.adicionarZord(leao);

        mz.listarZords();
        
        System.out.println();
        
        mz.atacar();

    }
}