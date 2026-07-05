package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ge0  reason: default package */
/* loaded from: classes.dex */
public class ge0 implements m4a {
    public final /* synthetic */ int a;
    public final long b;
    public final Object c;

    public ge0(long j, long j2) {
        p4a p4aVar;
        this.a = 2;
        this.b = j;
        if (j2 == 0) {
            p4aVar = p4a.c;
        } else {
            p4aVar = new p4a(0L, j2);
        }
        this.c = new l4a(p4aVar, p4aVar);
    }

    @Override // defpackage.m4a
    public final boolean c() {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.m4a
    public final l4a e(long j) {
        long j2;
        int i = this.a;
        int i2 = 1;
        Object obj = this.c;
        switch (i) {
            case 0:
                he0 he0Var = (he0) obj;
                l4a b = he0Var.i[0].b(j);
                while (true) {
                    kh1[] kh1VarArr = he0Var.i;
                    if (i2 < kh1VarArr.length) {
                        l4a b2 = kh1VarArr[i2].b(j);
                        if (b2.a.b < b.a.b) {
                            b = b2;
                        }
                        i2++;
                    } else {
                        return b;
                    }
                }
            case 1:
                bi4 bi4Var = (bi4) obj;
                bi4Var.k.getClass();
                s6f s6fVar = bi4Var.k;
                long[] jArr = (long[]) s6fVar.a;
                long[] jArr2 = (long[]) s6fVar.b;
                int f = a2d.f(jArr, a2d.j((bi4Var.e * j) / 1000000, 0L, bi4Var.j - 1), false);
                long j3 = 0;
                if (f == -1) {
                    j2 = 0;
                } else {
                    j2 = jArr[f];
                }
                if (f != -1) {
                    j3 = jArr2[f];
                }
                int i3 = bi4Var.e;
                long j4 = (j2 * 1000000) / i3;
                long j5 = this.b;
                p4a p4aVar = new p4a(j4, j3 + j5);
                if (j4 != j && f != jArr.length - 1) {
                    int i4 = f + 1;
                    return new l4a(p4aVar, new p4a((jArr[i4] * 1000000) / i3, j5 + jArr2[i4]));
                }
                return new l4a(p4aVar, p4aVar);
            default:
                return (l4a) obj;
        }
    }

    @Override // defpackage.m4a
    public final long g() {
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
                return ((bi4) this.c).b();
            default:
                return this.b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ge0(long j) {
        this(j, 0L);
        this.a = 2;
    }

    public /* synthetic */ ge0(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }
}
