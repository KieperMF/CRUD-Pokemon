
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args)
    {

        ArrayList<Habilidade> listaHabilidades = new ArrayList<Habilidade>();
        ArrayList<Pokemon> listaPokemon = new ArrayList<Pokemon>();
        ArrayList<Treinador> listaTreinadores = new ArrayList<Treinador>();

        //listaHabilidades.add(CriarHabilidade());
        //MostrarHabilidade(listaHabilidades);
        //AtualizarHabilidade(listaHabilidades, "Bola de Fogo");
        SeddHabilidade(listaHabilidades);

        //MostrarHabilidade(listaHabilidades);
        listaPokemon.add(CriarPokemon(listaHabilidades));

        MostrarPokemon(listaPokemon);

    }
    //SCANNER PARA LER GLOBALMENTE -------------------------------
    public static Scanner ler = new Scanner(System.in);

    //CRUD HABILIDADE---------------------------------------------
    //CRIAR HABILIDADE----------------------------------------------
    public static Habilidade CriarHabilidade() {

        System.out.println("Digite o nome da habilidade:");
        String nomeHabilidade = ler.nextLine();

        System.out.println("Digite a descrição da habilidade:");
        String desc = ler.nextLine();

        System.out.println("Digite o tipo da habilidade:");
        String t = ler.nextLine();

        System.out.println("Digite o dano da habilidade:");
        int d = ler.nextInt();

        System.out.println("Digite quanto de mana gasta a habilidade:");
        int gM = ler.nextInt();

        Habilidade habAdd = new Habilidade(nomeHabilidade, desc, t, d, gM);

        return (habAdd);

    }

    //MOSTRAR HABILIDADE A PARTIR DE UMA LISTA----------------------------
    public static void MostrarHabilidade(ArrayList<Habilidade> liHa, int select) {
        if (select == 0) {
            int idHabilidade = 0;
            for (Habilidade hab : liHa) {
                System.out.println("\n Habilidade numero " + idHabilidade);
                System.out.println("Nome da habilidade:" + hab.GetNome());
                System.out.println("Descrição da habilidade:" + hab.GetDescricao());
                System.out.println("Tipo da habilidade:" + hab.GetTipo());
                System.out.println("Dano da habilidade:" + hab.GetDano());
                System.out.println("Quanto de mana gasta a habilidade:" + hab.GetGastoDeMana());
                System.out.println("----------------------------------------------------------------");
                idHabilidade++;

            }
        }
        if (select == 1) {
            int idHabilidade = 0;
            for (Habilidade hab : liHa) {
                System.out.println("\n Habilidade numero " + idHabilidade);
                System.out.println("Nome da habilidade:" + hab.GetNome());
                System.out.println("----------------------------------------------------------------");
                idHabilidade++;

            }
        }
    }

    //ATUALIZAR A HABILIDADE A PARTIR DE UMA LISTA E DO NOME DA HABILIDADE
    public static void AtualizarHabilidade(ArrayList<Habilidade> liHa, String nomeHabilidade) {
        for (Habilidade hab : liHa) {
            if (hab.GetNome().equals(nomeHabilidade)) {
                System.out.println("Aperte enter para atualizar habilidade");
                ler.nextLine();

                System.out.println("Digite o nome da habilidade: ");
                hab.SetNome(ler.nextLine());

                System.out.println("Digite a descrição da habilidade: ");
                hab.Setdescricao(ler.nextLine());

                System.out.println("Digite o tipo da habilidade: ");
                hab.SetTipo(ler.nextLine());

                System.out.println("Digite o dano da habilidade: ");
                hab.SetDano(ler.nextInt());

                System.out.println("Digite quanto de mana gasta a habilidade: ");
                hab.SetGastoDeMana(ler.nextInt());
            }

        }
    }

    //DELETAR A HABILIDADE A PARTIR DE UMA LISTA E DO NOME DELA
    public static void DeletarHabilidade(ArrayList<Habilidade> liHa, String nomeHabilidade) {
        for (Habilidade hab : liHa) {
            if (hab.GetNome().equals(nomeHabilidade)) {
                System.out.println("Voce deletou a habilidade: " + hab.GetNome());
                liHa.remove(hab);

            }

        }
    }

    //ALIMENTAR HABILIDADE INICIALMENTE - SEED
    public static void SeddHabilidade(ArrayList<Habilidade> liHa) {
        Habilidade hab01 = new Habilidade("Bola de Fogo", "Solta uma Bola de Fogo", "Fogo", 10, 10);
        liHa.add(hab01);

        Habilidade hab02 = new Habilidade("Bola de Agua", "Solta uma Bola de Agua", "agua", 10, 10);
        liHa.add(hab02);

        Habilidade hab03 = new Habilidade("hab3", "hab3", "elec", 10, 10);
        liHa.add(hab03);

        Habilidade hab04 = new Habilidade("hab4", "hab4", "elec", 10, 10);
        liHa.add(hab04);

        Habilidade hab05 = new Habilidade("hab5", "hab5", "elec", 10, 10);
        liHa.add(hab05);
    }

    //CRIAR POKEMON
    public static Pokemon CriarPokemon(ArrayList<Habilidade> liHa) {
        System.out.println("Digite o nome do pokemon:");
        String nomepoke = ler.nextLine();

        System.out.println("Digite o tipo do pokemon:");
        String t = ler.nextLine();

        System.out.println("Digite a vida maxima do pokemon:");
        int vM = ler.nextInt();

        System.out.println("Digite a mana maxima do pokemon:");
        int mM = ler.nextInt();

        MostrarHabilidade(liHa, 0);

        System.out.println("Digite o id da habilidade 01 que quer adicionar");
        int hab1 = ler.nextInt();

        System.out.println("Digite o id da habilidade 02 que quer adicionar");
        int hab2 = ler.nextInt();

        System.out.println("Digite o id da habilidade 03 que quer adicionar");
        int hab3 = ler.nextInt();

        System.out.println("Digite o id da habilidade 04 que quer adicionar");
        int hab4 = ler.nextInt();

        Habilidade[] habPoke = new Habilidade[4];
        habPoke[0] = liHa.get(hab1);
        habPoke[1] = liHa.get(hab2);
        habPoke[2] = liHa.get(hab3);
        habPoke[3] = liHa.get(hab4);

        Pokemon pokeAdd = new Pokemon(nomepoke, t, vM, mM, habPoke);

        return (pokeAdd);
    }

    public static void MostrarPokemon(ArrayList<Pokemon> liPo) {
        int idPokemon = 0;
        for (Pokemon poke : liPo) {
            System.out.println("\n Pokemon numero: " + idPokemon + 1);
            System.out.println("Nome do Pokemon: " + poke.getNome());
            System.out.println("Tipo do Pokemon: " + poke.getTipo());
            System.out.println("Vida maxima do Pokemon:" + poke.getVidaMaxima());
            System.out.println("Mana Maxima do Pokemon:" + poke.getManaMaxima());
            for (int i = 0; i < 4; i++) {
                System.out.println("habilidade" + poke.getHabilidade()[i].GetNome());
            }

            System.out.println("----------------------------------------------------------------");
            idPokemon++;

        }
    }

    public static void AtualizarPokemon(ArrayList<Pokemon> liPo, String nomePokemon, ArrayList<Habilidade> liHa) {
        for (Pokemon poke : liPo) {
            if (poke.getNome().equals(nomePokemon)) {
                System.out.println("Atualizar Pokemon - " + nomePokemon);
                ler.nextLine();

                System.out.println("Digite o nome do pokemon:");
                poke.setNome(ler.nextLine());

                System.out.println("digite o tipo do pokemon");
                poke.setTipo(ler.nextLine());

                System.out.println("Digite a vida maxima do pokemon:");
                poke.setVidaMaxima(ler.nextInt());

                System.out.println("Digite a mana maxima do pokemon:");
                poke.setManaMaxima(ler.nextInt());

                System.out.println("---------Habilidades disponiveis---------");

                MostrarHabilidade(liHa, 1);

                System.out.println("---------Selecionar Habilidades---------");

                System.out.println("Digite o ID da Habilidade 01 que quer adicionar:");
                int hab1 = ler.nextInt();
                System.out.println("Digite o ID da Habilidade 02 que quer adicinar:");
                int hab2 = ler.nextInt();
                System.out.println("Digite o ID da Habilidade 03 que quer adicinar:");
                int hab3 = ler.nextInt();
                System.out.println("Digite o ID da Habilidade 04 que quer adicinar:");
                int hab4 = ler.nextInt();

                Habilidade[] habPoke = new Habilidade[4];
                habPoke[0] = liHa.get(hab1);
                habPoke[1] = liHa.get(hab2);
                habPoke[2] = liHa.get(hab3);
                habPoke[3] = liHa.get(hab4);

                poke.setHabilidade(habPoke);

                System.out.println("------------------- Pokemon Atualizado para"+poke.getNome()+"---------------------");

            }
        }
    }

    public static void DeletarPokemon(ArrayList<Pokemon> liPo, String nomePoke)
    {
        for (Pokemon poke : liPo) {
            if (poke.getNome().equals(nomePoke)) {
                System.out.println("Voce deletou a habilidade: " + poke.getNome());
                liPo.remove(poke);

            }

        }
    }

}