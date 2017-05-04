package evolution.controller.dto;

public class ResponseDto {
	public ResponseDto(String name) {
		super();
		this.name = name;
	}

	private String name;

	public String getName() {
		return name;
	}

	public ResponseDto() {// Don't forget to provide a default constructor otherwise rest template cannot analyze the object.
		super();
		// TODO Auto-generated constructor stub
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ResponseDto [name=" + name + "]";
	}
}
