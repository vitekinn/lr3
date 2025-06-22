package com.example.lrk3;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//1 зад
        /*    int[][][] nums = new int[3][2][3];
        for (int i = 1; i <= nums.length; i++){//выводит количетсво строк
            for (int j = 1; j <= nums[1].length; j++){ //nums[1].length выводит количетсво солбцов в строке
                for (int k = 1; k <= nums[1][1].length; k++){//выводит глубину в строке и столбце

                    System.out.println(i*j*k);
                }
            }
        }
       System.out.println(nums.length*nums[1].length*nums.length);*/
        //2 задание
     /*   int[][] nums =
                {
                        {1, 2},
                        {3, 4},
                        {5, 6}
                };

        System.out.println(nums[3][2]);*///выведет ошибку

        //3 задание
       /* int[][] nums2 = new int[][]
                {
                        {1, 2},
                        {3,4, 5},
                        {6,7, 8, 9,10}
                };
        for (int i = 0; i < nums2.length; i++)
        {
            for(int j=0; j < nums2[i].length; j++)
            {
                System.out.printf(String.valueOf(nums2[i][j]));//3 способа как вывести число
                System.out.printf("" + nums2[i][j]);
                System.out.println(nums2[i][j]);
            }

        }*/
       /* int[][] nums2 = new int[][]
        {
                { 1, 2, 3},
                { 3, 4, 5},
                { 6, 7, 8}
        };

        System.out.println(nums2[2][1]);//выведит 7
*/




    }
}
