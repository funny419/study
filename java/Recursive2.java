public class Recursive2 {
    public static void main(String[] args) {
        int input = 0;
        System.out.println(fact(input));
    }

    public static int fact(int num) {
        if (num <= 1) {
            return 1;
        }

        return num * fact(num-1);
    }
}

/**
 * 원리
 * 1) 처음 fact 메소드가 불린 것은 main함수에서이다.
 *    fact(4)가 실행될 것이다.
 * 
 * 2) fact(4)
 *  n은 현재 4이다.
 *  n은 1보다 크므로 else를 타고 fact(3) 호출 된다.
 *  여기서 처음 호출된 fact(4)는 종료 되지 않고 Stack에 쌓인 상태로 fact(4)가 호출한 fact(3)이 실행된다.
 * 
 * STACK
 * fact(3)
 * fact(4)
 * 
 * 3) fact(3)
 *  n은 현재 3이다.
 *  n은 1보다 크므로 else를 타고 fact(2) 호출 된다.
 *  호출한 fact(3)는 종료 되지 않고 Stack에 쌓인 상태로 fact(3)이 호출한 fact(2)가 실행된다.
 * 
 * STACK
 * fact(2)
 * fact(3)
 * fact(4)
 * 
 * 4) fact(2)
 *  n은 현재 2이다.
 *  n은 1보다 크므로 else를 타고 fact(1) 호출 된다.
 *  호출한 facr(2)는 종료 되지 않고 Stack 쌓인 상태로 fact(1)가 실행된다.
 * 
 * STACK
 * fact(1) --> return 1
 * fact(2) --> 2*fact(1) --> 2 * 1 --> 2
 * fact(3) --> 3*fact(2) --> 3 * 2 --> 6
 * fact(4) --> 4*fact(3) --> 4 * 6 --> 24
 * 
 * 5) fact(1)s
 *  n은 현재 1이다.
 *  n은 1과 같으므로 return되고 종료 된다.
 *  fact(1)이 종료 되면서 Stack가장 위에 있는 fact(2)가 실행된다.
 *  fact(2)에서는 n이 2이다. fact(1)에서 1을 리턴했으므로 2*fact(2-1) --> 2*1한 값을 return 한다.
 * 
 * 6) 그럼 이제 STACK아래와 같다.
 *  STACK
 *  fact(3)
 *  fact(4)
 * 
 *  3*fact(3-1)*2 --> 3*2*
 */
