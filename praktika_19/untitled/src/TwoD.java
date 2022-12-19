import java.util.Arrays;

class TwoD<T extends Number>  {
    public static void MAtrix(){
        Number ti=9.8;
       System.out.println(ti);
        Number[][] myArray = {{18.8,28,18.1f},{28,45,90.7},{45,3,14}};
        Number[][] myArray1 = {{2.8,20,18.1f},{28,5,90.7},{4,3,14}};
        System.out.println("Первый массив\n"+Arrays.deepToString(myArray));
        System.out.println("Второй массив\n"+Arrays.deepToString(myArray1));
        for(int i=0;i< myArray.length;i++){
            for(int j=0;j< myArray.length;j++){
                myArray[i][j]=myArray1[i][j].doubleValue()+myArray[i][j].doubleValue();

            }
        }
        System.out.println("Сложение:\n"+Arrays.deepToString(myArray));

        for(int i=0;i< myArray.length;i++){
            for(int j=0;j< myArray.length;j++){
                myArray[i][j]=myArray1[i][j].doubleValue()-myArray[i][j].doubleValue();

            }
        }
        System.out.println("Вычитание:\n"+Arrays.deepToString(myArray));

        for(int i=0;i< myArray.length;i++){
            for(int j=0;j< myArray.length;j++){
                myArray[i][j]=myArray1[i][j].doubleValue()*myArray[i][j].doubleValue();
            }
        }
        System.out.println("Умножение:\n"+Arrays.deepToString(myArray));

        for(int i=0;i< myArray.length;i++){
            for(int j=0;j< myArray.length;j++){
                myArray[i][j]=myArray1[i][j].doubleValue()/myArray[i][j].doubleValue();
            }
        }
        System.out.println("Деление:\n"+Arrays.deepToString(myArray));

    }
    public static void main(String args[])  {
        TwoD.MAtrix();
    }
}