package org.tzi.use.monitor.cmd;

import org.tzi.use.main.shell.runtime.IPluginShellCmd;
import org.tzi.use.monitor.MonitorPlugin;
import org.tzi.use.runtime.shell.IPluginShellCmdDelegate;

public class EndMonitorCmd implements IPluginShellCmdDelegate {

	@Override
	public void performCommand(IPluginShellCmd pluginCommand) {
		if (!MonitorPlugin.getInstance().checkMonitoring()) return;
		MonitorPlugin.getInstance().endMonitor();
	}

}
