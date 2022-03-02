import java.util.Scanner;  //including the scanner class to get the data from user
class Vicky{
	public static void main(String[] args)
	{
		boolean valid;	//check if user enter int or something else
		 
		System.out.println("Hello Welcome! Im Vicky The Frog");
		int totalDistance;
		int loginCount=3;//number of tries user get to enter the input
		/*Repeat the below code until u receive a correct integer value or just time out after 3 tires*/
		do 
		{
			 
			try
			{
				
				Scanner inputObj = new Scanner(System.in);
				System.out.println("Please do enter the total distance in Meters i should jump :) ");
				totalDistance = inputObj.nextInt();
				System.out.println("Total Distance Vikiy The Frog Should Jump is :"  +totalDistance +" M");
				valid=false;


				int totalTime=0;
				if(totalDistance==0)
				{

					System.out.println("Ops the Poor Frog has no more distance to jump");
				}
				 
				 

				while(totalDistance > 0)
				{
					 
					totalDistance =totalDistance - 5;
					totalTime=totalTime+1;
					if(totalDistance > 0)
					{
						totalDistance =totalDistance - 3;
						totalTime=totalTime+2;
					}
						if(totalDistance > 0)
					{
						totalDistance =totalDistance - 1;
						totalTime=totalTime+3;
					}
						
				}
				System.out.println("The total time taken for the frog to jump the distance " + totalTime + " Seconds");

			 
				
			}
			catch(Exception e)
			{	 
				System.out.println("Ops Sorry we accept only integer values Try again!");
				System.out.println("You have " +loginCount +" Chances before application dies");
				loginCount=loginCount-1;
				valid=true;	
				if(loginCount<=0)
				{
					System.out.println("Ops You have reached the limit please do start the application again");
					System.exit(-1);
				}	
			}
		}
		while(valid);

		 
		
	}

}



