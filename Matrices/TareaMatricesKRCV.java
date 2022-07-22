package Matrices;

import java.util.Scanner;

public class TareaMatricesKRCV {
    Scanner rc=new Scanner(System.in);
    public void matris01KRC() {                                                   //EJERCICIO 01
        System.out.println("Ingrese dimesion de la Matris:");
        int dimension=rc.nextInt();
        System.out.println("Ingrese valor inicial de la matris:");
        int valor=rc.nextInt();            
        String[][] matriz=new String[dimension][dimension];
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz.length; columna++) {
                if(columna<dimension-fila){
                    matriz[fila][columna]=String.valueOf(valor+(fila+columna)*(fila+columna+1)/2 + fila);
                }                
            }
        }
        imprimirMatriz(matriz);
    }
    public void matris05KRC() {                                                                  //05
        System.out.println("Ingrese dimesion de la Matris:");
        int dimension = rc.nextInt();
        System.out.println("Ingrese valor inicial de la matris:");
        int valor = rc.nextInt();
        String[][] matriz = new String[dimension][dimension];
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna <= fila; columna++) {
                matriz[fila][(dimension - 1) - columna] = String.valueOf(valor);
                valor++;
            }
        }
        imprimirMatriz(matriz);
    }  
    public void matris06KRC() {                                                                   //06
        System.out.println("Ingrese dimesion de la Matris:");
        int dimension = rc.nextInt();
        System.out.println("Ingrese valor inicial de la matris:");
        int valor = rc.nextInt();
        String[][] matriz = new String[dimension][dimension];
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna  <= fila; columna++) {
                matriz[fila][columna] = String.valueOf(valor);
                valor++;
            }
        }
        imprimirMatriz(matriz);
    }
    public void matris07KRC() {                                                                    //07
        String[][] matriz;
        System.out.println("Ingrese la dimesion de Matris:");
        int dimension = rc.nextInt();
        System.out.println("Ingrese el valor inicial de la matris:");
        int valor = rc.nextInt();
        matriz = new String[dimension][dimension];
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna <= (matriz.length - 1) - fila; columna++) {
                matriz[fila][columna] = String.valueOf(valor);
                valor++;
            }
        }
        imprimirMatriz(matriz);
    }
    public void matris09KRC() {                                                                    //09
        System.out.println("Ingrese dimesion de la Matris:");
        int dimension = rc.nextInt();
        System.out.println("Ingrese valor inicial de la matris:");
        int valor = rc.nextInt();
        String[][] matriz = new String[dimension][dimension];
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = (matriz[0].length - 1) - fila; columna <= matriz[0].length - 1; columna++) {
                matriz[fila][columna] = String.valueOf(valor);
                valor++;
            }
        }
        imprimirMatriz(matriz);
    }
    public void matris10KRC() {                                                                   //10
        System.out.println("Ingrese dimesion de la matris:");
        int dimension = rc.nextInt();
        System.out.println("Ingrese valor inicial de la matris:");
        int valor = rc.nextInt();
        String[][] matriz = new String[dimension][dimension];
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna <= fila; columna++) {
                matriz[fila][fila - columna] = String.valueOf(valor);
                valor++;
            }
        }
        imprimirMatriz(matriz);
    }
    public void matris11KRC() {                                                                      //11
        String[][] matriz;
        System.out.println("Ingrese dimesion de la Matris:");
        int dimension = rc.nextInt();
        System.out.println("Ingrese valor inicial de la matris:");
        int valor = rc.nextInt();
        matriz = new String[dimension][dimension];
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = (matriz.length - 1) - fila; columna >= 0; columna--) {
                matriz[fila][columna] = String.valueOf(valor);
                valor++;
            }
        }
        imprimirMatriz(matriz);
    }
    public void matris12KRC() {                                                                    //12
        String[][] matriz;
        System.out.println("Ingrese dimesion de la matris:");
        int dimension = rc.nextInt();
        System.out.println("Ingrese valor inicial de la matris:");
        int valor = rc.nextInt();
        matriz = new String[dimension][dimension];
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = matriz[fila].length-1; columna >= fila; columna--) {
                matriz[fila][columna] = String.valueOf(valor); 
                valor++;        
            }          
        }
        imprimirMatriz(matriz);
    }   
    public void matris13KRC() {                                                                    //13
        String[][] matriz;
        System.out.println("Ingrese dimesion de la Matriz:");
        int dimension = rc.nextInt();
        System.out.println("Ingrese valor inicial de la matris:");
        int valor = rc.nextInt();
        matriz = new String[dimension][dimension];
        for (int columna = 0; columna < matriz.length; columna++) {
            for (int fila = 0; fila <= (matriz.length - 1) - columna; fila++) {
                matriz[fila][columna] = String.valueOf(valor);
                valor++;
            }
        }
        imprimirMatriz(matriz);
    }
  
    public void matris17KRC() {                                                                     //17
        System.out.println("Ingrese dimesion de la Matris:");
        int dimension=rc.nextInt();
        System.out.println("Ingrese valor inicial de la matris:");
        int valor=rc.nextInt();            
        String[][] matriz=new String[dimension][dimension];   
        for (int columna = matriz[0].length-1; columna >=0 ; columna--) {
            for (int fila =0 ; fila < matriz.length-((dimension-1)-columna); fila++) {               
                matriz[fila][columna]=String.valueOf(valor);
                valor++;
            }
        }        
        imprimirMatriz(matriz);
    }
    public void matris20KRC() {                                                                   //20
        String[][] matriz;
        System.out.println("Ingrese dimesion de la Matris:");
        int dimension = rc.nextInt();
        System.out.println("Ingrese valor inicial de la matris:");
        int valor = rc.nextInt();
        matriz = new String[dimension][dimension];
        for (int fila = (matriz[0].length - 1); fila >= 0; fila--) {
            for (int columna = matriz[fila].length-1; columna >= fila; columna--) {
                matriz[columna][fila] = String.valueOf(valor); 
                valor++;        
            }          
        }
        imprimirMatriz(matriz);
    }
    public void matris21KRC() {                                                                   //21
       String[][] matriz;
       System.out.println("Ingrese la dimension de la Matriz:");
       int dimension=rc.nextInt();
       System.out.println("");
       int valor=0;
       matriz=new String[dimension][dimension];
       for (int columna = 0; columna < matriz[0].length; columna++) {
           if(columna%2==0){
                for (int fila = 0; fila < matriz.length; fila++) {
                    matriz[fila][columna]=String.valueOf(valor);
                    valor=valor+1;
                }
           }else{
               for (int fila = matriz.length-1; fila >= 0; fila--) {
                    matriz[fila][columna]=String.valueOf(valor);
                    valor=valor+1;
               }
           }
       }
       imprimirMatriz(matriz);
    }
    public void matris22KRC() {                                                                     //22
        String[][] matriz;
        System.out.println("Ingrese la dimesion de la Matris:");
        int dimension = rc.nextInt();
        System.out.println("Ingrese valor inicial de la matris:");
        int valor = rc.nextInt();
        matriz = new String[dimension][dimension];
        for (int columna = 0; columna < matriz[0].length; columna++) {
            if (columna % 2 == 0) {
                for (int fila = matriz.length - 1; fila >= 0; fila--) {
                    matriz[fila][columna] = String.valueOf(valor);
                    valor = valor + 1;
                }
            } else {
                for (int fila = 0; fila < matriz.length; fila++) {
                    matriz[fila][columna] = String.valueOf(valor);
                    valor = valor + 1;
                }
            }

        }
        imprimirMatriz(matriz);
    }
    public void matris23KRC() {                                                                      //23
        String[][] matriz;
        System.out.println("Ingrese dimesion de la Matris:");
        int dimension = rc.nextInt();
        System.out.println("Ingrese valor inicial de la matris:");
        int valor = rc.nextInt();
        matriz = new String[dimension][dimension];
        for (int columna = (matriz[0].length - 1); columna >= 0; columna--) {
            if (columna % 2 == 0) {
                for (int fila = 0; fila < matriz.length; fila++) {
                    matriz[fila][columna] = String.valueOf(valor);
                    valor = valor + 1;
                }
            } else {
                for (int fila = matriz.length - 1; fila >= 0; fila--) {
                    matriz[fila][columna] = String.valueOf(valor);
                    valor = valor + 1;
                }
            }

        }
        imprimirMatriz(matriz);
    }
    public void matris24KRC() {                                                                 //24
        String[][] matriz;
        System.out.println("Ingrese dimesion de la Matris:");
        int dimension = rc.nextInt();
        System.out.println("Ingrese valor inicial de la matris:");
        int valor = rc.nextInt();
        matriz = new String[dimension][dimension];
        for (int columna = (matriz[0].length - 1); columna >= 0; columna--) {
            if (columna % 2 == 0) {
                for (int fila = matriz.length - 1; fila >= 0; fila--) {
                    matriz[fila][columna] = String.valueOf(valor);
                    valor = valor + 1;
                }
            } else {
                for (int fila = 0; fila < matriz.length; fila++) {
                    matriz[fila][columna] = String.valueOf(valor);
                    valor = valor + 1;
                }
            }

        }
        imprimirMatriz(matriz);
    }

    public void matris25KRC() {                                                                      //25
        String[][] matriz;
        System.out.println("Ingrese dimesion de la Matriz:");
        int dimension = rc.nextInt();
        System.out.println("Ingrese valor inicial de la matris:");
        int valor = rc.nextInt();
        matriz = new String[dimension][dimension];
        for (int fila = 0; fila < matriz.length; fila++) {
            if (fila % 2 == 0) {
                for (int columna = 0; columna < matriz.length; columna++) {
                    matriz[fila][columna] = String.valueOf(valor);
                    valor = valor + 1;
                }
            } else {
                for (int columna = matriz.length - 1; columna >= 0; columna--) {
                    matriz[fila][columna] = String.valueOf(valor);
                    valor = valor + 1;
                }
            }

        }
        imprimirMatriz(matriz);
    }
    public void matris26KRC() {                                                                   //26
        String[][] matriz;
        System.out.println("Ingrese dimesion de la Matriz:");
        int dimension = rc.nextInt();
        System.out.println("Ingrese valor inicial la matris:");
        int valor = rc.nextInt();
        matriz = new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            if (f % 2 == 0) {
                for (int c = matriz.length - 1; c >= 0; c--) {
                    matriz[f][c] = String.valueOf(valor);
                    valor = valor + 1;
                }
            } else {
                for (int c = 0; c < matriz.length; c++) {
                    matriz[f][c] = String.valueOf(valor);
                    valor = valor + 1;
                }
            }

        }
        imprimirMatriz(matriz);
    }
    public void matris27KRC() {                                                                   //27
        System.out.println("Ingrese dimesion de la Matris:");
        int dimension = rc.nextInt();
        System.out.println("Ingrese valor inicial de la matris:");
        int valor = rc.nextInt();
        String[][] matriz = new String[dimension][dimension];
        for (int f = (matriz.length - 1); f >= 0; f--) {
            if (f % 2 == 0) {
                for (int c = (matriz.length - 1); c >= 0; c--) {
                    matriz[f][c] = "" + valor;
                    valor++;
                }
            } else {
                for (int c = 0; c < matriz.length; c++) {
                    matriz[f][c] = "" + valor;
                    valor++;
                }
            }
        }
        imprimirMatriz(matriz);
    }
    public void matris28KRC() {                                                                       //28
        System.out.println("Ingrese dimesion de la Matriz:");
        int dimension = rc.nextInt();
        System.out.println("Ingrese valor inicial de la matris:");
        int valor = rc.nextInt();
        String[][] matriz = new String[dimension][dimension];
        for (int fila = (matriz.length - 1); fila >= 0; fila--) {
            if (fila % 2 == 0) {
                for (int columna = 0; columna < matriz.length; columna++) {
                    matriz[fila][columna] = "" + valor;
                    valor++;
                }
            } else {
                for (int columna = (matriz.length - 1); columna >= 0; columna--) {
                    matriz[fila][columna] = "" + valor;
                    valor++;
                }
            }
        }
        imprimirMatriz(matriz);             
    }
    public void matris29KRC() {                                                                   //29
        String[][] matriz;
        System.out.println("Ingrese la dimension de la Matriz:");
        int dimension=rc.nextInt();//5
        System.out.println("");
        int valor=0;
        matriz=new String[dimension][dimension];         
        for (int v = 0; v < dimension/2; v++) {
            for (int ls = v; ls < dimension-1-v; ls++) {
                matriz[v][ls]=String.valueOf(valor);
                valor++;
            }
            for (int ld = v; ld < dimension-1-v; ld++) {
                matriz[ld][dimension-1-v]=String.valueOf(valor);
                valor++;
            }
            for (int lin = dimension-1-v; lin > v; lin--) {
                matriz[dimension-1-v][lin]=String.valueOf(valor);
                valor++;
            }
            for (int liz =dimension-1-v; liz > v; liz--) {
                matriz[liz][v]=String.valueOf(valor);
                valor++;
            }            
        }
        if (dimension%2!=0) {
            matriz[dimension/2][dimension/2]=String.valueOf(valor);
        }
        imprimirMatriz(matriz);

    }

    public void imprimirMatriz(String[][] m) {
        for (int fila = 0; fila < m.length; fila++) {
            for (int columna = 0; columna < m[0].length; columna++) {
                if(m[fila][columna]==null){
                    System.out.print("\t");
                }else{
                    System.out.print(m[fila][columna]+"\t");
                }
            }
            System.out.println("");
        }
    }
 
    public static void main(String[] args) {
        //new Transformadas().transformada01();
        new TareaMatricesKRCV().matris07KRC();
    }

}
