
public class GumballMachineTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GumballMachine gumballMachine = new GumballMachine(3);
		System.out.println(gumballMachine);
		//gumballMachine.turnCrank();
		
	}
}

//thinking count = 3, state = noQuaterState

//you turned, but there,s no quarter
// you need to pay first

//thinking count = 0, state = SoldOutState

// you turned, but there are no gumball
//No Gumball dispensed

