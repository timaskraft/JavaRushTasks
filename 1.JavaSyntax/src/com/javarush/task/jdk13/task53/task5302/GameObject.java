package com.javarush.task.jdk13.task53.task5302;

public class GameObject
{
        public int x;
        public int y;
        public boolean isMine;
        public int countMineNeighbors;
        public boolean isOpen;
        public boolean isFlag;

        GameObject(int x,int y,boolean isMine)
        {
            this.x = x;
            this.y = y;
            this.isMine = isMine;
            this.isOpen = false;
            this.isFlag = false;
        }

}
