import javax.swing.*;
import java.util.Scanner;
import java.util.jar.JarEntry;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Scanner teclado = new Scanner(System.in);
//        System.out.print("Nome: ");
//        String nome = teclado.nextLine();
//        System.out.println("Primeira Nota: ");
//        float nota = teclado.nextFloat();
//        System.out.println("Segunda Nota: ");
//        float nota2 = teclado.nextFloat();
//        System.out.println("Terceira Nota: ");
//        float nota3 = teclado.nextFloat();
//        float media =(nota+nota2+nota3)/3;
//
//        System.out.printf("A media do aluno %s foi %.1f\n", nome, media);
//        if(media >= 7){
//            System.out.println("passou");
//
//        }else{
//            System.out.println("Nao passou");
//        }
        JOptionPane.showMessageDialog( null, "Ola mundo!");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
        System.out.println(idade);

        System.out.println(JOptionPane.showConfirmDialog( null,"tem certeza"));


    }
}