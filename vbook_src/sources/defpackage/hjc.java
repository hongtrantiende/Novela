package defpackage;

import java.util.Collections;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hjc  reason: default package */
/* loaded from: classes.dex */
public final class hjc {
    public final ajc a;
    public final qs5 b;

    static {
        a2d.K(0);
        a2d.K(1);
    }

    public hjc(ajc ajcVar, mm9 mm9Var) {
        if (!mm9Var.isEmpty() && (((Integer) Collections.min(mm9Var)).intValue() < 0 || ((Integer) Collections.max(mm9Var)).intValue() >= ajcVar.a)) {
            xk5.r();
            throw null;
        }
        this.a = ajcVar;
        this.b = qs5.l(mm9Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hjc.class == obj.getClass()) {
            hjc hjcVar = (hjc) obj;
            if (this.a.equals(hjcVar.a) && this.b.equals(hjcVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }
}
