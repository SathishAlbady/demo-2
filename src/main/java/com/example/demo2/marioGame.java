package com.example.demo2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

interface gameconsole 
{
	void right();
	void left();
	void up();
	void down();
}
@Primary
@Component

public class marioGame implements gameconsole
{

public void right() {System.out.println("Right");}
public void left() {System.out.println("Left");}
public void up() {System.out.println("up");}
public void down() {System.out.println("down");}

}
