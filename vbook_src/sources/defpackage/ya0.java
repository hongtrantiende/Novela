package defpackage;

import java.io.File;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ya0  reason: default package */
/* loaded from: classes.dex */
public final class ya0 {
    public final xa0 a;
    public final String b;
    public final File c;

    public ya0(xa0 xa0Var, String str, File file) {
        this.a = xa0Var;
        if (str != null) {
            this.b = str;
            this.c = file;
            return;
        }
        xk5.k("Null sessionId");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ya0) {
                ya0 ya0Var = (ya0) obj;
                if (this.a.equals(ya0Var.a) && this.b.equals(ya0Var.b) && this.c.equals(ya0Var.c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.a + ", sessionId=" + this.b + ", reportFile=" + this.c + "}";
    }
}
