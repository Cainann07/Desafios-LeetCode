package RichestCustomerWealth;

/* Você tem uma matriz de inteiros m x n accounts onde accounts[i][j] é o montante de dinheiro do [i]cliente do [j]banco.
Retorne a riqueza que o cliente mais rico possui.

A riqueza de um cliente é determinado pela quantia somada de todas as suas contas bancárias. O cliente mais rico é o que tem a maior riqueza.
 */
public class Principal {
    public static int maximumWealth(int [][] accounts){
        int maiorRiqueza = 0;
        for (int i = 0; i < accounts.length; i++) {
            int somaRiqueza = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                somaRiqueza += accounts[i][j];
            }
            if (maiorRiqueza < somaRiqueza) maiorRiqueza = somaRiqueza;
        }
        return maiorRiqueza;
    }

    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
        System.out.println(maximumWealth(accounts));
    }
}
