public class Zoo {
    private String animalType;
    private int age;
    private String animalName;
    public Zoo(){
        animalType = "blank ";
        animalName = "no name ";   
        age = 0;    
   }
    public Zoo(String type, int agein, String name){
        animalType = type;
        animalName = name;  
        age = agein;     
   }
   public void printInfo(){
    System.out.println("you have a " + animalType + " named " + animalName + " whos age is " + age);
    }
   public void updateAge(int newAge){
    age = newAge;
   }
}
