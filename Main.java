package ru.prokudin.geekbrains.homework;

import java.text.MessageFormat;
import java.util.Scanner;

/**
 * Created by Serge Prokudin on 19.12.2019.
 * Урок № 5 Задание № 1
 * 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
 * 2. Конструктор класса должен заполнять эти поля при создании объекта;
 * 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
 * 4. Создать массив из 5 сотрудников
 * 5. * С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
 */

public class Main {


    public static void main(String[] args) {
        class Employee {

            private String Name;
            private String Position;

            public Employee(String n, String p) {
                Name = n;
                Position = p;
            }
            void GetData() {
                Scanner sc = new Scanner(System.in);

                System.out.print("\n\tEnter Employee Name : ");
                Name = sc.nextLine();
            }
        }
    }
}

