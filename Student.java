package myproject;

import java.util.ArrayList;

class Student {
	
		String name;
		int id;
		int totalmarks;
		
		
		// default constructor
		Student(){ 
			name = "default name";
			totalmarks = 600;
			id = 10;
			
		}
		Student(String name, int id, int totalmarks){
			this.name = name;
			this.id = id;
			this.totalmarks = totalmarks;
		}
		
		//override to string method
		@Override
		public String toString() {
			return "Name; " + name + "\nID: " + id + "\ntotalmarks: " + totalmarks;
		}
		
	}


	public class javaarraylist {

		public static void main(String[] args) {
			// TO create arraylist
			ArrayList<Student> Students = new ArrayList();

			Student s1 = new Student("Fred", 1, 450);
			Student s2 = new Student("blake", 2, 500);
			Student s3 = new Student("joe", 3, 320);
			Student s4 = new Student("zlatan", 4, 580);
			Student s5 = new Student("veroc", 5, 440);
			
			//add object in arraylist
			Students.add(s1);
			Students.add(s2);
			Students.add(s3);
			Students.add(s4);
			Students.add(s5);
			
			for(int i =0; i < Students.size(); i++) {
				System.out.println(Students.get(i).toString());
			}
			
		}

	}

