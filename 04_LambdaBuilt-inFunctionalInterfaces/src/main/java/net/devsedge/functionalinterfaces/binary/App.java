package net.devsedge.functionalinterfaces.binary;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToLongBiFunction;

public class App {

	public static void main(String[] args) {
		
		/*
		 * 
		 * BiPredicate
		 * 
		 */
	
		System.out.println("'BiPredicate' takes two parameters of any type and returns a boolean");
		
		((BiPredicate<String, Integer>) (t, i) -> {
			System.out.println("\tBiPredicate takes two parameters of any type");
			return true;
		}).test("",1);
		
		/*
		 * 
		 * BiConsumer
		 * 
		 */
		
		System.out.println("\n'BiConsumer' takes two parameters of any type and returns any type");
		
		((BiConsumer<String, Integer>) (t, i) -> System.out.println("\tBiConsumer takes any type")).accept("",1);
		
		((ObjIntConsumer<String>) (s, t) -> System.out.println("\tObjIntConsumer takes an Object and an int")).accept("",1);
		
		((ObjLongConsumer<String>) (s, t) -> System.out.println("\tObjLongConsumer takes an Object and a long")).accept("",1L);
		
		((ObjDoubleConsumer<String>) (s, t) -> System.out.println("\tObjDoubleConsumer takes an Object and a double")).accept("",1D);
		
		/*
		 * 
		 * BiFunction
		 * 
		 */
		
		System.out.println("\n'Function' takes two parameter of any type and returns any type");
		
		((BiFunction<String, Double, Integer>) (t, d) -> {
			System.out.println("\tBiFunction takes any type and returns any type");
			return 1;
		}).apply("",1D);

		((ToIntBiFunction<String, Double>) (value, d) -> {
			System.out.println("\tToIntFunction takes any type and returns an int");
			return 0;
		}).applyAsInt("",1D);

		((ToLongBiFunction<String, Double>) (value, d) -> {
			System.out.println("\tToLongFunction takes any type and returns a long");
			return 0L;
		}).applyAsLong("",1D);

		((ToDoubleBiFunction<String, Double>) (value, d) -> {
			System.out.println("\tToDoubleFunction takes any type and returns a double");
			return 0L;
		}).applyAsDouble("",1D);
		
		/*
		 * 
		 * BinaryOperator
		 * 
		 */

		System.out.println("\n'BinaryOperator' takes two objects of any type and returns the same type");
		
		((BinaryOperator<String>) (t, s) -> {
			System.out.println("\tBinaryOperator takes/returns any type");
			return "";
		}).apply("","");
		
		((IntBinaryOperator) (t, u) -> {
			System.out.println("\tIntBinaryOperator takes/returns an int");
			return 1;
		}).applyAsInt(1,2);

		((LongBinaryOperator) (t, u) -> {
			System.out.println("\tLongBinaryOperator takes/returns a long");
			return 1L;
		}).applyAsLong(1L,1L);
		
		((DoubleBinaryOperator) (t, u) -> {
			System.out.println("\tDoubleBinaryOperator takes/returns a double");
			return 1D;
		}).applyAsDouble(1D,1D);
		
	}

}
