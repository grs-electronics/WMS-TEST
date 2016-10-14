package com.grs.wms.utilities;

public interface JsonTransformer {
	String toJson(Object data);
	Object fromJson(String json,Class clazz);
}
