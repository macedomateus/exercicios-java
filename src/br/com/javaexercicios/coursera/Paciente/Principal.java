package br.com.javaexercicios.coursera.Paciente;

public class Principal {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente(63, 1.75);
        Paciente paciente2 = new Paciente(80, 1.91);
        Paciente paciente3 = new Paciente(103, 1.57);

        System.out.println("Paciente 1 -> " + paciente1);
        System.out.println("Paciente 2 -> " + paciente2);
        System.out.println("Paciente 3 -> " + paciente3);
    }


}
