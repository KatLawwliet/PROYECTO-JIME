package CURSOJAVA;

public class UpdatingVariable {
    public static void main(String[] args) {
        int salary = 1000;

        //Bono $200
        salary =salary +200;
        System.out.println(salary);

        //Pension $50 descuento
        salary = salary - 50;
        System.out.println(salary);

        // 2 hs extra $30 c/u
        //Comida $45

        salary = salary+ (30*2)- 45;
        System.out.println(salary);

        //Actualizando cadenas de texto
        String employeeName = " Kat Lawwliet ";
        employeeName = employeeName + " Moraño";
        System.out.println(employeeName);

        employeeName = "Belén" + employeeName;
        System.out.println(employeeName);


    }

}
