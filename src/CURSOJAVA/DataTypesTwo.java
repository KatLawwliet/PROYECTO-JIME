package CURSOJAVA;

public class DataTypesTwo {
    public static void main(String[] args) {
        var salaery = 1000; //int
        //Pension 3%
        var pension = salaery * 0.03; //double
        var totalSalaery = salaery - pension;

        System.out.println(salaery);
        System.out.println(pension);
        System.out.println(totalSalaery);

        var employeeName = "Kat Lawwliet ";
        System.out.println("EMPLOYEE: " + employeeName + "SALAERY: " + totalSalaery );



    }

}
