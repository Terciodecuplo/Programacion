public class Calculadora {
    // Polimorfismo estático o en tiempo de compilación -> sobrecarga de métodos (mismo nombre distinto comportamiento)
    public int suma(int a, int b){
        return a + b;
    }
    public int suma(int a, int b, int c){
        return a + b + c;
    }
    public float suma(float a, float b, float c){
        return a + b + c;
    }
}
