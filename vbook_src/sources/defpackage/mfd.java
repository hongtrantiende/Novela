package defpackage;

import java.math.RoundingMode;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mfd  reason: default package */
/* loaded from: classes.dex */
public final class mfd implements m4a {
    public final lm8 a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public mfd(lm8 lm8Var, int i, long j, long j2) {
        this.a = lm8Var;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / lm8Var.c;
        this.d = j3;
        this.e = h(j3);
    }

    @Override // defpackage.m4a
    public final boolean c() {
        return true;
    }

    @Override // defpackage.m4a
    public final l4a e(long j) {
        lm8 lm8Var = this.a;
        long j2 = (lm8Var.b * j) / (this.b * 1000000);
        long j3 = this.d - 1;
        long j4 = a2d.j(j2, 0L, j3);
        int i = lm8Var.c;
        long j5 = this.c;
        long h = h(j4);
        p4a p4aVar = new p4a(h, (i * j4) + j5);
        if (h < j && j4 != j3) {
            long j6 = j4 + 1;
            return new l4a(p4aVar, new p4a(h(j6), (i * j6) + j5));
        }
        return new l4a(p4aVar, p4aVar);
    }

    @Override // defpackage.m4a
    public final long g() {
        return this.e;
    }

    public final long h(long j) {
        long j2 = this.a.b;
        String str = a2d.a;
        return a2d.Y(j * this.b, 1000000L, j2, RoundingMode.DOWN);
    }
}
