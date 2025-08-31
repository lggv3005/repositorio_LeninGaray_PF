/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PF;
import java.util.Scanner;
public class PF_LeninGaray {
public static void main(String[] args){
//declarando variables
double compra1,compra2,compra3,tc,pc;
String nombreCliente;
Scanner lectura=new Scanner(System.in);
//entrada de datos
System.out.print("Ingresar el nombre del cliente:");
nombreCliente=lectura.nextLine();
System.out.print("Ingresar el valor de la primera compra:");
compra1=lectura.nextDouble();
System.out.print("Ingresar el valor de la segunda compra:");
compra2=lectura.nextDouble();
System.out.print("Ingresar el valor de la tercera compra:");
compra3=lectura.nextDouble();
//proceso de datos
tc=compra1+compra2+compra3;
pc=tc/3;
//salida de datos
System.out.println("Actualización de Código - Título Resultados:");
System.out.println("Nombre de cliente:"+nombreCliente);
System.out.println("Total de compras:"+tc);
System.out.println("Promedio de compras:"+pc);
}
}