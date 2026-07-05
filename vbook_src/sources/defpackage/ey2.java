package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ey2  reason: default package */
/* loaded from: classes.dex */
public final class ey2 implements Comparable {
    public final boolean a;
    public final boolean b;

    public ey2(vq4 vq4Var, int i) {
        this.a = (vq4Var.e & 1) != 0;
        this.b = ei0.n(i, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ey2 ey2Var = (ey2) obj;
        return ys1.a.c(this.b, ey2Var.b).c(this.a, ey2Var.a).e();
    }
}
