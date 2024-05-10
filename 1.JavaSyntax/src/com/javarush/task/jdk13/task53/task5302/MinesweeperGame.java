package com.javarush.task.jdk13.task53.task5302;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinesweeperGame extends Game {
    private static final int SIDE = 9;
    private GameObject[][] gameField = new GameObject[SIDE][SIDE];
    private int countClosedTiles = SIDE * SIDE;
    private int countMinesOnField;
    private static final String MINE = "\uD83D\uDCA3";
    private static final String FLAG = "\uD83D\uDEA9";
    private int countFlags;
    private boolean isGameStopped = false;
    private int score = 0;

    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
    }

    private void createGame() {

       

        for (int y = 0; y < SIDE; y++) {
            for (int x = 0; x < SIDE; x++) {
                gameField[y][x] = null;
                setCellValue(x, y,"");
                boolean isMine = getRandomNumber(10) < 1;
                if (isMine) {
                    countMinesOnField++;
                }
                gameField[y][x] = new GameObject(x, y, isMine);
                setCellColor(x, y, Color.ORANGE);
            }
        }
        countFlags = countMinesOnField;

        countMineNeighbors();
    }

    private void countMineNeighbors(){
        for (int y = 0; y < SIDE; y++) {
            for (int x = 0; x < SIDE; x++) {
                if (!gameField[y][x].isMine)
                {
                    ArrayList<GameObject> list = new ArrayList<>(getNeighbors(gameField[y][x]));
                    for (GameObject  obj: list) {
                        if (obj.isMine) {
                            gameField[y][x].countMineNeighbors++;
                        }
                    }
                }
            }
        }
    }


    private List<GameObject> getNeighbors(GameObject gameObject) {
        List<GameObject> result = new ArrayList<>();
        for (int y = gameObject.y - 1; y <= gameObject.y + 1; y++) {
            for (int x = gameObject.x - 1; x <= gameObject.x + 1; x++) {
                if (y < 0 || y >= SIDE) {
                    continue;
                }
                if (x < 0 || x >= SIDE) {
                    continue;
                }
                if (gameField[y][x] == gameObject) {
                    continue;
                }
                result.add(gameField[y][x]);
            }
        }
        return result;
    }



    private void openTile(int x, int y)
    {
        if (isGameStopped) {return;}
        if (gameField[y][x].isFlag) {return;}
        if (!gameField[y][x].isOpen) {
            setCellColor(x, y, Color.GREEN);
            gameField[y][x].isOpen = true;

            countClosedTiles--;

            if (gameField[y][x].isMine) {

                setCellValueEx(x, y, Color.RED, MINE);
                gameOver();

            } else {

                setScore(score+=5);

                if (countClosedTiles==countMinesOnField) {
                    win();
                }

                if (gameField[y][x].countMineNeighbors == 0) {
                    for (GameObject gameObject : getNeighbors(gameField[y][x])) {
                        if (!gameObject.isOpen) {
                            openTile(gameObject.x, gameObject.y);
                        }

                    }
                    setCellValue(x, y, "");

                } else {
                    setCellNumber(x, y, gameField[y][x].countMineNeighbors);
                }
            }

        }
    }

    private void markTile(int x, int y)
    {
        if (isGameStopped) {return;}

        if (!gameField[y][x].isOpen)
        {

            if(!gameField[y][x].isFlag) {
                if (countFlags > 0) {
                    countFlags--;
                    gameField[y][x].isFlag = true;
                    setCellValue(x, y, FLAG);
                    setCellColor(x, y, Color.YELLOW);
                }
            }else
            {
                countFlags++;
                gameField[y][x].isFlag = false;
                setCellValue(x, y, "");
                setCellColor(x, y, Color.ORANGE);

            }
        }
    }
    private void gameOver()
    {
        isGameStopped=true;
        showMessageDialog(Color.WHITE,"GAME OVER",Color.BLACK,60);
    }
    private void win()
    {
        isGameStopped = true;
        showMessageDialog(Color.WHITE,"YOU WIN!!!",Color.BLUE,60);
    }

    private void restart()
    {

        isGameStopped = false;
        countClosedTiles = SIDE * SIDE;
        score =0;
        countMinesOnField =0;
        setScore(score);
        createGame();

    }

    @Override
    public void onMouseLeftClick(int x,int y)
    {
        if (isGameStopped)
        {
            restart();
            return;
        }

        openTile(x,y);
    }
    @Override
    public void onMouseRightClick(int x,int y)
    {
        markTile(x,y);
    }
}