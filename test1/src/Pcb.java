
public class Pcb {
	
	/**
	 * ������
	 */
	private String courSeName;
	
	/**
	 * ����ʱ��
	 */
	private Integer arriveTime;
	
	/**
	 * ��Ҫʱ��  
	 */
	private Integer needTime;

	/**
	 * ״̬
	 */
	private String  state;
	
	/**
	 * ����CPU ʱ��
	 */
	private Integer runTime =0;
	
	/**
	 * ���ȼ�
	 */
	private Integer greade;

	public String getCourSeName() {
		return courSeName;
	}

	public void setCourSeName(String courSeName) {
		this.courSeName = courSeName;
	}

	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}

	public boolean run(){
		System.out.println(this.courSeName+"��������.........");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.runTime+= 1;
		this.greade-=1;
		this.state="����";
		if(this.runTime>=this.needTime){
			System.out.println(this.courSeName+"���н���!!!!!!!");
			this.state="����";
			return true;
		}
		return false;
	}

	public Integer getArriveTime() {
		return arriveTime;
	}

	public void setArriveTime(Integer arriveTime) {
		this.arriveTime = arriveTime;
	}

	public Integer getNeedTime() {
		return needTime;
	}

	public void setNeedTime(Integer needTime) {
		this.needTime = needTime;
	}

	public Integer getRunTime() {
		return runTime;
	}

	public void setRunTime(Integer runTime) {
		this.runTime = runTime;
	}

	public Integer getGreade() {
		return greade;
	}

	public void setGreade(Integer greade) {
		this.greade = greade;
	}
	
	public void info(){
		System.out.println(this.courSeName+" || " +
				this.arriveTime +"     ||"+
				this.needTime +"        ||"+ this.runTime+"      ||"+
				this.greade+"    ||"+this.state);
	}
}
