package com.jhumildes;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Employee JessyHumble = new Employee("Jessy","Humble",5464);
        Employee DoraLinda = new Employee("Dora", "Linda", 5463);
        Employee BiaLinda = new Employee("Bia", "Linda",6743);
        Employee JakeYoung = new Employee("Jake","Young",6483);
        Employee KamillaMaia = new Employee("Kamilla","Maia",6432);

        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(JessyHumble);
        list.addFirst(DoraLinda);
        list.addFirst(BiaLinda);

        //print the list
        Iterator iter = list.iterator();
        System.out.print("HEAD ->");
        while(iter.hasNext()){
            System.out.print(iter.next());
            System.out.print(" <=>");
        }
        System.out.print(" null ");

        //add to the end of the list
        list.add(KamillaMaia);
        iter = list.iterator();
        System.out.print("HEAD -> ");
        while(iter.hasNext()){
            System.out.print(iter.next());
            System.out.print(" <=>");
        }
        System.out.println(" null ");

        //removing items from the list
        list.removeFirst();
        iter = list.iterator();
        System.out.print(" HEAD -> ");
        while(iter.hasNext()){
            System.out.print(iter.next());
            System.out.print(" <=> ");
        }
        System.out.println(" null ");

        list.removeLast();
        iter = list.iterator();
        System.out.print(" HEAD ->");
        while(iter.hasNext()){
            System.out.print(iter.next());
            System.out.print(" <=>");
        }
        System.out.println(" null ");
//        list.size();
        System.out.println(list.size());

        //print the list
//        for(Employee employee: list){
//            System.out.println(employee);
//        }
    }
}
