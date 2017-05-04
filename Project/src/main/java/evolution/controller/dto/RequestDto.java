package evolution.controller.dto;

public class RequestDto {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public RequestDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RequestDto(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "RequestDto [name=" + name + "]";
	}
}
