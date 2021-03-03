import javax.swing.*;

public class IfElseEncadeado {
    public static void main(String[] args) {
        int nota;
        nota = Integer.parseInt(JOptionPane.showInputDialog("Digite a Nota: "));
        if (nota >= 90){
            JOptionPane.showMessageDialog(null, "Parabens");
            JOptionPane.showMessageDialog(null, "Conceito A");
        }
        else if (nota >= 80){
            JOptionPane.showMessageDialog(null, "Aprovado");
            JOptionPane.showMessageDialog(null, "Conceito B");
        }
        else if (nota >= 70){
            JOptionPane.showMessageDialog(null, "Aprovado");
            JOptionPane.showMessageDialog(null, "Conceito C");
        }
        else
            JOptionPane.showMessageDialog(null, "Reprovado");
    }
}

/*
Se for uma linha de comando apenas após o if ou else, não precisa de chaves.
 */
