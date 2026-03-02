package com.resource;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

public class ResourceInjection {
	private Resource file;
	
	public ResourceInjection() {
		super();
	}

	public ResourceInjection(Resource file) {
		super();
		this.file=file;
	}

	public Resource getFile() {
		return file;
	}

	public void setFile(Resource file) {
		this.file = file;
	}
	
	public void process() {
		String path="E:\\spring file destination\\resume";
		
		try {
			InputStream is=file.getInputStream();//it was read the data from the file
			OutputStream os=new FileOutputStream(path+file.getFilename());
			
			int c;
			while((c=is.read()) !=-1) {
				os.write(c);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		ResourceInjection ri=ctx.getBean("r",ResourceInjection.class);
		ri.process();
	}
	
	
}
