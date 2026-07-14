public class exercise1 {
    public static void main(String[] args) {
        /*
        Cramer's rule to solve to find x and y: 3.4x + 50.2y = 44.5
                                        2.1x + .55y = 5.9.
                                        
                                        given, x = ed - bf/ ad - bc
                                                y = af - ec/ ad - bc
        */
        double a = 3.4, b = 50.2, c = 2.1, d = 0.55, e = 44.5, f = 5.9, x, y;

        x = ((e * d) - (b * f)) / ((a * d) - (b * c));
        y = ((a * f) - (e * c)) / ((a * d) - (b * c));

        System.out.printf("x = %.2f \ny = %.2f", x , y);
    }
}
