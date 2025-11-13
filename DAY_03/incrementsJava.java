public class incrementsJava {
    public static void main(String[] args) {
        
        System.out.println("Post Increment: ");
        for(int i = 0; i < 10; System.out.print(" "+ (i++))) {
        }
        System.out.println();
        System.out.println("Pre Increment: ");
        for(int i = 0; i < 10; System.out.print(" "+ (++i))) {
        }
    }
}
