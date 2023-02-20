package com.example.demo2;

import org.springframework.stereotype.Component;

@Component
public class superCantro implements gameconsole
{
	public void right() {System.out.println("Right 1");}
	public void left() {System.out.println("Left 2");}
	public void up() {System.out.println("up 2");}
	public void down() {System.out.println("down 4");}

}
