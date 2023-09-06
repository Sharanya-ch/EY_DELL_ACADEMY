package EY2308;

public class HowSleepMethodWorks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HowSleepMethodWorks t1 = new HowSleepMethodWorks();
		HowSleepMethodWorks t2 = new HowSleepMethodWorks();
		
		t1.start();
		t2.start();
		
	}
	public void run() {
		for(int i =1 , i<5, i++) {
			try {
				Thread.sleep(1000);
				TimeUnit.Seconds.sleep(1);
			}
		}
	}

}
