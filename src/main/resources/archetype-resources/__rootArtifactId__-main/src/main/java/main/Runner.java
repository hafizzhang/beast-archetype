package ${package}.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	private static final Logger log = LoggerFactory.getLogger(Runner.class);
	private static ClassPathXmlApplicationContext context;
	
    public static void main(String[] args) throws Throwable {
    	long start = System.currentTimeMillis();
        context = new ClassPathXmlApplicationContext(new String[] { "/applicationContext.xml" });
        context.start();
        long end = System.currentTimeMillis();
        log.info("beast-${artifactId} has started in " + (end - start));
        while (true) {
            try {
                Thread.sleep(60000);
            } catch (Throwable e) {
            	e.printStackTrace();
            }
        }
    }
}
