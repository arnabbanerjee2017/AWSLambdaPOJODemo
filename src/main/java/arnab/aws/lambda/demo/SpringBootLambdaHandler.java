package arnab.aws.lambda.demo;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import arnab.aws.lambda.demo.domains.Request;

public class SpringBootLambdaHandler extends SpringBootRequestHandler<Request, String> {

}
