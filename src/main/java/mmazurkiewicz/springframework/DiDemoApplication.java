package mmazurkiewicz.springframework;

import mmazurkiewicz.springframework.controllers.ConstructorInjectedController;
import mmazurkiewicz.springframework.controllers.MyController;
import mmazurkiewicz.springframework.controllers.PropertyInjectedController;
import mmazurkiewicz.springframework.controllers.SetterInjectedController;
import mmazurkiewicz.springframework.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"mmazurkiewicz.springframework.services", "mmazurkiewicz.springframework"})
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUser());

	}
}
