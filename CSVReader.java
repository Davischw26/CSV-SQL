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

    private static List<List<String>> data = new ArrayList<>();
    private static String csvPath;

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

            data.add(Arrays.asList(values));

            rowID++;

        }
        br.close(); 
    }

    
}
