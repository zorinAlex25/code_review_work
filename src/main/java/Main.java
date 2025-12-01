public class Main {
    public static void main(String[] args) {

    }
    public static int add(int a, int b){
        return a + b;
    }

    public static int dif(int a, int b){
        return a - b;
    }

    public static int div(int a, int b){
        if (b == 0){
            throw new IllegalArgumentException("Нельзя делить на 0");
        }
        return a / b;
    }

    public static int times(int a, int b){
        return (int) Math.pow(a, b);
    }

    public static int solver(){
        // 16 + 3 = 19
        return times(2,4) + div(6,2);
    }
}
