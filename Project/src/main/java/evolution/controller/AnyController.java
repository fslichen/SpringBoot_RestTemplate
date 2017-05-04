package evolution.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import evolution.controller.dto.RequestDto;
import evolution.controller.dto.ResponseDto;

@RestController
public class AnyController {
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/get")
	public ResponseDto get() {
		return new ResponseDto("Chen");
	}
	
	@PostMapping("/post")
	public ResponseDto post(@RequestBody RequestDto requestDto) {
		return new ResponseDto(requestDto.getName());
	}
	
	@GetMapping("/send/get")
	public void sendGet() {
		ResponseDto responseDto = restTemplate.getForObject("http://localhost:8080/get", 
				ResponseDto.class);
		System.out.println(responseDto);
	}
	
	@GetMapping("/send/post")
	public void sendPost() {
		ResponseDto responseDto = restTemplate.postForObject("http://localhost:8080/post", new RequestDto("Ling"), ResponseDto.class);
		System.out.println(responseDto);
	}
}
