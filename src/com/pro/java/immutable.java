package com.pro.java;

final class renu {
	private final int i;

	renu(int i) {

		this.i = i;

	}

	public renu modify(int i) {
		if (this.i == i) {

			return this;
		}
		else {
			return new renu(i);
		}
		 }
	}

	public class immutable {
		  public static void main(String[] args) {
			   
			  renu r=new renu(10);
			  renu r1=r.modify(10);
			  renu r3=r1.modify(10);
			 renu r2=r3.modify(100);
			  
		  System.out.println(r==r1);
		  System.out.println(r==r3);
		 System.out.println(r==r2);
		  }	
		
	}
