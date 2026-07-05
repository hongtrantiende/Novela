package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: akc  reason: default package */
/* loaded from: classes.dex */
public final class akc {
    public static final akc f;
    public final long a;
    public final long b;
    public final float c;
    public final long d;
    public final long e;

    static {
        long a = mz9.a(1.0f, 1.0f);
        long j = z78.b;
        int i = dkc.b;
        f = new akc(a, j, (float) nae.e, ekc.b(), ekc.b());
    }

    public akc(long j, long j2, float f2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = f2;
        this.d = j3;
        this.e = j4;
        if (j != lz9.b) {
            if (j2 != z78.c) {
                return;
            }
            vs.m("offset must be specified");
            throw null;
        }
        vs.m("scale must be specified");
        throw null;
    }

    public static akc a(akc akcVar, long j, long j2, long j3, int i) {
        long j4;
        long j5;
        if ((i & 1) != 0) {
            j = akcVar.a;
        }
        long j6 = j;
        if ((i & 2) != 0) {
            j4 = akcVar.b;
        } else {
            j4 = j2;
        }
        float f2 = akcVar.c;
        long j7 = akcVar.d;
        if ((i & 16) != 0) {
            j5 = akcVar.e;
        } else {
            j5 = j3;
        }
        akcVar.getClass();
        return new akc(j6, j4, f2, j7, j5);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof akc) {
                akc akcVar = (akc) obj;
                if (lz9.a(this.a, akcVar.a) && this.b == akcVar.b && Float.compare(this.c, akcVar.c) == 0 && dkc.a(this.d, akcVar.d) && dkc.a(this.e, akcVar.e)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = lz9.c;
        int i2 = z78.d;
        int d = nk2.d(this.c, hl5.c(Long.hashCode(this.a) * 31, this.b, 31), 31);
        int i3 = dkc.b;
        return Long.hashCode(this.e) + hl5.c(d, this.d, 31);
    }

    public final String toString() {
        return "TransformCompat(scale=" + mz9.d(this.a) + ", offset=" + mue.t(this.b) + ", rotation=" + this.c + ", scaleOrigin=" + ekc.c(this.d) + ", rotationOrigin=" + ekc.c(this.e) + ')';
    }

    public /* synthetic */ akc(long j, long j2, float f2, long j3, int i) {
        long j4;
        akc akcVar;
        long j5;
        long j6;
        float f3 = (i & 4) != 0 ? 0.0f : f2;
        int i2 = dkc.b;
        long b = ekc.b();
        if ((i & 16) != 0) {
            j4 = ekc.b();
            j5 = j;
            j6 = j2;
            akcVar = this;
        } else {
            j4 = j3;
            akcVar = this;
            j5 = j;
            j6 = j2;
        }
        new akc(j5, j6, f3, b, j4);
    }
}
