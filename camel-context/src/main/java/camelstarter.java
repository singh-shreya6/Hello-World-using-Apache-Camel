import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;


public class camelstarter {
        public static void main(String[] args) {
            CamelContext context = new DefaultCamelContext();
            try {
                context.addRoutes(new IntegrationRoute());
                context.start();
                System.out.println("Hello to Camel!");
                Thread.sleep(30000);
                context.stop();
            }
            catch(Exception e)
            {
                System.out.println("Error");
            }
        }
}

