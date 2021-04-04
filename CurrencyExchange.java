
package googol99;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class CurrencyExchange extends GOOGOL99GUI {
    String txt = null ;
    //
    //
  
    public String moneyExchangeList () {    
      
          try{
              Scanner countrylist = new Scanner(new FileInputStream("C:\\Users\\USER\\Downloads\\CountryList.txt"));
              while(countrylist.hasNextLine()){
                  //System.out.println(countrylist.nextLine());
                  txt += countrylist.nextLine();
                  txt += "\n";
              } 
              countrylist.close();
          }
          catch(FileNotFoundException e){
              System.out.println("File not found");
          }
          //jTextArea1.setText(txt);
          //System.out.println(txt);
          return txt;
}
    public String changeMoney(String user){
          String wakaka = "";
          System.out.print("\n");
          String same = "myr";
          Scanner money = new Scanner(System.in);
          String[] arrWord = user.split(" ",5);
          double amountBefore = Double.parseDouble(arrWord[1]);
          String fromCountry = arrWord[2];
          
          
          String toCountry = arrWord[4];
  
    
        if(fromCountry.equalsIgnoreCase(same)||toCountry.equalsIgnoreCase(same)){
            
            double amountAfter = convert(amountBefore,fromCountry,toCountry);
            if(amountAfter!=0){
                wakaka += toCountry.toUpperCase() + " ";
                wakaka += amountAfter;
                System.out.print(toCountry.toUpperCase() + " ");
                System.out.printf("%.2f",amountAfter);
            }
            else{
                System.out.print("Error occured. Please try again");
            }
        }
        else{
           String passValue = toCountry;
           toCountry = same;
           double amountAfter = convert(amountBefore,fromCountry,toCountry);
           amountBefore = amountAfter;
           fromCountry = same;
           toCountry = passValue;
           amountAfter = convert(amountBefore,fromCountry,toCountry);
           if(amountAfter!=0){
               wakaka += toCountry.toUpperCase() + " ";
               wakaka += amountAfter;
                System.out.print(toCountry.toUpperCase() + " ");
                System.out.printf("%.2f",amountAfter);
            }
            else{
                System.out.print("Error occured. Please try again");
            }
        }
        return wakaka;
    }
        
        public static double convert(double amountBefore,String fromCountry,String toCountry){
            double changer, rate;
            rate = value(fromCountry,toCountry);
            if(rate!=0){
            changer=amountBefore*rate;
            }
            else{
                changer = 0;
            }
            return changer;
        }
        
        public static double value(String fromCountry,String toCountry){
            double rateValue=0;
            try{
                Scanner readFile = new Scanner(new FileInputStream("C:\\Users\\USER\\Downloads\\DataCurrency.txt"));
                while(readFile.hasNextLine()){
                    if(readFile.next().equalsIgnoreCase(fromCountry)&&readFile.next().equalsIgnoreCase(toCountry)){
                        rateValue = readFile.nextDouble();
                        break;
                    }
                    if(readFile.hasNextLine()==false){
                        break;
                    }
                }
            }
            catch(FileNotFoundException e){
                System.out.println("File not found");
            }
            return rateValue;
        }
        
    }

