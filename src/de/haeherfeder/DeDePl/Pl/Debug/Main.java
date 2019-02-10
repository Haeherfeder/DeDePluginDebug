package de.haeherfeder.DeDePl.Pl.Debug;

import de.haeherfeder.DeDePlEngine.all.IPlugin;
import de.haeherfeder.DeDePlEngine.all.PluginManager;

public class Main implements IPlugin{
	PluginManager manager;
	@Override
	public void GameStart() {
		manager.showVisualMessage("GameStart");
	}

	@Override
	public void GameWindowStart(String arg0) {
		manager.showVisualMessage("GameWindowStart: "+ arg0);
	}

	@Override
	public void PlayerInput(String arg0, String arg1) {
		// TODO Auto-generated method stub
		manager.showVisualMessage("PlayerInput: \n first: \n"+arg0+"\n second: "+arg1);
	}

	@Override
	public void sendPosition(String arg0) {
		// TODO Auto-generated method stub
		manager.showVisualMessage("Send Pos: "+arg0);
	}

	@Override
	public boolean setEngineVersion(String arg0) {
		// TODO Auto-generated method stub
		manager.showVisualMessage("EngineVersion"+arg0);
		return false;
	}

	@Override
	public void setPluginManager(PluginManager arg0) {
		// TODO Auto-generated method stub
		manager = arg0;
		manager.showVisualMessage("Manager"+arg0);
	}

	@Override
	public boolean start() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean stop() {
		// TODO Auto-generated method stub
		return false;
	}

}
