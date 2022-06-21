package ex01;

import java.nio.channels.AcceptPendingException;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;


/**
 * 
 * 1. 스프링부트 애플리케이션의 부트스트랩핑 클래스
 * 2. 설정 클래스로 역할(Configuration Class)
 *
 */

@SpringBootApplication
public class HelloSpringBootApplication {
	
	@Bean
	public ApplicationRunner applicationRunner() {
		return new MyComponent();
	}
	
	
	public static void main(String[] args) {
		/** SpringApplication.run 안에서 일어나는 5가지의 작업(bootstrap)
		 * 
		 * 1. 애플리케이션 컨텍스트(Application Context, spring Container) 생성
		 * 2. 만약 웹 애플리케이션이면, 애플리케이션의 타입을 결정(지금은 웹이 아니기에 건너뜀)
		 * 		-> Spring MVC Type or Reactive Type	
		 * 3. 어노테이션 스캐닝(auto) + Configuration Class(Explicit) 통한 Bean 생성/등록/와이어링
		 * 4. 만약 웹 애플리케이션이면, 웹 애플리케이션(MVC)
		 * 		- 내장(embeded) 서버(TomcatEmbededServlectContainer) 인스턴스 생성
		 * 		- 서버 인스턴스에 웹 어플리케이션 배포
		 * 		- 서버 인스턴스 실행   
		 * 5.  ApplicationRunner 인터페이스를 구현한 Bean을 찾아서 실행(run 실행)
		 * 
		 */
		
		// SpringApplication.run(HelloSpringBootApplication.class, args);

//		ConfigurableApplicationContext ac =null;
//		try {
//		ac = SpringApplication.run(HelloSpringBootApplication.class, args);		
//		} catch (Throwable e) {
//			e.printStackTrace();
//		}finally {
//			ac.close();
//		}
		
		try(ConfigurableApplicationContext ac = SpringApplication.run(HelloSpringBootApplication.class, args)){
			
		}
		
		
	}

}
