import org.apache.camel.builder.RouteBuilder;

public class IntegrationRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("file://C:/Users/SG0304978/Downloads/docs/?fileName=hello.txt&noop=true")
                .process(new LoggingProcessor())
                .bean(new TransformationBean(),"makeUpperCase")
                .to("file://C:/Users/SG0304978/Downloads/docsout/?fileName=newhello.txt");
    }
}