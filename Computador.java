/*
 *
 *
 */
package aula08exercicio01;

import javax.swing.JOptionPane;



/**
 *
 * @author Aluno
 */
public class Computador {
   

    String marca;
    String modelo;
    int memoriaRAM;

    // Construtor 
    public Computador(String marca, String modelo, int memoriaRAM) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoriaRAM = memoriaRAM;
    }

    // sobrecarga
    public Computador(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoriaRAM = 8;
    }

    /*mostrar as informações*/
    public void mostrarInformacoes() {
      JOptionPane.showMessageDialog(null,
                "marca: " + marca +
                "\nmodelo: " + modelo +
                "\nmemoria RAM: " + memoriaRAM + "GB");
    }
}

