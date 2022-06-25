package assignment;

import java.util.Scanner;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.util.*;

public class Menu {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		String order;
		Scanner sc =new Scanner(System.in);
		System.out.println("SHAPES");
		System.out.println("1. Rectangle");
		System.out.println("2. triangle");
		System.out.println("3. Circle");
		
		System.out.println("Enter choice number of shape to be displayed:");
		
		choice=sc.nextInt();
		
		//switch start
		
		switch(choice)
		{
		case 1:
			order="Rectangle";	
			break;
		case 2:
			order="triangle";
			break;
		case 3:
			order="Circle";
			break;
		default:
			break;
		}

	}

}
