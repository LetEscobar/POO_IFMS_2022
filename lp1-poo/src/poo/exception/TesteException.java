// package poo.exception;

// public class TesteException {
// public static void main(String[] args) {
// String frase = null;
// String novaFrase = null;
// try {
// novaFrase = frase.toUpperCase();
// } catch (NullPointerException ex) {
// System.out.println("Erro: Frase nula\nUsando uma frase default");
// frase = "Estou aprendendo";
// novaFrase = frase.toUpperCase();
// } catch (IllegalArgumentException ex) {
// System.out.println("Argumento inválido!");
// }
// System.out.println("Frase antiga: " + frase);
// System.out.println("Nova frase: " + novaFrase);

// // ------------------------------------------------------------------------

// String novaMsg = null;
// String msgCaixaAlta = caixaAlta(novaMsg);
// System.out.println("Msg Caixa Alta: " + msgCaixaAlta);
// try {
// msgCaixaAlta = caixaAlta(novaMsg);
// } catch (NullPointerException e) {
// novaMsg = "Nova Frase...";
// msgCaixaAlta = caixaAlta(novaMsg);
// e.printStackTrace();
// }
// System.out.println("Msg caixa Alta: " + msgCaixaAlta);
// }

// public static String caixaAlta(String msg) throws Exception {
// // pode acontecer um nullPointerException
// String ca = msg.toUpperCase();
// return ca;
// }
// }
