public class Practice_bitwise {
    public static void main(String[] args) {
        int arr = [1,2,3,4,4,2,1];
        int n =3;
        System.out.println(even_odd(n));
    }
    private static boolean even_odd(int n){
        return (n^1)==0;
    }
}
