package Model;
//this is not for model exam
    class complexNum {
        // Data members
        private double real; // Real part
        private double imaginary; // Imaginary part

        // Constructor
        public complexNum(double real, double imaginary) {
            this.real = real;
            this.imaginary = imaginary;
        }

        // Method to add two complexNum numbers
        public complexNum add(complexNum other) {
            double newReal = this.real + other.real;
            double newImaginary = this.imaginary + other.imaginary;
            return new complexNum(newReal, newImaginary);
        }

        // Method to subtract two complexNum numbers
        public complexNum subtract(complexNum other) {
            double newReal = this.real - other.real;
            double newImaginary = this.imaginary - other.imaginary;
            return new complexNum(newReal, newImaginary);
        }

        // Method to multiply two complexNum numbers
        public complexNum multiply(complexNum other) {
            double newReal = this.real * other.real - this.imaginary * other.imaginary;
            double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
            return new complexNum(newReal, newImaginary);
        }

        // Method to divide two complexNum numbers
        public complexNum divide(complexNum other) {
            double divisor = other.real * other.real + other.imaginary * other.imaginary;
            double newReal = (this.real * other.real + this.imaginary * other.imaginary) / divisor;
            double newImaginary = (this.imaginary * other.real - this.real * other.imaginary) / divisor;
            return new complexNum(newReal, newImaginary);
        }

        // Method to display the complexNum number
        public String toString() {
            return "(" + real + " + " + imaginary + "i)";
        }

        public static void main(String[] args) {
            complexNum complexNum1 = new complexNum(3, 4);
            complexNum complexNum2 = new complexNum(2, 7);

            // Addition example
            complexNum sum = complexNum1.add(complexNum2);
            System.out.println("Sum: " + sum);

            // Subtraction example
            complexNum difference = complexNum1.subtract(complexNum2);
            System.out.println("Difference: " + difference);

            // Multiplication example
            complexNum product = complexNum1.multiply(complexNum2);
            System.out.println("Product: " + product);

            // Division example
            complexNum quotient = complexNum1.divide(complexNum2);
            System.out.println("Quotient: " + quotient);
        }
    }
