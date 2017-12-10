package com.epsi.library;

public class ISBNValidator {
	public static boolean validateIsbn10(String isbn) {
		if (isbn == null) {
			return false;
		}

		// must be a 10 digit ISBN
		if (isbn.length() != 10) {
			return false;
		}

		try {
			int sum = 0;
			// Multiply each number by its position number and then sum up the
			// products.
			for (int i = 0; i < 9; i++) {
				int digit = Integer.parseInt(isbn.substring(i, i + 1));
				sum += ((10 - i) * digit);
			}

			/*
			 * Divide the sum by 11 and find out what is the remainder. If the
			 * remainder is zero, then it is a valid 10 digit ISBN. If the
			 * remainder is not zero, then it is not a valid 10 digit ISBN.
			 */
			String checksum = Integer.toString((11 - (sum % 11)) % 11);
			if ("10".equals(checksum)) {
				checksum = "X";
			}

			return checksum.equals(isbn.substring(9));
		} catch (NumberFormatException nfe) {
			// to catch invalid ISBNs that have non-numeric characters in them
			return false;
		}
	}

	public static boolean validateIsbn13(String isbn) {
		if (isbn == null) {
			return false;
		}

		// must be a 13 digit ISBN
		if (isbn.length() != 13) {
			return false;
		}

		try {
			int sum = 0;
			// Multiply each number by an alternating 1 and 3 and then sum up
			// the products.
			for (int i = 0; i < 12; i++) {
				int digit = Integer.parseInt(isbn.substring(i, i + 1));
				sum += (i % 2 == 0) ? digit * 1 : digit * 3;
			}
			/*
			 * Divide the sum by 10 and find out what is the remainder. If the
			 * remainder is zero, then it is a valid 13 digit ISBN. If the
			 * remainder is not zero, then it is not a valid 13 digit ISBN.
			 */
			int checksum = 10 - (sum % 10);
			// checksum must be 0-9. If calculated as 10 then = 0
			if (checksum == 10) {
				checksum = 0;
			}

			return checksum == Integer.parseInt(isbn.substring(12));
		} catch (NumberFormatException nfe) {
			// to catch invalid ISBNs that have non-numeric characters in them
			return false;
		}
	}
}
