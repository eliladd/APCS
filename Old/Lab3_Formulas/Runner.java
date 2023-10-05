import java.util.Scanner;
public class Runner {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Formulas formula = new Formulas();
        Boolean Running = true;
        while (Running){
            System.out.println("\n What formula do you want?");
            System.out.println("1. Area of a triangle");
            System.out.println("2. Area of a Rectangle");
            System.out.println("3. Area of a circle");
            System.out.println("4. Volume of a pyrmid");
            System.out.println("5.Area of a Cube ");
            System.out.println("6. Area of a Sphere");
            System.out.println("7. Area of a Cyllender");
            System.out.println("8. pythagorean theorem");
            System.out.println("9. Quadratic formula");
            System.out.println("10. Slope Formula");
            System.out.println("11. Force Formula");
            System.out.println("12. Gravety Force Formula");
            System.out.println("13. Escape velocity Formula");
            System.out.println("14. Acceleration Formula");
            System.out.println("15. Pressure diffrence formula");
            System.out.println("0. QUit");
            int number = sc.nextInt();
            if (number == 1){
                formula.AreaTriangle();
            }
            else if (number == 2){
                formula.AreaRectange();
            }
            else if (number == 3){
                formula.Areacircle();
            }
            else if (number == 4){
                formula.Volumepyrmid();
            }
            else if (number == 5){
                formula.AreaCube();
            }
            else if (number == 6){
                formula.AreaSphere();
            }
            else if (number == 7){
                formula.AreaCyllender();
            }
            else if (number == 8){
                formula.Pythag();
            }
            else if (number == 9){
                formula.Quadraticformula();
            }
            else if (number == 10){
                formula.SlopeFormula();
            }
            else if (number == 11){
                formula.forceFormula();
            }
            else if (number == 12){
                formula.gravetyForce();
            }
            else if (number == 13){
                formula.escapevelocity();
            }
            else if (number == 14){
                formula.acceleration();
            }
            else if (number == 15){
                formula.pressurediffrenceformula();
            }
            else if (number == 0){
                Running = false;
            }
            else{
                System.out.println("Thats not an option!");
            }
        }
    }
}
