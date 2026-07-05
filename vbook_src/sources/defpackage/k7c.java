package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k7c  reason: default package */
/* loaded from: classes.dex */
public final class k7c {
    public final wu7 a;
    public j7c b;
    public long c;
    public long d;
    public long e;
    public long f;
    public float[] g;

    public k7c() {
        wu7 wu7Var = oy5.a;
        this.a = new wu7();
        this.c = -1L;
        this.d = 0L;
        this.e = 0L;
    }

    public final void a(j7c j7cVar, long j, long j2, float[] fArr, long j3) {
        boolean z;
        long j4 = j7cVar.g;
        if (j3 - j4 <= 0 && j4 != Long.MIN_VALUE) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            j7cVar.g = j3;
            j7cVar.a(j7cVar.e, j7cVar.f, j, j2, fArr);
        }
    }

    public final boolean b(long j, long j2, float[] fArr, int i, int i2) {
        boolean z;
        if (!py5.b(j2, this.d)) {
            this.d = j2;
            z = true;
        } else {
            z = false;
        }
        if (!py5.b(j, this.e)) {
            this.e = j;
            z = true;
        }
        if (fArr != null) {
            this.g = fArr;
            z = true;
        }
        long j3 = (i << 32) | (i2 & 4294967295L);
        if (j3 != this.f) {
            this.f = j3;
            return true;
        }
        return z;
    }
}
