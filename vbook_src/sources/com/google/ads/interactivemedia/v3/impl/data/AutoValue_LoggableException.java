package com.google.ads.interactivemedia.v3.impl.data;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class AutoValue_LoggableException extends LoggableException {
    private final String message;
    private final String name;
    private final String stackTrace;

    public AutoValue_LoggableException(String str, String str2, String str3) {
        this.name = str;
        this.message = str2;
        this.stackTrace = str3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LoggableException) {
            LoggableException loggableException = (LoggableException) obj;
            String str = this.name;
            if (str != null ? str.equals(loggableException.name()) : loggableException.name() == null) {
                String str2 = this.message;
                if (str2 != null ? str2.equals(loggableException.message()) : loggableException.message() == null) {
                    String str3 = this.stackTrace;
                    if (str3 != null ? str3.equals(loggableException.stackTrace()) : loggableException.stackTrace() == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.name;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        String str2 = this.message;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = hashCode ^ 1000003;
        String str3 = this.stackTrace;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((i2 * 1000003) ^ hashCode2) * 1000003) ^ i;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.LoggableException
    public String message() {
        return this.message;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.LoggableException
    public String name() {
        return this.name;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.LoggableException
    public String stackTrace() {
        return this.stackTrace;
    }

    public String toString() {
        String str = this.name;
        int length = String.valueOf(str).length();
        String str2 = this.message;
        int length2 = String.valueOf(str2).length();
        String str3 = this.stackTrace;
        StringBuilder sb = new StringBuilder(length + 33 + length2 + 13 + String.valueOf(str3).length() + 1);
        nk2.C(sb, "LoggableException{name=", str, ", message=", str2);
        return nk2.v(sb, ", stackTrace=", str3, "}");
    }
}
