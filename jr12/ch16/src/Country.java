package com.briup.ch16;
/**
抽象
	为了让别人继承
*/
public abstract class Country{

	//中央银行
	public void yanghang(){
		System.out.println("房贷利率 商业贷款 4.9 * 0.95");  // 五险一金  首付 2成
	}

	public abstract void qukc();

	public abstract void qucn();
}