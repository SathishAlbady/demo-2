package com.example.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class gameRunnable 
{ 
	@Autowired
	@Qualifier("superCantro")
	gameconsole obj;
	   gameRunnable(gameconsole obj)
		{
		this.obj=obj;
		}
	   void runner() 
	   {
		obj.right();
		obj.left();
		obj.up();
		obj.down();
		}
}
