package bao3;

public class TestPrint {
	


	public static void main(String[] args) {
		
		InkBox inkBox =new Color();
		Paper paper=new A4();
		
		Print p=new Print();
		
		p.setInkBox(inkBox);
		p.setPaper(paper);
		p.show();
		
	}

}
