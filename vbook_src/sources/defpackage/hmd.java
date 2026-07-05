package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hmd  reason: default package */
/* loaded from: classes.dex */
public final class hmd {
    public final String a;
    public final int b;

    public hmd(String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hmd)) {
            return false;
        }
        hmd hmdVar = (hmd) obj;
        if (c16.i(this.a, hmdVar.a) && this.b == hmdVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb.append(this.a);
        sb.append(", generation=");
        return hl5.p(sb, this.b, ')');
    }
}
