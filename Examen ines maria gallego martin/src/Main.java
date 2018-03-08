/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor..
 */




public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
            //modificado
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            operativa_cuenta(cuenta1);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }

	private static void operativa_cuenta(CCuenta cuenta1) throws Exception {
		System.out.println("Ingreso en cuenta");
		cuenta1.ingresar(695);
	}
}
