package programación_proyectos.matrices_miranda.martínez;
import java.util.Arrays;
import java.util.Scanner;
public class PROGRAMACIÓN_PROYECTOSMATRICES_MIRANDAMARTÍNEZ {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        //Pedir datos de 1ra matriz
        System.out.println("Ingrese la cantidad de filas de la 1ra matriz:");
        int filas1=sc.nextInt();
        System.out.println("Ingrese la cantidad de columnas de la 1ra matriz:");
        int columnas1=sc.nextInt();
        int[][] matriz1=new int[filas1][columnas1];
        
        //Pedir datos de 2da matriz
        System.out.println("Ingrese la cantidad de filas de la 2da matriz (debe ser la misma cantidad que las columnas de la 1ra matriz):");
        int filas2=sc.nextInt();
        System.out.println("Ingrese la cantidad de columnas de la 2da matriz:");
        int columnas2=sc.nextInt();
        int[][] matriz2=new int[filas2][columnas2];
        
        if (columnas1 != filas2) {
            System.out.println("No se pueden multiplicar las matrices");
        }
        
        //Datos randómicos 1ra matriz
        for (int i=0;i<filas1;i++){
            for (int j=0;j<columnas1;j++){
                matriz1[i][j]=(int)(Math.random()*9)+1;
            }
        }
        
        //Imprimir 1ra matriz
        System.out.println("Matriz 1: ");
        for (int i=0;i<filas1;i++){
            for (int j=0;j<columnas1;j++){
                System.out.print(matriz1[i][j]+" ");
            }
            System.out.println();
        }
        
        //Datos randómicos 2da matriz
        for (int i=0;i<filas2;i++){
            for (int j=0;j<columnas2;j++){
                matriz2[i][j]=(int)(Math.random()*9)+1;
            }
        }
        
        //Imprimir 2da matriz
        System.out.println("Matriz 2: ");
        for (int i=0;i<filas2;i++){
            for (int j=0;j<columnas2;j++){
                System.out.print(matriz2[i][j]+" ");
            }
            System.out.println();
        }
        
        //Matriz resultante
        System.out.println("Matriz resultante: ");
        
        int[][] matrizR=new int[filas1][columnas2];
        
        for (int i=0;i<filas1;i++){
            for (int j=0;j<columnas2;j++){
                for (int k=0;k<columnas1;k++) {
                    matrizR[i][j]+=(matriz1[i][k])*(matriz2[k][j]);
                }
                System.out.print(matrizR[i][j]+" ");
            }
            System.out.println();
        }
        
        //Matriz resultante ordenada
        int[] vector=new int[filas1*columnas2];
        int contador_vector=0;
        
        for (int i=0;i<filas1;i++){
            for (int j=0;j<columnas2;j++){
                int numero=matrizR[i][j];
                vector[contador_vector]=numero;
                contador_vector+=1;
            }
        }
        Arrays.sort(vector);
        for(int i=0;i<vector.length;i++){
            System.out.print(vector[i]+" ");
        }

    }

}
