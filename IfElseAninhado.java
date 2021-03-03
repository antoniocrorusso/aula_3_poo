import javax.swing.*;

public class IfElseAninhado {
    public static void main(String[] args) {
        long nota;
        nota = Long.parseLong(JOptionPane.showInputDialog("Digite a Nota: "));
        if (nota >= 90){
            JOptionPane.showMessageDialog(null, "Parabens");
            JOptionPane.showMessageDialog(null, "Conceito A");
        }
        else {
            if (nota >= 80){
                JOptionPane.showMessageDialog(null, "Conceito B");
            }
            else {
                if (nota >= 70){
                    JOptionPane.showMessageDialog(null, "Conceito C");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Reprovado");
                }
            }
        }
    }
}
