public class ArrayOps 
{
    public static void main(String[] args) 
    {
        
    }
    public static int findMissingInt(int[] array) 
    {
        int missing = -1;
        int temp;
        for (int i = 0; i < array.length; i++) 
        {
            temp = array[i];
            for (int j = i; j < array.length; j++) 
            {
                if (temp > array[j]) 
                {
                    array[i] = array[j];
                    array[j] = temp;
                    temp = array[i];
                }
            }
        }
        for (int i = 0; i < array.length; i++) 
        {
             if (array[i] != i) 
            {
                missing = i;
                break;
            }
        }
        return missing;
    }
    public static int secondMaxValue(int[] array) 
    {
        int[] ordered = new int[array.length];
        for (int i = 0; i < ordered.length; i++) 
        {
            ordered[i] = array[i];
        }
        for (int i = 0; i < ordered.length - 1; i++) 
        {
            for (int j = i + 1; j < ordered.length; j++) 
            {
                if (ordered[i] > ordered[j]) 
                {
                    int temp = ordered[i];
                    ordered[i] = ordered[j];
                    ordered[j] = temp;
                }
            }
        }
        if (ordered.length >= 2) 
        {
            return ordered[ordered.length - 2];
        } 
        else 
        {
            return -1;
        }
    }
    public static boolean containsTheSameElements(int [] array1,int [] array2) 
    {
        int count = 0;
        for ( int i = 0; i < array1.length; i++)
        {
            count = 0;
            for ( int j = 0; j < array2.length; j++)
            {
                if ( array1[i] != array2[j] )
                {
                    count++;
                }
            }
            if ( count == array2.length)
            {
                 return false;
            }
        }
        return true;
    }
    public static boolean isSorted(int [] array)
    {
        int countup = 0;
        int countdown = 0;
        int temp4;
        for ( int i = 0; i < array.length; i++)
        {
            temp4 = array[i];
            for ( int j = i+1; j < array.length; j++)
            {
                if ( temp4 <= array[j])
                {
                    temp4 = array[j];
                    countup++;
                }
                else
                {
                    temp4 = array[j];
                    countdown++;
                }
            }
        }
        if ( ( countdown > 0 && countup > 0))
        {
            return false;
        }
        else
        {
            return true;
        }        
    }
}
