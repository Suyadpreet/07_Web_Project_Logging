package com.suyad.Controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ControllerClass 
{
	///----we can use @Slf4j lombok annotation instead of this all boilerplate code-------
	//Logger logger = LoggerFactory.getLogger(Controller.class);

    @GetMapping("/test")
    public String hello()
    {
    	/*
        logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");
        return "index";
        */
    	log.trace("A TRACE Message");
        log.debug("A DEBUG Message");
        log.info("An INFO Message");
        log.warn("A WARN Message");
        log.error("An ERROR Message");
        return "index";
    }
}
