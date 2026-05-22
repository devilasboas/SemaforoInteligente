# 🚦 Semáforo Inteligente para Pedestres

Simulador interativo de semáforo inteligente desenvolvido em **Java 25** como projeto de estudo. O sistema analisa a cor atual do semáforo para carros e o acionamento do botão do pedestre para indicar, com segurança, o momento ideal para travessia.

---

## ✨ Funcionalidades

- ✅ Entrada interativa via console
- ✅ Validação de dados informados pelo usuário
- ✅ Análise de segurança por cor do semáforo (verde, amarelo, vermelho)
- ✅ Temporizador real com `Thread.sleep()`
- ✅ Efeito piscante nos segundos finais da travessia
- ✅ Métodos reutilizáveis para diferentes tipos de contagem regressiva
- ✅ Mensagens contextuais para cada situação de travessia

---

## 🛠️ Tecnologias Utilizadas

- **Java 25**
- `java.util.Scanner` — Leitura de entradas do usuário
- `Thread.sleep()` — Temporizador real
- Estruturas condicionais (`if/else`, `switch-case`)
- Estruturas de repetição (`for`)
- Métodos estáticos auxiliares

---

## 🎮 Como Executar

1. Certifique-se de ter o **JDK 25** instalado
2. Clone este repositório:
   ```bash
   git clone https://github.com/devilasboas/semaforo-inteligente.git
3. Compile o arquivo:
   ```bash
   javac SemaforoInteligente.java
4. Execute o programa:
   ```bash
   java SemaforoInteligente

## 📸 Exemplo de Saída

=== SEMÁFORO INTELIGENTE PARA PEDESTRES ===
Cruzamento: Av. Principal com Rua das Flores

Qual a cor atual do semáforo para carros? (verde/amarelo/vermelho): vermelho
O botão do pedestre foi pressionado? (s/n): s

--- ANÁLISE DA SITUAÇÃO ---
✅ Botão pressionado! Analisando condições de segurança...

🚦 Semáforo carros: VERMELHO
⏰ Tempo disponível: 15 segundos
🚶 Semáforo pedestres: VERDE

✅ CONDIÇÃO IDEAL PARA TRAVESSIA!

⏱️  Tempo restante para travessia:
   ⏱️  15 segundos
   ⏱️  14 segundos
   ...
   🟢 VERDE - 5
   ⚫ APAGADO - 5
   🟢 VERDE - 4
   ⚫ APAGADO - 4
   ...

🔴 Tempo esgotado! Semáforo pedestres: VERMELHO
=== CICLO CONCLUÍDO ===

## 🧠 Conceitos Praticados
- Estruturas condicionais (if, else, switch-case)
- Estruturas repetitivas (for)
- Operadores lógicos e comparativos
- Tratamento de exceções (try-catch)
- Criação e utilização de métodos
- Boas práticas de organização de código

## 📚 Próximos Passos
- Adicionar sistema de ciclos automáticos
- Implementar efeitos sonoros no console
- Criar estatísticas de travessias por cor
- Desenvolver simulação totalmente autônoma

## 📝 Licença
Este projeto está sob a licença MIT. Sinta-se à vontade para usar e modificar!



   
  
