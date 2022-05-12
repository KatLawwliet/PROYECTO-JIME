package CURSOJAVA;

public class DataTypes {
    public static void main(String[] args) {

        //Classification dates ENTERS (ENTEROS)
        //Byte: Range: -128a 127 (Ocupa un byte)
        //Short: Range: -32768 a 32767 ( Ocupa 2 bytes)
        // Int: Rango: -2.147.483.648 a 2.147.483.647 (Ocupa 4 bytes)
        //Long: Rango: -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807 (Ocupa 8 bytes)

        int n = 1234475678;
        long nL = 12345678909L;
        short a = 12345;
        float b = 3.40282346638528860e+38F;
        double x = 4.94065645841246544e-324d;

        System.out.println( n + " int: Es un dato de 10 Digitos, de tipo Entero, ocupa 1Byte.");
        System.out.println( nL + " long: Es un dato de de 13 Digitos, de tipo Entero,ocupa 8Bytes (Se coloca una L");
        System.out.println( a + " short: Es un dato de 5 Digitos, de tipo Entero, ocupa 2Bytes");
        System.out.println( b + " float: Es un dato de 22 D&C, de tipo Decimal, ocupa 4Bytes (se coloca una F)");
        System.out.println( x + " double: Es un dato de 24 D&C, de tipo Decimal, ocupa 8Bytes");

        //Dato punto flotante o punto decimal
        // Float: Range: 1.40129846432481707e-45 a 3.40282346638528860e+38,(Ocupa 4Bytes) colocar una letra F al final
        // Double : Range: 4.94065645841246544e-324d a 1.79769313486231570e+308d, (Ocupa 8Bytes)




    }

}
