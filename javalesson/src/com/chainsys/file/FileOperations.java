package com.chainsys.file;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class  FileOperations {

			public static void main(String[] args)  {
				// Createfile();
				// renamefile();
				// deletefile();
				// appendfile();
				// readfile();
				// movefile();
				// modifyDataInFile();
				copyfile();

			}

			public static void Createfile() {
				try {
					File f1 = new File("E:\\New folder\\java batch.txt");
					if (f1.createNewFile()) {
						System.out.println("File created");
					} else {
						System.out.println("File does not Exists");
					}
				} catch (Exception e) {
					System.out.println("ERROR");
				}
			}

			public static void renamefile() {
				File f1 = new File("E:\\New folder\\java batch.txt");
				File newname = new File("E:\\New folder\\Aravinth55.txt");
				if (f1.renameTo(newname)) {
					System.out.println("successfuly renamed");
				} else {
					System.out.println("file does not change the rename");
				}
			}

			public static void deletefile() {

				File newname = new File("E:\\New folder\\Aravinth55.txt");
				if (newname.delete()) {
					System.out.println("successfuly deleted");
				} else {
					System.out.println("file does not deleted");
				}
			}

			public static void appendfile() {
				String data = "working from chainsys chennai!!!";
				try {
					FileWriter fw = new FileWriter("E:\\New folder\\java batch.txt", true);
					fw.write(data);
					System.out.println("FILE APPEND SUCCESFULLY!!!");
					fw.close();

				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("FILE APPEND ERROR!!!");
				}
			}

			public static void readfile() {
				File f1 = new File("E:\\New folder\\java batch.txt");
				try {
					Scanner scanner = new Scanner(f1);
					while (scanner.hasNextLine()) {
						System.out.println(scanner.nextLine());
					}
				} catch (FileNotFoundException e) {
					System.out.println("ERROR");
				}
			}

			public static void movefile() {
				String fromFile = "E:\\New folder\\java batch.txt";
				String toFile = "E:\\New folder\\chainsys\\java batch.txt";
				Path source = Paths.get(fromFile);
				Path target = Paths.get(toFile);
				try {
					java.nio.file.Files.move(source, target);
					System.out.println("File moved");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			public static void modifyDataInFile() {
				try {

					FileOutputStream file = new FileOutputStream("E:\\New folder\\chainsys\\java batch.txt");
					String modify = "aravinth praveen sujitha manisha pooja";
					byte[] b = modify.getBytes();
					file.write(b);
					file.close();
					System.out.println("Modification Complete");
					FileInputStream file1 = new FileInputStream("E:\\New folder\\chainsys\\java batch.txt");
					int i;
					while ((i = file1.read()) != -1) {
						System.out.print((char) i);
					}
					file1.close();
				} catch (IOException e) {
					System.out.println("ERROR");
				}
			}

			public static void copyfile() {

				try {
					InputStream input = new FileInputStream("E:\\New folder\\chainsys\\java batch.txt");
					;
					OutputStream output = new FileOutputStream("E:\\New folder\\chainsys\\data science.txt");
					int info = input.read();
					while (info != -1) {
						output.write(info);
						info = input.read();
					}
					output.flush();
					System.out.println("File copied");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}


