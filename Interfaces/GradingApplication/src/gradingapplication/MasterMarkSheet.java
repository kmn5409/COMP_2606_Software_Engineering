/*
 *This class holds all of the GradeSlip objects created using a TreeMap.
 */

package gradingapplication;



public class MasterMarkSheet {
    
    //Declare a collection of GradeSlip objects
    
    
    //Constructor
    public MasterMarkSheet(){
        
    }
    
    
   /*  This method creates a new GradeSlip object, populates the object with the
    *  data supplied by the second parameter, and inserts the object into the 
    *  collection of gradeSlips. The tokenised grade slip data
    *  is returned using the tokeniseGradeSlip( ) if successful. Null otherwise.
    */ 
    public String[] createGradeSlip(String studentID, String[] gradeSlipData){
        return null;
    }
    
   /*   This method searches for a GradeSlip  with the given studentID in the
    *   collection of gradeSlips. If found, the tokenised grade slip data
    *   is returned using the tokeniseGradeSlip( ) method in GradeSlip.
    *   Otherwise, null is returned if the object is not found.
    */
    public String[] findGradeSlip(String studentID){
        return null;
    }
    
   /*   This method updates an existing GradeSlip object with the given 
    *   studentID in the collection of gradeSlips. The supplied data is parsed
    *   and the appropriate mutator methods are invoked. The tokenised grade 
    *   slip data is returned using the tokeniseGradeSlip( ) if successful. 
    *   Null otherwise.
    */    
    public String[] updateGradeSlip(String studentID, String[] gradeSlipData){
       return null;
    }
    
   /*   This method removes an existing GradeSlip object with the given 
    *   studentID in the collection of gradeSlips. If successful, true is 
    *   returned, false otherwise. 
    */     
    public boolean deleteGradeSlip(String studentID){
        return false;
    }

    
   /*   This method returns a String containing the studentID, scores and grades
    *   for all of the GradeSlip objects in the gradeSlips collection. Null is 
    *   returned if the collection is empty
    */    
     public String getAllGradesAndScores(){
        return null;
    }
}
