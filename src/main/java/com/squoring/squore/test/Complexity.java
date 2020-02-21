package com.squoring.squore.test;

import java.util.Random;

public class Complexity {

	public Complexity() {
	}

	public void complexMethod() {
		int rand = new Random().nextInt();
		for (int i = 0; i < 10; i++) {
			if (rand > 0) {
				if (rand > 1) {
					if (rand > 2) {
						if (rand > 3) {
							if (rand > 4) {
								if (rand > 5) {
									if (rand > 6) {
										if (rand > 7) {
											if (rand > 8) {
												if (rand > 9) {
													if (rand > 10) {
														System.out.println("Is it complex enough ? ");
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
