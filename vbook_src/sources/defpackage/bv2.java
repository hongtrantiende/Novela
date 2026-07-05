package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bv2  reason: default package */
/* loaded from: classes.dex */
public final class bv2 {
    public int a;
    public boolean b;
    public int c;
    public float d;
    public Object e;

    public static int a(fj6 fj6Var, boolean z) {
        if (z) {
            return ((gj6) sl1.j0(fj6Var.k)).a + 1;
        }
        return ((gj6) sl1.c0(fj6Var.k)).a - 1;
    }

    public static int b(eg6 eg6Var, boolean z) {
        int i;
        int i2;
        ff8 ff8Var = ff8.a;
        if (z) {
            fg6 fg6Var = (fg6) sl1.j0(eg6Var.m);
            if (eg6Var.q == ff8Var) {
                i2 = fg6Var.y;
            } else {
                i2 = fg6Var.z;
            }
            return i2 + 1;
        }
        fg6 fg6Var2 = (fg6) sl1.c0(eg6Var.m);
        if (eg6Var.q == ff8Var) {
            i = fg6Var2.y;
        } else {
            i = fg6Var2.z;
        }
        return i - 1;
    }
}
