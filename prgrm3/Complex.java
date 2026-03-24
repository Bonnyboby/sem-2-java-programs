class Complex {

    int real;
    int imaginary;

    Complex(int r, int i) {
        real = r;
        imaginary = i;
    }

    void add(Complex c) {
        int newReal = real + c.real;
        int newImaginary = imaginary + c.imaginary;

        System.out.println("Sum = " + newReal + " + " + newImaginary + "i");
    }

    public static void main(String[] args) {

        Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(1, 2);
        c1.add(c2);
    }
}

