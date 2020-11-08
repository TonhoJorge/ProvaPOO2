package Senai.prog_oo_java.prova2;

public class DemonstraExcecao {
    public static void main(String[] args) {
        MinhaClasse meuObjeto = new MinhaClasse();

        meuObjeto.metodo1();

        try {
            
            meuObjeto.metodo2();
        } catch (RuntimeException runtimeException) {
            System.out.println("Capturou um RuntimeException");
        } catch (Exception exception) {
            System.out.println("Capturou um Exception");
        } finally {
            System.out.println("Executou o bloco finally");
        }
    }
} // fim da classe DemonstraExcecao

