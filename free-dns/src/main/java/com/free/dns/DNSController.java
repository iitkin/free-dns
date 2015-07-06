package com.free.dns;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
 
@Controller
@RequestMapping(headers = "Accept=application/json")
public class DNSController {

	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, value = "/lookup")
	public String lookup() {
		return "test";

	}
}
