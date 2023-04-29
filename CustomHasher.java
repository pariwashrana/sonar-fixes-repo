package org.merchanthostedkit.jspKit.util;

public class CustomHasher {

	public CustomHasher() {
	}

	public static Scrambler getScrambler(String payId, String salt) throws Exception {
		Scrambler scrambler;
		scrambler = new Scrambler(salt);
		return scrambler;
	}

	public static String decrypt(String payId, String salt, String data) throws Exception {
		Scrambler scrambler = getScrambler(payId, salt);
		return scrambler.decrypt(data);
	}

	public static String encrypt(String payId, String salt, String data) throws Exception {
		Scrambler scrambler = getScrambler(payId, salt);
		return scrambler.encrypt(data);
	}

	public static void main(String[] arg) {

		String data = "An2LPRz26pwNmpgD1CCk4Co-9AvMeJj4lEVmZkqwJB99wy2BPHa8VhZxI9kFgV7jo96xLA8KwjL3ct7EgZh_i6r-0nfrOlLBp9BdeBtcAGTrBPbvwd03o9zAhAt291PJsVQb_-1pbvcl0ZuE54uGAsudoLcw_Mla00oHV2vWvEL7v_PxjhOME-1syKw0xGZNoiJcxQmNMcHJZCKd24Kg2dJiX6xw9jQ9f9hBqMlNMSx0dhJpMqRbMlcCr3H_IaiItgY4rhes2u5YiUAl-QH-5ao8Jqu8BTHD5QVmRWrDEcGJUaAOrJsphP1YHBSCmWfrX3csCpeTGcMwmh4EKGtku1WMANkFeSeu1754E2IQU8o90LZ86_ETPL2EWwx25lr77hQR-Rf7LhOpHQyEExIzC74hcqH3Aab-EeF3ZdVn-uC7GTnDR4A5skvhrAIGzMHQidOJ7ipKN_KML9mWdVlenOSkXOQaqy6gEdOwBPhGFYUmxO-IlXSTyK9jhf6WeUpQb5wU6awpDq9s7n65QBHb4PSXmE1BeaNhv7_Bbq1XiiiCXbXybyTDwDsceOrWNzsCaeO4nk8pzLAtcj4tQp-TnVxz3o4P9mJ5Fapnwo_JMyZDsjgtrnwbTMVzoME5B1HEhOEVsjewPs-q7K0K4ZE9HR_zYv2WVKXvk9-fLkFRKTi2v1gzA6NC5yL9OuRV4upec3U129W5v4_vPlugLLbufioGi4jvV0bfH89LHXvwRtTbMc8uQKOj0yTP4ySvAdX0adtyfU_LjHyqVu4XHRDtq6gflsnKwPpjcIY0vz5sPOc8mNOYxHExotZMT-hVbQLMxXTVmRn0or644hcbyJVMGG2NuP49YhgnZ7UK56V2gLJLXQ58NyZBvf-K-pbnfOj5XCKimL9rnEAlv9Y4yTqg==";
		String payid = "1009130130104440";
		String salt = "e1425ee14b704c56";
		try {
			System.out.println(decrypt(payid, salt, data));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
