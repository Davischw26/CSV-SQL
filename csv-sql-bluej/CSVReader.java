 

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class CSVReader {

    public Scanner sc = new Scanner(System.in);

    private static String csvPath;
    
    private static List<String[]> row = new ArrayList<>();
    // private static List<String[]> column = new ArrayList<>();

    public void setPath(String path) {
        csvPath = path;
    }

    public List<String[]> getColumn() throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(csvPath));

        String line;

        while ((line = br.readLine()) != null) {

            String[] values = line.split(";");
            
            values[0] = values[0].replace("﻿", "");

            row.add(values);
                
        }
        br.close();
        
        // for(int a = 0; a < row.get(0).length ;a++)
        // {           
                
                // column.add(a,new String[row.size()]);
                
        // }
        // for(int i = 0; i < column.size() ;i++)
        // {
            // for(int a = 0; a < column.get(i).length ;a++)
            // {           
                
                // column.get(i)[a] = row.get(a)[i];

            // }      
            
        // }
        
        return row;
        
    }


}