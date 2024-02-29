package com.rinftech.develop;

import java.util.*;

public class Main {
    public static void main(String[] args){
        int number = 8733;
        System.out.println("The sum of the integer "+number+" is: "+computeSum(number));
        System.out.println();

        String input = "The quick brown fox jumps over 42 lazy dogs";
        countAll(input);
        System.out.println();

        Employee employee = new Employee("Ana","Pop",12,"dks");
        System.out.println("Last name and job: "+employee.getLastName());
        System.out.println();

        Car car = new Car("c", "b",2020,"d");
        System.out.println("Maximum speed car:"+car.maximumSpeed());
        System.out.println("Calculate fuel efficiency: "+car.calculateFuelEfficiency(car.distanceTraveled(20,60),5.5));
        System.out.println("Distance traveled: "+car.distanceTraveled(20,60));
        System.out.println();

        Motorcycle motorcycle = new Motorcycle("m","r", 2021,"b");
        System.out.println("Maximum speed motorcycle: "+motorcycle.maximumSpeed());
        System.out.println("Calculate fuel efficiency: "+motorcycle.calculateFuelEfficiency(motorcycle.distanceTraveled(20,80),7.5));
        System.out.println("Distance traveled: "+motorcycle.distanceTraveled(20,80));
        System.out.println();

        Truck truck = new Truck("t", "c", 2019, "b");
        System.out.println("Maximum speed truck: "+truck.maximumSpeed());
        System.out.println("Calculate fuel efficiency: "+truck.calculateFuelEfficiency(truck.distanceTraveled(20,50),8));
        System.out.println("Distance traveled: "+truck.distanceTraveled(20,50));
        System.out.println();

        commonElements();

        // Creăm un obiect de tip Scanner pentru a citi de la tastatură
        Scanner scanner = new Scanner(System.in);

        // Afisăm un mesaj pentru utilizator
        System.out.print("Introduceti un numar intreg: ");

        // Citim numărul introdus de utilizator
        int element1 = scanner.nextInt();

        // Afisăm un mesaj pentru utilizator
        System.out.print("Introduceti un numar intreg: ");

        // Citim numărul introdus de utilizator
        int element2 = scanner.nextInt();

        swapsTwoTlements(element1,element2);

        //9th problem

        // Afisăm un mesaj pentru utilizator
        System.out.print("Introduceti o culoare: ");

        // Citim numărul introdus de utilizator
        String c = scanner.next();

        positionSpecifiedElement(c);


        anagramsMap();
        System.out.println();

        Circle circle = new Circle(5);
        System.out.println("Circle area : "+circle.calculateArea());

        Triangle triangle = new Triangle(5,10);
        System.out.println("Triangle area: "+triangle.calculateArea());

        Rectangle rectangle = new Rectangle(5,5);
        System.out.println("Rectangle area: "+rectangle.calculateArea());
        System.out.println();

        Lion lion = new Lion("Hyenas","roar");
        System.out.println("Lion eats: "+lion.eat()+" and it makes: "+lion.sound());
        Panther panther = new Panther("deer","grr" );
        System.out.println("Panther makes: "+panther.sound());
        Tiger tiger = new Tiger("humans","hss");
        System.out.println("Tiger makes: "+tiger.sound());

    }

    //first problem
    public static int computeSum(int number) {
        int sum = 0;
        while ( number !=0 ) {
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }

    //second problem
    public static void countAll(String input){
        int letters = 0;
        int numbers = 0;
        int spaces = 0;
        for ( int i = 0 ; i< input.length() ; i++ ){
            char ch = input.charAt(i);
            if ( Character.isLetter(ch) ){
                letters++;
            }
            if ( Character.isSpaceChar(ch) ){
                spaces++;
            }
            if ( Character.isDigit(ch) ){
                numbers++;
            }

        }
        System.out.println("Letter: "+letters);
        System.out.println("Spaces: "+spaces);
        System.out.println("Numbers: "+numbers);

    }

    //5th problem
    public static void commonElements(){
        List<String> firstArray = new ArrayList<>();
        List<String> secondArray = new ArrayList<>();
        firstArray.add("Python");
        firstArray.add("Java");
        firstArray.add("GoLang");
        firstArray.add("Lisp");
        secondArray.add("Java");
        secondArray.add("C++");
        secondArray.add("Apples");
        secondArray.add("Hamburger");
        secondArray.add("Lisp");
        List<String> newArray = new ArrayList<>();

        for ( int i = 0 ; i < firstArray.size() ; i++ ){
            //verify first element from firstArray if exist in secondArray
            if ( secondArray.contains(firstArray.get(i)) ){
                newArray.add(firstArray.get(i));
            }
        }
        System.out.println("Result for problem 5: "+newArray);
        System.out.println();
    }

    //8th problem
    public static void swapsTwoTlements(int element1, int element2){
        List<String> colorArray = new ArrayList<>();
        colorArray.add("Red");
        colorArray.add("Green");
        colorArray.add("Black");
        colorArray.add("White");
        colorArray.add("Pink");



        if ( !(element1 < colorArray.size())){
            System.out.println("The element 1 is bigger than colorArray size");
        }
        if ( !(element2 < colorArray.size())){
            System.out.println("The element 2 is bigger than colorArray size");
        }

        String obj1 = colorArray.get(element1);
        String obj2 = colorArray.get(element2);
        for ( int i = 0 ; i < colorArray.size() ; i ++ ){
            if ( colorArray.get(i).equals(obj1)){
                colorArray.remove(i);
                colorArray.add(i,obj2);
            }else {
                if (colorArray.get(i).equals(obj2)) {
                    colorArray.remove(i);
                    colorArray.add(i, obj1);
                }
            }
        }
        System.out.println("Output for problem 8: "+colorArray);
        System.out.println();
    }

    //9th problem
    public static void positionSpecifiedElement(String c){
        List<String> color = new ArrayList<>();
        color.add("Red");
        color.add("Green");
        color.add("Black");
        color.add("White");
        color.add("Pink");
        color.add("Green");
        color.add("Green");
        color.add("Black");
        color.add("Yellow");
        color.add("White");

        int firstPosition = color.indexOf(c);
        int lastPosition = color.lastIndexOf(c);

        System.out.println("First occurrence for "+c+" is position "+firstPosition+" and last is position "+lastPosition);
        System.out.println();
    }

    //10th problem
    public static void anagramsMap(){
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat", "listen", "silent", "enlist", "hello", "world", "dlrow"};

        // Crearea unui map pentru a grupa anagramele
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);

            String sortedStr = new String(charArray);

            // Dacă șirul sortat nu există în map, adăugăm o nouă listă goală
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }
            map.get(sortedStr).add(str);
        }
        List<List<String>> groupedAnagrams = new ArrayList<>(map.values());
        for (List<String> group : groupedAnagrams) {
            System.out.println("Output problem 10: "+group);
        }
    }






}
