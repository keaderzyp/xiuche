package com.oojunzi.app.test.dao;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.UUID;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

public class Test {
	       public static void main(String[] args) throws MalformedURLException,URISyntaxException {
	               System.out.println("java.home :"+System.getProperty("java.home"));
	               System.out.println("java.class.version :"+System.getProperty("java.class.version"));
	                System.out.println("java.class.path: "+System.getProperty("java.class.path"));
	               System.out.println("java.library.path :"+System.getProperty("java.library.path"));
	               System.out.println("java.io.tmpdir :"+System.getProperty("java.io.tmpdir"));
	               System.out.println("java.compiler :"+System.getProperty("java.compiler"));
	               System.out.println("java.ext.dirs :"+System.getProperty("java.ext.dirs"));
	               System.out.println("user.name : "+System.getProperty("user.name"));
	               System.out.println("user.home :"+System.getProperty("user.home"));
	               System.out.println("user.dir :"+System.getProperty("user.dir"));
	               System.out.println("===================");
	               System.out.println("package:"+Test.class.getPackage().getName());
	               System.out.println("package:"+Test.class.getPackage().toString());
	               System.out.println("=========================");
	                String packName =Test.class.getPackage().getName();
	                
	               // URI packuri = newURI(packName);
	              // System.out.println(packuri.getPath());
	               //System.out.println(packuri.toURL().getPath());
	               System.out.println(packName.replaceAll("//.", "/"));
	               System.out.println(System.getProperty("user.dir")+"/"+(Test.class.getPackage().getName()).replaceAll("//.","/")+"/");
	       }
	}
