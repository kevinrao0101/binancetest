
public class AreaExplorer {
	
	public static void main(String[] args) {
		AreaExplorer ae = new AreaExplorer();
		int[][] map = new int[100][100];
		System.out.println(ae.checkAccess(map, map.length, map[0].length, 0, 0, 21, 0));
	}

	public int checkAccess(int[][] map, int rows, int cols, int m, int n, int k, int res) {
		if(m < 0 || m >= rows || n < 0 || n >= cols || isMine(m, n) > k || map[m][n] == 1)
			return res;
		map[m][n] = 1;
		res++;
		
		res = checkAccess(map, rows, cols, m + 1, n, k, res);
		res = checkAccess(map, rows, cols, m, n + 1, k, res);
		
		return res;
	}
	
	public int isMine(int m, int n) {
		int res = 0;
        while(m > 0){
            res += m % 10;
            m = m / 10;
        }
        while(n > 0){
            res += n % 10;
            n = n / 10;
        }

        return res;
	}
	
	
}
