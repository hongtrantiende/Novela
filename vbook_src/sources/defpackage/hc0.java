package defpackage;

import android.content.Context;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hc0  reason: default package */
/* loaded from: classes.dex */
public final class hc0 extends nb2 {
    public final Context a;
    public final xj1 b;
    public final xj1 c;
    public final String d;

    public hc0(Context context, xj1 xj1Var, xj1 xj1Var2, String str) {
        if (context != null) {
            this.a = context;
            if (xj1Var != null) {
                this.b = xj1Var;
                if (xj1Var2 != null) {
                    this.c = xj1Var2;
                    if (str != null) {
                        this.d = str;
                        return;
                    } else {
                        xk5.k("Null backendName");
                        throw null;
                    }
                }
                xk5.k("Null monotonicClock");
                throw null;
            }
            xk5.k("Null wallClock");
            throw null;
        }
        xk5.k("Null applicationContext");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nb2) {
            hc0 hc0Var = (hc0) ((nb2) obj);
            if (this.a.equals(hc0Var.a) && this.b.equals(hc0Var.b) && this.c.equals(hc0Var.c) && this.d.equals(hc0Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.a);
        sb.append(", wallClock=");
        sb.append(this.b);
        sb.append(", monotonicClock=");
        sb.append(this.c);
        sb.append(", backendName=");
        return s21.q(sb, this.d, "}");
    }
}
