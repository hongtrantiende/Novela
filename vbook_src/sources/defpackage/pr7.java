package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pr7  reason: default package */
/* loaded from: classes.dex */
public final class pr7 implements rb7 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public pr7(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pr7.class == obj.getClass()) {
            pr7 pr7Var = (pr7) obj;
            if (this.a == pr7Var.a && this.b == pr7Var.b && this.c == pr7Var.c && this.d == pr7Var.d && this.e == pr7Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int m = axe.m(this.b);
        int m2 = axe.m(this.c);
        int m3 = axe.m(this.d);
        return axe.m(this.e) + ((m3 + ((m2 + ((m + ((axe.m(this.a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.a + ", photoSize=" + this.b + ", photoPresentationTimestampUs=" + this.c + ", videoStartPosition=" + this.d + ", videoSize=" + this.e;
    }
}
