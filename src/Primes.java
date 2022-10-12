public class Primes {
    public static void main(String[] args) {
        for(int i = 2; i < 101; i++) {
            if (isPrime(i)) System.out.println(i);
        }
    }
    //Функция определения простоты числа
    public static boolean isPrime(int n) {
        //Если число меньше 0 или 0 или 1 то оно будет точно непростым.
        if (n < 2) return false;
        //Нет смысла перебирать все числа в диапазоне от 1 до n, достаточно от 2 до n-1
        for (int i = 2; i < (n-1); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
