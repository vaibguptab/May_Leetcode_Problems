package may;

public class May_10 {
    public static void main(String[] args) {
        int n = 4;
        int[][] ans = spiralMatrix2(n);
        for (int[] e:ans){
            for (int ele:e){
                System.out.print(e+" ");
            }
            System.out.println();
        }
    }

    private static int[][] spiralMatrix2(int n) {
        int[][] ans = new int[n][n];
        int cnt = 1;
        for (int layer =0; layer<(n+1)/2; layer++){
            for (int p =layer ; p < n - layer ;p++){
                ans[layer][p] = cnt++;
            }

            for (int p = layer + 1; p < n - layer; p++) {
                ans[p][n - layer - 1] = cnt++;
            }

            for (int p = layer + 1; p < n - layer; p++) {
                ans[n - layer - 1][n-p-1] = cnt++;
            }

            for (int p = layer + 1; p < n - layer-1; p++) {
                ans[n - p - 1][layer] = cnt++;
            }
        }

        return ans;
    }
}
