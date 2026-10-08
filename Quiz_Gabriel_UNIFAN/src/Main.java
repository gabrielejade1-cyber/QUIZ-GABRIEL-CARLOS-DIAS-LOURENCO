import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Cabecalho.exibir();
        List<Questao> questoes = criarQuestoes();
        int acertos = 0;

        for (int i = 0; i < questoes.size(); i++) {
            Questao questao = questoes.get(i);
            System.out.println("---------- QUESTÃO " + (i + 1) + " DE " + questoes.size() + " ----------");
            questao.escrevaQuestao();
            String resposta = questao.leiaResposta();
            if (questao.isCorreta(resposta)) {
                acertos++;
            }
        }

        double percentual = (acertos * 100.0) / questoes.size();
        System.out.println("============== RESULTADO FINAL ==============");
        System.out.println("Total de perguntas: " + questoes.size());
        System.out.println("Acertos: " + acertos);
        System.out.println("Erros: " + (questoes.size() - acertos));
        System.out.printf(Locale.forLanguageTag("pt-BR"), "Porcentagem de acertos: %.2f%%%n", percentual);
        System.out.println("Obrigado por participar do Quiz de Tecnologia, Programação e Games!");
    }

    private static List<Questao> criarQuestoes() {
        List<Questao> questoes = new ArrayList<>();
        questoes.add(criarQuestao("1. O que significa a sigla CPU?", "Unidade Central de Processamento", "Controle Principal de Usuário", "Central de Programas Úteis", "Unidade de Cálculo de Pixels", "Comando de Processamento Universal", "A"));
        questoes.add(criarQuestao("2. Qual destas linguagens é utilizada neste quiz?", "HTML", "CSS", "Java", "SQL", "XML", "C"));
        questoes.add(criarQuestao("3. Qual componente armazena dados temporários enquanto o computador está ligado?", "SSD", "Memória RAM", "Fonte de alimentação", "Monitor", "Teclado", "B"));
        questoes.add(criarQuestao("4. Em Java, qual comando pode imprimir uma mensagem no console com quebra de linha?", "console.log()", "print.text()", "echo()", "System.out.println()", "write.console()", "D"));
        questoes.add(criarQuestao("5. Qual destes é um sistema de controle de versões?", "Git", "Photoshop", "Excel", "Discord", "Blender", "A"));
        questoes.add(criarQuestao("6. Qual empresa criou o console PlayStation original?", "Nintendo", "Sega", "Atari", "Microsoft", "Sony", "E"));
        questoes.add(criarQuestao("7. Qual estrutura repete comandos enquanto uma condição for verdadeira?", "class", "import", "while", "return", "package", "C"));
        questoes.add(criarQuestao("8. Qual destes é um jogo conhecido por construir estruturas com blocos?", "Tetris", "Minecraft", "Pac-Man", "Pong", "Space Invaders", "B"));
        questoes.add(criarQuestao("9. Qual extensão é usada normalmente em arquivos de código-fonte Java?", ".exe", ".html", ".png", ".java", ".zip", "D"));
        questoes.add(criarQuestao("10. O que é um algoritmo?", "Uma sequência de passos para resolver um problema", "Um componente físico do computador", "Um tipo de cabo de rede", "Um modelo de placa de vídeo", "Um formato de imagem", "A"));
        questoes.add(criarQuestao("11. Qual destas alternativas representa um valor booleano em Java?", "\"texto\"", "42", "3.14", "'A'", "true", "E"));
        questoes.add(criarQuestao("12. Qual plataforma é muito usada para hospedar repositórios Git?", "Spotify", "Netflix", "GitHub", "YouTube Music", "Twitch", "C"));
        questoes.add(criarQuestao("13. Qual tipo de dado Java é adequado para armazenar números inteiros comuns?", "boolean", "int", "String", "char", "double[]", "B"));
        questoes.add(criarQuestao("14. Qual empresa desenvolve a franquia de jogos Mario?", "Valve", "Ubisoft", "Electronic Arts", "Nintendo", "Capcom", "D"));
        questoes.add(criarQuestao("15. Em programação, para que serve uma condição if?", "Executar um bloco de código quando uma condição é verdadeira", "Criar automaticamente um banco de dados", "Desligar o computador", "Importar todas as bibliotecas", "Repetir obrigatoriamente um comando 100 vezes", "A"));
        return questoes;
    }

    private static Questao criarQuestao(String pergunta, String a, String b, String c,
                                        String d, String e, String correta) {
        Questao questao = new Questao();
        questao.pergunta = pergunta;
        questao.opcaoA = "A) " + a;
        questao.opcaoB = "B) " + b;
        questao.opcaoC = "C) " + c;
        questao.opcaoD = "D) " + d;
        questao.opcaoE = "E) " + e;
        questao.correta = correta;
        return questao;
    }
}
