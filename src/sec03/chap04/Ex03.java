package sec03.chap04;

public class Ex03 {
    public static void main(String[] args) {
        // && = 앞이 false면 실행x, || = 앞이 true면 실행x
        int a = 1, b = 2, c = 0, d = 0, e = 0, f = 0;

        boolean bool1 = a < b && c++ < (d += 3);
        boolean bool2 = a < b || e++ < (f += 3);

        boolean bool3 = a > b && c++ < (d += 3); // 🔴
        boolean bool4 = a > b || e++ < (f += 3);
    }
}
