package com.glenvasa.softdevclub;

import java.util.Scanner;

public class ClubMemberApp {

	public static void main(String[] args) {

		SoftwareDeveloperClub club = new SoftwareDeveloperClub();

		int choice = -1;

		while (choice != 4) {

			Scanner scan = new Scanner(System.in);

			System.out.println("Select from the following menu:");
			System.out.println("1: Display Members");
			System.out.println("2: Remove Member");
			System.out.println("3: Add Member");
			System.out.println("4: Quit");

			choice = scan.nextInt();

			switch (choice) {
			case 1:
				club.displayMembers();
				break;
			case 2:
				club.removeMember();
				break;
			case 3:
				club.addMember();
				break;
			case 4:
				System.out.println("Goodbye!");
				scan.close();
				break;
			default:
				System.out.println("You must choose 1, 2, 3, or 4!");
			}

		}

	}

}
