package com.assignment;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class VoterValidatorTest {
	@Test
	void testValidateVoterAge() {
		VoterValidator v=new VoterValidator();
		Exception e=assertThrows(Exception.class,()->{
			v.validateVoterAge(-10);
			});
		Assertions.assertEquals("Invalid age", e.getMessage());
	}
	@ParameterizedTest
	@ValueSource(ints = { 19,20,45,78})
	public void validateVoterAgeTestParameter123(int age) throws Exception {
		VoterValidator v=new VoterValidator();

		Assertions.assertTrue(v.validateVoterAge(age),"Not Eligible");
	}
}
