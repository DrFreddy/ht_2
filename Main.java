/**Universidad Del Valle de Guatemala 
 *Algoritmos y Estructura de Datos 
 *Seccion 10- Hoja de Trabajo 2
 *------------------------------------------------------------------
 *Autores:
 *Pedro Joaquin Castillo 14224
 *Freddy Jose Ruiz Gatica 14592
 *Boris Cifuentes 14150
 *------------------------------------------------------------------
 *Main:
 *Esta clase es la encargada de interactuar con el usuario y mostrarle
 *el resultado obtenido por la calcuadora Postfix después de haber leído el
 *documento que contiene la  linea a operar.
 **/
public class Main {
public static void main(String[] args){
double val= 0;
CalPostFix calculadora= new CalPostFix();
System.out.println("¡Bienvenido a la calculadora POSTFIX");
System.out.println("A continuación se cargará el archivo a analizar");


try{
calculadora.readFile("C:\\Users\\Ary lou\\Desktop\\P.txt");
}
catch (Exception e){
	   System.err.println( "ARCHIVO NO ENCONTRADO" );
}

try {
val=calculadora.calcular();
}
catch (Exception e){
	System.out.println("OPS, no es posible realizar la operación");
	System.exit(0);
}
System.out.println("¡Trabajo realizado!"+ val );
}
}
