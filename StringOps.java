public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) 
    {

    }
    public static String capVowelsLowRest (String string) 
    {
        char lettercheck;
        String result = "";
        for ( int i = 0; i < string.length(); i++ )
        {
            lettercheck = string.charAt(i);
            if( lettercheck == 97 || lettercheck == 101 || lettercheck == 105 || lettercheck == 111 || lettercheck == 117 )
            {
                result = result + (char)(lettercheck - 32);	
            }
            else if ( ( lettercheck > 64 && lettercheck < 91 ) && ( lettercheck != 65 || lettercheck != 69 || lettercheck != 73 || lettercheck != 79 || lettercheck != 85))
            {
                result = result + (char)(lettercheck + 32);	
            }
            else
            {
                result = result + (char)(lettercheck);
            }
        }
        return result;
    }
    public static String camelCase(String string) 
    {
        String result1 = "";
        for (int i = 0; i < string.length(); i++) 
        {
            char lettercheck1 = string.charAt(i);
            if (lettercheck1 >= 65 && lettercheck1 <= 90) 
            {
                result1 = result1 + (char) (lettercheck1 + 32);
            } else 
            {
                result1 = result1 + (char) (lettercheck1);
            }
        }
        for (int i = 0; i < result1.length() - 1; i++) 
        {
            char lettercheck1 = result1.charAt(i);
            char lettercheck2 = result1.charAt(i + 1);
            if (lettercheck1 == 32 && lettercheck2 > 32) 
            {
                if (lettercheck2 >= 97 && lettercheck2 <= 122) {
                    result1 = result1.substring(0, i + 1) + (char) (lettercheck2 - 32) + result1.substring(i + 2);
                } 
                else 
                {
                    result1 = result1 + (char) (lettercheck2);
                }
            }
        }
        String finalresult = "";
        for (int i = 0; i < result1.length(); i++) {
            char lettercheck3 = result1.charAt(i);
            if (lettercheck3 != 32) {
                finalresult = finalresult + (char) (lettercheck3);
            }
        }
        return finalresult;
    }
    
         
    public static int[] allIndexOf(String string, char chr) 
    {
        int count = 0;
        for (int i = 0; i < string.length(); i++) 
        {
            if (chr == string.charAt(i)) 
            {
                count++;
            }
        }
        int[] repeated = new int[count];
        int index = 0;
        for (int i = 0; i < string.length(); i++) 
        {
            if (chr == string.charAt(i)) 
            {
                repeated[index] = i;
                index++;
            }
        }
        return repeated;
    }
}
