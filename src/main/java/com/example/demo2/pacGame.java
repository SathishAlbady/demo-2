package com.example.demo2;

import org.springframework.stereotype.Component;

@Component
public class pacGame implements gameconsole
{

	public void right() {System.out.println(" jump Right");}
	public void left() {System.out.println("jump Left");}
	public void up() {System.out.println("jump up");}
	public void down() {System.out.println("jump down");}
}
