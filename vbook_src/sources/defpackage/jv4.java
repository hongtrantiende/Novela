package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: jv4  reason: default package */
/* loaded from: classes3.dex */
public final class jv4 implements Comparable<jv4> {
    public static final iv4 Companion = new Object();
    public static final ye6[] F;
    public final ar7 C;
    public final int D;
    public final long E;
    public final int a;
    public final int b;
    public final int c;
    public final fid d;
    public final int e;
    public final int f;

    /* JADX WARN: Type inference failed for: r0v0, types: [iv4, java.lang.Object] */
    static {
        k24 k24Var = new k24(20);
        sk6 sk6Var = sk6.b;
        F = new ye6[]{null, null, null, ipe.x(sk6Var, k24Var), null, null, ipe.x(sk6Var, new k24(21)), null, null};
        pi2.a(0L);
    }

    public /* synthetic */ jv4(int i, int i2, int i3, int i4, fid fidVar, int i5, int i6, ar7 ar7Var, int i7, long j) {
        if (511 == (i & 511)) {
            this.a = i2;
            this.b = i3;
            this.c = i4;
            this.d = fidVar;
            this.e = i5;
            this.f = i6;
            this.C = ar7Var;
            this.D = i7;
            this.E = j;
            return;
        }
        w92.x(i, 511, hv4.a.e());
        throw null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(jv4 jv4Var) {
        jv4 jv4Var2 = jv4Var;
        jv4Var2.getClass();
        return c16.m(this.E, jv4Var2.E);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jv4)) {
            return false;
        }
        jv4 jv4Var = (jv4) obj;
        if (this.a == jv4Var.a && this.b == jv4Var.b && this.c == jv4Var.c && this.d == jv4Var.d && this.e == jv4Var.e && this.f == jv4Var.f && this.C == jv4Var.C && this.D == jv4Var.D && this.E == jv4Var.E) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int a = hl5.a(this.c, hl5.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
        int a2 = hl5.a(this.f, hl5.a(this.e, (this.d.hashCode() + a) * 31, 31), 31);
        return Long.hashCode(this.E) + hl5.a(this.D, (this.C.hashCode() + a2) * 31, 31);
    }

    public final String toString() {
        return "GMTDate(seconds=" + this.a + ", minutes=" + this.b + ", hours=" + this.c + ", dayOfWeek=" + this.d + ", dayOfMonth=" + this.e + ", dayOfYear=" + this.f + ", month=" + this.C + ", year=" + this.D + ", timestamp=" + this.E + ')';
    }

    public jv4(int i, int i2, int i3, fid fidVar, int i4, int i5, ar7 ar7Var, int i6, long j) {
        fidVar.getClass();
        ar7Var.getClass();
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = fidVar;
        this.e = i4;
        this.f = i5;
        this.C = ar7Var;
        this.D = i6;
        this.E = j;
    }
}
