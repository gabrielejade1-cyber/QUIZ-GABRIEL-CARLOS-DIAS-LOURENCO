# Quiz em Java | Tecnologia, Programação e Games

Trabalho acadêmico de **Algoritmos e Linguagem de Programação II**.

- **Instituição:** UNIFAN - Centro Universitário Alfredo Nasser
- **Aluno:** Gabriel Carlos Dias Lourenço
- **Professor:** Brenno Pimenta
- **Curso:** Engenharia de Software, 2º período
- **Tema:** Tecnologia, Programação e Games

## Funcionalidades
- Cabeçalho acadêmico ao iniciar.
- 15 questões objetivas, com 5 alternativas (A a E), e uma resposta correta em cada.
- Validação e correção imediata das respostas.
- Exibição do total de acertos, erros e percentual com duas casas decimais.
- Agradecimento ao final.

## Como executar no IntelliJ IDEA
1. Extraia a pasta deste projeto.
2. Abra o IntelliJ IDEA e escolha **Open**.
3. Selecione a pasta `Quiz_Gabriel_UNIFAN` extraída.
4. Se for solicitado, configure um JDK (Java 17 ou superior é adequado).
5. Abra `src/Main.java` e clique no triângulo verde ao lado de `main` > **Run 'Main.main()'**.
6. No console, digite A, B, C, D ou E para cada pergunta.

## Estrutura
```
src/
  Main.java
  Cabecalho.java
  Questao.java
```

A classe `Questao.java` foi mantida conforme o projeto-base do professor: https://github.com/brennopimenta/universidadeESN2_QUIZ

## Execução alternativa pelo terminal
```bash
javac -encoding UTF-8 -d out src/*.java
java -cp out Main
```

## Autor
Gabriel Carlos Dias Lourenço.
