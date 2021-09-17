package m3103.tp1;

public class Counter {
	
	private int comp;
	private int perm;
	
	
	public void incComp() {
		this.comp++;
	}
	
	public void incComp(int n) {
		this.comp = this.comp + n;
	}
	
	public void incPerm() {
		this.perm++;
	}
	
	public void incPerm(int n) {
		this.perm = this.perm + n;
	}
	
	public String toString() {
		String res = ("\nnombre comparaison : "+this.comp+"\nnombre permutation : "+this.perm+"\n");
		System.out.println(res);
		return res;
	}
	
	public void reset() {
		comp = 0;
		perm = 0;
	}

}
