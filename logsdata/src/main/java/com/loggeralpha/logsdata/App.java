package com.loggeralpha.logsdata;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class App 
{
	private static final Logger LOGGER=LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        Scanner in=new Scanner(System.in);
        LOGGER.debug("1.Simple Interest\n2.Compound Interest\n3.House Construction Cost : ");
        int option=in.nextInt();
        while(option<1 || option>3) {
        	LOGGER.debug("Entered invalid option\n");
        	option=in.nextInt();
        }
        if(option==1) {
        	LOGGER.debug("Enter principal amount : ");
        	double p=in.nextDouble();
        	LOGGER.debug("Enter rate of interest : ");
        	double r=in.nextDouble();
        	LOGGER.debug("Enter time period : ");
        	double t=in.nextDouble();
        	Simple s=new Simple(p,t,r);
        	LOGGER.debug("Simple Interest is : "+s.cal()+"INR");
        }
        else if(option==2) {
        	LOGGER.debug("Enter principal amount : ");
        	double p=in.nextDouble();
        	LOGGER.debug("Enter rate of interest : ");
        	double r=in.nextDouble();
        	LOGGER.debug("Enter time period : ");
        	double t=in.nextDouble();
        	Compound c=new Compound(p,t,r);
        	LOGGER.debug("Compound Interest is : "+c.cal()+"INR");
        }
        else {
        	LOGGER.debug("Enter area of the house : ");
        	double area=in.nextDouble();
        	LOGGER.debug("Enter materail standard : ");
        	LOGGER.debug("1.Standard material\n2.Above Standard materials\n3.High Standard materials\n4.High standard material and fully automated home");
        	int op=in.nextInt();
        	House h=new House(area,op);
        	LOGGER.debug("Total Cost : "+h.cal()+"INR");
        }
        in.close();
    }
}
