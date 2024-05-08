package com.javarush.task.jdk13.task53.task5301;

import com.javarush.engine.cell.*;

public class Game2048 extends Game {


    private static final int SIDE = 4;
    private int[][] gameField = new int[SIDE][SIDE];
    private boolean isGameStopped;
    private int score = 0;

    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
        drawScene();
    }

    private void createGame(){
        score =0;
        setScore(score);

        for(int i=0;i<SIDE;i++)
        {
            for(int j=0;j<SIDE;j++) gameField[i][j]=0;
        }
        createNewNumber();
        createNewNumber();
    }

    private void drawScene()
    {
        for (int y = 0; y < gameField.length; y++) {
            for (int x = 0; x < gameField[y].length; x++) {

                setCellColoredNumber(x,y,gameField[y][x]);
            }


        }
    }

    private boolean canUserMove()
    {
       /*
        gameField= new int[][]{{64,  16,  8, 4},
                               {32,  4, 16, 32},
                               {128, 8,  2, 4},
                               {256, 32, 8, 512}};
*/
        for(int x=0;x<SIDE;x++)
            for(int y=0;y<SIDE;y++)
            {
                if (gameField[y][x]==0) return true;
            }

        for(int x=0;x<SIDE-1;x++) {
            for (int y = 0; y < SIDE - 1; y++) {
                if (gameField[y][x] == gameField[y + 1][x]) return true;
                else if (gameField[y][x] == gameField[y][x+1]) return true;
            }

            if (gameField[SIDE-1][x]==gameField[SIDE-1][x+1]) return true;
            if (gameField[x][SIDE-1]==gameField[x+1][SIDE-1]) return true;

        }


        return false;

    }

    private void  win()
    {
        isGameStopped= true;
        showMessageDialog(Color.BLUE, "YOU WIN!", Color.WHITE, 75);
    }

    private void gameOver()
    {
        isGameStopped= true;
        showMessageDialog(Color.BLUE, "YOU LOSE!", Color.DARKRED, 75);

    }

    private int getMaxTileValue()
    {
        int max = gameField[0][0];
        for(int x=0;x<SIDE;x++)
            for(int y=0;y<SIDE;y++)
            {
                if (gameField[y][x]>max) max=gameField[y][x];
            }
        return max;
    }




    private void createNewNumber()
    {
        if (getMaxTileValue()==2048)
        {
            win();
            return;
        }


        while(true)
        {
            int x = getRandomNumber(SIDE);
            int y = getRandomNumber(SIDE);
            if (gameField[y][x]==0)
            {
                gameField[y][x] = getRandomNumber(10)==9 ? 4 : 2;
                break;
            }
        }
    }

    private void setCellColoredNumber(int x, int y, int value) {
        Color color = getColorByValue(value);
        String str = value > 0 ? "" + value : "";
        setCellValueEx(x, y, color, str);

        //setCellValueEx(y, x,getColorByValue(value) , value==0?"":String.valueOf(value) );
    }
    private Color getColorByValue(int value)
    {

        return switch (value){
            case 2 -> Color.PINK;
            case 4 -> Color.PURPLE;
            case 8 -> Color.BLUE;
            case 16 -> Color.AQUA;
            case 32 -> Color.GREEN;
            case 64 -> Color.LIGHTGREEN;
            case 128 -> Color.ORANGE;
            case 256 -> Color.DEEPPINK;
            case 512 -> Color.ORANGERED;
            case 1024-> Color.BROWN;
            case 2048-> Color.GOLDENROD;
           default -> Color.WHITE;
        };
    }

    private boolean compressRow(int[] row)
    {
        int insertPosition = 0;
        boolean result = false;
        for (int x = 0; x < SIDE; x++) {
            if (row[x] > 0) {
                if (x != insertPosition) {
                    row[insertPosition] = row[x];
                    row[x] = 0;
                    result = true;
                }
                insertPosition++;
            }
        }
        return result;
    }

    private boolean mergeRow(int[] row)
    {
        boolean res=false;
        for(int i=0;i<SIDE-1;i++)
        {

            if(row[i]== row[i+1] && row[i]!=0)
            {

                row[i] = row[i]+row[i+1];
                row[i+1] = 0;
                score+=row[i];
                setScore(score);
                res = true;
            }
        }

        return res;
    }

    @Override
    public void setScore(int score) {
        super.setScore(score);
        showMessageDialog(Color.WHITE, "", Color.WHITE, 1);
    }

    private void moveLeft()
    {
        boolean check=false;
        for(int i=0;i<SIDE;i++)
        {

            if (compressRow(gameField[i])) check = true;
            if (mergeRow(gameField[i])) check=true;
            if (compressRow(gameField[i])) check = true;


        }
        if (check)  createNewNumber();
    }

    private void moveRight()
    {
        rotateClockwise();
        rotateClockwise();
        moveLeft();
        rotateClockwise();
        rotateClockwise();

    }
    private void moveUp()
    {
        rotateClockwise();
        rotateClockwise();
        rotateClockwise();
        moveLeft();
        rotateClockwise();

    }
    private void moveDown()
    {
        rotateClockwise();
        moveLeft();
        rotateClockwise();
        rotateClockwise();
        rotateClockwise();
    }

    private void rotateClockwise()
    {
        int n = SIDE;
        int[][] newField =  new int[n][n];
        for (int i = 0; i < n/2; i++) {
            for (int j = i; j < n-i-1; j++) {
                int tmp = gameField[i][j];
                newField[i][j]=gameField[n-j-1][i];
                newField[n-j-1][i]=gameField[n-i-1][n-j-1];
                newField[n-i-1][n-j-1]=gameField[j][n-i-1];
                newField[j][n-i-1]=tmp;

            }
        }
        gameField = newField;

    }

    @Override
    public void onKeyPress(Key key)
    {

        if (isGameStopped) {
            if (key ==Key.SPACE) {
                isGameStopped=false;
                createGame();
                drawScene();
            }

            return;
        }

        if(!canUserMove())
        {
            gameOver();
            return;
        }

        if (key == Key.LEFT) {
// выполнить движение влево
            moveLeft();
            drawScene();
        } else if (key == Key.RIGHT) {
// выполнить движение вправо
            moveRight();
            drawScene();
        } else if (key == Key.UP) {
            moveUp();
            drawScene();
        } else if (key == Key.DOWN) {
            moveDown();
            drawScene();
        }

    }

}
