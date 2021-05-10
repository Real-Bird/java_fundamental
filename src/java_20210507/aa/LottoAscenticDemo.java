package java_20210507.aa;

public class LottoAscenticDemo extends Ascending {

	public static void main(String[] args) {
		Lotto l = new Lotto();
		Ascending asc = new Ascending();
		
		asc.ascending(l.lottery());
		asc.ascending(l.lottery());
		asc.ascending(l.lottery());
		asc.ascending(l.lottery());
		asc.ascending(l.lottery());
		
	}
}
