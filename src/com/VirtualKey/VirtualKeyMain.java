package com.VirtualKey;

public class VirtualKeyMain {

public static void main(String[] args) {
		
		// Create "main" folder if not present in current folder structure
		FileOperations.createMainFolderIfNotPresent("main");
		
		MenuOptions.printWelcomeScreen("VirtualKey", "Sagar Sahu");
		
		HandleOptions.handleWelcomeScreenInput();
	}
	
}
