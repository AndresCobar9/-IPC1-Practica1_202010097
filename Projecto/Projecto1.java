
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Random;
public class Projecto1 {


    public class Moda {
        static float moda(float[] k, float l) {
            int y,b;
            float mV = 0, mC = 0;

            for (y = 0; y < l; ++y) {
                int count = 0;
                for (b = 0; b < l; ++b) {
                    if (k[b] == k[y])
                        ++count;
                }

                if (count > mC) {
                    mC = count;
                    mV = k[y];
                }
            }
            return mV;
        }
    }


    public static void main (String[] args){
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        boolean Continue = true;
        DecimalFormat formato1 = new DecimalFormat("#.0000");
        DecimalFormat formato2 = new DecimalFormat("#.00");
        do {
            System.out.print  ("==========================================\n");
            System.out.println(" .___  ___.  _______ .__   __.  __    __  \n" +
                               " |   \\/   | |   ____||  \\ |  | |  |  |  | \n" +
                               " |  \\  /  | |  |__   |   \\|  | |  |  |  | \n" +
                               " |  |\\/|  | |   __|  |  . `  | |  |  |  | \n" +
                               " |  |  |  | |  |____ |  |\\   | |  `--'  | \n" +
                               " |__|  |__| |_______||__| \\__|  \\______/\n" +
                               "==========================================\n" +
                               "1. Aritmetica\n" +
                               "2. Geometria\n" +
                               "3. Estadistica \n" +
                               "4. Matrices\n" +
                               "5. Avanzadas\n" +
                               "6. Salir\n");
            System.out.print("Opcion deseada: ");
            String Option = sc.next();
            switch (Option) {
                case "1": // ARITMETICA

                    boolean case1 = true;
                    do { // Iniciamos un ciclo para la Aritmetica
                        System.out.print  ("============================================================\n");
                        System.out.println("  ___  ____  __ ______ ___  ___  ____ ______ __   ___  ___ \n" +
                                           " // \\\\ || \\\\ || | || | ||\\\\//|| ||    | || | ||  //   // \\\\\n" +
                                           " ||=|| ||_// ||   ||   || \\/ || ||==    ||   || ((    ||=||\n" +
                                           " || || || \\\\ ||   ||   ||    || ||___   ||   ||  \\\\__ || ||\n" +
                                           "============================================================\n" +
                                           "1. Suma\n" +
                                           "2. Resta\n" +
                                           "3. Multiplicacion\n" +
                                           "4. Division\n" +
                                           "5. Regresar\n"); // Mostramos el menu de opciones
                        System.out.print("Opcion deseada: ");
                        String OptionAr = sc.next();
                        if(OptionAr.equals("5")){
                            case1 = false;
                        }

                        else if(OptionAr.equals("4")) {
                            System.out.println("============================");
                            System.out.println("===       DIVISION       ===");
                            System.out.println("============================");
                            System.out.println("Ingrese el Numerador");
                            int Nume = sc.nextInt();
                            System.out.println("Ingrese el Denominador");
                            int Den = sc.nextInt();
                            float resdiv = (float)Nume/Den;
                            System.out.println("\n====== El resultado de la division es: " + formato1.format(resdiv) + " ======\n");



                        }else if(OptionAr.equals("1") || OptionAr.equals("2") || OptionAr.equals("3") ){
                            int num, resultado = 0;
                            System.out.println("==================================");
                            System.out.println("Cuantos numeros desea ingresar: "); // Pedimos cuantos numeros desea ingresar
                            String n = sc.next();
                            System.out.println("==================================\n");
                            if(OptionAr.equals("1")) {
                                System.out.print("\n============================\n==          SUMA          ==\n============================\n");

                                    for (int a = 0; a < Integer.parseInt(n); a++) {
                                         System.out.print("Introduzca numero " + (a + 1) + ": ");
                                        num = sc.nextInt();
                                        resultado = resultado + num;
                                    }
                                    System.out.println("\n====== El resultado de la suma es: " + resultado + " ======\n");
                            }else if(OptionAr.equals("2")){
                                System.out.print("============================\n");
                                System.out.print("=          RESTA          ==\n");
                                System.out.print("============================\n");
                                     System.out.println("\nIngrese la Cantidad a la que desea restar: ");
                                     String NP = sc.next();

                                     for (int b = 0; b < Integer.parseInt(n); b++) {
                                          System.out.print("Introduzca el numero " + (b + 1) + ": ");
                                           num = sc.nextInt();
                                          resultado = resultado + num;
                                       }
                                       System.out.println("\n====== El resultado de la resta es: " + (Integer.parseInt(NP) - resultado ) + " ======\n");
                            }else if(OptionAr.equals("3")) {
                                resultado = 1;
                                System.out.print("============================\n");
                                System.out.print("===    MULTIPLICACION    ===\n");
                                System.out.print("============================\n");
                                for (int c = 0; c < Integer.parseInt(n); c++) {
                                    System.out.print("Introduzca numero " + (c + 1) + ": ");
                                    num = sc.nextInt();
                                    resultado = resultado * num;
                                }
                                System.out.println("\n====== El resultado de la multiplicacion es: " + (resultado ) + " ======\n");


                            }else{
                                System.out.println("======== Opcion Incorrecta =========\n" +
                                                   "--- Ingrese una Opcion Valida ---");
                            }
                            }else {
                            System.out.println("======== Opcion Incorrecta =========\n" +
                                               "--- Ingrese una Opcion Valida ---");
                        }

                        } while (case1);
                    break;
                case "2": // GEOMETRIA

                    boolean case2 = true;
                    do { // Iniciamos un ciclo para la Geometria
                        System.out.println("=========================================");
                        System.out.println("____ ____ ____ _  _ ____ ___ ____ _ ____ \n" +
                                           "| __ |___ |  | |\\/| |___  |  |__/ | |__| \n" +
                                           "|__] |___ |__| |  | |___  |  |  \\ | |  |\n" +
                                           "=========================================\n" +
                                           "1. Perimetro\n" +
                                           "2. Area\n" +
                                           "3. Regresar\n");
                        System.out.print("Opcion deseada: ");
                        String OptionG = sc.next();
                        if(OptionG.equals("1")){
                            boolean f1= true;
                            do{
                                System.out.println("=============================");
                                System.out.println("==         FIGURAS         ==");
                                System.out.println("=============================\n" +
                                                    "A. Triangulo\n" +
                                                    "B. Cuadrado\n" +
                                                    "C. Rectangulo\n" +
                                                    "D. Circulo\n" +
                                                    "F. Regresar");
                                String Pf = sc.next();
                                float totalt = 0;
                                switch (Pf.toLowerCase()){
                                    case "a":
                                        System.out.println("=============================");
                                        System.out.println("==        TRIANGULO        ==");
                                        System.out.println("=============================");
                                        for(int d = 0;d<3;d++){
                                            System.out.println("\nIngrese el lado numero " + (d+1) +":");
                                            float ladot = sc.nextFloat();
                                            totalt = totalt + ladot;
                                        }
                                        System.out.println("==== El perimetro de su triangulo es de: " + formato2.format(totalt) + " ====\n");
                                        break;
                                    case "b":
                                        System.out.println("=============================");
                                        System.out.println("==        CUADRADO         ==");
                                        System.out.println("=============================");
                                        System.out.println("Ingrese el valor del lado: ");
                                        float l1 = sc.nextFloat();
                                        System.out.println("==== El perimetro del cuadrado es: " + formato2.format(l1 * 4) + " ====\n");
                                        break;
                                    case"c":
                                        System.out.println("=============================");
                                        System.out.println("==       RECTANGULO        ==");
                                        System.out.println("=============================");
                                        System.out.println("Ingrese el valor de la base: ");
                                        float br = sc.nextFloat();
                                        System.out.println("Ingrese el valor de la altura: ");
                                        float hr = sc.nextFloat();
                                        System.out.println("==== El Perimetro de su triangulo es de: "+formato2.format((br*2) + (hr *2)) + " ====\n");

                                        break;
                                    case"d":
                                        System.out.println("=============================");
                                        System.out.println("==         CIRCULO         ==");
                                        System.out.println("=============================");
                                        System.out.println(" = Con que desea hacer el perimetro =");
                                        System.out.println("1. Radio");
                                        System.out.println("2. Diametro");
                                        String rc = sc.next();
                                        if (rc.equals("1")){
                                            System.out.println("Ingrese el Radio :");
                                            float radiop = sc.nextFloat();
                                            float pi = (float) 3.1416;
                                            float total = 0;
                                            total = 2 + radiop * pi;
                                            System.out.println(String.format("==== El total de perimetro es: " + formato1.format(total) + " ====\n"));
                                        }else if (rc.equals("2")){
                                            System.out.println("Ingrese el Diametro :");
                                            float diametrop = sc.nextFloat();
                                            float pi = (float) 3.1416;
                                            float total = 0;
                                            total = diametrop * pi;
                                            System.out.println("==== El total del perimetro es: " + formato1.format(total) + " ====\n");
                                        }
                                        break;
                                    case"f":
                                        f1 = false;
                                        break;
                                }
                            }while(f1);
                        } //PERIMETRO
                        else if(OptionG.equals("2")){
                            boolean Caf = true;
                            do{


                            System.out.println("=============================");
                            System.out.println("==         FIGURAS         ==");
                            System.out.println("=============================\n" +
                                    "A. Triangulo\n" +
                                    "B. Cuadrado\n" +
                                    "C. Rectangulo\n" +
                                    "D. Circulo\n" +
                                    "E. Regresar");
                            String Af = sc.next();
                            switch(Af.toLowerCase()){

                                case "a":
                                    System.out.println("=============================");
                                    System.out.println("==        TRIANGULO        ==");
                                    System.out.println("=============================");
                                    System.out.println("Ingrese la base: ");
                                    String bt = sc.next();
                                    System.out.println("Ingrese la altura: ");
                                    String ht = sc.next();
                                    float tta = Float.parseFloat(bt) * Float.parseFloat(ht);
                                    System.out.println(" ==== El area del triangulo es :" + (tta/2)+" ====\n");
                                    break;

                                case "b":
                                    System.out.println("=============================");
                                    System.out.println("==        CUADRADO         ==");
                                    System.out.println("=============================");
                                    System.out.println("Ingrese el valor del lado: ");
                                    float la1 = sc.nextFloat();
                                    System.out.println(" ==== El area del cuadrado es: "+ (la1*la1)+" ====\n");
                                    break;

                                case "c":
                                    System.out.println("=============================");
                                    System.out.println("==       RECTANGULO        ==");
                                    System.out.println("=============================");
                                    System.out.println("Ingrese el valor de la base: ");
                                    float br = sc.nextFloat();
                                    System.out.println("Ingrese el valor de la altura: ");
                                    float hr = sc.nextFloat();
                                    float totalr = (br)*(hr);
                                    System.out.println(" ==== El area del Rectangulo es :" + (totalr)+" ====\n");
                                    break;

                                case "d":
                                    System.out.println("=============================");
                                    System.out.println("==         CIRCULO         ==");
                                    System.out.println("=============================");
                                    System.out.println(" = Con que desea hacer el area =");
                                    System.out.println("1. Radio");
                                    System.out.println("2. Diametro");
                                    String rca = sc.next();
                                    if (rca.equals("1")){
                                        System.out.println("Ingrese el Radio :");
                                        float radioa = sc.nextFloat();
                                        float pi = (float) 3.1416;
                                        float total = 0;
                                        total = 2 + radioa * pi* pi;
                                        System.out.println(String.format("==== El total de area es: " + formato1.format(total) + " ====\n"));
                                    }else if(rca.equals("2")){
                                        System.out.println("Ingrese el Diametro :");
                                        float diametroa = sc.nextFloat();
                                        float pi = (float) 3.1416;
                                        float total = 0;
                                        total = ((diametroa * diametroa)/4) * pi ;
                                        System.out.println("==== El total del area es: " + formato1.format(total) + " ====\n");
                                    }
                                    break;

                                case "e":
                                    Caf = false;
                                    break;
                                default:
                                    System.out.println("== Opcion Incorrecta, Seleccione una opcion valida ==");

                            }

                            }while(Caf);

                        }else if(OptionG.equals("3")){
                            case2 = false;
                        }else{
                            System.out.println("====== Opcion Incorrecta Eliga una opcion valida ======");
                        }

                    }while(case2);
                    break;

                case "3": // Estadistica
                    boolean case3 = true;
                    do{ // Iniciamos el ciclo de Estadistica


                    System.out.println("==============================================================");
                    System.out.println("  ____  __  ______  ___  ____   __  __  ______ __   ___  ___ \n" +
                                       " ||    (( \\ | || | // \\\\ || \\\\  || (( \\ | || | ||  //   // \\\\\n" +
                                       " ||==   \\\\    ||   ||=|| ||  )) ||  \\\\    ||   || ((    ||=||\n" +
                                       " ||___ \\_))   ||   || || ||_//  || \\_))   ||   ||  \\\\__ || ||");
                            System.out.println("==============================================================\n" +
                                       "1. Moda\n" +
                                       "2. Mediana\n" +
                                       "3. Media\n"+
                                       "4. Regresar\n");
                        System.out.print("Opcion deseada: ");
                            String OptionE = sc.next();
                            switch (OptionE) {
                                case "1":
                                    System.out.println("============================");
                                    System.out.println("===         MODA         ===");
                                    System.out.println("============================");
                                    System.out.println("Cuantos Datos va a ingresa: ");
                                    String r = sc.next();
                                    float est[] = new float[Integer.parseInt(r)];
                                    for (int b = 0; b < Integer.parseInt(r); b++) {
                                        System.out.println("Ingrese el numero " + (b + 1) + " :");
                                        est[b] = sc.nextFloat();
                                    }
                                    System.out.println("\n ===== La moda es : " + Moda.moda(est, Integer.parseInt(r)) + " =====");
                                    break;
                                case "2":
                                    System.out.println("===========================");
                                    System.out.println("===       MEDIANA       ===");
                                    System.out.println("===========================");
                                    System.out.println("Cuantos Datos va a ingresa: ");
                                    String r1 = sc.next();
                                    float est1[] = new float[Integer.parseInt(r1)];
                                    for (int b = 0; b < Integer.parseInt(r1); b++) {
                                        System.out.println("Ingrese el numero " + (b + 1) + " :");
                                        est1[b] = sc.nextFloat();
                                    }
                                    for (int i = 0; i < est1.length; i++) {
                                        for (int j = 0; j < est1.length; j++) {
                                            if (est1[i] < est1[j]) {
                                                float temp = est1[i];
                                                est1[i] = est1[j];
                                                est1[j] = temp;
                                            }
                                        }
                                    }

                                    int par = Integer.parseInt(r1) / 2;
                                    System.out.println(est1[par]);
                                    if (Integer.parseInt(r1) % 2 == 0) {

                                        float medi1 = est1[par] + (est1[par - 1]);
                                        float mediana1 = medi1 / 2;
                                        System.out.println(" ===== La mediana es : " + mediana1 + " =====");

                                    } else {

                                        double mediana2 = (est1[par]);
                                        System.out.println(" ===== La mediana es : " + mediana2 + " =====");


                                    }
                                    break;

                                case "3":
                                    System.out.println("===========================");
                                    System.out.println("===        MEDIA        ===");
                                    System.out.println("===========================");
                                    System.out.println("Cuantos Datos va a ingresa: ");
                                    String r2 = sc.next();
                                    float est2[] = new float[Integer.parseInt(r2)];
                                    float total = 0;
                                    for (int b = 0; b < Integer.parseInt(r2); b++) {
                                        System.out.println("Ingrese el numero " + (b + 1) + " :");
                                        est2[b] = sc.nextInt();
                                        total = total + est2[b];
                                    }

                                    System.out.println(" ===== La media es : " + total + " =====");

                                    break;

                                case "4":
                                    case3 = false;
                                    break;
                            }

                }while(case3);

                break;

                case "4":
                    boolean case5 = true;
                    do {

                        System.out.println("============================================================");
                        System.out.println("___  ___  ___ ___________ _____ _____  _____ _____ \n" +
                                           "|  \\/  | / _ \\_   _| ___ \\_   _/  __ \\|  ___/  ___|\n" +
                                           "| .  . |/ /_\\ \\| | | |_/ / | | | /  \\/| |__ \\ `--. \n" +
                                           "| |\\/| ||  _  || | |    /  | | | |    |  __| `--. \\\n" +
                                           "| |  | || | | || | | |\\ \\ _| |_| \\__/\\| |___/\\__/ /\n" +
                                           "\\_|  |_/\\_| |_/\\_/ \\_| \\_|\\___/ \\____/\\____/\\____/");
                        System.out.println("============================================================\n"+
                                           "1. Matriz 2x2\n" +
                                           "2. Matriz 3x3\n" +
                                           "3. Salir\n"); // Mostramos el menu de opciones
                        System.out.print("Opcion deseada: ");
                        String opm = sc.next();
                        if (opm.equals("1")){
                            System.out.println("===== Matriz 2x2 =====" +
                                    "\nDesea ingresar los numeros automaticos:" +
                                    "\n1. Si" +
                                    "\n2. No");
                            String opma = sc.next();
                            if (opma.equals("2")){
                                int i, j, k, n=2;
                                float termino;
                                String literales = "";
                                char literal;
                                float[][] matriz = new float[n][n+1];
                                for(i=0; i<n; i++)
                                {
                                    System.out.print("Ingrese nombre de la variable " + (i+1) + ": ");

                                    do {
                                        literal = sc.next().toLowerCase().charAt(0);
                                        System.out.println("==========================================================");
                                    } while(!Character.isLetter(literal) || literales.contains(String.valueOf(literal)));
                                    literales = literales + literal;
                                }
                                for(i=0; i<n; i++)
                                {
                                    for(j=0; j<n; j++)
                                    {
                                        System.out.print("Ingrese el coeficiente de la variable '" + literales.charAt(j) + "' de la ecuacion " + (i+1) + ": ");

                                        matriz[i][j] = Float.parseFloat(sc.next());
                                        System.out.println("==========================================================");
                                    }
                                    System.out.print("Ingrese la constante de la ecuacion " + (i+1) + ": ");

                                    matriz[i][n] = Float.parseFloat(sc.next());
                                    System.out.println("==========================================================");
                                }
                                System.out.println();
                                for(i=0; i<n; i++)
                                {
                                    if(matriz[i][i]==0.0)
                                    {
                                        System.err.println("Error: division entre cero.\n");
                                        return;
                                    }
                                    for(k=0; k<n; k++)
                                        if(k!=i)
                                        {
                                            termino = matriz[k][i] / matriz[i][i];
                                            for(j=0; j<=n; j++)
                                                matriz[k][j] -= termino * matriz[i][j];
                                        }
                                }
                                System.out.println(" ===== Solucion ======\n");
                                for(i=0; i<n; i++)
                                {
                                    termino = matriz[i][n] / matriz[i][i];
                                    System.out.println(literales.charAt(i) + " = " + termino);
                                }
                                System.out.println();

                            }else if (opma.equals("1")){
                                System.out.println("===== Automatico =====");
                                int i, j, k, n=2;
                                float termino;
                                String literales = "";
                                char literal;
                                float[][] matriz = new float[n][n+1];
                                for(i=0; i<n; i++)
                                {
                                    System.out.print("Ingrese nombre de la variable " + (i+1) + ": ");

                                    do {
                                        literal = sc.next().toLowerCase().charAt(0);

                                    } while(!Character.isLetter(literal) || literales.contains(String.valueOf(literal)));
                                    literales = literales + literal;
                                }
                                for(i=0; i<n; i++)
                                {
                                    for(j=0; j<n; j++)
                                    {
                                        float a = rnd.nextInt(100);
                                        System.out.print("coeficiente de la variable '" + literales.charAt(j) + "' de la ecuacion " + (i+1) + ": " + a + "\n");

                                        matriz[i][j] = a;

                                    }
                                    float a = rnd.nextInt(100);
                                    System.out.print("la constante de la ecuacion " + (i+1) + ": " + a + "\n");
                                    matriz[i][n] = a;

                                }
                                System.out.println();
                                for(i=0; i<n; i++)
                                {
                                    if(matriz[i][i]==0.0)
                                    {
                                        System.err.println("Error: division entre cero.\n");
                                        return;
                                    }
                                    for(k=0; k<n; k++)
                                        if(k!=i)
                                        {
                                            termino = matriz[k][i] / matriz[i][i];
                                            for(j=0; j<=n; j++)
                                                matriz[k][j] -= termino * matriz[i][j];
                                        }
                                }
                                System.out.println(" ===== Solucion ======\n");
                                for(i=0; i<n; i++)
                                {
                                    termino = matriz[i][n] / matriz[i][i];
                                    System.out.println(literales.charAt(i) + " = " + termino);
                                }
                                System.out.println();

                            }


                        }else if (opm.equals("2")){

                            System.out.println("===== MATRIZ 3x3 =====" +
                                    "\nDesea ingresar los numeros automaticos:\n" +
                                    "1. Si\n" +
                                    "2. No");
                            String opma2 = sc.next();
                            if (opma2.equals("2")){

                                int i, j, k, n=3;
                                float termino;
                                String literales = "";
                                char literal;
                                float[][] matriz = new float[n][n+1];
                                for(i=0; i<n; i++)
                                {
                                    System.out.print("Ingrese nombre de la variable " + (i+1) + ": ");

                                    do {
                                        literal = sc.next().toLowerCase().charAt(0);
                                        System.out.println("==========================================================");
                                    } while(!Character.isLetter(literal) || literales.contains(String.valueOf(literal)));
                                    literales = literales + literal;
                                }
                                for(i=0; i<n; i++)
                                {
                                    for(j=0; j<n; j++)
                                    {
                                        System.out.print("Ingrese el coeficiente de la variable '" + literales.charAt(j) + "' de la ecuacion " + (i+1) + ": ");

                                        matriz[i][j] = Float.parseFloat(sc.next());
                                        System.out.println("==========================================================");
                                    }
                                    System.out.print("Ingrese la constante de la ecuacion " + (i+1) + ": ");

                                    matriz[i][n] = Float.parseFloat(sc.next());
                                    System.out.println("==========================================================");
                                }
                                System.out.println();
                                for(i=0; i<n; i++)
                                {
                                    if(matriz[i][i]==0.0)
                                    {
                                        System.err.println("Error: division entre cero.\n");
                                        return;
                                    }
                                    for(k=0; k<n; k++)
                                        if(k!=i)
                                        {
                                            termino = matriz[k][i] / matriz[i][i];
                                            for(j=0; j<=n; j++)
                                                matriz[k][j] -= termino * matriz[i][j];
                                        }
                                }
                                System.out.println(" ===== Solucion ======\n");
                                for(i=0; i<n; i++)
                                {
                                    termino = matriz[i][n] / matriz[i][i];
                                    System.out.println(literales.charAt(i) + " = " + termino);
                                }
                                System.out.println();

                            }else if (opma2.equals("1")){
                                System.out.println("===== Automatico =====");
                                int i, j, k, n=3;
                                float termino;
                                String literales = "";
                                char literal;
                                float[][] matriz = new float[n][n+1];
                                for(i=0; i<n; i++)
                                {
                                    System.out.print("Ingrese nombre de la variable " + (i+1) + ": ");

                                    do {
                                        literal = sc.next().toLowerCase().charAt(0);

                                    } while(!Character.isLetter(literal) || literales.contains(String.valueOf(literal)));
                                    literales = literales + literal;
                                }
                                for(i=0; i<n; i++)
                                {
                                    for(j=0; j<n; j++)
                                    {
                                        float a = rnd.nextInt(100);
                                        System.out.print("coeficiente de la variable '" + literales.charAt(j) + "' de la ecuacion " + (i+1) + ": " + a + "\n");

                                        matriz[i][j] = a;

                                    }
                                    float a = rnd.nextInt(100);
                                    System.out.print("la constante de la ecuacion " + (i+1) + ": " + a + "\n");
                                    matriz[i][n] = a;

                                }
                                System.out.println();
                                for(i=0; i<n; i++)
                                {
                                    if(matriz[i][i]==0.0)
                                    {
                                        System.err.println("Error: division entre cero.\n");
                                        return;
                                    }
                                    for(k=0; k<n; k++)
                                        if(k!=i)
                                        {
                                            termino = matriz[k][i] / matriz[i][i];
                                            for(j=0; j<=n; j++)
                                                matriz[k][j] -= termino * matriz[i][j];
                                        }
                                }
                                System.out.println(" ===== Solucion ======\n");
                                for(i=0; i<n; i++)
                                {
                                    termino = matriz[i][n] / matriz[i][i];
                                    System.out.println(literales.charAt(i) + " = " + termino);
                                }
                                System.out.println();
                            }

                        }else if (opm.equals("3")){
                            case5 = false;
                        }
                        else{
                            System.out.println(" ----- Opcion Incorrecta Ingrese una opcion correta -----");
                        }


                    }while(case5);
                    break;
                case "5":
                    boolean avz = true;
                    do{


                    System.out.println("\n===========================================================================");
                    System.out.println("  ,---.,--.   ,--.,---.  ,--.  ,--.,-------.  ,---.  ,------.   ,-----.  \n" +
                                       " /  O  \\\\  `.'  //  O  \\ |  ,'.|  |`--.   /  /  O  \\ |  .-.  \\ '  .-.  ' \n" +
                                       "|  .-.  |\\     /|  .-.  ||  |' '  |  /   /  |  .-.  ||  |  \\  :|  | |  | \n" +
                                       "|  | |  | \\   / |  | |  ||  | `   | /   `--.|  | |  ||  '--'  /'  '-'  ' \n" +
                                       "`--' `--'  `-'  `--' `--'`--'  `--'`-------'`--' `--'`-------'  `-----'");
                    System.out.println("===========================================================================");
                    System.out.println("1. Factorial N\n" +
                            "2. Fibonacci\n" +
                            "3. Salir\n");
                    System.out.print("Opcion deseada: ");
                    String avp = sc.next();
                    if (avp.equals("1")){
                        String n;
                        do{
                            n="";
                            System.out.println(" ====== Factorial N ======");
                            System.out.print("Ingrese un numero del 1 - 100: ");
                            n = sc.next();
                        }while(Integer.parseInt(n) > 100 || Integer.parseInt(n) < 1);
                        int totalt = Integer.parseInt(n);
                        for (int i=1;i<Integer.parseInt(n) - 1; i++){
                            totalt = totalt * (Integer.parseInt(n)-i);
                        }
                        System.out.println("\n-----------------------------------------------------");
                        System.out.println("  ===== Resultado del Factorial "+n + "! : " + totalt +" ======");
                        System.out.println("-----------------------------------------------------\n");

                    }else if (avp.equals("2")) {
                        System.out.println(" ====== Fibonacci ======");
                        String n;
                        do{
                            n="";
                            System.out.print("Ingrese un numero del 1 - 100: ");
                            n = sc.next();
                        }while(Integer.parseInt(n) > 100 || Integer.parseInt(n) < 1);

                        int f1=1;
                        int f2=1;

                        System.out.print(f1 + " ");
                        for(int i=2;i<=Integer.parseInt(n);i++){
                            System.out.print(f2 + " ");
                            f2 = f1 + f2;
                            f1= f2 - f1;
                        }
                    }else if (avp.equals("3")){
                        avz = false;
                    }
                    else{
                        System.out.println("===== Opcion Incorrecta, Ingrese una opcion valida =====");
                    }

                    }while(avz);
                    break;

                case "6":

                    System.exit(0);


                default:
                    System.out.println("----- Opcion Incorrecta, Ingrese una opcion valida -----\n");
                    }

            }while(Continue);

        }
}









