package com.bridgelabz.niofileoperations;

import java.io.File;

/***********************************************************
 * @author Pavani
 *
 * This class contains method that deletes files from system.
 ***********************************************************/

public class FileUtils {
    public static boolean deleteFiles(File contentsToDelete) {
        File[] allContents = contentsToDelete.listFiles();
        if (allContents != null) {
            for (File file : allContents) {
                deleteFiles(file);
            }
        }
        return contentsToDelete.delete();
    }
}
