package com.zxl.blog.service.base;

import com.zxl.blog.web.api.base.ControllerApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ResourceBundle;

/**
 * 服务层基类
 */
public abstract class ServiceBase {
    protected static final Logger LOGGER = LoggerFactory.getLogger(ControllerApi.class);
    protected static final ResourceBundle RES = ResourceBundle.getBundle("strings/base/service");
}
