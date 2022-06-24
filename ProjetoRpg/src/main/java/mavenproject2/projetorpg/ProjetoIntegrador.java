package mavenproject2.projetorpg;

import java.util.Scanner;

public class ProjetoIntegrador {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int menu;

        do {
            System.out.println("1-JOGAR");
            System.out.println("2-CRÉDITOS");
            System.out.println("Opção: ");

            menu = input.nextInt();

            if (menu == 1) {

                System.out.println("Aqui começa a nossa história.Vamos Jogar ");
                System.out.println("...");
                System.out.println("Em uma era antiga onde homens usavam espadas, armaduras e cavalos, existiam 02 reinos.\n"
                        + "Um desses reinos é o Reino Eterno, esse reino era bastante movimentado, porém para entrar ao reino, cada indivíduo tinha que ter pré-requisitos.\n"
                        + "um desses pré-requisitos é nunca ter se aliado a reinos conquistadores de terras, os quais valorizam a riqueza maior que a vida individual,\n"
                        + "em torno do reino tinham fortaleza feita de pedra, com altas defesas para inibir qualquer invasor.\n");

                System.out.println("O outro era o Reino Agricultor, que por sua vez era onde os acordos não existiam eram ganancioso e rancorosos.\n"
                        + "Domintantes de grandes lotes, eles se vangloriavam de cada território conquistado, terras planas e férteis eram suas preferidas,\n"
                        + "seu reino era cercado por muros de pedra com um toque de ouro nas pontas, haviam grandes negociações dentro das cidades, onde as pessoas\n ");
                System.out.println("Há décadas atras o reino Agricultor invadiu o Reino Eterno, isso porque queriam riquezas e conquistar seu território,\n"
                        + "durante o confronto houve muito sangue derramado, incluindo o antigo rei do Reino Eterno.\n"
                        + "O Reino Eterno levou anos para pensar em uma vingaça e como iriam reconstruir sua honra e glória depois de terem sidos devastados pelos ataques rivais.\n"
                        + "Após anos de treinamentos e adaptação com novas tropas, apresentaram diante do novo rei uma ideia de vingaça,\n"
                        + "durante todo o tempo de planejamento, enviaram um espião ao reino rival, para procurar brechas na guarda, saber a quantidades de soldados e armamentos\n"
                        + "que tinham protegendo seu reino, após o infiltrado voltar com a planta do castelo, descobriam que dentro do reino rival havia uma grande área comercial,\n"
                        + "onde diversas pessoas entravam e saiam a todo tempo, tendo muralhas grandiosas com defesas compostas por arqueiros, um portão fortificado, soldados circulando\n "
                        + "a todo tempo e no final da rua ficava o castelo. Alguns dias se passaram, após terem analisado e estudado formas de ataque, chegou o grande dia do Reino Eterno\n"
                        + "ter sua vingaça. Na frente foram os exércitos mais os arqueiros e cavalaria, logo atrás muitos soldados aliados.\n"
                        + "O reino Eterno levou 4 dias para chegar ao reino rival, durante esse percuso encontraram poções e recursos para abrigos e alimentação.\n"
                        + "Se aproximando o reino inimigo, o reino Agricultor precebeu movimentações estranhas e rapidamente mandaram um ancião para um possível acordo,\n"
                        + "oferecendo riquezas e parte da colheita para que fossem embora. Porém isso não foi o bastante para eles, pois o Reino Eterno queria vingaça\n"
                        + "guerreiros com sede de guerra, de ouvir barulhos de espadas cortando, sons tenebrosos da batalha e então recusaram a proposta.\n"
                        + "Chegando próximo ao reino inimigo, foi ordenado à um dos arqueiros que atirasse uma flechão no ancião inimigo, para msotrar que nada importava para eles\n"
                        + "apenas queriam vingança. Com isso, prosseguiram para a invasão ao reino, usamos escadas grandes para subir os muros e um grande tronco para quebrar o portão.\n"
                        + "Entraram no reino e lá houve espadas cortando corpos e batendo, durante todo esse processo conquistaram grande parte do exército inimigo.\n"
                        + "Saquearam as casas e queimavam algumas do reino inimigo, durante toda essa rebelião, pegaram a rainha inimiga e fizeram chantagens para o rei inimigo aparecer.\n"
                        + "o rei logo apareceu, e então o rei fez uma proposta de sua vida pela a da rainha, e então o Reino Eterno aceitou, só para ir até eles.\n"
                        + "No final de toda guerra, o Reino Eterno dominou o reino inimigo, baniram a rainha para terras bem distantes. E a glória reinou.\n"
                        + "Que a força e a sabedoria esteja com você, qualquer dúvida pense bem antes de agir, boa sorte!");

                System.out.printf(".\n.\n.\n");

                System.out.println("Nickname: ");
                String nomeJogador = entradaDadosString();
                System.out.println("Olá " + "'" + nomeJogador + "'" + ", você terá uma aventura incrível!!! ");
                System.out.println("Nesse primeiro momento do jogo você precisará escolher ");
                System.out.println("um personagem, cada um com sua classe, cada um com suas ");
                System.out.println("particularidades, entre as opções temos: ");

                    System.out.println("1 - Guerreiro:");
                    System.out.println("A classe guerreiro tem como arma uma grande espada, tem bastante dano ");
                    System.out.println("e bastante resistência, é ruim contra inimigos que atacam de longa distância.");

                    System.out.println("2 - Ladrão:");
                    System.out.println("A classe ladrão tem uma faca letal, tem bastante agilidade e furtividade, é ruim");
                    System.out.println("contra inimigos com muita resistência.");

                    System.out.println("3 - Mago:");
                    System.out.println("A classe mago tem como arma um cajado que pode ser de água, ar, fogo ou terra,");
                    System.out.println("tem bastante dano em área e versáril, é ruim contra inimigos de curta distância.");

                    System.out.println("4 - Atirador:");
                    System.out.println("A classe atirador tem como arma uma besta, tem velocidade de ataque e bom dano, ");
                    System.out.println("é ruim contra inimigos de curto alcance e inimigos assassinos.");

                    System.out.println("5 - Lutador:");
                    System.out.println("A classe lutador usa como arma seus punhos, tem curto alcance, porém muito dano");
                    System.out.println("é ruim contra inimigos de longo alcance como mago e atirador.");

                    System.out.println("6 - Paladino:");
                    System.out.println("A classe paladino tem como arma uma espada protegida pelos anjos e um escudo de grande porte");
                    System.out.println("tem habilidades de cura e bastante dano, é ruim contra magos.");

                    System.out.println("Selecione uma opção: ");
                    int opcao = entradaDadosInt();

                    switch (opcao) {

                        case 1:
                        int vidaGuerreiro,
                         habilidade1Guerreiro,
                         habilidade2Guerreiro,
                         goblin,
                         guardiao;
                        vidaGuerreiro = 250;
                        habilidade1Guerreiro = 20;
                        habilidade2Guerreiro = 10;
                        goblin = 10;
                        guardiao = 50;

                        int combate;

                        System.out.println("GUERREIRO SELECIONADO ");
                        System.out.println("Poderes do guerreiro: ");
                        System.out.println("* Espada Gloriósa: causa 20 de dano porém recebe 5 de dano ao conjurar;");
                        System.out.println("* Escudo Divino: causa 10 de dano. Não recebe dano ao conjurar.");
                        System.out.println("Você nascera em um centro de treinamento para ");
                        System.out.println("aprender os conceitos basicos do jogo, tais como andar, ");
                        System.out.println("escolher itens dropados pelos monstros da floresta e usar ");
                        System.out.println("seus equipamentos. ");
                        System.out.println("para andar pelo jogo, digite norte ou sul: ");
                        System.out.println("tente se movimentar, digitando alguns dos comandos acima:");
                        String movimento = entradaDadosString();

                        if (movimento.equalsIgnoreCase("norte")) {
                            System.out.println("Você andou um passo para o norte");
                            System.out.println("encontrou um goblin fraco, com 10 de vida, para lutar contra ele digite ");
                            System.out.println(" '1' ou para sair, digite '2'");
                            opcao = entradaDadosInt();

                            if (opcao == 1) {
                                System.out.println("Sua vida atual: " + vidaGuerreiro);
                                System.out.println("Escolha uma habilidade para atacar o inimigo:");
                                System.out.println("1 - Espada Gloriósa");
                                System.out.println("2 - Escudo Divino ");
                                combate = entradaDadosInt();
                                if (combate == 1) {
                                    goblin = goblin - habilidade1Guerreiro;
                                    vidaGuerreiro = vidaGuerreiro - 5;
                                    System.out.println("Vida do goblin: " + goblin);
                                    System.out.println("Você derrotou o goblin!");
                                    System.out.println("Sua vida atual: " + vidaGuerreiro);

                                } else if (combate == 2) {
                                    goblin = goblin - habilidade2Guerreiro;
                                    System.out.println("Vida do goblin: " + goblin);
                                    System.out.println("Você derrotou o goblin!");
                                } else if (opcao == 2) {
                                    System.out.println("VocÊ fugiu de uma batalha! ");
                                    break;

                                }

                            }

                        } else if (movimento.equalsIgnoreCase("sul")) {
                            System.out.println("Você andou um passo para o sul");
                            System.out.println("Você encontrou um baú, porém há um guardião por perto");
                            System.out.println("terá que lutar contra ele para conseguir abrir o baú");
                            System.out.println("O Guardião tem 50 pontos de vida ");

                            do {
                                combate = entradaDadosInt();

                                if (combate == 1) {

                                    System.out.println("Sua vida atual: " + vidaGuerreiro);
                                    guardiao = guardiao - habilidade1Guerreiro;
                                    vidaGuerreiro = vidaGuerreiro - 5;
                                    System.out.println("Vida do guardião: " + guardiao);

                                } else if (combate == 2) {

                                    System.out.println("Sua vida atual: " + vidaGuerreiro);
                                    guardiao = guardiao - habilidade2Guerreiro;
                                    vidaGuerreiro = vidaGuerreiro - 15;
                                    System.out.println("Vida do guardião: " + guardiao);

                                }
                            } while (guardiao > 0);
                            System.out.println("Parabens, você derrotou o guardião e agora pode abrir o baú");
                            System.out.println(" ** Você encontrou uma espada fortificada ** ");
                            System.out.println(" * Espada equipada automaticamente * ");

                            break;

                        }

                        case 2:

                            int vidaLadrao,
                             habilidade1Ladrao,
                             habilidade2Ladrao,
                             javalis,
                             javalisatk,
                             guarda;
                            vidaLadrao = 50;
                            habilidade1Ladrao = 15;
                            habilidade2Ladrao = 5;
                            guarda = 20;
                            javalis = 10;
                            javalisatk = 10;

                            System.out.println("LADRAO SELECIONADO ");
                            System.out.println("Você nascera em um centro de treinamento para ");
                            System.out.println("aprender os conceitos basicos do jogo, tais como andar, ");
                            System.out.println("escolher itens dropados pelos monstros da floresta e usar ");
                            System.out.println("seus equipamentos. ");
                            System.out.println("para andar um passo, digite norte ou sul: ");
                            movimento = entradaDadosString();

                            if (movimento.equalsIgnoreCase("norte")) {
                                System.out.println("Você andou um passo para o norte");
                                System.out.println("Encontrou mantimentos numa bolsa perto de uma arvore,");
                                System.out.println("Logo apó pegar os itens da bolsa apareceu um guarda com 20 de vida");
                                System.out.println("Você pode tentar escolher fugir e não ser pego ou tentar matar o guarda");
                                System.out.println("1 para matar o guarda ou 2 para fugir");
                                opcao = entradaDadosInt();

                                if (opcao == 1) {
                                    System.out.println("Sua vida atual: " + vidaLadrao);
                                    System.out.println("Escolha uma habilidade para atacar o inimigo:");
                                    System.out.println("1 - faquinha");
                                    System.out.println("2 - soco");
                                    combate = entradaDadosInt();

                                    do {
                                        if (combate == 1) {
                                            guarda = guarda - habilidade1Ladrao;
                                            System.out.println("Vida do guarda: " + guarda);
                                            if (guarda > 0) {
                                                System.out.println("Escolha uma habilidade para atacar o inimigo:");
                                                System.out.println("1 - faquinha");
                                                System.out.println("2 - soco");
                                                combate = entradaDadosInt();
                                            } else {
                                                System.out.println("Você derrotou o guarda!");
                                                break;
                                            }

                                        } else if (combate == 2) {

                                            guarda = guarda - habilidade2Ladrao;
                                            System.out.println("Vida do guarda: " + guarda);
                                            if (guarda > 0) {
                                                System.out.println("Escolha uma habilidade para atacar o inimigo:");
                                                System.out.println("1 - faquinha");
                                                System.out.println("2 - soco");
                                                combate = entradaDadosInt();

                                            } else {
                                                System.out.println("Você derrotou o guarda!");
                                                break;
                                            }

                                        }
                                    } while (guarda > 0);

                                } else if (opcao == 2) {
                                    System.out.println("VocÊ fugiu de uma batalha! ");
                                    break;
                                }

                                System.out.println("Depois de sua árdua batalha você decide ir para a cidade a sua frente,");
                                System.out.println("mas como você é uma ladrão procurado você não pode entrar pelos portões,");
                                System.out.println("Você pode tentar pular o muro ou entrar em uma carroça");
                                System.out.println("1 para pular o muro ou 2 para entrar na carroça");
                                opcao = entradaDadosInt();

                                if (opcao == 1) {
                                    vidaLadrao = vidaLadrao - 20;
                                    System.out.println("você  tropeçou no topo do muro e caiu dentro da cidade, porem se feriu levemente");
                                    break;
                                } else if (opcao == 2) {

                                    System.out.println("você pede para entrar na carroça de um mercador,");
                                    System.out.println("Porem ele diz que só permitira você entrar se acertar seu enigma.");
                                    System.out.println("O que é, o que é? Mesmo atravessando o rio não se molha.");
                                    String enigma = entradaDadosString();

                                    if (enigma.equalsIgnoreCase("Ponte")) {
                                        System.out.println("Parabens, você acertou, pode entrar na carroça,");
                                        System.out.println("Você entrou na cidade.");
                                        break;
                                    } else if (enigma.equalsIgnoreCase("ponte")) {
                                        System.out.println("Parabens, você acertou, pode entrar na carroça,");
                                        System.out.println("Você entrou na cidade.");
                                        break;
                                    } else if (enigma.equalsIgnoreCase("PONTE")) {
                                        System.out.println("Parabens, você acertou, pode entrar na carroça,");
                                        System.out.println("Você entrou na cidade.");
                                        break;
                                    } else if (enigma.equalsIgnoreCase("A PONTE")) {
                                        System.out.println("Parabens, você acertou, pode entrar na carroça,");
                                        System.out.println("Você entrou na cidade.");
                                        break;
                                    } else if (enigma.equalsIgnoreCase("A ponte")) {
                                        System.out.println("Parabens, você acertou, pode entrar na carroça,");
                                        System.out.println("Você entrou na cidade.");
                                        break;
                                    } else if (enigma.equalsIgnoreCase("a ponte")) {
                                        System.out.println("Parabens, você acertou, pode entrar na carroça,");
                                        System.out.println("Você entrou na cidade.");
                                        break;
                                    }else{
                                        System.out.println("Você errou o enigma do dono da carroça e foi pego pelos guradas.");
                                        System.exit(0);
                                        
                                    }

                                }

                                System.out.println("você conseguiu entrar na cidade");
                                    System.out.println("Parabens por finalizar essa história.");
                                    System.exit(0);

                            } else if (movimento.equalsIgnoreCase("sul")) {
                                System.out.println("Você andou um passo para o sul");
                                System.out.println(" - O que é aquilo? uma árvore gigante!!!");
                                System.out.println(" - Tem varias maças frescas nela, será que consigo pega-las? ");
                                System.out.println("1 - Tentar escalar a árvore");
                                System.out.println("2 - Usar uma faca para acertar a maça");

                                int decisao = entradaDadosInt();
                                if (decisao == 1) {
                                    System.out.println(" - boa, foi moleza!");
                                    System.out.println(" - ela podia ser maior.");
                                } else if (decisao == 2) {
                                    System.out.println(" - Ops, acabei acertando um inimigo sem querer !!! ");
                                    System.out.println(" - javalis sairam de trás dos arbustos, precisamos derrota-los ");
                                    System.out.println(" ** Os lobos tem 30 de vida e 10 dano de atk ** ");
                                    System.out.println("1 - faquinha");
                                    System.out.println("2 - Soco");

                                    do {
                                        combate = entradaDadosInt();

                                        if (combate == 1) {
                                            System.out.println("Sua vida atual: " + vidaLadrao);
                                            javalis = javalis - habilidade1Ladrao;
                                            System.out.println("o javali revidou o seu ataque");
                                            vidaLadrao = vidaLadrao - javalisatk;
                                            System.out.println("Sua vida atual: " + vidaLadrao);
                                            System.out.println("Vida do javali: " + javalis);

                                        } else if (combate == 2) {

                                            System.out.println("Sua vida atual: " + vidaLadrao);
                                            javalis = javalis - habilidade2Ladrao;
                                            System.out.println("o javali revidou o seu ataque");
                                            vidaLadrao = vidaLadrao - javalisatk;
                                            System.out.println("Sua vida atual: " + vidaLadrao);
                                            System.out.println("Vida do javali: " + javalis);
                                        }

                                    } while (javalis > 0);
                                    System.out.println("Olha só, conseguimos derrotar os javalis e ainda garantimos nossas maças !!!");
                                    }
                                break;
                            }

                            break;
                        case 3:
                            
                            int magia1,
                            magia2,
                            arqueiro,
                            arqatk,
                            urso,
                            ursoatk,
                            vidaMago;
                            magia1 = 20;
                            magia2 = 10;
                            arqueiro = 30;
                            arqatk = 10;
                            urso = 60;
                            ursoatk = 20;
                            vidaMago = 40;
                            
                            System.out.println("MAGO SELECIONADO ");
                            System.out.println("Você nascera em um centro de treinamento para ");
                            System.out.println("aprender os conceitos basicos do jogo, tais como andar, ");
                            System.out.println("escolher itens dropados pelos monstros da floresta e usar ");
                            System.out.println("seus equipamentos. ");
                            System.out.println("para andar um passo, digite norte ou sul: ");
                            movimento = entradaDadosString();

                            if (movimento.equalsIgnoreCase("norte")) {
                                System.out.println("Você andou um passo para o norte");
                                System.out.println("Encontrou um urso, terá que lutar contra ele para seguir em frente!! ");
                                System.out.println("urso tem 60 de vida e 20 dano de atk ");
                                System.out.println("Escolha uma habilidade para ataca-lo: ");
                                System.out.println("1 - magia de fogo");
                                System.out.println("2 - magia de gelo, magia de gelo impede que o inimigo te ataque");

                                do {
                                    combate = entradaDadosInt();

                                    if (combate == 1) {
                                        System.out.println("Sua vida atual: " + vidaMago);
                                        urso = urso - magia1;
                                        System.out.println("o urso revidou o seu ataque");
                                        vidaMago = vidaMago - ursoatk;
                                        System.out.println("Sua vida atual: " + vidaMago);
                                        System.out.println("Vida do urso: " + urso);

                                    } else if (combate == 2) {

                                        System.out.println("Sua vida atual: " + vidaMago);
                                        urso = urso - magia2;
                                        System.out.println("Vida do urso: " + urso);
                                    }

                                } while (urso > 0);
                                System.out.println("Você derrotou o urso e pode seguir sua jornada!!!");

                            } else if (movimento.equalsIgnoreCase("sul")) {
                                System.out.println("Você andou um passo para o sul");
                                System.out.println("Encontrou um arqueiro do reino inimigo, terá que lutar contra ele para seguir em frente!! ");
                                System.out.println("o arqueiro tem 30 de vida e 10 dano de atk ");
                                System.out.println("Escolha uma habilidade para ataca-lo: ");
                                System.out.println("1 - magia de fogo");
                                System.out.println("2 - magia de gelo, magia de gelo impede que o inimigo te ataque");

                                do {
                                    combate = entradaDadosInt();

                                    if (combate == 1) {
                                        System.out.println("Sua vida atual: " + vidaMago);
                                        arqueiro = arqueiro - magia1;
                                        System.out.println("o arqueiro revidou o seu ataque");
                                        vidaMago = vidaMago - arqatk;
                                        System.out.println("Sua vida atual: " + vidaMago);
                                        System.out.println("Vida do arqueiro: " + arqueiro);

                                    } else if (combate == 2) {

                                        System.out.println("Sua vida atual: " + vidaMago);
                                        arqueiro = arqueiro - magia2;
                                        System.out.println("Vida do arqueiro: " + arqueiro);
                                    }

                                } while (urso > 0);
                                System.out.println("Você derrotou o arqueiro inimigo e pode seguir sua jornada!!!");
                            }

                            break;
                        case 4:
                            
                            int vidaAti,
                             arco,
                             hobgoblin,
                             hgatk;
                            vidaAti = 40;
                            arco = 20;
                            hobgoblin = 80;
                            hgatk = 40;
                            
                            System.out.println("ATIRADOR SELECIONADO ");
                            System.out.println("Você nascera em um centro de treinamento para ");
                            System.out.println("aprender os conceitos basicos do jogo, tais como andar, ");
                            System.out.println("escolher itens dropados pelos monstros da floresta e usar ");
                            System.out.println("seus equipamentos. ");
                            System.out.println("para andar um passo, digite norte ou sul: ");
                            movimento = entradaDadosString();

                            if (movimento.equalsIgnoreCase("norte")) {
                                System.out.println("Você andou um passo para o norte");
                                System.out.println("encontrou um hobgoblin, com 80 de vida e 40 de dano de atk,");
                                System.out.println(" digite '1' para lutar com ele ou digite '2' para fugir");
                                opcao = entradaDadosInt();

                                if (opcao == 1) {
                                    System.out.println("Sua vida atual: " + vidaAti);
                                    System.out.println("Escolha uma habilidade para atacar o inimigo:");
                                    System.out.println("1 - use uma flecha");
                                    combate = entradaDadosInt();
                                    if (combate == 1) {
                                        hobgoblin = hobgoblin - arco;
                                        System.out.println("Vida do hobgoblin: " + hobgoblin);
                                        System.out.println("o hobgoblin revidou o seu ataque");
                                        vidaAti = vidaAti - hgatk;
                                        System.out.println("Sua vida atual: " + vidaAti);
                                        System.out.println("Você perdeu para o hobgoblin!");
                                        System.exit(0);
                                        
                                    } else if (opcao == 2) {
                                        System.out.println("VocÊ fugiu de uma batalha! ");
                                        break;

                                    }
                                }
                            } else if (movimento.equalsIgnoreCase("sul")) {
                                System.out.println("Você andou um passo para o sul");
                                System.out.println("você encontra uma sala secreta com um arco escondido la dentro,");
                                System.out.println("Porem para entrar você tem que acertar um enigma gravado em suas paredes.");
                                System.out.println("O que é, o que é? Pode passar diante do sol sem fazer sombra?");
                                String enigma = entradaDadosString();
                                
                                if (enigma.equalsIgnoreCase("Vento")) {
                                        System.out.println("Parabens, você acertou,");
                                        System.out.println("Com isso você entrou na sala e pegou o seu novo arco");
                                        break;
                                    } else if (enigma.equalsIgnoreCase("vento")) {
                                        System.out.println("Parabens, você acertou,");
                                        System.out.println("Com isso você entrou na sala e pegou o seu novo arco");
                                        break;
                                    } else if (enigma.equalsIgnoreCase("VENTO")) {
                                        System.out.println("Parabens, você acertou,");
                                        System.out.println("Com isso você entrou na sala e pegou o seu novo arco");
                                        break;
                                    } else if (enigma.equalsIgnoreCase("O VENTO")) {
                                        System.out.println("Parabens, você acertou,");
                                        System.out.println("Com isso você entrou na sala e pegou o seu novo arco");
                                        break;
                                    } else if (enigma.equalsIgnoreCase("O Vento")) {
                                        System.out.println("Parabens, você acertou,");
                                        System.out.println("Com isso você entrou na sala e pegou o seu novo arco");
                                        break;
                                    } else if (enigma.equalsIgnoreCase("o vento")) {
                                        System.out.println("Parabens, você acertou,");
                                        System.out.println("Com isso você entrou na sala e pegou o seu novo arco");
                                        break;
                                    }else{
                                        System.out.println("Você errou o enigma da sala secreta,");
                                        System.out.println("O Guardião da sala retornou ao seu posto e te eliminou.");
                                        System.exit(0);
                                        
                                    }
                                
                            }
                            
                            break;
                        case 5:
                        System.out.println("LUTADOR SELECIONADO ");
                        System.out.println("Poderes do lutador: ");
                        System.out.println("* Punho dos Deuses: causa 20 de dano, porém recebe 5 de dano ao conjurar;");
                        System.out.println("* Chute Celeste: causa 15 de dano, podérm recebe 3 de dano ao conjutar.");
                        System.out.println("Você nascera em um centro de treinamento para ");
                        System.out.println("aprender os conceitos basicos do jogo, tais como andar, ");
                        System.out.println("escolher itens dropados pelos monstros da floresta e usar ");
                        System.out.println("seus equipamentos. ");
                        System.out.println("para andar um passo, digite norte ou sul: ");
                        movimento = entradaDadosString();

                        int vidaLutador,
                         habilidade1Lutador,
                         habilidade2Lutador,
                         harpia, tita;

                        vidaLutador = 130;
                        habilidade1Lutador = 15;
                        habilidade2Lutador = 5;
                        tita = 100;
                        harpia = 50;

                        if (movimento.equalsIgnoreCase("norte")) {
                            System.out.println("Você andou um passo para o norte");
                            System.out.println("Andando pelo norte da florest você se deparou com harpias ");
                            System.out.println("e terá que passar por elas para continuar em frente!!");
                            System.out.println("* Vida da Harpia * " + harpia);
                            System.out.println("Escolha a habilidade para atacar: ");
                            System.out.println("1 - Punho dos Deuses");
                            System.out.println("2 - Chute Celeste");
                            do {
                                combate = entradaDadosInt();

                                if (combate == 1) {
                                    System.out.println("Sua vida atual: " + vidaLutador);
                                    harpia = harpia - habilidade1Lutador;
                                    System.out.println("A harpia revidou o seu ataque");
                                    vidaLutador = vidaLutador - 5;
                                    System.out.println("Sua vida atual: " + vidaLutador);
                                    System.out.println("Vida da harpia: " + harpia);

                                } else if (combate == 2) {

                                    System.out.println("Sua vida atual: " + vidaLutador);
                                    harpia = harpia - habilidade2Lutador;
                                    System.out.println("A harpia revidou o seu ataque");
                                    vidaLutador = vidaLutador - 3;
                                    System.out.println("Sua vida atual: " + vidaLutador);
                                    System.out.println("Vida da harpia: " + harpia);
                                }

                            } while (harpia > 0);
                            System.out.println("A Harpia dropou uma armadura");
                            System.out.println(" * Armadura equipada automaticamente * ");
                            System.out.println("Parabens, você derrotou a harpia e poderá seguir em frete!! ");
                            break;

                        } else if (movimento.equalsIgnoreCase("sul")) {
                            System.out.println("Você andou um passo para o sul");
                            System.out.println("Andando pelo sul da floresta você encontrou um titã colossal ");
                            System.out.println("e terá que passar por ele para seguir em frente !");
                            System.out.println("Escolha a habilidade para atacar: ");
                            System.out.println("1 - Punho dos Deuses");
                            System.out.println("2 - Chute Celeste");

                            do {
                                combate = entradaDadosInt();

                                if (combate == 1) {
                                    System.out.println("Sua vida atual: " + vidaLutador);
                                    tita = tita - habilidade1Lutador;
                                    System.out.println("o titã revidou o seu ataque");
                                    vidaLutador = vidaLutador - 10;
                                    System.out.println("Sua vida atual: " + vidaLutador);
                                    System.out.println("Vida do titã: " + tita);

                                } else if (combate == 2) {

                                    System.out.println("Sua vida atual: " + vidaLutador);
                                    tita = tita - habilidade2Lutador;
                                    System.out.println("o titã revidou o seu ataque");
                                    vidaLutador = vidaLutador - 10;
                                    System.out.println("Sua vida atual: " + vidaLutador);
                                    System.out.println("Vida do tita: " + tita);
                                }
                                System.out.println("Parabéns, você derrotou o Titã e pode seguir em frente!! ");

                            } while (tita > 0);
                        }

                        break;
                        case 6:

                            int poder1 = 15,
                             poder2 = 30,
                             poder3 = 60;
                            int oak = 90,
                             lobo = 50;
                            int vidaPaladino = 230;

                            System.out.println("PALADINO SELECIONADO ");
                            System.out.println("Poderes do paladino:");
                            System.out.println("* Intimidação Ancestral: causa 15 de ano porém recebe 5 de dano ao conjurar;");
                            System.out.println("* Soco Benzido: causa 30 de dano porém recebe 15 de dano ao conjurar;");
                            System.out.println("* Poder Divino: causa 60 de dano porém recebe 30 de dano ao conjurar.");
                            System.out.println("Você nascera em um centro de treinamento para ");
                            System.out.println("aprender os conceitos basicos do jogo, tais como andar, ");
                            System.out.println("escolher itens dropados pelos monstros da floresta e usar ");
                            System.out.println("seus equipamentos. ");
                            System.out.println("para andar um passo, digite norte ou sul: ");
                            movimento = entradaDadosString();

                            if (movimento.equalsIgnoreCase("norte")) {
                                System.out.println("Você andou um passo para o norte");
                                System.out.println("Encontrou um Oak, terá que lutar contra ele para seguir em frente!! ");
                                System.out.println(" ** Oak tem 90 de vida e 20 dano de atk ** ");
                                System.out.println("Escolha uma habilidade para ataca-lo: ");
                                System.out.println("1 - Intimidação Ancestral");
                                System.out.println("2 - Soco Benzido");
                                System.out.println("3 - Poder Divino");

                                do {
                                    combate = entradaDadosInt();

                                    if (combate == 1) {
                                        System.out.println("Sua vida atual: " + vidaPaladino);
                                        oak = oak - poder1;
                                        vidaPaladino = vidaPaladino - 5;
                                        System.out.println("Vida do Oak: " + oak);

                                    } else if (combate == 2) {

                                        System.out.println("Sua vida atual: " + vidaPaladino);
                                        oak = oak - poder2;
                                        vidaPaladino = vidaPaladino - 15;
                                        System.out.println("Vida do Oak: " + oak);

                                    } else if (combate == 3) {
                                        System.out.println("Sua vida atual: " + vidaPaladino);
                                        oak = oak - poder3;
                                        vidaPaladino = vidaPaladino - 20;
                                        System.out.println("Vida do Oak: " + oak);
                                    }

                                } while (oak > 0);
                                System.out.println("Você derrotou o oak e pode seguir sua jornada!!!");

                            } else if (movimento.equalsIgnoreCase("sul")) {
                                System.out.println("Você andou um passo para o sul");
                                System.out.println(" - O que é aquilo? uma árvore gigante!!!");
                                System.out.println(" - Tem varias maças frescas nela, será que consigo pega-las? ");
                                System.out.println("1 - Tentar escalar a árvore");
                                System.out.println("2 - Usar um poder na árvore");

                                int decisao = entradaDadosInt();
                                if (decisao == 1) {
                                    System.out.println(" - Argh, sou muito lento e grande para subir aqui !");
                                    System.out.println(" - Quem sabe não encontro uma árvore menor.");
                                } else if (decisao == 2) {
                                    System.out.println(" - Ops, acabei acertando um inimigo sem querer !!! ");
                                    System.out.println(" - Lobos sairam de trás dos arbustos, precisamos derrota-los ");
                                    System.out.println(" ** Os lobos tem 50 de vida e 10 dano de atk ** ");
                                    System.out.println("1 - Intimidação Ancestral");
                                    System.out.println("2 - Soco Benzido");
                                    System.out.println("3 - Poder Divino");

                                    do {
                                        combate = entradaDadosInt();

                                        if (combate == 1) {
                                            System.out.println("Sua vida atual: " + vidaPaladino);
                                            lobo = lobo - poder1;
                                            vidaPaladino = vidaPaladino - 5;
                                            System.out.println("Vida do Oak: " + lobo);

                                        } else if (combate == 2) {

                                            System.out.println("Sua vida atual: " + vidaPaladino);
                                            lobo = lobo - poder2;
                                            vidaPaladino = vidaPaladino - 15;
                                            System.out.println("Vida do Lobo: " + lobo);

                                        } else if (combate == 3) {
                                            System.out.println("Sua vida atual: " + vidaPaladino);
                                            lobo = lobo - poder3;
                                            vidaPaladino = vidaPaladino - 20;
                                            System.out.println("Vida do Lobo: " + lobo);
                                        }

                                    } while (lobo > 0);
                                    System.out.println("Olha só, conseguimos derrotar os lobos e ainda garantimos nossas maças !!!");
                                }
                                break;               
                            }
                    }

                } else if (menu == 2) {
                System.out.println("Muito Obrigado por jogar o nosso jogo.\nEsse jogo foi desenvolvido e criado pelos alunos da turma B,\nEric Alves Melo\nFelipe Müller da Costa\nGuilherme Mikami\nHenrique Dos Santos Carvalho");
                System.exit(0);
            } else {
                System.out.println("Opção invalida");
                System.exit(0);
            }

            }

            while (menu > 2 || menu < 1);
        }

    static String entradaDadosString() {
        Scanner input = new Scanner(System.in);
        String opcaoString = input.next();
        return opcaoString;
    }

    static int entradaDadosInt() {
        Scanner input = new Scanner(System.in);
        int opcao = input.nextInt();
        return opcao;
    }

}
