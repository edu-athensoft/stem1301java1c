package com.athensoft.demo.m5.s77;

/**
 * @author Athens
 *
 */
public class DemoInit {

	public static int totalSubscriber = 0;
	public static int totalView ;
	
	static {
		System.out.println("static block 1.");
		totalView = 1000;
	}
	
	private String pageName ;
	
	{
		System.out.println("init block.");
		pageName = "home";
	}
	
	public DemoInit(){
		System.out.println("constructor.");
	}
	
	protected void finalize() {
		System.out.println("finalize().");
	}
	
	static {
		System.out.println("static block 2.");
		totalSubscriber = 100;
	}
	
	public String getPageName() {
		return pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}
	
	@Override
	public String toString() {
		return "DemoInit [pageName=" + pageName +
				", totalSubscriber="+totalSubscriber +
				", totalView="+totalView +
				"]";
	}

	public static void main(String[] args) {
		System.out.println("main() is called.");
		DemoInit seo = new DemoInit();
		System.out.println(seo);
		seo = null;
		System.out.println("exited from main()");	
	}	

}
