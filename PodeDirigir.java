import javax.swing.*;

public class PodeDirigir {
    public static void main(String[] args) {
        byte idade;
        idade = Byte.parseByte(JOptionPane.showInputDialog("Qual a sua idade? "));
        String podeDirigir;
        // If Else
        /*
        if (idade >= 18)
            podeDirigir = "Sim";
        else podeDirigir = "Não";
        */
        // python
        // pode_dirigir = "Sim" if idade >= 18 else "Não" -> Operador ternário
        // Operador Ternário Java
        podeDirigir = (idade >= 18) ? ("Sim") : ("Não");
        JOptionPane.showMessageDialog(null, podeDirigir);

    }
}
