public class Animal {
    //instance variables
    private String animalType;
    private int age;

    //set variables
    public void setVariables(String animal, int agevar){
        animalType = animal;
        age = agevar;

    }

    //print variables
    public void printInfo(){
        System.out.println("Animal Type: " + animalType);
        System.out.println("Animal Age: " + age);
    }
}