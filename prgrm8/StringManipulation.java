class StringManipulation {

    public static void main(String[] args) {

        String str = "Hello, World!";

        int length = str.length();
        System.out.println("Length: " + length);

        String upper = str.toUpperCase();
        System.out.println("Uppercase: " + upper);

        String lower = str.toLowerCase();
        System.out.println("Lowercase: " + lower);

        String replaced = str.replace('o', 'x');
        System.out.println("Replaced: " + replaced);

        String sub = str.substring(7, 12);
        System.out.println("Substring: " + sub);

        boolean start = str.startsWith("Hello");
        System.out.println("Starts with 'Hello': " + start);

        boolean end = str.endsWith("World!");
        System.out.println("Ends with 'World!': " + end);

        String trimmed = "   Hello, World!   ".trim();
        System.out.println("Trimmed: " + trimmed);
    }
}
