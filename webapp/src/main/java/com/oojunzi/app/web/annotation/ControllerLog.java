package com.oojunzi.app.web.annotation;

import java.lang.annotation.*;

/**
 * Created by huangyong on 12/23/2016.
 */

@Target({ ElementType.PARAMETER, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ControllerLog {
	String description() default "";
}
