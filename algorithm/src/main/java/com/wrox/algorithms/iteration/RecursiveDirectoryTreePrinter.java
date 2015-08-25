package com.wrox.algorithms.iteration;

import java.io.File;

public final class RecursiveDirectoryTreePrinter {
	private static final String SPACES = "  ";

	public static void main(String[] args) {
//		assert args != null : "args can't be null";

/*		if (args.length != 1) {
			System.err.println("Usage : RecursiveDirectoryTreePrinter <dir>");
			System.exit(4);
		}
*/		
		File file = new File("C:\\Users\\User\\git\\algorithm-practice\\algorithm");
		print(file, "");
	}

	private static void print(File file, String indent) {
		assert file != null : "file can't be null";
		assert indent != null : "indent can't be null";

		System.out.print(indent);
		System.out.println(file.getName());

		if (file.isDirectory()) {
			print(file.listFiles(), indent + SPACES);
		}

	}

	private static void print(File[] listFiles, String indent) {
		assert listFiles != null : "listFiles can't be null";

		for (int i = 0; i < listFiles.length; i++) {
			print(listFiles[i], indent);
		}

	}
}
