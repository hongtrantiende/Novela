package defpackage;

import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u3a  reason: default package */
/* loaded from: classes.dex */
public final class u3a {
    public static final u3a b;
    public final ts5 a;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l97] */
    static {
        ?? obj = new Object();
        obj.a = ts5.i(2, 1, 5);
        b = new u3a(obj);
    }

    public u3a(l97 l97Var) {
        this.a = (ts5) l97Var.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof u3a) && this.a.equals(((u3a) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.a, null, null, bool, bool, bool, bool, bool);
    }
}
