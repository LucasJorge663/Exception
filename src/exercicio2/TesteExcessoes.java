package exercicio2;

import javax.swing.JOptionPane;

class TesteExcessoes extends DivisaoPorUmException {

	public TesteExcessoes(String s) {
		super(s);
	}

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		try {
			int x = 1 / 0;
		} catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());

		}

		System.out.println("Continua a execu��o. ");

		String denominador = JOptionPane.showInputDialog(null, "Digite um valor para o denominador", "Denominador?",
				JOptionPane.QUESTION_MESSAGE);

		if (denominador.equals("1")) {
			throw new DivisaoPorUmException("Voc� tentou dividir por 1, isto � inutil!");
		} else {

		}
	}
}
