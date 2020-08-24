package deSerialization;

import java.util.List;

public class Courses {
	
	//Since getCourse Json is nested Json we have to create another pojo class for Courses Json
	private List <WebAutomation> webAutomation;
	private List <Api> api;
	private List <Mobile> mobile;
	
	public List<WebAutomation> getWebAutomation() {
		return webAutomation;
	}
	public void setWebAutomation(List<WebAutomation> webAutomation) {
		this.webAutomation = webAutomation;
	}
	public List<Api> getApi() {
		return api;
	}
	public void setApi(List<Api> api) {
		this.api = api;
	}
	public List<Mobile> getMobile() {
		return mobile;
	}
	public void setMobile(List<Mobile> mobile) {
		this.mobile = mobile;
	}

}
