package day64;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class RepresentingTableData {

    public static void main(String[] args) throws IOException {

        //for using single row
        //I want to get the value by it's column name
        // so i choose Map

        Map<String, String> row1 = new HashMap<>();

        row1.put("first_name ", "Regan");
        row1.put("email", "rboiichat@1688.com");
        row1.put("gender", "Female");

        Map<String, String> row2 = new HashMap<>();

        row2.put("first_name ", "Carleen");
        row2.put("email", "cmorillas@blog.com");
        row2.put("gender", "Male");

        System.out.println("row1 = " + row1);
        System.out.println("row2 = " + row2);


        //for one row I used one map
        //but I have many rows !!
        // may of Some type--->> List<SomeType>

        List<Map<String, String>> rowMapLst = new ArrayList<>();

        rowMapLst.add(row1);
        rowMapLst.add(row2);

        System.out.println("rowMapLst = " + rowMapLst);

        // how do I get 2nd row email column value
        System.out.println("rowMaplst.get(1).get(\"email\")=" + rowMapLst.get(1).get("email"));

        //update the Name of 1st row to Hulk

        rowMapLst.get(0).replace("first_name ", "hulk");
        System.out.println("rowMapLst = " + rowMapLst);
        rowMapLst.get(0).put("first_name", "jane");
        System.out.println("rowMapLst = " + rowMapLst);

//  HOMEWORK FILL UP THIS LIST OF MAP  USING FILE DATA

        List<String> readingEmployeeDataTxt = Files.readAllLines(Paths.get("src/day64/EmployeeData1.txt"));
        for (String eachLine : readingEmployeeDataTxt) {
            String[] arr = eachLine.split(",");
            Map<String, String> eachRow = new LinkedHashMap<>();
            eachRow.put("first name", arr[0]);
            eachRow.put("email", arr[1]);
            eachRow.put("gender", arr[2]);
            // rowMapsList.add(eachRow);

        }
    }
}