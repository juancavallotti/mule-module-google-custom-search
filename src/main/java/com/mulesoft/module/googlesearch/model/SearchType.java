package com.mulesoft.module.googlesearch.model;

/**
 * Created with IntelliJ IDEA.
 * User: juancavallotti
 * Date: 18/05/13
 * Time: 20:49
 * To change this template use File | Settings | File Templates.
 */
public enum SearchType {

    WEB_SEARCH(""),
    IMAGE_SEARCH("image")
    ;

    private final String typeValue;

    SearchType(String typeValue) {
        this.typeValue = typeValue;
    }

    public String getTypeValue() {
        return typeValue;
    }
}
