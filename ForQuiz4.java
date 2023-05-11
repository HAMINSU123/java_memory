package com.green.java.ch04;

public class ForQuiz4 {
    public static void main(String[] args) {
        int star = 5;
//        for(int i = 1; i <= star; i++){
//            for(int k =0; k<star-i; k++)
//                System.out.print(" ");
//
//            for(int z =0; z<i; z++ ){
//                System.out.print("*");
//            }
//            if(i!=star)System.out.println();
//        }

//        for(int i=1; i<=star; i++){
//            for(int k =0; k<star-i; k++) {
//                System.out.print(" ");
//            }
//                for(int z =0; z<i*2-1; z++){
//                    System.out.print("*");
//                }
//               System.out.println();
//            }
//        for(int i = star-1; i > 0; i--){
//            for(int k = 1; k <= star-i; k++) {
//                System.out.print(" ");
//            }
//            for(int z = 0; z < i*2-1; z++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        for(int i= star; i > 0; i--){
            for(int z = 1; z <= star; z++){
                if(z < i) {
                    System.out.println(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
//
//        for(int i =0 ; i<= star; i--){
//            for(int k =0; k <= star-i; k++) {
//                if(k <= i){
//                    System.out.print(" ");
//                }else{
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }
//        for(int i =0 ; i<= star; i++){
//            for(int k =0; k <= star-i; k++) {
//                if(k <= i){
//                    System.out.print(" ");
//                }else{
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }
    }
}

