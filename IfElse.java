import javax.swing.*;

public class IfElse {
    public static void main(String[] args) {
        float nota;
        nota = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota: "));
        if (nota >= 70){
            JOptionPane.showMessageDialog(null, "Aprovado!");
            JOptionPane.showMessageDialog(null, "Parabens!");
        }
        else {
            JOptionPane.showMessageDialog(null, "Reprovado");
        }
    }
}
