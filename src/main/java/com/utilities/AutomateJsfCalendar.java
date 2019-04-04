package com.utilities;
import java.util.Calendar;
import org.openqa.selenium.WebElement;

public class AutomateJsfCalendar extends TestBase
{
 /**Months
  * @param args
  */
 static int targetDay     = 0,
            targetMonth   = 0,
            targetYear    = 0;
 
 static int currentDay    = 0,
      currentMonth  = 0,
         currentYear   = 0;
 
 static int jumpMonthsBy  = 0,jumpYearsBy  = 0,
      index         = 0; 

 static boolean increment = true;
 static int JANUARY   = 1,
		  FEBRUARY  = 2,
		  MARCH     = 3,
		  APRIL     = 4,
		  MAY       = 5,
		  JUNE      = 6,
		  JULY      = 7,
		  AUGUST    = 8,
		  SEPTEMBER = 9,
		  OCTOBER   = 10,
		  NOVEMBER  = 11;

static int DECEMBER  = 12;
 
 public static int datePicker(String date, WebElement monthIncrementerxPath, WebElement monthDecrementerxPath, WebElement dayZeroxPath,WebElement yearIncrementerxPath,WebElement yearDecrementerxPath) throws Exception
	{
	 GetTargetDateMonthAndYear(date);
		  GetCurrentDateMonthAndYear();
		  int jumpYearsBy = CalculateHowManyYearsToJump();		  
		  for(int i=0;i<jumpYearsBy;i++)
		  {
		   if(increment)
			   yearIncrementerxPath.click();
		   else
			   yearDecrementerxPath.click();
		   try
		   {
		    //sleep will let you see the automation happening. 
		    Thread.sleep(1000);
		   } catch (InterruptedException e)
		   {
		    e.printStackTrace();
		   }
		  }
		  
		  int jumpMonthsBy = CalculateHowManyMonthsToJump();
		  for(int i=0;i<jumpMonthsBy;i++)
		  {
		   if(increment)
		    monthIncrementerxPath.click();
		   else
		    monthDecrementerxPath.click();
		   try
		   {
		    //sleep will let you see the automation happening. 
		    Thread.sleep(1000);
		   } catch (InterruptedException e)
		   {
		    e.printStackTrace();
		   }
		  }
		  
		  CalculateCorrectDayIndex(dayZeroxPath);
		  
		 return index;
	}
/*
  *This method will bisect the target date and upadates  targetDay, targetMonth & targetYear variables.
  */
 public static void GetTargetDateMonthAndYear(String dateString)
 {
  int firstIndex = dateString.indexOf("/");
  int lastIndex = dateString.lastIndexOf("/");
  
  String month = dateString.substring(0, firstIndex);
  targetMonth = Integer.parseInt(month); 
  
  String day = dateString.substring(firstIndex+1, lastIndex);
  targetDay = Integer.parseInt(day);
  
  String year = dateString.substring(lastIndex+1, dateString.length());
  targetYear = Integer.parseInt(year);
 }
 
 /*
  * This method will fetch current date and updates currentDay, currentMonth & currentYear variables.
  */
 public static void GetCurrentDateMonthAndYear()
 {
  Calendar cal = Calendar.getInstance();
  
  currentDay   = cal.get(Calendar.DAY_OF_MONTH);
  currentMonth = cal.get(Calendar.MONTH)+1;//+1 because month values starts from 0. January = 0.
  currentYear  = cal.get(Calendar.YEAR);
 }
 
 public static int CalculateHowManyYearsToJump()
 {
  if((targetYear - currentYear) > 0 )
  {
   jumpYearsBy = (targetYear - currentYear);
  }
  else
  {
	  jumpYearsBy = (currentYear - targetYear);
   increment = false;
  }
  return jumpYearsBy;
 }
 
 /*
  * This method decides how many time this ">" element on the calendar component needs to be clicked to reach target month.
  */
 public static int CalculateHowManyMonthsToJump()
 {
  if((targetMonth - currentMonth) > 0 )
  {
   jumpMonthsBy = (targetMonth - currentMonth);
   increment = true;
  }
  else
  {
   jumpMonthsBy = (currentMonth - targetMonth);
   increment = false;
  }
  return jumpMonthsBy;
 }

 /*
  * This calculates the current index that holds the targetDay value that we need to click in the calendar control.
  */
 public static void CalculateCorrectDayIndex(WebElement dayZeroxPath)
 {
	 int MAX_DAY_IN_A_MONTH = 31;
  int tempMonth = targetMonth - 1;
  if(tempMonth == 0)
  {
   //if target month is January, control will come inside.
   tempMonth = DECEMBER;
  }
      
  String str = dayZeroxPath.getText();
  int dayValueAtZeroIndex = Integer.parseInt(str);

  if(dayValueAtZeroIndex == 1) 
  {
   index = targetDay - 1;
  }
  else
  {
   switch(tempMonth)
   {
    case 1:
    case 3:
    case 5:
    case 7:
    case 8:
    case 10:
    case 12:
    {
     index = ((MAX_DAY_IN_A_MONTH - dayValueAtZeroIndex) + targetDay);
     break;
    }
    case 2:
    {
     /*
      * Separate case is needed for feb because Feb contains only 28(MAX_DAY_IN_A_MONTH - 3) days.
      */
     index = (((MAX_DAY_IN_A_MONTH - 3) - dayValueAtZeroIndex) + targetDay);
     break;
    }
    default:
    {
     //Control will come here for months that consists of 30(MAX_DAY_IN_A_MONTH - 1) days.
     
     index = (((MAX_DAY_IN_A_MONTH - 1) - dayValueAtZeroIndex) + targetDay);
     break;
    }
   }
  }
 } 
}//end of class.