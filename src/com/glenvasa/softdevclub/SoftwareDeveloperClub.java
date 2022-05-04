package com.glenvasa.softdevclub;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SoftwareDeveloperClub {

	private List<ClubMember> members = new ArrayList<>();

	SoftwareDeveloperClub() {

		try {
			File file = new File(("members.txt"));
			File path = new File(file.getAbsolutePath());
			Scanner reader = new Scanner(path);
			reader.nextLine(); // reads first line of file (column headers) before we get to while loop
			while (reader.hasNextLine()) {
				String[] line = reader.nextLine().split("\\*\\*");
				ClubMember member = new ClubMember(line[0], line[1] + ", " + line[2], line[3]);
				members.add(member);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public void displayMembers() {
		System.out.println("\nSoftware Developers Club - Members List");
		System.out.println("***************************************");
		members.forEach(m -> {
			System.out.printf("Member Name: %s\n", m.getMemberName());
			System.out.printf("Location: %s\n", m.getLocation());
			System.out.printf("Favorite Language: %s\n\n", m.getFavoriteLanguage());
		});
	}

	public void removeMember() {
		Scanner removeScan = new Scanner(System.in);
		ClubMember removedMember = null;

		System.out.println("What is the name of the member to remove?");
		String choice = removeScan.next();

		for (ClubMember member : members) {
			if (member.getMemberName().equals(choice)) {
				removedMember = member;

			}
		}

		members.remove(removedMember);

		System.out.printf("\n%s has been removed from the Members list\n\n", removedMember.getMemberName());

		// removeScan.close();
	}

	public void addMember() {

		Scanner addScan = new Scanner(System.in);

		System.out.println("What is the name of the new member?");
		String name = addScan.next();

		System.out.println("In what city does the new member live?");
		String city = addScan.next();

		System.out.println("In what state does the new member live?");
		String state = addScan.next();

		System.out.println("What is the new member's favorite programming language?");
		String language = addScan.next();

		ClubMember addMember = new ClubMember(name, city + ", " + state, language);
		members.add(addMember);

		System.out.printf("\n%s has been added to the Members list\n\n", addMember.getMemberName());
//		addScan.close();
	}
}
