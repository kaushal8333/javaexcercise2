package com.ig.ui;

import java.util.ArrayList;
import java.util.Scanner;

public class Program2 {
	public static int findMaxDistance(ArrayList<Integer> dist,int n) {
		int maxi=0;
		int index=-1;
		for(int i:dist) {
			for(int j:dist) {
				if(Math.abs(i-j)>maxi) {
					maxi=Math.abs(i-j);
					index=(i>j)?dist.indexOf(i):dist.indexOf(j);
				}
			}
		}
		return index;
	}
	public static void main(String[] args) {
		ArrayList<Integer> dist=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("number of elements:");
		int n=sc.nextInt();
		System.out.println("elements:");
		for(int i=0;i<n;i++) {
			int temp=sc.nextInt();
			dist.add(temp);
		}
		System.out.println("Index:"+findMaxDistance(dist,n));
	}
}
