package com.google.ads.interactivemedia.v3.impl.data;

import java.io.PrintWriter;
import java.io.StringWriter;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public abstract class LoggableException {
    public static LoggableException create(Throwable th) {
        String name = th.getClass().getName();
        String message = th.getMessage();
        Object obj = v6f.a;
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return new AutoValue_LoggableException(name, message, stringWriter.toString());
    }

    public abstract String message();

    public abstract String name();

    public abstract String stackTrace();

    public static LoggableException create(String str, String str2, String str3) {
        return new AutoValue_LoggableException(str, str2, str3);
    }
}
