public class Triangle {
    public static void main(String[] args){
        int Base = 7;
        int Height = 11;
        int areaInt = 0;
        double areaDbl = 0;

        System.out.print("Base: " + Base + "\nHeight: " + Height);
        System.out.println();
        areaInt = (Base * Height) / 2;
        areaDbl = (Base * Height) / 2.0;
        System.out.print("areaDbl: " + areaDbl + "\n" + "areaInt: " + areaInt);
    }
}
