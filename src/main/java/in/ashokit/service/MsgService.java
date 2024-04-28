package in.ashokit.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MsgService {
	
	private Logger logger = LoggerFactory.getLogger(MsgService.class);
	
	public String getWelcomeMsg() {
		logger.trace("this is trace msg...");
		logger.debug("this is debug msg...");
		logger.info("getWelcomeMsg - Started...");
		
		String msg = "Welcome To AshokIT";
		
		logger.info("getWelcomeMsg - Ended...");
		logger.warn("this is warn msg...");
		logger.error("this is error msg...");
		
		return msg;
	}
}
