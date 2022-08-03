package com.phicommerce;



public class SingletonD {
private static SingletonD singletonObj;
	
	private SingletonD() {
	
	}
	
	public static SingletonD getSingletonObj() {
		synchronized (SingletonD.class) {
			if(singletonObj==null) {
				singletonObj=new SingletonD();
				
			}
			else {
				return singletonObj;
			}
		}
		
		return singletonObj;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return this.singletonObj;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		SingletonD obj1=SingletonD.getSingletonObj();
		SingletonD obj2=SingletonD.getSingletonObj();
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		SingletonD obj3=(SingletonD) obj1.clone();
		System.out.println(obj3.hashCode());
		System.out.println("this is git hub project");
	}

}
