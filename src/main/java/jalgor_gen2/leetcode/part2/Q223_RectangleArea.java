package jalgor_gen2.leetcode.part2;

public class Q223_RectangleArea {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        
	int x1 = Math.max(A, E), y1 = Math.max(B, F);
	int x2 = Math.max(x1, Math.min(C, G)), y2 = Math.max(y1, Math.min(D, H));
	int area1 = (C - A) * (D - B), area2 = (G - E) * (H - F);
	return area1 - (x2 - x1) * (y2 - y1) + area2;
    }
}
