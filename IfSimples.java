import javax.swing.JOptionPane;
public class IfSimples{
   public static void main (String[] args) {
       double nota;
       // double -> Double
       //float -> Float
       //int -> Integer
       //char -> Character
       nota = Double.parseDouble(JOptionPane.showInputDialog ("Digite a nota: "));
       if (nota >= 70){
        JOptionPane.showMessageDialog(null, "Aprovado");
       }
       
   } 
}

/*
    tipos primitivos do java:
    byte: 1 byte -> 8 bits
    short: 2 bytes -> 16 bits
    int: 4 bytes -> 32 bits
    long: 8 bytes -> 64 bits
    char: 1 byte -> 8 bits
    float: 4 bytes -> 32 bits
    double: 8 bytes -> 64 bits
*/

/*
    arquivo.java --------> arquivo.class --------> JVM -------> SO e hardware
                compilador                     interpreta e da instruções   
    
                compilador é o JavaC
    A vantagem disso é a portabilidade: write once, run anywhere.
*/

/*
    o arquibo class pode ser ignorado e posto no git ignore, pois a cada run é substituido.
*/ 