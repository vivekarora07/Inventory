package com.inventory.util;

import com.inventory.validator.GenericValidation;
import com.inventory.validator.Validation;

public class ValidatorUtil {
	public static final Validation<String> notNullString = GenericValidation.from(s -> s != null);
    public static final Validation<String> notEmptyString = GenericValidation.from(s -> !s.isEmpty());
    public static final Validation<String> matchesDecimalNumberPattern = GenericValidation.from(s -> s.matches("\\d*\\.?\\d+"));
    public static final Validation<String> matchesIntegerNumberPattern = GenericValidation.from(s -> s.matches("\\d+"));


}
