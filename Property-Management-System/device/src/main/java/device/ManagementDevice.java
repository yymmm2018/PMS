package device;

public class ManagementDevice {

	public String deviceID;//设备编号
	public Date requestForRepairTime;//报修时间     
	public int dealStatus;//报修处理 (-1)未处理 (0)处理中 (1)已处理
	public int dealByEmployeeID;//处理员工编号
	public String feedBack//用户反馈     
	public String deviceID;//设备编号，统一D+8位数字 如D00000010;
	public String Name;//设备名称
	public boolean Status;//设备状态 true-保修, false-正常
	public Date checkTime;//检查时间
	public boolean  checkResult;//需维修false ,不需维修true
	public ManagementDevice()
	{
		
		
	}
	public DeviceData()//设备信息
	{
		
	}
	public DeviceRepairable()
	{
	     
	}


}
