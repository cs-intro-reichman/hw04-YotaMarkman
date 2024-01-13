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
    public static String camelCase (String string)
    {
        char check;
        char checkspace;
        String finalresult = "";
        for( int i = 0; i < string.length(); i++)
        {
            check = string.charAt(i);
            if ( check > 64 && check < 91)
            {
                finalresult = finalresult + (char)(check+32);
                break;
            }
            else
            {
                finalresult = finalresult + (char)(check);
                break;
            }
        }
         for ( int i = 1; i < string.length(); i++)
        {
            check = string.charAt(i);
            checkspace = string.charAt(i+1);
            if( check == 32&& checkspace > 32)
            {
                if ( checkspace > 64 && checkspace < 91)
                {
                    finalresult = finalresult + (char)(checkspace);
                    break;
                }
                else
                {
                    finalresult = finalresult + (char)(checkspace-32);
                    break;
                }
            }
        }
        for (int i = 0; i < string.length(); i++) 
        {
            char c = string.charAt(i);
            if (c == ' ') 
            {
                continue;
            }
            finalresult += c;
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
