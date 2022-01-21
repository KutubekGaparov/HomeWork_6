package org.example;

import org.example.dao.Dao;

import java.sql.SQLException;
import java.util.Scanner;

/**
 * Hello world!
 */

public class App {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws SQLException {
        System.out.println(Dao.printCountry());
        System.out.println(Dao.printCities());


        while (true) {
            System.out.println("Oлколорду  id си менен табуу");
            int a = scanner.nextInt();
            if (a < 6) {
                Dao.printIdCountry(a);
            } else {
                break;
            }
        }
        while (true) {
            System.out.println("Шаарларды id си менен табуу");
            int a = scanner.nextInt();
            if (a < 6) {

                Dao.printIdCities(a);

            } else {
                break;
            }
        }
    }
}

