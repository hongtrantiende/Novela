package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rub  reason: default package */
/* loaded from: classes.dex */
public final class rub {
    public static final rub c = new rub(0L, 3);
    public final long a;
    public final long b;

    public /* synthetic */ rub(long j, int i) {
        this((i & 1) != 0 ? zr1.q(0) : j, zr1.q(0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rub)) {
            return false;
        }
        rub rubVar = (rub) obj;
        if (e4c.a(this.a, rubVar.a) && e4c.a(this.b, rubVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        f4c[] f4cVarArr = e4c.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hl5.o("TextIndent(firstLine=", e4c.e(this.a), ", restLine=", e4c.e(this.b), ")");
    }

    public rub(long j, long j2) {
        this.a = j;
        this.b = j2;
    }
}
