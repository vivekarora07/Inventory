package com.inventory.validator;

import com.inventory.util.ValidatorUtil;

public class ItemValidator {

	public static void validateStringIsDecimalNumber(String type) throws InvalidRequestException {
		StringBuilder errorFields = new StringBuilder();
		errorFields.append(ValidatorUtil.notEmptyString.and(ValidatorUtil.matchesDecimalNumberPattern).test(type)
				.getFieldNameIfInvalid(type).orElse(""));
		String errors = errorFields.toString();
		if (!errors.isEmpty()) {
			throw new InvalidRequestException(errors);
		}
	}
	
	public static void validateStringIsIntegerNumber(String type) throws InvalidRequestException {
		StringBuilder errorFields = new StringBuilder();
		errorFields.append(ValidatorUtil.notEmptyString.and(ValidatorUtil.matchesIntegerNumberPattern).test(type)
				.getFieldNameIfInvalid(type).orElse(""));
		String errors = errorFields.toString();
		if (!errors.isEmpty()) {
			throw new InvalidRequestException(ErrorCode.ERR06.getValue() + " " + errors);
		}
	}
}
