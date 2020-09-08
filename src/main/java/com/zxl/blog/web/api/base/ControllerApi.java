package com.zxl.blog.web.api.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ResourceBundle;

/**
 * API抽象类
 */
public abstract class ControllerApi {

    protected static final Logger LOGGER = LoggerFactory.getLogger(ControllerApi.class);
    protected static final  ResourceBundle RES = ResourceBundle.getBundle("strings/base/controller");

}
