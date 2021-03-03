import javax.swing.*;

public class SwitchCase {
    public static void main(String[] args) {
        short nota;
        nota = Short.parseShort(JOptionPane.showInputDialog("Digite a nota: "));
        switch (nota){
            case 10:
                JOptionPane.showMessageDialog(null, "Conceito A");
                JOptionPane.showMessageDialog(null, "Parabens");
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "Conceito A");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "Conceito B");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Conceito C");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Reprovado");
        }
    }
}
