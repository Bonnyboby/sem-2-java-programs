package Arithmetic;

interface InterArith {
    float add(int a, int b);
    float sub(int a, int b);
    float mult(int a, int b);
    float div(int a, int b);
    float rem(int a, int b);
}

public class Oprtn implements InterArith {
    public float add(int a, int b) { return a + b; }
    public float sub(int a, int b) { return a - b; }
    public float mult(int a, int b) { return a * b; }
    public float div(int a, int b) { return (b == 0) ? 0 : (float)a / b; }
    public float rem(int a, int b) { return (b == 0) ? 0 : a % b; }
}
