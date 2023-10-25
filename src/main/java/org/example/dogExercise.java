package org.example;

public class dogExercise {
    public static int dogEvaluation(int[][] dogInfo){

        if(dogInfo != null){
            for(int i = 0; i < dogInfo.length; i++){
                for(int j = 0; j < 2; j++){

                    if (dogInfo[i][j] < 0){
                        break;
                    }

                    if(dogInfo[i][0] <= 10){
                        if (dogInfo[i][1] == 100){
                            return 0;
                        }
                        if (dogInfo[i][1] > 100){
                            return 1;
                        }
                        return -1;
                    }

                    if(dogInfo[i][0] <= 25){
                        if (dogInfo[i][1] == 250){
                            return 0;
                        }
                        if (dogInfo[i][1] > 250){
                            return 1;
                        }
                        return -1;
                    }

                    if(dogInfo[i][0] <= 45){
                        if (dogInfo[i][1] == 300){
                            return 0;
                        }
                        if (dogInfo[i][1] > 300){
                            return 1;
                        }
                        return -1;
                    }

                    if(dogInfo[i][1] == 500){
                        return 0;
                    }
                    if (dogInfo[i][1] > 500){
                        return 1;
                    }
                    return -1;

                }
            }
        }
        return -3;



    }

}
