package hello.core.singleton;

public class SingletonService {
    //1. static 영역에 객체를 1개만 생성
    private static SingletonService instance = new SingletonService();

    //2. public으로 열어서 객체 인스턴스가 필요하면 이 static 메서드로만 조회 하도록 허용
    public static SingletonService getInstance() {
        return instance;
    }

    //3. 생성자를 private 으로 선언 해서 외부에서 new 키워드로 선언하는 객체 생성을 막는다
    private SingletonService() {}

    public void logic() {
        System.out.println("싱글톤 객체 호출");
    }

}
