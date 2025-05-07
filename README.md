# Descrição do Código

Este código implementa um **jogo de lançar dados** utilizando Java. O objetivo é simular o lançamento de um dado de 6 lados e calcular as **probabilidades** dos resultados de cada face do dado após múltiplos lançamentos.

### Funcionalidades do código:

1. **Início do Jogo:**
   - O programa exibe uma mensagem inicial explicando o jogo e os objetivos.
   - A probabilidade de cada face do dado é apresentada como sendo **16,6%** (já que o dado possui 6 faces).

2. **Lançamentos de Dados:**
   - O código utiliza a classe `Random` para gerar números aleatórios entre 1 e 6, simulando o lançamento de um dado.
   - O usuário é solicitado, através de um **JOptionPane**, se deseja lançar o dado. Caso sim, o programa realiza o lançamento, registrando a face do dado sorteada e atualizando as contagens de cada face.

3. **Contagem e Exibição das Estatísticas:**
   - O programa mantém contadores para cada face do dado (de 1 a 6), e cada vez que uma face é sorteada, o respectivo contador é incrementado.
   - Após cada lançamento, o programa exibe o **resultado** do dado e, se o usuário escolher encerrar, ele mostra um resumo final com as **estatísticas** dos lançamentos, incluindo:
     - O número total de lançamentos.
     - A quantidade de vezes que cada face do dado foi sorteada, bem como a probabilidade percentual de cada face.

4. **Encerramento:**
   - O jogo é finalizado quando o usuário opta por não continuar lançando o dado.
   - Uma janela de diálogo é exibida com o total de lançamentos e as estatísticas de cada face, com a probabilidade de cada uma calculada de forma simples.

### Estrutura:

- **Classe `App`:** Contém a lógica principal do jogo, que é executada no método `main`.
- **Estruturas de Controle:**
  - **`while (true)`**: Loop principal do jogo que continua enquanto o usuário quiser lançar o dado.
  - **`switch-case`**: Usado para incrementar o contador da face correspondente a cada lançamento do dado.
  - **`JOptionPane`**: Para interações com o usuário, exibindo mensagens de entrada e saída.

### Conceitos Utilizados:
- **Probabilidade:** A probabilidade de cada face do dado é apresentada ao usuário, e o cálculo da porcentagem é realizado de forma dinâmica após cada rodada.
- **Aleatoriedade:** O lançamento do dado é simulado usando a classe `Random` para gerar um valor entre 1 e 6, de maneira completamente aleatória.

### Exemplo de Execução:

- O usuário decide lançar o dado várias vezes.
- Para cada lançamento, a face sorteada é mostrada, e os contadores são atualizados.
- Ao final, o programa exibe as estatísticas de como as faces foram sorteadas em termos de quantidade e probabilidade percentual.

Esse jogo simula a experiência de jogar um dado real e permite uma visualização simples das probabilidades teóricas e observadas durante o processo de lançamento.
