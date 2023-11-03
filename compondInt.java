public class compondInt {
    private double princ=500000;
    private int timey= 3;
   int timecomponding=12;
    double rateh=0.18;
    public void FindCOMPInt(){
         double amount= princ;
         for(int x  = 0; x < timey * timecomponding; x++){
            amount += amount * rateh / timecomponding;
         }
         System.out.println("the total amount paid is " + amount + " RWF");

    }


}
