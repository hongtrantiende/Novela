package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a38  reason: default package */
/* loaded from: classes.dex */
public final class a38 {
    public mq7 a;
    public int b;
    public gw7 c;
    public gw7 d;
    public boolean e;
    public final /* synthetic */ kn f;

    public a38(kn knVar, mq7 mq7Var, int i, gw7 gw7Var, gw7 gw7Var2, boolean z) {
        this.f = knVar;
        this.a = mq7Var;
        this.b = i;
        this.c = gw7Var;
        this.d = gw7Var2;
        this.e = z;
    }

    public final boolean a(int i, int i2) {
        gw7 gw7Var = this.c;
        int i3 = this.b;
        lq7 lq7Var = (lq7) gw7Var.a[i + i3];
        lq7 lq7Var2 = (lq7) this.d.a[i3 + i2];
        if (c16.i(lq7Var, lq7Var2) || lq7Var.getClass() == lq7Var2.getClass()) {
            return true;
        }
        return false;
    }
}
