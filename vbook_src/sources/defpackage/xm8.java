package defpackage;

import java.io.IOException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xm8  reason: default package */
/* loaded from: classes.dex */
public class xm8 extends IOException {
    public final boolean a;
    public final int b;

    public xm8(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.a = z;
        this.b = i;
    }

    public static xm8 a(RuntimeException runtimeException, String str) {
        return new xm8(str, runtimeException, true, 1);
    }

    public static xm8 b(String str, Exception exc) {
        return new xm8(str, exc, true, 4);
    }

    public static xm8 c(String str) {
        return new xm8(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str;
        String message = super.getMessage();
        StringBuilder sb = new StringBuilder();
        if (message != null) {
            str = message.concat(" ");
        } else {
            str = "";
        }
        sb.append(str);
        sb.append("{contentIsMalformed=");
        sb.append(this.a);
        sb.append(", dataType=");
        return rs8.g(this.b, "}", sb);
    }
}
