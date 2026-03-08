package PLA;

public class ALICE_APPLE_TREE {
    static int alice_apple_tree(int M, int K, int N, int S, int W, int E){
        if(M <= S*K){
            return M;
        }
        if(M <= S*K + W + E){
            return M;
        }
        return -1;
    }
    public static void main(String[] args) {
        int M = 10;
        int K = 15;
        int N = 0;
        int S = 1;
        int W = 0;
        int E = 0;

        System.out.print(alice_apple_tree(M, K, N, S, W, E));
    }
}
