/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_07_01_2019_chapter8;

/**
 *
 * @author User
 */
public class Page294_GradingAMultipleChoiceTest {
    public static void main(String[] args) {
  
        //Students' answers to the questions
        char[][] answers = {
            {'A','B','A','C','C','D','E','E','A','D'},
            {'A','B','A','C','C','D','E','E','A','D'},
            {'A','B','A','C','C','D','E','E','A','D'},
            {'A','B','A','C','C','D','E','E','A','D'},
            {'A','B','A','C','C','D','E','E','A','D'},
            {'A','B','A','C','C','D','E','E','A','D'},
            {'A','B','A','C','C','D','E','E','A','D'},
            {'A','B','A','C','C','D','E','E','A','D'}
            
        };
        
        //Key to the questions
        char[] keys = {'A','B','A','C','C','D','E','E','A','D'};
        
        //Grade all anwers
        for (int i = 0; i < answers.length; i++) {
            //Grade one student
           
           int correctCount = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j]) {
                correctCount++;      
                }
                
            }
            
           System.out.println("Student "+ i + "'s correct count is: "+ correctCount); 
        }
    }
 
}
