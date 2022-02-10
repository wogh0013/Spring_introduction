package hello.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//스프링 빈 : Spring에 의하여 생성되고 관리되는 자바 객체
//@Component 애너테이션이 있으면 스프링 빈으로 자동 등록된다.
//@Controller, @Service, @Repository도 @Componet를 포함하여 자동 등록됨.
//정형화된 패턴 !!!
//@Controller를 통해서 외부 요청을 받고
//@Service에서 비즈니스 로직을 만들고
//@Repository에서 데이터를 저장한다.
//Autowired는 위 3개를 서로 연결시켜준다.

@SpringBootApplication
public class HelloSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
	}

}
