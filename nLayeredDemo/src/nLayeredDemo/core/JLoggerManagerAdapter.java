package nLayeredDemo.core;

import nLayeredDemo.jLogger.jLoggerManager;

public class JLoggerManagerAdapter implements LoggerService{

	private jLoggerManager _jLoggerManager;
	public JLoggerManagerAdapter(jLoggerManager jLoggerManager) {
		// TODO Auto-generated constructor stub
		this._jLoggerManager=jLoggerManager;
	}
	@Override
	public void logtoSystem(String message) {
		// TODO Auto-generated method stub
		_jLoggerManager.Log(message);
	}
}
