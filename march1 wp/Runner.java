public class Runner {
    public static void main(String[] args){
        Array2DString arr = new Array2DString();
        String[][] animalArr = {{"cat", "dog", "bird"}, {"fish", "lizard", "hamster"},{ "turtle", "snake", "gerbil"}};
        arr.printStr(animalArr);
        System.out.println(arr.findAnimal(animalArr, "snake"));
        System.out.println(arr.findAnimal(animalArr, "lion"));
    }
}
