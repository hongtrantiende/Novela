package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dy2  reason: default package */
/* loaded from: classes.dex */
public final class dy2 extends jy2 implements Comparable {
    public final int e;
    public final int f;

    public dy2(int i, ajc ajcVar, int i2, gy2 gy2Var, int i3) {
        super(i, ajcVar, i2);
        int i4;
        this.e = ei0.n(i3, gy2Var.C) ? 1 : 0;
        vq4 vq4Var = this.d;
        int i5 = vq4Var.v;
        int i6 = -1;
        if (i5 != -1 && (i4 = vq4Var.w) != -1) {
            i6 = i5 * i4;
        }
        this.f = i6;
    }

    @Override // defpackage.jy2
    public final int a() {
        return this.e;
    }

    @Override // defpackage.jy2
    public final /* bridge */ /* synthetic */ boolean b(jy2 jy2Var) {
        dy2 dy2Var = (dy2) jy2Var;
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f, ((dy2) obj).f);
    }
}
