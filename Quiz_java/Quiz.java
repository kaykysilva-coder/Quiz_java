import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

class Pergunta {
    String enunciado;
    String[] alternativas;
    char respostaCorreta;

    public Pergunta(String enunciado, String[] alternativas, char respostaCorreta) {
        this.enunciado = enunciado;
        this.alternativas = alternativas;
        this.respostaCorreta = respostaCorreta;
    }

    public boolean verificarResposta(char respostaUsuario) {
        return Character.toLowerCase(respostaUsuario) == Character.toLowerCase(respostaCorreta);
    }

    public void exibirPergunta() {
        System.out.println(enunciado);
        char letra = 'a';
        for (String alternativa : alternativas) {
            System.out.println(letra + ") " + alternativa);
            letra++;
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Pergunta[] perguntas = new Pergunta[15];

        perguntas[0] = new Pergunta(
                "Qual é a melhor Linguagem de Programacao",
                new String[]{"javascript", "go", "html", "php", "java"},
                'e'
        );

        perguntas[1] = new Pergunta(
                "Quem ganhou a libertadores de 2012 ? ",
                new String[]{"Flamengo", "santos", "Vasco", "corinthians", "Barcelona"},
                'd'
        );

        perguntas[2] = new Pergunta(
                "Qual elemento químico tem o símbolo O",
                new String[]{"Ouro", "Oxigênio", "Ósmio", "Oganésson", "Óxido"},
                'b'
        );

        perguntas[3] = new Pergunta(
                "Qual é o rio mais longo do mundo",
                new String[]{"nilo", "Amazonas", "Yangtzé", "Mississippi", "Danúbio"},
                'B'
        );

        perguntas[4] = new Pergunta(
                "Qual é a fórmula química da água?",
                new String[]{"CO2", "H2O", "O2", "NaCl", "CH4"},
                'b'
        );

        perguntas[5] = new Pergunta(
                "Qual é a capital do Japão?",
                new String[]{"Pequim", "Seul", "Tóquio", "Bangkok", " Osaka"},
                'c'
        );

        perguntas[6] = new Pergunta(
                "Qual é o metal mais condutor de eletricidade?",
                new String[]{"Ferro", "Cobrec", "Ouro", "Prata", "Alumínio"},
                'd'
        );

        perguntas[7] = new Pergunta(
                "Qual destes é um osso da perna humana?",
                new String[]{"Úmero", "Fêmur", " Rádio", "Clavícula", "Escápula"},
                'b'
        );

        perguntas[8] = new Pergunta(
                "Qual desses é um loop em Java?",
                new String[]{"repita", "foreach", "laço", "para", "iterar"},
                'b'
        );

        perguntas[9] = new Pergunta(
                "Qual o time com a segunda maior torcida do brasil e melhor nos campeonatos ",
                new String[]{"São Paulo ", "Flamengo", "Vasco da Gama", "Botafogo ", "Corinthians"},
                'e'
        );

        perguntas[10] = new Pergunta(
                "Qual é o menor país do mundo",
                new String[]{"Mônaco", "Vaticano", "San Marino", "Maltas", "Liechtenstein"},
                'b'
        );

        perguntas[11] = new Pergunta(
                "Qual destes animais é um mamífero?",
                new String[]{"Tubarão", "Jacaré", "Golfinho", "Cobra", "Galinha"},
                'c'
        );

        perguntas[12] = new Pergunta(
                "Qual linguagem é usada para desenvolver aplicativos Android?",
                new String[]{"Rápido", "Kotlin", "Rubi", "C#", "PHP"},
                'b'
        );

        perguntas[13] = new Pergunta(
                "Qual desses números é primo?",
                new String[]{"9", "12", "15", "17", "21"},
                'd'
        );

        perguntas[14] = new Pergunta(
                "Quem escreveu 'Os Lusíadas'?",
                new String[]{"Camões", "Fernando Pessoa", "Eça de Queiroz", "Machado de Assis", "José de Alencar"},
                'a'
        );

        int pontuacao = 0;

        for (int i = 0; i < perguntas.length; i++) {
            System.out.println("\nPergunta " + (i + 1) + ":");
            perguntas[i].exibirPergunta();

            System.out.print("Sua resposta (a/b/c/d/e): ");
            char resposta = scanner.next().charAt(0);

            if (perguntas[i].verificarResposta(resposta)) {
                System.out.println("Correto!");
                pontuacao++;
            } else {
                System.out.println("Errado! A resposta correta era: " + perguntas[i].respostaCorreta);
            }
        }

        System.out.println("\n--- FIM DO QUIZ ---");
        System.out.println("Você acertou " + pontuacao + " de " + perguntas.length + " perguntas!");
        System.out.println("\nola devkacik");

        scanner.close();
    }
}
