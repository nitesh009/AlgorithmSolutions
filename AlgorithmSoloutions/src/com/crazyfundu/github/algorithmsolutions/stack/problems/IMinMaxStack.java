package com.crazyfundu.github.algorithmsolutions.stack.problems;

import com.crazyfundu.github.algorithmsolutions.stack.IStack;

public interface IMinMaxStack extends IStack {
	/*
	 * Will return the minimum value from the stack
	 */
	public int min();
	
	/*
	 * Will return the maximum value from the stack
	 */
	public int max();
	
}
