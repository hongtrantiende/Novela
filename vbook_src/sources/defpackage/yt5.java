package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yt5  reason: default package */
/* loaded from: classes.dex */
public final class yt5 implements m4a {
    public final tx6 a;
    public final tx6 b;
    public long c;

    public yt5(long j, long[] jArr, long[] jArr2) {
        boolean z;
        if (jArr.length == jArr2.length) {
            z = true;
        } else {
            z = false;
        }
        wq9.s(z);
        int length = jArr2.length;
        if (length > 0 && jArr2[0] > 0) {
            int i = length + 1;
            tx6 tx6Var = new tx6(i);
            this.a = tx6Var;
            tx6 tx6Var2 = new tx6(i);
            this.b = tx6Var2;
            tx6Var.a(0L);
            tx6Var2.a(0L);
        } else {
            this.a = new tx6(length);
            this.b = new tx6(length);
        }
        this.a.b(jArr);
        this.b.b(jArr2);
        this.c = j;
    }

    @Override // defpackage.m4a
    public final boolean c() {
        if (this.b.b > 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.m4a
    public final l4a e(long j) {
        tx6 tx6Var = this.b;
        if (tx6Var.b == 0) {
            p4a p4aVar = p4a.c;
            return new l4a(p4aVar, p4aVar);
        }
        int c = a2d.c(tx6Var, j);
        long d = tx6Var.d(c);
        tx6 tx6Var2 = this.a;
        p4a p4aVar2 = new p4a(d, tx6Var2.d(c));
        if (d != j && c != tx6Var.b - 1) {
            int i = c + 1;
            return new l4a(p4aVar2, new p4a(tx6Var.d(i), tx6Var2.d(i)));
        }
        return new l4a(p4aVar2, p4aVar2);
    }

    @Override // defpackage.m4a
    public final long g() {
        return this.c;
    }
}
