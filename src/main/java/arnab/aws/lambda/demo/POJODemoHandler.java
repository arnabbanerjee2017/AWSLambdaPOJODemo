package arnab.aws.lambda.demo;

import java.util.function.Function;

import org.springframework.stereotype.Component;

import arnab.aws.lambda.demo.domains.Request;

@Component("pojoDemoHandler")
public class POJODemoHandler implements Function<Request, String> {

	@Override
	public String apply(Request t) {
		return "HELLO " + t.getFirstName().toUpperCase() + " " + t.getLastName().toUpperCase();
	}

}
