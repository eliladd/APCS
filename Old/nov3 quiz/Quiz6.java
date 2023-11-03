public class Quiz6 {
    private int grade1, grade2;
    public Quiz6(int aGrade1, int aGrade2){
        //instance variables
        grade1 = aGrade1;
        grade2 = aGrade2;
    }
    public String getGrade1(){
        //if grade one is greater then or equal to 95 AND grade two is greater then or equal to 95
        if (grade1 >= 95 && grade2 >= 95){
            return "A";
        }
        //if grade one is greater then or equal to 90 AND grade two is greater then or equal to 90
        else if (grade1 >= 90 || grade2 >= 90){
            return "B";
        }
        
        else{
            return "F";
        }
    }
    public String getGrade2(){
        //compare grade2
        switch (grade2) {
            case 95:
                return "A";
                
        
            case 85:
                return "B";
                
            case 75:
                return "C";
                
        
            default:
                return "F";
        }
    }
}
