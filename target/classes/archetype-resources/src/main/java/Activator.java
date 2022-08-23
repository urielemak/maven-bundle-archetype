package ${package};

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {
    
    @Override
    public void start(BundleContext context) {
	System.out.println("Congrats, bundle created!");
    }

    @Override
    public void stop(BundleContext context) {
	System.out.println("Bundle stopped");
    }
}
