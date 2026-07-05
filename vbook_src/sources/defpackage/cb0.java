package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cb0  reason: default package */
/* loaded from: classes.dex */
public final class cb0 extends t92 {
    public final String a;
    public final String b;

    public cb0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof t92) {
                cb0 cb0Var = (cb0) ((t92) obj);
                if (this.a.equals(cb0Var.a) && this.b.equals(cb0Var.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomAttribute{key=");
        sb.append(this.a);
        sb.append(", value=");
        return s21.q(sb, this.b, "}");
    }
}
