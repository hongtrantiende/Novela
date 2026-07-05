package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z5a  reason: default package */
/* loaded from: classes.dex */
public final class z5a {
    public final long a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final fvb f;

    public z5a(long j, int i, int i2, int i3, int i4, fvb fvbVar) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = fvbVar;
    }

    public final f6a a(int i) {
        return new f6a(lye.n(this.f, i), i, this.a);
    }

    public final jd2 b() {
        int i = this.c;
        int i2 = this.d;
        if (i < i2) {
            return jd2.b;
        }
        if (i > i2) {
            return jd2.a;
        }
        return jd2.c;
    }

    public final g6a c(int i, int i2) {
        boolean z;
        f6a a = a(i);
        f6a a2 = a(i2);
        if (i > i2) {
            z = true;
        } else {
            z = false;
        }
        return new g6a(a, a2, z);
    }

    public final String toString() {
        fvb fvbVar = this.f;
        int i = this.c;
        oq9 n = lye.n(fvbVar, i);
        int i2 = this.d;
        oq9 n2 = lye.n(fvbVar, i2);
        return "SelectionInfo(id=" + this.a + ", range=(" + i + "-" + n + "," + i2 + "-" + n2 + "), prevOffset=" + this.e + ")";
    }
}
