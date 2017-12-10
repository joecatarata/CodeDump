public class Algorithm{
    private char[][] grid;
    private int width;
    private int length;
    private int startXpos;
    private int startYpos;
    private char startIcon;

    public Algorithm(int m, int n){
        grid = new char[m][n];
        length = n;
        width = m;
        startXpos = 0;
        startYpos = 0;
        startIcon = 'S';
        System.out.println(length);
        initializeGrid(m,n);
    }
    public void showMenu(){
        System.out.println("MENU");
        System.out.println("[1] Flood Fill");
        //System.out.println("[2] A* Search");
        System.out.println("[0] Exit");
    }
    public void floodFill(int y, int x, char fill){
        //Base Case
        if(grid[y][x] == '*'){
            return;
        }
        //recursive case
        else if(grid[y][x] == '.' || grid[y][x] == 'S'){
        // else{
            System.out.println("");
            showGrid();
            grid[y][x] = fill;
            if(y+1 < length)
               floodFill(y+1,x,fill);
            if(y-1 >= 0)
               floodFill(y-1,x,fill);
            if(x+1 < width)
               floodFill(y,x+1,fill);
            if(x-1 >= 0)
               floodFill(y,x-1,fill);
        }
    }

    public void AStarSearch(){

    }

    public void initializeGrid(int m, int n){
        for(int i=0; i<this.width; i++){
            for(int j=0; j<this.length; j++){
                if(j == width-2){
                    grid[i][j] = '*';
                }
                else{
                    grid[i][j] = '.';
                }
            }
        }

        //Place Start Index
        grid[startYpos][startXpos] = startIcon;
    }

    public void changeStartIcon(char s){
        startIcon = s;
    }
    public void showGrid(){
        for(int i=0; i<this.width; i++){
            for(int j=0; j<this.length; j++){
                System.out.print(grid[i][j]);
            }
            System.out.println("");
        }
    }

    public void changeStartIndex(int y, int x){
        startXpos = x;
        startYpos = y;
    }

    public int getWidth(){
        return width;
    }

    public int getLength(){
        return length;
    }
}
