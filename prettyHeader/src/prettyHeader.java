public class prettyHeader {
    public static void prettyHeader(String msg) {
        int width = 60;
        int padding = (width - 6 - msg.length()) / 2;
        for (int i = 0; i < width; i++) System.out.print("*");
        System.out.println();
        System.out.print("***");
        for (int i = 0; i < padding; i++) System.out.print(" ");
        System.out.print(msg);
        for (int i = 0; i < padding; i++) System.out.print(" ");
        if ((msg.length() + 6) % 2 != 0) System.out.print(" ");
        System.out.println("***");

        for (int i = 0; i < width; i++) System.out.print("*");
        System.out.println();
    }
    public static void main(String[] args) {
        prettyHeader("Message Centered Here");
    }
}

