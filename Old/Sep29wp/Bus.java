public class Bus {
    private int numPassengers;
    double numPassengersHold;
    public Bus(){
        numPassengers = 200;
    }
    public Bus(int aNum){
        numPassengersHold = aNum;
    }
    public void numBuses(int aNum){
        int numPassengers = aNum;
        double numbus = Math.ceil(aNum / 15);
        System.out.println("you need " + numbus + " Busses");
    }
    public void numBuses(int aNumPassengers, int aNumBusses){
        
        double needed = Math.ceil(numPassengers / numPassengersHold);
        if (aNumBusses >= needed){
            System.out.println("The number of passangers can fit!");
        }
        else{
            System.out.println("uh oh!! they cant fit");
        }
    }
}
