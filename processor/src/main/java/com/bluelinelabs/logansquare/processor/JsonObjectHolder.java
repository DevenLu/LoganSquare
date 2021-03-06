package com.bluelinelabs.logansquare.processor;

import com.squareup.javapoet.TypeName;

import java.util.HashMap;
import java.util.Map;

public class JsonObjectHolder {

    public final String packageName;
    public final String injectedClassName;
    public final TypeName objectTypeName;
    public final boolean isAbstractClass;
    public final TypeName parentInjectedTypeName;
    public String onCompleteCallback;
    public String preSerializeCallback;

    public final Map<String, JsonFieldHolder> fieldMap = new HashMap<>();
    public boolean fileCreated;

    public JsonObjectHolder(String packageName, String injectedClassName, TypeName objectTypeName, boolean isAbstractClass, TypeName parentInjectedTypeName) {
        this.packageName = packageName;
        this.injectedClassName = injectedClassName;
        this.objectTypeName = objectTypeName;
        this.isAbstractClass = isAbstractClass;
        this.parentInjectedTypeName = parentInjectedTypeName;
    }
}
