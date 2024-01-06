
/**
 * Write a description of class series here.
 * 
 * @author (Jesus Chamorro)
 * @version (0.0.0.3)
 */

       import java.util.Scanner;

public class SERIES
{
    public static void main(String[] args){
        //funcion de lectura
        Scanner input = new Scanner(System.in);
        //Realizar las siguientes series en las tres estructuras de repetición.
        boolean repeticion = true;
        do{
            System.out.println("******Ejercicios de series en Java******");
            System.out.println("***Elija que serie de números desea ver primero***");
            System.out.println("1) Serie 1");
            System.out.println("2) Serie 2");
            System.out.println("3) Serie 3");
            System.out.println("4) Serie 4");
            System.out.println("5) Serie 5");
            System.out.println("6) Serie 6");
            System.out.println("7) Serie 7");
            System.out.println("8) Serie 8");
            System.out.println("9) Serie 9");
            System.out.println("10) Serie 10");



            System.out.println("***Digite el número***");
            int opcion = input.nextInt();
            
            switch(opcion){
                case 1:
                    //Ejercicios serie 1
                    System.out.println("");
                    System.out.println(" La serie a mostrar es: 1/3, 2/5, 4/7, 6/9... n/n+3");
                    System.out.println("  Con que ciclo de repeticion desea que el ejercicio se ejecute?****");
                    System.out.println("  1) while");
                    System.out.println("  2) do while");
                    System.out.println("  3) for");
                    int opcion1 = input.nextInt();
                    
                    switch(opcion1){
                        case 1:
                            System.out.println(" While");
                            System.out.println("  Ingrese un numero entero: ");  
                            int serie = input.nextInt();
                            int i = 1; //aux = 1; posible solucion con variables extras
                            System.out.println("  "+i+"/"+(i+2));
                            i++;
                            while(i <= serie){
                                //aux = aux + 2;
                                System.out.println("  "+i+"/"+(i+3));
                                i+=2;
                            }
                            break;
                        case 2:
                            System.out.println(" do while");
                            System.out.println("  Ingrese un numero entero: ");  
                            int range = input.nextInt();
                            int j = 1; //aux = 1; posible solucion con variables extras
                            System.out.println("  "+j+"/"+(j+2));
                            j++;
                            do{
                                //aux = aux + 2;
                                System.out.println("  "+j+"/"+(j+3));
                                j+=2;
                            }while(j < range);
                            break;
                        case 3:
                            System.out.println(" for");
                            System.out.println("  Ingrese un numero entero: ");  
                            int range2 = input.nextInt();
                            int e = 1; //aux = 1; posible solucion con variables extras
                            System.out.println(e+"/"+(e+2));
                            for(e = 2; e <= range2; e+=2){
                                System.out.println(e+"/"+(e+3));
                            }
                            break;
                        default:
                            System.out.println("Fuera del rango de opciones");
                            break;
                    }
                    System.out.println("");
                    break;
                case 2:
                    //Ejercicios serie 2
                    System.out.println("La serie a mostrar es: 1, 1/3, 1/9, 1/27... n/m^n");
                    //Todo dentro de la estructura de repeticion
                    System.out.println("****Con que ciclo de repeticion desea que el ejercicio se ejecute?****");
                    System.out.println("1) while");
                    System.out.println("2) do while");
                    System.out.println("3) for");
                    int opcion2 = input.nextInt();
                    
                    switch(opcion2){
                        case 1:
                            System.out.println("*****While*****");
                            System.out.println("**Ingrese un numero entero: ");  
                            int rango1 = input.nextInt();
                            int i = 1, e = 1, j = 1;
                            while(i <= rango1){
                                if(i == 1){
                                    System.out.println(i);
                                }else{
                                   e = e * 3;
                                    System.out.println(j+"/"+e); 
                                }
                                i++;
                            }
                            break;
                        case 2:
                            System.out.println("*****do while*****");
                            System.out.println("**Ingrese un numero entero: ");  
                            int rango2 = input.nextInt();
                            int c = 1, a = 1, ch = 1;
                            do{
                                if(c == 1){
                                    System.out.println(c);
                                }else{
                                   a = a * 3;
                                    System.out.println(ch+"/"+a); 
                                }
                                c++;
                            }while(c <= rango2);
                            break;
                        case 3:
                            System.out.println("*****for*****");
                            System.out.println("**Ingrese un numero entero: ");  
                            int rango3 = input.nextInt();
                            int s, u = 1, r = 1;
                            for(s = 1 ; s <= rango3; s++){
                                if(s == 1){
                                    System.out.println(u);
                                }else{
                                   r = r * 3;
                                    System.out.println(u+"/"+r); 
                                }
                            }
                            break;
                        default:
                            System.out.println("Fuera del rango de opciones");
                            break;
                    }
                    break;
                case 3:
                    //Ejercicios serie 3
                    System.out.println("La serie a mostrar es: 0, 1, 1, 2, 3, 5...");
                    //Hasta los N primeros numeros, serie fibonacci
                    System.out.println("****Con que ciclo de repeticion desea que el ejercicio se ejecute?****");
                    System.out.println("1) while");
                    System.out.println("2) do while");
                    System.out.println("3) for");
                    int opcion3 = input.nextInt();
                    
                    switch(opcion3){
                        case 1:
                            System.out.println("*****While*****");
                            System.out.println("**Ingrese un numero entero: ");  
                            int rango1 = input.nextInt();
                            int e = 0, d = 1, w;
                            while(d <= rango1){
                                System.out.println(e);
                                w = e + d;
                                e = d;
                                d = w;
                            }
                            break;
                        case 2:
                            System.out.println("*****do while*****");
                            System.out.println("**Ingrese un numero entero: ");  
                            int rango2 = input.nextInt();
                            int i = 0, n = 1, j;
                            do{
                                System.out.println(i);
                                j = i + n;
                                i = n;
                                n = j;
                            }while(i < rango2);
                            break;
                        case 3:
                            System.out.println("*****for*****");
                            System.out.println("**Ingrese un numero entero: ");  
                            int rango3 = input.nextInt();
                            int E = 0, s = 1, u;
                            for(int h = 1; h <= rango3; h++){
                                System.out.println(E);
                                u = E + s;
                                E = s;
                                s = u;
                            }
                            break;
                        default:
                            System.out.println("Fuera del rango de opciones");
                            break;
                    }
                    break;
                case 4:
                    //Ejercicios serie 4
                    System.out.println("La serie a mostrar es :2, 3, 5, 7,...");
                    //Hasta los N primeros numeros
                    System.out.println("****Con que ciclo de repeticion desea que el ejercicio se ejecute?****");
                    System.out.println("1) while");
                    System.out.println("2) do while");
                    System.out.println("3) for");
                    int op4 = input.nextInt();
                    
                    switch(op4){
                        case 1:
                            System.out.println("*****While*****");
                            System.out.println("**Ingrese un numero entero: ");  
                            int rango1 = input.nextInt();
                            int j = 2, e = 3, s = 1;
                            System.out.println(j);
                            while(s < rango1){
                                System.out.println(e);
                                e = j + e;
                                s++;
                            }
                            break;
                        case 2:
                            System.out.println("*****do while*****");
                            System.out.println("**Ingrese un numero entero: ");  
                            int rango2 = input.nextInt();
                            int u = 2, S = 3, c = 1;
                            System.out.println(u);
                            do{
                                System.out.println(S);
                                S = u + S;
                                c++;
                            }while(c < rango2);
                            break;
                        case 3:
                            System.out.println("*****for*****");
                            System.out.println("**Ingrese un numero entero: ");  
                            int rango3 = input.nextInt();
                            int h = 2, a = 3;
                            System.out.println(h);
                            for(int x = 1; x < rango3; x++){
                                System.out.println(a);
                                a = h + a;
                            }
                            break;
                        default:
                            System.out.println("Fuera del rango de opciones");
                            break;
                    }
                    break;
                case 5:
                    //Ejercicios serie 5
                    System.out.println("La serie a mostrar es: 1/2, 3/4, 5/6, 7/8...");
                    //Hasta los N primeros numeros
                    System.out.println("****Con que ciclo de repeticion desea que el ejercicio se ejecute?****");
                    System.out.println("1) while");
                    System.out.println("2) do while");
                    System.out.println("3) for");
                    int opcion5 = input.nextInt();
                    
                    switch(opcion5){
                        case 1:
                            System.out.println("*****While*****");
                            System.out.println("**Ingrese un numero entero: ");  
                            int rango1 = input.nextInt();
                            int j = 1, e = 2, s = 1;
                            while(s <= rango1){
                                System.out.println(j+"/"+e);
                                j = j + 2;
                                e = e + 2;
                                s++;
                            }
                            break;
                        case 2:
                            System.out.println("*****do while*****");
                            System.out.println("**Ingrese un numero entero: ");  
                            int rango2 = input.nextInt();
                            int u = 1, S = 2, c = 1;
                            do{
                                System.out.println(u+"/"+S);
                                u = u + 2;
                                S = S + 2;
                                c++;
                            }while(c < rango2);
                            break;
                        case 3:
                            System.out.println("*****for*****");
                            System.out.println("**Ingrese un numero entero: ");  
                            int rango3 = input.nextInt();
                            int h = 1, A = 2, m;
                            for(m = 1; m <= rango3; m++){
                                System.out.println(h+"/"+A);
                                h = h + 2;
                                A = A + 2;
                            }
                            break;
                        default:
                            System.out.println("Fuera del rango de opciones");
                            break;
                    }
                    break;
                case 6:
                    //Ejercicios serie 6
                    System.out.println("La serie a mostrar es: 1, 4, 9, 16...");
                    //Hasta los N primros numeros
                    System.out.println("****Con que ciclo de repeticion desea que el ejercicio se ejecute?****");
                    System.out.println("1) while");
                    System.out.println("2) do while");
                    System.out.println("3) for");
                    int opcion6 = input.nextInt();
                    
                    switch(opcion6){
                        case 1:
                            System.out.println("*****While*****");
                            System.out.println("**Ingrese un numero entero: ");  
                            int rango1 = input.nextInt();
                            int j = 1, e = 3, s = 1;
                            while(s <= rango1){
                                System.out.println(j);
                                j = j + e;
                                e = e + 2;
                                s++;
                            }
                            break;
                        case 2:
                            System.out.println("*****do while*****");
                            System.out.println("**Ingrese un numero entero: ");  
                            int rango2 = input.nextInt();
                            int u = 1, S = 3, c = 1;
                            do{
                                System.out.println(u);
                                u = u + S;
                                S = S + 2;
                                c++;
                            }while(c <= rango2);
                            break;
                        case 3:
                            System.out.println("*****for*****");
                            System.out.println("**Ingrese un numero entero: ");  
                            int rango3 = input.nextInt();
                            int h = 1, A = 3, a;
                            for(a = 1; a <= rango3; a++){
                                System.out.println(h);
                                h = h + A;
                                A = A + 2;
                            }
                            break;
                        default:
                            System.out.println("Fuera del rango de opciones");
                            break;
                    }
                    break;
                case 7:
                    //Ejercicios serie 7
                    System.out.println("La serie a mostrar es: 1/1, 2/-4, 3/9, 4/-16");
                    //Hasta los N primeros numeros
                    System.out.println("****Con que ciclo de repeticion desea que el ejercicio se ejecute?****");
                    System.out.println("1) while");
                    System.out.println("2) do while");
                    System.out.println("3) for");
                    int opcion7 = input.nextInt();
                    
                    switch(opcion7){
                        case 1:
                            System.out.println("*****While*****");
                            System.out.println("**Ingrese un numero entero: ");  
                            int rango1 = input.nextInt();
                            int w = 1;
                            while(w <= rango1){
                                if(w % 2 == 0){
                                    System.out.println(w+"/"+(w*(-w)));
                                }else{
                                    System.out.println(w+"/"+(w*w));
                                }
                                w++;
                            }
                            break;
                        case 2:
                            System.out.println("*****do while*****");
                            System.out.println("**Ingrese un numero entero: ");  
                            int rango2 = input.nextInt();
                            int j = 1;
                            do{
                                if(j % 2 == 0){
                                    System.out.println(j+"/"+(j*(-j)));
                                }else{
                                    System.out.println(j+"/"+(j*j));
                                }
                                j++;
                            }while(j <= rango2);
                            break;
                        case 3:
                            System.out.println("*****for*****");
                            System.out.println("**Ingrese un numero entero: ");  
                            int rango3 = input.nextInt();
                            int a = 1;
                            for(a = 1; a <= rango3; a++){
                                if(a % 2 == 0){
                                    System.out.println(a+"/"+(a*(-a)));
                                }else{
                                    System.out.println(a+"/"+(a*a));
                                }
                            }
                            break;
                        default:
                            System.out.println("Fuera del rango de opciones");
                            break;
                    }
                    break;
                case 8:
                    //Ejercicios serie 8
                    System.out.println("La serie a mostrar es: 2, 6, 12, 20...");
                    //Hasta los N primeros numeros
                    System.out.println("****Con que ciclo de repeticion desea que el ejercicio se ejecute?****");
                    System.out.println("1) while");
                    System.out.println("2) do while");
                    System.out.println("3) for");
                    int opcion8 = input.nextInt();
                    
                    switch(opcion8){
                        case 1:
                            System.out.println("*****While*****");
                            System.out.println("**Ingrese un numero entero: ");  
                            int rango1 = input.nextInt();
                            int j = 2, e = 4, s = 1;
                            while(s <= rango1){
                                System.out.println(j);
                                j = j + e;
                                e = e + 2;
                                s++;
                            }
                            break;
                        case 2:
                            System.out.println("*****do while*****");
                            System.out.println("**Ingrese un numero entero: ");  
                            int rango2 = input.nextInt();
                            int u = 2, S = 4, c = 1;
                            do{
                                System.out.println(u);
                                u = u + S;
                                S = S + 2;
                                c++;
                            }while(c <= rango2);
                            break;
                        case 3:
                            System.out.println("*****for*****");
                            System.out.println("**Ingrese un numero entero: ");  
                            int rango3 = input.nextInt();
                            int h = 2, A = 4, a;
                            for(a = 1; a <= rango3; a++){
                               System.out.println(h);
                               h = h + A;
                               A = A + 2; 
                            }
                            break;
                        default:
                            System.out.println("Fuera del rango de opciones");
                            break;
                    }
                    break;
                case 9:
                    //Ejercicios serie 9
                    System.out.println("La serie a mostrar es: 1, 3, 6, 10...");
                    //Hasta los N primeros numeros
                    System.out.println("****Con que ciclo de repeticion desea que el ejercicio se ejecute?****");
                    System.out.println("1) while");
                    System.out.println("2) do while");
                    System.out.println("3) for");
                    int opcion9 = input.nextInt();
                    
                    switch(opcion9){
                        case 1:
                            System.out.println("*****While*****");
                            System.out.println("**Ingrese un numero entero: ");  
                            int rango1 = input.nextInt();
                            int j = 1, e = 1, s = 1;
                            while(s <= rango1){
                                System.out.println(j);
                                e = e + 1;
                                j = j + e;
                                s++;    
                            }
                            break;
                        case 2:
                            System.out.println("*****do while*****");
                            System.out.println("**Ingrese un numero entero: ");  
                            int rango2 = input.nextInt();
                            int u = 1, S = 1, c = 1;
                            do{
                                System.out.println(u);
                                S = S + 1;
                                u = u + S;
                                c++;    
                            }while(c <= rango2);
                            break;
                        case 3:
                            System.out.println("*****for*****");
                            System.out.println("**Ingrese un numero entero: ");  
                            int range3 = input.nextInt();
                            int h = 1, A = 1, a;
                            for(a = 1; a <= range3; a++){
                                System.out.println(h);
                                A = A + 1;
                                h = h + A;
                            }
                            break;
                        default:
                            System.out.println("Fuera del rango de opciones");
                            break;
                    }
                    break;
                case 10:
                    //Ejercicios serie 10
                    System.out.println("La serie a mostrar es: 4, 6, 8, 9...");
                    //Hasta los N primeros numeros
                    System.out.println("****Con que ciclo de repeticion desea que el ejercicio se ejecute?****");
                    System.out.println("1) while");
                    System.out.println("2) do while");
                    System.out.println("3) for");
                    int opcion10 = input.nextInt();
                    
                    switch(opcion10){
                        case 1:
                            System.out.println("*****While*****");
                            System.out.println("**Ingrese un numero entero: ");  
                            int range1 = input.nextInt();
                            int j = 4, e = 2, s = 1;
                            System.out.println(j);
                            while(s <= range1){
                                if(e == 2 || e == 1){
                                    j = j + 2;
                                    System.out.println(j);
                                    e = e - 1;
                                }else{
                                    j = j + 1;
                                    System.out.println(j);
                                    j = j + 1;
                                    System.out.println(j);
                                    e = e + 2;
                                }
                                s++;    
                            }
                            break;
                        case 2:
                            System.out.println("*****do while*****");
                            System.out.println("**Ingrese un numero entero: ");  
                            int rango2 = input.nextInt();
                            int u = 4, S = 2, c = 1;
                            System.out.println(u);
                            do{
                                if(S == 2 || S == 1){
                                    u = u + 2;
                                    System.out.println(u);
                                    S = S - 1;
                                }else{
                                    u = u + 1;
                                    System.out.println(u);
                                    u = u + 1;
                                    System.out.println(u);
                                    S = S + 2;
                                }
                                c++;    
                            }while(c <= rango2);
                            break;
                        case 3:
                            System.out.println("*****for*****");
                            System.out.println("**Ingrese un numero entero: ");  
                            int rango3 = input.nextInt();
                            int h = 4, A = 2, a;
                            System.out.println(h);
                            for(a = 1; a <= rango3; a++){
                                if(A == 2 || A == 1){
                                    h = h + 2;
                                    System.out.println(h);
                                    A = A - 1;
                                }else{
                                    h = h + 1;
                                    System.out.println(h);
                                    h = h + 1;
                                    System.out.println(h);
                                    A = A + 2;
                                }
                            }
                            break;
                        default:
                            System.out.println("Fuera del rango de opciones");
                            break;
                    }
                    break;
                default: 
                    System.out.println("El número ingresado esta fuera del rango");
                    repeticion = false;
                    break;
            }
        }while(repeticion);
        
    }
}

