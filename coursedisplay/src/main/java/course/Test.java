package course;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext content = new ClassPathXmlApplicationContext("spring-bean.xml");
		Elearn e=content.getBean(Elearn.class);
        e.display();
	}

}
