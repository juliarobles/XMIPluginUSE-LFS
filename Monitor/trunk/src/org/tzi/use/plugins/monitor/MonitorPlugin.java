package org.tzi.use.plugins.monitor;

import java.util.Map;

import org.tzi.use.main.Session;
import org.tzi.use.plugins.monitor.vm.adapter.InvalidAdapterConfiguration;
import org.tzi.use.plugins.monitor.vm.adapter.VMAdapter;
import org.tzi.use.plugins.monitor.vm.adapter.jvm.JVMAdapter;
import org.tzi.use.runtime.impl.Plugin;
import org.tzi.use.util.Log;

public class MonitorPlugin extends Plugin {

	private static String PLUGIN_NAME = "Monitor";
	
	private Monitor monitor = new Monitor();
	
	private VMAdapter adapter = new JVMAdapter();
	
	public static MonitorPlugin getMonitorPluginInstance() {
		return (MonitorPlugin)pluginInstance;
	}
	
	@Override
	public String getName() {
		return PLUGIN_NAME;
	}

	public Monitor getMonitor() {
		return monitor;
	}
	
	public void setAdapter(VMAdapter a) {
		
	}
	
	public void startMonitor(Session session, Map<String,String> args, boolean suspend) {
		try {
			this.monitor.configure(session, adapter, args);
		} catch (InvalidAdapterConfiguration e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.monitor.start(suspend);
	}

	public boolean checkMonitoring() {
		if (!monitor.isRunning()) {
    		Log.error("No monitoring is running. Please use 'monitor start' to begin monitoring.");
    		return false;
    	}
    	
    	return true;
	}

	public void endMonitor() {
		monitor.end();
	}
}
