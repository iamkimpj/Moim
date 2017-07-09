package com.moim.moim.Model.Http.Schema;

/**
 * Created by developer on 2017. 7. 2..
 */

public class BaseSchema {

    protected _Head head;

    class _Head {
        protected String encodeType;
        protected String status;
        protected String errorMessage;
    }

    public boolean isSuccess() {
        return this.head.status.equals( "200" );
    }

    public String errorMessage() {
        return this.head.errorMessage;
    }

}
