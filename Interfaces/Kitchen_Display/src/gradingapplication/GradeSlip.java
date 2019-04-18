/*
 * This class models a grade slip for an assignment with 3 questions.
 */
package gradingapplication;

/**
 *
 * @author phaedramohammed
 */
public class GradeSlip {
    
   private final String studentID;
   private boolean submittedOnTime;
   private final double[] scores;
   private boolean plagiarismFormSubmitted;
   private double assignmentScore;
   private final double maximumAssignmentScore = 30;
   private String grade;
   private String comments;


   public GradeSlip(String studentID){
       this.studentID = studentID;
       scores = new double[3];
       grade = "";
       comments = "";
   }
   public String getStudentID(){
       return studentID;
   }
   public boolean getSubmittedOnTime(){
       return submittedOnTime;
   }
   public boolean getPlagiarismFormSubmitted(){
       return plagiarismFormSubmitted;
   }
   public double getQuestion1Score(){
       return scores[0];
   }
   public double getQuestion2Score(){
       return scores[1];
   }
   public double getQuestion3Score(){
       return scores[2];
   }
   public double[] getAllScores(){
       return scores;
   }
   public double getTotalScore(){
       return scores[0] + scores[1] + scores[2];
   }
   public String getGrade(){
       calculateGrade();
       return grade;
   }
   public String getComments(){
       return comments;
   }
   
  /*    Returns an array (size 9), containing all of the data for a GradeSlip
   *    in the order displayed on the GradingGUI
   */
   
   public String[] tokeniseGradeSlip(){
       return new String[]{
            getStudentID(),
            getSubmittedOnTime()+"",
            getQuestion1Score()+"",
            getQuestion2Score()+"",
            getQuestion3Score()+"",
            getPlagiarismFormSubmitted()+"",
            getTotalScore() + "",
            getGrade(),
            getComments()
       };
   }
   
  
   //Accessors
   public void setSubmittedOnTime(boolean onTime){
       submittedOnTime = onTime;
   }
    public void setPlagiarismFormSubmitted(boolean formSubmitted){
       plagiarismFormSubmitted = formSubmitted;
   }
   
   //Only 3 question scores are recorded by a GradeSlip object
   public void setQuestionScore(int questionNumber, double score){
       if(questionNumber >=1 && questionNumber <3)
           scores[questionNumber] = score;
   }
   //This method allows all 3 question scores to recorded at once
   public void setAllQuestionScores(double score1, double score2, double score3){
       scores[0] = score1;
       scores[1] = score2;
       scores[2] = score3;  
   }
   
   // To be filled out!
   public void calculateGrade(){
       
       
   }
   public void setComments(String newComments){
       comments = newComments;
   }
   
   public String toString(){
       return getStudentID() + "    " + getTotalScore();
   }
  
  
  
}
