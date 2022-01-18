import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class CSVReader 
{
    
    public Scanner sc  = new Scanner(System.in);
    
    private static String csvPath;
    private static List<List<String>> row = new ArrayList<>();
    private static List<List<String>> column = new ArrayList<>();
    
    
    
    public void setPath(String path)
    {
        csvPath = path;
        
        System.out.println(path);
    }
    
    public void run() throws IOException
    {

        
        BufferedReader br = new BufferedReader(new FileReader(csvPath));

        String line;
        int rowID = 0;

        while ((line = br.readLine()) != null) 
        {        

            String[] values = line.split(";");

            values[0] = values[0].replace("﻿","");

            row.add(Arrays.asList(values));

            //System.out.println(data.get(rowID)); 
            rowID++;

        }
        br.close(); 
    }

    public static String[] getColumn()
    {
        for(int i = -1; i < row.size(); i++)
        {
        String[] localColumn = new String[1];
                for(int a = -1; a < row.get(i).size(); a++)
        {           
            localColumn[0] = row.get(i).get(a);                    
        }
        column.add(Arrays.asList(localColumn));  
        System.out.println(column.get(i)); 
        }
        return null;
    }
}

