package testeGetnet;

import static org.junit.Assert.assertEquals;

import org.json.simple.JSONObject;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ValidaStatus {

	RequestSpecification request = RestAssured.given();

	@Test
	public void ValidaçãoStatusCodeCadastro() {

		JSONObject bodyRequest = new JSONObject();
		request.body(bodyRequest.toJSONString());
		Response response = request.post("https://reqres.in/api/users");

		System.out.println(response.asPrettyString());
		int code = 201;
		int codeRetornado = response.getStatusCode();
		assertEquals(code, codeRetornado);
	}

}
