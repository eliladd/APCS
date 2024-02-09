public class AnimalArray {
    private String[] animals;
    public AnimalArray(){
        animals = new String[5];
        animals[0] = "dog";
        animals[1] = "cat";
        animals[2] = "human";
        animals[3] = "bird";
        animals[4] = "fish";
    }
    public void printAnimals(){
        for (String animal : animals){
            System.out.print(animal + " ");
        }
        System.out.println();
    }
    public void swapAnimals(int index1, int index2){
        String temp = animals[index1];
        animals[index1] = animals[index2];
        animals[index2] = temp;
    }
}
