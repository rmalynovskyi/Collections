package com.gmail.malynovskyiroman.task4;

        /*Шелдон, Леонард, Воловиц, Кутрапалли и Пенни стоят в очереди
        за «двойной колой». Как только человек выпьет такой колы он
        раздваивается и оба становятся в конец очереди, что бы выпить еще
        стаканчик. Напишите программу которая выведет на экран
        состояние очереди в зависимости от того сколько стаканов колы
        выдал аппарат с чудесным напитком. Например если было выдано
        только два стакана, то очередь выглядит как:
        [Volovitc, Kutrapalli, Penny,Sheldon,Sheldon,Leonard,Leonard]*/

public class Main {

    public static void main(String[] args) {

        DoubleColaAutomat doubleColaAutomat = new DoubleColaAutomat();

        System.out.println(doubleColaAutomat);

        doubleColaAutomat.deliveryCola(2);

        System.out.println(doubleColaAutomat);
    }
}
