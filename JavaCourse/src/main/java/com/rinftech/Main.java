package com.rinftech;


import com.rinftech.animals.DomesticAnimal;
import com.rinftech.animals.GoldenRetriever;

public class Main {
    public static void main(String[] args) {

//        DomesticAnimal domesticAnimal = new DomesticAnimal("Dog", 15.0f, "Rex");
//        domesticAnimal.callPet();
//        DomesticAnimal goldenRetriver = new GoldenRetriever("Dog", 12.0f, "Leo", "Yellow");
//        goldenRetriver.callPet();
//
        GoldenRetriever golden = new GoldenRetriever("Dog", 12.0f, "John", "Yellow");
        GoldenRetriever secondGolden = new GoldenRetriever("Dog", 12.0f, "John", "White");

        if (golden.equals(secondGolden)) {
            System.out.println("both golden are the same");
        } else {
            System.out.println("different goldens");
        }

//        secondGolden.petDog();
//        secondGolden.petDog(2);
//        secondGolden.petDog(true);

//
//        Main obj = new Main();
//        System.out.println("before " + golden);
//        obj.changeGoldenProperties(golden);
//        System.out.println("after " + golden);
    }

    public void changeGoldenProperties(GoldenRetriever golden) {
        golden.setName("Azorel");
        golden.setWeight(13.0f);
        System.out.println(golden);
    }
}