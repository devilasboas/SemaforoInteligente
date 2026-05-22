import java.util.Scanner;

public class SemaforoInteligente {
    
    // ===== MÉTODOS AUXILIARES =====
    
    /**
     * Faz contagem regressiva simples de 1 em 1 segundo
     * @param segundosTotais Quantos segundos deve contar
     */
    public static void iniciarTimer(int segundosTotais) {
        try {
            for (int segundos = segundosTotais; segundos > 0; segundos--) {
                System.out.println("   ⏱️  " + segundos + " segundos");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("❌ Timer interrompido!");
        }
    }
    
    /**
     * Contagem regressiva com alerta nos últimos segundos
     * @param segundosTotais Total de segundos
     * @param segundosAlerta A partir de quantos segundos mostrar alerta
     */
    public static void iniciarTimerComAlerta(int segundosTotais, int segundosAlerta) {
        try {
            for (int segundos = segundosTotais; segundos > 0; segundos--) {
                if (segundos <= segundosAlerta) {
                    System.out.println("   ⚠️  " + segundos + " segundos - ATENÇÃO!");
                } else {
                    System.out.println("   ⏱️  " + segundos + " segundos");
                }
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("❌ Timer interrompido!");
        }
    }
    
    /**
     * Timer com mensagem personalizada
     * @param segundosTotais Total de segundos
     * @param mensagem Texto que aparece junto com o número
     */
    public static void iniciarTimerComMensagem(int segundosTotais, String mensagem) {
        try {
            for (int segundos = segundosTotais; segundos > 0; segundos--) {
                System.out.println("   " + mensagem + " " + segundos + "...");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("❌ Timer interrompido!");
        }
    }
    
    /**
     * Timer que pisca nos últimos segundos (efeito visual legal)
     * @param segundosTotais Total de segundos
     * @param segundosPiscar A partir de quantos segundos começar a piscar
     */
    public static void iniciarTimerPiscante(int segundosTotais, int segundosPiscar) {
        try {
            for (int segundos = segundosTotais; segundos > 0; segundos--) {
                if (segundos <= segundosPiscar) {
                    System.out.println("   🟢 VERDE - " + segundos);
                    Thread.sleep(500);  // Meio segundo aceso
                    System.out.println("   ⚫ APAGADO - " + segundos);
                    Thread.sleep(500);  // Meio segundo apagado
                } else {
                    System.out.println("   ⏱️  " + segundos + " segundos");
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            System.out.println("❌ Timer interrompido!");
        }
    }
    
    // ===== PROGRAMA PRINCIPAL =====
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final String VERDE = "verde";
        final String AMARELO = "amarelo";
        final String VERMELHO = "vermelho";
        
        System.out.println("=== SEMÁFORO INTELIGENTE PARA PEDESTRES ===");
        System.out.println("Cruzamento: Av. Principal com Rua das Flores\n");
        
        System.out.print("Qual a cor atual do semáforo para carros? (verde/amarelo/vermelho): ");
        String corSemaforo = scanner.nextLine().toLowerCase().trim();
        
        // Validação
        if (!corSemaforo.equals(VERDE) && 
            !corSemaforo.equals(AMARELO) && 
            !corSemaforo.equals(VERMELHO)) {
            System.out.println("❌ Cor inválida! Use apenas: verde, amarelo ou vermelho.");
            scanner.close();
            return;
        }
        
        System.out.print("O botão do pedestre foi pressionado? (s/n): ");
        String botaoPressionado = scanner.nextLine().toLowerCase().trim();
        
        if (!botaoPressionado.equals("s") && !botaoPressionado.equals("n")) {
            System.out.println("❌ Opção inválida! Use apenas: s ou n.");
            scanner.close();
            return;
        }
        
        System.out.println("\n--- ANÁLISE DA SITUAÇÃO ---");
        
        if (botaoPressionado.equals("n")) {
            System.out.println("Botão não foi pressionado. Sistema em espera.");
            System.out.println("Semáforo para pedestres permanece VERMELHO.");
        } else {
            System.out.println("✅ Botão pressionado! Analisando condições de segurança...\n");
            
            switch (corSemaforo) {
                case VERDE:
                    System.out.println("🚦 Semáforo carros: VERDE");
                    System.out.println("⏰ Tempo estimado para travessia: 10 segundos");
                    System.out.println("🚶 Semáforo pedestres: VERMELHO");
                    System.out.println("\n⚠️  ATENÇÃO: Aguarde o semáforo ficar vermelho para carros.");
                    
                    System.out.println("\n🕐 Iniciando contagem regressiva...");
                    iniciarTimer(10);  // ✅ USA O MÉTODO
                    
                    System.out.println("\n🔴 Semáforo para carros mudou para VERMELHO");
                    System.out.println("🟢 Semáforo para pedestres: VERDE - Pode atravessar!");
                    
                    System.out.println("\n🚶‍♂️ Tempo de travessia: 8 segundos");
                    iniciarTimerComAlerta(8, 3);  // ✅ USA O MÉTODO COM ALERTA
                    
                    System.out.println("🔴 Tempo esgotado! Semáforo pedestres: VERMELHO");
                    break;
                    
                case AMARELO:
                    System.out.println("🚦 Semáforo carros: AMARELO");
                    System.out.println("⏰ Tempo de atenção: 3 segundos");
                    
                    System.out.println("\n⏱️  Analisando condições...");
                    iniciarTimerComMensagem(3, "🔍 Verificando:");  // ✅ USA MÉTODO COM MENSAGEM
                    
                    System.out.println("\n⚠️  CUIDADO: Sinal está para mudar!");
                    System.out.println("📢 Mensagem: \"Atenção! Atravesse rapidamente ou aguarde.\"");
                    System.out.println("🔍 Verificando distância de segurança...");
                    
                    if (Math.random() > 0.5) {
                        System.out.println("   ⚠️  Veículos muito próximos!");
                        System.out.println("🚫 Travessia não recomendada. Aguarde o próximo ciclo.");
                    } else {
                        System.out.println("   ✅ Distância segura confirmada.");
                        System.out.println("🚶 Travessia permitida por 5 segundos. ATRAVESSE COM URGÊNCIA!");
                        iniciarTimerComMensagem(5, "🏃 CORRA:");  // ✅ USA O MÉTODO
                    }
                    break;
                    
                case VERMELHO:
                    System.out.println("🚦 Semáforo carros: VERMELHO");
                    System.out.println("⏰ Tempo disponível: 15 segundos");
                    System.out.println("🚶 Semáforo pedestres: VERDE");
                    System.out.println("\n✅ CONDIÇÃO IDEAL PARA TRAVESSIA!");
                    
                    System.out.println("\n⏱️  Tempo restante para travessia:");
                    iniciarTimerPiscante(15, 5);  // ✅ USA MÉTODO PISCANTE
                    
                    System.out.println("\n🔴 Tempo esgotado! Semáforo pedestres: VERMELHO");
                    break;
            }
        }
        
        System.out.println("\n=== CICLO CONCLUÍDO ===");
        scanner.close();
    }
}
