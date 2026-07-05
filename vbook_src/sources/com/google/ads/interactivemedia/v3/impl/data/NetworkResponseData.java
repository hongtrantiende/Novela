package com.google.ads.interactivemedia.v3.impl.data;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public abstract class NetworkResponseData {
    public static final String UNKNOWN_CONTENT_TYPE = "unknown";

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface ErrorCode {
        public static final int API_NOT_AVAILABLE = 102;
        public static final int NETWORK_TIMEOUT = 101;
        public static final int NO_ERROR = 0;
        public static final int UNKNOWN_ERROR = 100;
    }

    private static NetworkResponseData create(String str, String str2, String str3, int i) {
        return new AutoValue_NetworkResponseData(str, str2, str3, i);
    }

    public static NetworkResponseData forError(String str, int i) {
        return create(str, "", UNKNOWN_CONTENT_TYPE, i);
    }

    public static NetworkResponseData forResponse(String str, String str2) {
        return forResponse(str, str2, UNKNOWN_CONTENT_TYPE);
    }

    public abstract String content();

    public abstract String contentType();

    public abstract int errorCode();

    public abstract String id();

    public static NetworkResponseData forResponse(String str, String str2, String str3) {
        return create(str, str2, str3, 0);
    }
}
