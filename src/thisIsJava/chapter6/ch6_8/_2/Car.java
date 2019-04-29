package thisIsJava.chapter6.ch6_8._2;

public class Car {
    int gas;

    void setGas(int gas) {
        this.gas = gas;
    }

    boolean isLeftGas() {
        if(gas==0) {
            System.out.println("gas없음");
            return false;
        }
        System.out.println("gas있음");
        return true;
    }

    void run() {
        while(true) {
            if(gas > 0) {
                System.out.println("달립니다.(gas잔량: " + gas + ")");
                gas -= 1;
            } else {
                System.out.println("멈춥니다.(gas잔량: " + gas + ")");
                return; //메소드 실행 종료. 여기서는 break로 대체 가능.
            }
        }
    }
}
