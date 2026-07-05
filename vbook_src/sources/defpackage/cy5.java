package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cy5  reason: default package */
/* loaded from: classes.dex */
public final class cy5 implements dy5 {
    public final int a;
    public final long b;

    public cy5(int i, long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        wq9.s(z);
        this.a = i;
        this.b = j;
    }

    public static cy5 b(s94 s94Var, km8 km8Var) {
        s94Var.x(km8Var.a, 0, 8);
        km8Var.M(0);
        return new cy5(km8Var.q(), km8Var.m(), false);
    }

    public boolean a() {
        int i = this.a;
        if (i == 0 || i == 1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.dy5
    public zx5 toInstant() {
        long j = zx5.c.a;
        long j2 = this.b;
        if (j2 >= j && j2 <= zx5.d.a) {
            return bze.l(j2, this.a);
        }
        throw new IllegalArgumentException("The parsed date is outside the range representable by Instant (Unix epoch second " + j2 + ')');
    }

    public /* synthetic */ cy5(long j, int i, boolean z) {
        this.a = i;
        this.b = j;
    }

    public cy5(long j, int i) {
        this.b = j;
        this.a = i;
    }
}
