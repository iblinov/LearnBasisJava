package by.bsu.java8.defaullambda;

public class StrategyMain {

	public static void main(String[] args) {
		// 1
		Strategy st = new Strategy(){};
		st.anOperation();
		
		//2
		StrategyNew stNew1 = new StrategyNew(){
			@Override
			public int define(int x1, int y1) {
				return (x1 + y1)/2;
			}		
		};

        //3
		StrategyNew stNew2 = (int x1, int y1) -> { 	return  (x1 + y1)/2; };

		stNew2.define(3, 7);

        //4
			StrategyNew stNew3 = (int x1, int y1) -> (x1 + y1)/2;
		//5
		StrategyNew stNew4 = ( x1,  y1) -> (x1 + y1)/2;

	}

}
