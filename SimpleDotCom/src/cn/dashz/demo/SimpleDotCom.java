package cn.dashz.demo;

public class SimpleDotCom {
    int[] locatonCells;
    int numOfHits = 0;

    public void setLocatonCells(int[] locs){
        locatonCells = locs;
    }

    public String checkYourself(String stringGuess){
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";
        for (int cell : locatonCells){
            if (guess == cell){
                result = "hit";
                numOfHits ++;
                break;
            }
        }

        if (numOfHits == locatonCells.length){
            result = "kill";
        }

        System.out.println(result);
        return result;
    }
}
