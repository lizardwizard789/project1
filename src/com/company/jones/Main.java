package com.company.jones;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("to do list time");
        int choice;
        ArrayList<String> theList=new ArrayList<String>();
        do {
            System.out.println("pick time! choos e nuber for action/n" +
                    "1: add task\n"+
                    "2: remove task\n" +
                    "3:update task\n" +
                    "4:list all task\n" +
                    "0: exit\nChoice:");
            choice=(input.nextInt());
            switch(choice)
            {
                case 1:
                    theList=addTask(input, theList);
                    break;
                case 2:
                    theList=removeTask(input, theList);
                    break;
                case 3:
                    theList=updateTask(input, theList);
                    break;
                case 4:
                    sendList(theList);
                    break;
                case 0:
                    System.out.println("ok bye");
                    break;
                default:
                    System.out.println("please cooperate");
                    break;

            }
        }while (choice!=0);


    }
    private static ArrayList<String> addTask(Scanner input, ArrayList<String> theList){
input.nextLine(); //java is cruel and janky.  this is a necessary evil
        System.out.println("what would you like to add?");
        theList.add(input.nextLine());
        return theList;


    }
    private static ArrayList<String> removeTask(Scanner input,ArrayList<String> theList){
        input.nextLine(); //java is cruel and janky.  this is a necessary evil
        System.out.println("which index wold you like to remove");
        theList.remove(input.nextInt());
        return theList;
    }
    private static ArrayList<String> updateTask(Scanner input, ArrayList<String> theList){
        System.out.println("which index would you like to update");
        int replaceIndex=input.nextInt();
        input.nextLine(); //java is cruel and janky.  this is a necessary evil
        System.out.println("and what wouold you like it to say?");
        theList.set(replaceIndex, input.nextLine());
        return theList;
    }
    private static void sendList(ArrayList<String> theList){
        for (int i=0; i<theList.size(); i++){
            System.out.println(theList.get(i));
        }
    }
}
