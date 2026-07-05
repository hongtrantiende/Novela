package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u4d  reason: default package */
/* loaded from: classes.dex */
public final class u4d implements r4d {
    public final q4d a;
    public final yo9 b;
    public final long c;
    public final long d;

    public u4d(q4d q4dVar, yo9 yo9Var, long j) {
        this.a = q4dVar;
        this.b = yo9Var;
        this.c = (q4dVar.g() + q4dVar.o()) * 1000000;
        this.d = j * 1000000;
    }

    public final long b(long j) {
        long j2 = j + this.d;
        if (j2 <= 0) {
            return 0L;
        }
        long j3 = this.c;
        long min = Math.min(j2 / j3, 2L);
        if (this.b != yo9.a && min % 2 != 0) {
            return ((min + 1) * j3) - j2;
        }
        return j2 - (min * j3);
    }

    public final js c(long j, js jsVar, js jsVar2, js jsVar3) {
        long j2 = this.d;
        long j3 = this.c;
        if (j + j2 > j3) {
            return l(j3 - j2, jsVar, jsVar2, jsVar3);
        }
        return jsVar2;
    }

    @Override // defpackage.o4d
    public final long h(js jsVar, js jsVar2, js jsVar3) {
        return (3 * this.c) - this.d;
    }

    @Override // defpackage.o4d
    public final js l(long j, js jsVar, js jsVar2, js jsVar3) {
        return this.a.l(b(j), jsVar, jsVar2, c(j, jsVar, jsVar3, jsVar2));
    }

    @Override // defpackage.o4d
    public final js u(long j, js jsVar, js jsVar2, js jsVar3) {
        return this.a.u(b(j), jsVar, jsVar2, c(j, jsVar, jsVar3, jsVar2));
    }
}
