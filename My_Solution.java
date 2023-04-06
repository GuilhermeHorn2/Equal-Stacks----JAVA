package misc;


public class main_misc2 {
	public static void main(String[] args) {
		// 
	
	int[]a = {3, 2, 1, 1, 1};
	int[]b = {4, 3, 2};
	int[]c = {1, 1, 4, 1};
	System.out.println(equal_h(a,b,c));
	
	}
	private static int[] acumulate(int[]v) {
		for(int i = v.length-1;i >= 0;i--) {
			if(i == v.length-1) {
				continue;
			}
			v[i] = v[i] + v[i+1];
		}
		return v;
	}
	
	private static int equal_h(int[]a,int[]b,int[]c) {
		//
		a = acumulate(a);
		b = acumulate(b);
		c = acumulate(c);
		
		/*Finding max height*/
		
		int max = a[0];
		if(max < b[0]) {
			max = b[0];
		}
		if(max < c[0]) {
			max = c[0];
		}
		
		/**/
		int []v = new int[max];
		
		for(int i = 0;i < a.length;i++) {
			v[a[i]-1]++;
		}
		for(int i = 0;i < b.length;i++) {
			v[b[i]-1]++;
		}
		for(int i = 0;i < c.length;i++) {
			v[c[i]-1]++;
		}
		
		int k = -1;
		for(int i = 0;i < v.length;i++) {
			if(v[i] == 3) {
				k = i+1;
				break;
			}
		}
		return k;
	}
	
	
	
	
	
	}
	
	
