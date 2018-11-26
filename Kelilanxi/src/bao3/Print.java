package bao3;

public class Print {
	
	InkBox inkBox;
	Paper paper;
	
	
	public InkBox getInkBox() {
		return inkBox;
	}
	public void setInkBox(InkBox inkBox) {
		this.inkBox = inkBox;
	}
	public Paper getPaper() {
		return paper;
	}
	public void setPaper(Paper paper) {
		this.paper = paper;
	}
	
	
	public void show(){
		System.out.println("您正在使用"+inkBox.getColor()+"的墨盒在"+paper.getSize()+"纸张上打印内容");
	}

}
