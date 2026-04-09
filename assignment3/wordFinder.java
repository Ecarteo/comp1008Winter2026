package assignment3;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class wordFinder {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        // ask the user for the file name
        System.out.print("Please type file's name: ");
        String fileName = keyboard.nextLine();
        
        // ask the user for the word to search
        System.out.print("Enter the word to search for: ");
        String searchWord = keyboard.nextLine();
        
        // try to open the file
        File myFile = new File(fileName);
        Scanner fileReader = null;
        
        try {
            fileReader = new Scanner(myFile);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            System.out.print(fileReader);
            keyboard.close();
            return;
        }
        
        // line tracker
        int lineNumber = 0;
        
        // amount of time the word was found
        int timesFound = 0;
        
        System.out.println("\nSearching for \"" + searchWord + "\" in " + fileName + "...\n");
        
        // go through the file line by line
        // it is case-insensitive!
        while (fileReader.hasNextLine()) {
            String currentLine = fileReader.nextLine();
            lineNumber++;
            
            // convert to lowercase so the search is case-insensitive
            if (currentLine.toLowerCase().contains(searchWord.toLowerCase())) {
                System.out.println("Line " + lineNumber + ": " + currentLine);
                timesFound++;
            }
        }
        
        // RESULTS
        System.out.println("\n--------------------");
        if (timesFound == 0) {
            System.out.println("The word \"" + searchWord + "\" was not found in the file.");
        } else {
            System.out.println("The word \"" + searchWord + "\" was found in " + timesFound + " lines.");
        }
        
        fileReader.close();
        keyboard.close();
    }
}

// by Matthew Calderon Arce
// April 2nd, 2026