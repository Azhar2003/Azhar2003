
package prog_poe;

import javax.swing.JOptionPane;

public class PROG_POE {

    boolean checkTaskDescription(String taskDescription)
    {
        if (taskDescription.length() <=50)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public String createTaskID(String taskName, int taskNumber, String developerName)
    {
        String taskID = taskName.substring(0,2) + ":" + Integer.toString(taskNumber) + ":" + developerName.substring(developerName.length() -3);
        
        return taskID.toUpperCase();
    }
    public String printTaskDetails(String taskName, int taskNumber, String taskDescription, String devFirstName, String devLastName, int taskDuration, String taskID, String taskStatus)
    {
        String printValue = taskName + "" + Integer.toString(taskNumber) + "" + taskDescription + "" + devFirstName + "" + devLastName + "" + Integer.toString(taskDuration) + "" + taskID + "" + taskStatus;
        
        return printValue;
    }
    public int returnTotalHours (int numTasks, int enteredHours)
    {
        int totalHours = 0;
                for (int i=0; i< numTasks; i++)
                {
                    totalHours += enteredHours;
                }
                
                return totalHours;
    }
    public int addSlackTime (int numTasks, int duration, int slackTime)
    {
        int totalTimeWithSlack = 0;
        
        for (int i = 1; i < numTasks; i++)
        {
            slackTime += slackTime;
            totalTimeWithSlack = slackTime + duration;
            
            JOptionPane.showMessageDialog(null, "slack currently is");
        }
        return totalTimeWithSlack;
    }
    public String[]
            populateDeveloperArray()
            {
                String[] developers = new String[]
                {
                    "Mike Smith" , "Edward Harrington" , "Samantha Paulson" , "Glenda Oberholzer"
                };
                return developers ;
                
            }
            public String[]
                    populateTaskNameArray()
                    {
                        String[] TaskName = new String[]
                        {
                            "Create Login" , "Create Add Features" , "Create Reports" , "Create Arrays"
                        };
                        
                        return TaskName;
                    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
