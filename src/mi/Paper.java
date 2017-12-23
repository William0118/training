package mi;

import java.util.ArrayList;
import java.util.List;

public class Paper<T> {
	private Integer pageNum;
	private Integer itmNum;
	private List<T> datas;
	Paper(){
		this.itmNum=2;
		datas = new ArrayList<>();
	}
	public Integer getPageNum() {
		return pageNum;
	}
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}
	public Integer getItmNum() {
		return itmNum;
	}
	public void setItmNum(Integer itmNum) {
		this.itmNum = itmNum;
	}
	public List<T> getData() {
		return datas;
	}
	public void setData(List<T> data) {
		this.datas = data;
	}
	
	public void browsePage(Integer pageNum , List<T> bplist ){
		Integer count=1;
		for(int i=(pageNum-1)*2;count<= itmNum && i<bplist.size();i++){
			T modle = (T) bplist.get(i);
			this.datas.add(modle);
			count++;
		}
	}
}
