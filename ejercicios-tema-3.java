// Suma de tres números

public static int suma(int a, int b, int c) 
{
    int resultado = a + b + c;
    return resultado;
}

suma(10,20,30);

// Clase Coche

class miCoche {
    private int Puertas = 3;

    public void addPuerta() {
        Puertas = Puertas++;
    }
}
System.out.println(miCoche.Puertas);
