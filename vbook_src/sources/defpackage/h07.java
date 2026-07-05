package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h07  reason: default package */
/* loaded from: classes.dex */
public final class h07 implements l29 {
    public final n07 a;
    public zy5 b;
    public tc6 c;
    public zy5 d;
    public py5 e;

    public h07(n07 n07Var) {
        this.a = n07Var;
    }

    @Override // defpackage.l29
    public final long g(uy5 uy5Var, long j, tc6 tc6Var, long j2) {
        boolean b;
        py5 py5Var = this.e;
        if (py5Var != null) {
            zy5 zy5Var = this.b;
            boolean z = false;
            if (zy5Var == null) {
                b = false;
            } else {
                b = zy5.b(zy5Var.a, j);
            }
            if (b && this.c == tc6Var) {
                zy5 zy5Var2 = this.d;
                if (zy5Var2 != null) {
                    z = zy5.b(zy5Var2.a, j2);
                }
                if (z) {
                    return py5Var.a;
                }
            }
        }
        long g = this.a.g(uy5Var, j, tc6Var, j2);
        this.b = new zy5(j);
        this.c = tc6Var;
        this.d = new zy5(j2);
        this.e = new py5(g);
        return g;
    }
}
