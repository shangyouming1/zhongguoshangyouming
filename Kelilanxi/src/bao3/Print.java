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
		System.out.println("������ʹ��"+inkBox.getColor()+"��ī����"+paper.getSize()+"ֽ���ϴ�ӡ����");
	}

}
