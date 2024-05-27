package by.bsu2.java8.defaultstrategy;

public class StrategyMain {

	public static void main(String[] args) {
		Strategy.action();
		// 0
//		Strategy st = new Strategy(){};
//		st.anOperation();
		
		//1
		Strategy stNew1 = new Strategy(){
			@Override
			public int define(int x1, int y1) {
				return (x1 + y1)/2;
			}
        };
        int res1 = stNew1.define(4,7);
        stNew1.anOperation();

        //2
		Strategy stNew2 = (int x1, int y1) -> { return  (x1 + y1)/2; };
		int res2 = stNew2.define(3, 7);

        //3
		Strategy stNew3 = (int x1, int y1) -> (x1 + y1)/2;
		//4
		Strategy stNew4 = (x1,  y1) -> (x1 + y1)/2;

		new StrategyAction(1, 2).action((x1,  y1) -> (x1 + y1)/2);
	}
}
