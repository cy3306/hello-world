package com.baidu.utils;
//��ҳ������
public class PageUtils {
	
	//����
	//��ǰҳ
	private int cpage;
	//��ҳ��λ
	private int pageSize;
	//��ʼλ��
	private int startPage;
	//��һҳ
	private int prevPage;
	//��һҳ
	private int nextPage;
	//��ҳ��
	private int totalPage;
	//������
	private int count;
	
	
	public PageUtils(String cpage, int pageSize, int count) {
		this.pageSize = pageSize;
		this.count = count;
		//1.������ҳ��
		initTotalPage();
		//2.����cpage(��ǰҳ)
		initCpage(cpage);
		//������ʼλ��
		initStartPage();
		//������һҳ
		initPrevPage();
		//������һҳ
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


	//������һҳ
	private void initNextPage() {
		if(cpage>=totalPage){
			nextPage=totalPage;
			
		}else{
			nextPage=cpage+1;
		}
		
	}

	//������һҳ
	private void initPrevPage() {
		if(cpage<=1){
			prevPage=1;
		}else{
			
			prevPage=cpage-1;
		}
		
	}

	//������ʼλ��
	private void initStartPage() {
		startPage=(cpage-1)*pageSize;
		if(startPage<0){
			startPage=0;
		}
	}


	//2.����cpage(��ǰҳ)
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

	//1.������ҳ��
	private void initTotalPage() {
		totalPage=(count/pageSize);
		if(count%pageSize!=0){
			totalPage++;
		}
		
	}
	
	
	
	
	
	
	
	

}
