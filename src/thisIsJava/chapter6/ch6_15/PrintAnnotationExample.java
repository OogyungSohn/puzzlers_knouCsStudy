package thisIsJava.chapter6.ch6_15;

import java.lang.reflect.Method;

public class PrintAnnotationExample {
    public static void main(String[] args) {
        //Service 클래스로부터 선언된 메소드 정보를 얻음(리플렉션)
        Method[] declaredMethods = Service.class.getDeclaredMethods();

        //Method 객체를 하나씩 처리
        for(Method method : declaredMethods) {
            //PrintAnnotation이 적용됐는지 확인
            if(method.isAnnotationPresent(PrintAnnotation.class)) {
                //printAnnotation 객체 얻기
                PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);

                //메소드 이름 출력
                System.out.println("[" + method.getName() + "]");

                //구분선 출력
                int i;
                for(i=0; i<printAnnotation.number(); i++) {
                    System.out.print(printAnnotation.value());
                }
                System.out.print(i);
                System.out.println();

                try{
                    //생성된 Service 객체의 메소드호출
                    method.invoke(new Service());
                } catch (Exception e) {}
                System.out.println();
            }
        }
    }
}
