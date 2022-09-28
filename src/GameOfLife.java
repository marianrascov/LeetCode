public class GameOfLife {
    // Functie pentrua verifica daca (x, y) se afla in matrice
    boolean check(int x, int y, int n, int m) {
        return (x >= 0 && x < n) && (y >= 0 && y < m);
    }

    public void gameOfLife(int[][] board) {
        // vectori de directie
        int dx[] = {-1, 0, 1, 1, 1, 0, -1, -1};
        int dy[] = {-1, -1, -1, 0, 1, 1, 1, 0};
        // daca matricea e goala nu facem nimic
        if (board.length == 0)
            return;

        // calculam dimensiunile matricii
        int n = board.length; // numarul de linii
        int m = board[0].length; // numarul de coloane

        // alocam o matrice auxiliara
        int[][] aux = new int[n][m];

        // iteram prin matrice
        for (int i = 0; i < n; ++i)
            for (int j = 0; j < m; ++j) {
                int count = 0;
                for (int k = 0; k < 8; ++k) {
                    //calculam pozitia vecinului
                    int x = i + dx[k];
                    int y = j + dy[k];
                    // daca pozitia e in matrice si vecinul e 1, numaram
                    if (check(x, y, n, m) && board[x][y] == 1)
                        ++count;
                }

                // decidem care va fi starea viitoare a unei casute.
                if (board[i][j] == 0) {
                    if (count == 3) aux[i][j] = 1;
                    else aux[i][j] = 0;
                } else { // board[i][j] == 1
                    if (count < 2) aux[i][j] = 0;
                    else if (count > 3) aux[i][j] = 0;
                    else aux[i][j] = 1;
                }
            }

        // copiem datele din matricea auxiliara in tabla
        for (int i = 0; i < n; ++i)
            for (int j = 0; j < m; ++j) {
                board[i][j] = aux[i][j];
            }
    }
}
