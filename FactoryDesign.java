package assignmentbyTanuj;

abstract class Computer {
	
	public abstract String getRAM();
	public abstract String getHDD();
	
	@Override
	public String toString(){
		return "RAM= "+this.getRAM()+", HDD="+this.getHDD();
	}
}

class PC extends Computer {

	private String ram;
	private String hdd;
	
	public PC(String ram, String hdd){
		this.ram=ram;
		this.hdd=hdd;
	}
	@Override
	public String getRAM() {
		return this.ram;
	}

	@Override
	public String getHDD() {
		return this.hdd;
	}

}

class Server extends Computer {

	private String ram;
	private String hdd;
	
	public Server(String ram, String hdd){
		this.ram=ram;
		this.hdd=hdd;
	}
	@Override
	public String getRAM() {
		return this.ram;
	}

	@Override
	public String getHDD() {
		return this.hdd;
	}
}

class ComputerFactory {

	public static Computer getComputer(String type, String ram, String hdd){
		if("PC".equalsIgnoreCase(type)) return new PC(ram, hdd);
		else if("Server".equalsIgnoreCase(type)) return new Server(ram, hdd);
		
		return null;
	}
}




public class FactoryDesign {

	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer("pc","4 GB","1 TB");
		Computer server = ComputerFactory.getComputer("server","16 GB","4 TB");
		System.out.println("PC Config :: "+pc);
		System.out.println("Server Config :: "+server);
	}

}
