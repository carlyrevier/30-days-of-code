package day12;

public class Student extends Person{
	private int[] testScores;

    public Student(String firstName, String lastName, int id, int[] scores){
        super(firstName, lastName, id);
        this.testScores = scores;
    }

    public char calculate(){
        int sum = 0;
        for (int i = 0; i < testScores.length; i++){
            sum = sum + testScores[i];
        }
        int score = sum/testScores.length;
        if (score >= 90 && score <= 100){
            return 'O';
        } else if (score >= 80 && score < 90){
              return 'E';
        } else if (score >= 70 && score < 80){
              return 'A';
        } else if (score >= 55 && score < 70){
              return 'P';
        } else if (score >= 40 && score < 55){
              return 'D';
        } else if (score >= 0 && score < 40){
              return 'T';
        }
        else return 0;
    }
}
