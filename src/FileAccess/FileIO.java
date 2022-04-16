package FileAccess;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileIO {

    public String[][] getInsuradValues(){
        final String file = "HW2_InsuredValues.csv";
        String[][] InsuredValues = getdata(file);
        return InsuredValues;
    }

    private String[][] getdata(String file) {

        String path = file;
        String line = "";
        String[][] data = null;
        int index1 = 0;
        int index2 = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));

            while((line = br.readLine()) != null) {

                String[] values = line.split(",");
                index2 = values.length;
                index1 ++;
            }
            br.close();
            data = new String[index1][index2];
            BufferedReader br_second = new BufferedReader(new FileReader(path));
            index1=0;
            while((line = br_second.readLine()) != null) {

                String[] splittedLine = line.split(",");
                for (int i = 0; i < index2; i++) {
                    data[index1][i] = splittedLine[i];
                }
                index1++;
            }
            br_second.close();

            } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;


    }
}