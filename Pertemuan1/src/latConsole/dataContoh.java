/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package latConsole;

import java.util.Scanner;

/**
 *
 * @author fadil
 */
public class dataContoh {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            String nim, nama, grade;
            double uts, uas, rata;

            System.out.println("Data : ");
            System.out.print("NIM       : ");
            nim = input.next();
            System.out.print("Nama      : ");
            nama = input.next();
            System.out.print("Nilai Uts : ");
            uts = input.nextDouble();
            System.out.print("Nilai Uas : ");
            uas = input.nextDouble();

            rata = (uts + uas) / 2;

            if (rata < 50) {
                grade = "E";
            } else if (rata < 60) {
                grade = "D";
            } else if (rata < 70) {
                grade = "C";
            } else if (rata < 80) {
                grade = "B";
            } else {
                grade = "A";
            }
            System.out.println("=============================================================================================");
            System.out.println("NIM\t\t Nama\t UTS\t UAS\t Rata-Rata\tGrade");
            System.out.println("=============================================================================================");
            System.out.println(nim + "\t" + nama + "\t" + uts + "\t" + uas + "\t" + rata + "\t\t" + grade);
            System.out.println("");
            System.out.println(System.getProperty("user.name") + "-" + System.getProperty("user.dir"));
            System.out.println("");

        }
    }

