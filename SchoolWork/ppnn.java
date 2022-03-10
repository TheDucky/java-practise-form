class ppnn {
    public static void main(String[] args) {
        int var1 = 5, var2 = 5, var3 = 5, var4 = 5;

        // 5 is displayed
        // Then, var1 is increased to 6.
        System.out.println(var1++); // n++ --> n & ++ 

        // var2 is increased to 6
        // Then, var2 is displayed
        System.out.println(++var2); // ++n --> ++ & n

        // 5 is displayed
        // Then, var3 is decreased to 4.
        System.out.println(var3--); // n-- --> n & --

        // var4 is decreased to 4
        // Then, var4 is displayed
        System.out.println(--var4); // --n --> -- & n

    }
}