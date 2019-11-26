package homework.hw2;

public class Fill {
    public  void fillArray(String array [] []){
        for (int i = 0;i < array.length ;i++){

            for (int j = 0;j < array.length ;j++){
                if (i ==0){
                    array[i][j] =   j + "|";
                }else if (j == 0) {
                    array[i][j] =   i + "|";
                }
                else {
                    array[i][j] = "-|";
                }
            }

        }
    }

}
