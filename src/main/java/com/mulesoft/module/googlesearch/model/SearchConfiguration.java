package com.mulesoft.module.googlesearch.model;

import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.param.Optional;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: juancavallotti
 * Date: 18/05/13
 * Time: 20:51
 * To change this template use File | Settings | File Templates.
 */
public class SearchConfiguration implements Serializable {

    @Configurable @Optional
    private String fileType;

    @Configurable @Optional
    private String exactTerms;

    @Configurable @Optional
    private String dateRestrict;


    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getExactTerms() {
        return exactTerms;
    }

    public void setExactTerms(String exactTerms) {
        this.exactTerms = exactTerms;
    }

    public String getDateRestrict() {
        return dateRestrict;
    }

    public void setDateRestrict(String dateRestrict) {
        this.dateRestrict = dateRestrict;
    }
}
