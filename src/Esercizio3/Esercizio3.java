package Esercizio3;

import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ciclo while per ripetere la richiesta finché l'utente non inserisce ":q"
        while (true) {
            // Chiede una stringa all'utente
            System.out.print("Inserisci una stringa (o :q per uscire): ");
            String input = scanner.nextLine();

            // Se l'utente inserisce ":q", il programma si ferma
            if (input.equals(":q")) {
                break; // Esce dal ciclo while
            }

            // Suddivide la stringa in caratteri separati dalla virgola
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                result.append(input.charAt(i));
                if (i < input.length() - 1) {
                    result.append(", "); // Aggiungi la virgola dopo ogni carattere, tranne l'ultimo
                }
            }

            // Stampa la stringa con i caratteri separati da virgola
            System.out.println("Caratteri separati da virgola: " + result);
        }

        // Chiude lo scanner quando non è più necessario
        scanner.close();
    }
}
