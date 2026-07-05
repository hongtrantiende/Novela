package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yxa  reason: default package */
/* loaded from: classes3.dex */
public final class yxa {
    public final String a;
    public final fsc b;
    public final long c;

    public yxa(String str, fsc fscVar, long j) {
        str.getClass();
        fscVar.getClass();
        this.a = str;
        this.b = fscVar;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yxa)) {
            return false;
        }
        yxa yxaVar = (yxa) obj;
        if (c16.i(this.a, yxaVar.a) && this.b == yxaVar.b && this.c == yxaVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return Long.hashCode(this.c) + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StackedToastData(message=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", endDuration=");
        return hl5.q(sb, this.c, ")");
    }
}
