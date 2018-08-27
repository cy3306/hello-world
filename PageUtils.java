package com.baidu.utils;
//分页工具类
public class PageUtils {
	
	//属性
	//当前页
	private int cpage;
	//分页单位
	private int pageSize;
	//起始位置
	private int startPage;
	//上一页
	private int prevPage;
	//下一页
	private int nextPage;
	//总页数
	private int totalPage;
	//总条数
	private int count;
	
	
	public PageUtils(String cpage, int pageSize, int count) {
		this.pageSize = pageSize;
		this.count = count;
		//1.处理总页数
		initTotalPage();
		//2.处理cpage(当前页)
		initCpage(cpage);
		//处理起始位置
		initStartPage();
		//处理上一页
		initPrevPage();
		//处理下一页
		initNextPage();
		
	}
	
	
	public int getCpage() {
		return cpage;
	}


	public void setCpage(int cpage) {
		this.cpage = cpage;
	}


	public int getPageSize() {
		return pageSize;
	}


	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}


	public int getStartPage() {
		return startPage;
	}


	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}


	public int getPrevPage() {
		return prevPage;
	}


	public void setPrevPage(int prevPage) {
		this.prevPage = prevPage;
	}


	public int getNextPage() {
		return nextPage;
	}


	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}


	public int getTotalPage() {
		return totalPage;
	}


	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	//处理下一页
	private void initNextPage() {
		if(cpage>=totalPage){
			nextPage=totalPage;
			
		}else{
			nextPage=cpage+1;
		}
		
	}

	//处理上一页
	private void initPrevPage() {
		if(cpage<=1){
			prevPage=1;
		}else{
			
			prevPage=cpage-1;
		}
		
	}

	//处理起始位置
	private void initStartPage() {
		startPage=(cpage-1)*pageSize;
		if(startPage<0){
			startPage=0;
		}
	}


	//2.处理cpage(当前页)
	private void initCpage(String cpage2) {
		if(cpage2==null||"".equals(cpage2)){
			cpage2="1";
		}
		int cpage1=Integer.parseInt(cpage2);
		if(cpage1<1){
			cpage1=1;
		}
		if(cpage1>=totalPage){
			cpage1=totalPage;
		}
		
		this.cpage=cpage1;
		
	}

	//1.处理总页数
	private void initTotalPage() {
		totalPage=(count/pageSize);
		if(count%pageSize!=0){
			totalPage++;
		}
		
	}
	
	
	
	
	
	
	
	

}
