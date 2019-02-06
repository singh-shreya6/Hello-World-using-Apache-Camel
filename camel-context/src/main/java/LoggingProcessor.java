import org.apache.camel.Processor;
import org.apache.camel.Exchange;

public class LoggingProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        System.out.println("Received Order: " +
                exchange.getIn().getBody(String.class));
    }
}