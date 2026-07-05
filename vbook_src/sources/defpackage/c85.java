package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c85  reason: default package */
/* loaded from: classes.dex */
public final class c85 implements gx9 {
    public final int a;
    public final g85 b;
    public int c = -1;

    public c85(g85 g85Var, int i) {
        this.b = g85Var;
        this.a = i;
    }

    @Override // defpackage.gx9
    public final boolean a() {
        if (this.c != -3) {
            if (e()) {
                int i = this.c;
                g85 g85Var = this.b;
                if (g85Var.E() || !g85Var.R[i].z(g85Var.p0)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.gx9
    public final void b() {
        int i = this.c;
        g85 g85Var = this.b;
        if (i != -2) {
            if (i == -1) {
                g85Var.G();
                return;
            } else if (i != -3) {
                g85Var.G();
                g85Var.R[i].B();
                return;
            } else {
                return;
            }
        }
        g85Var.b();
        throw new IOException(hl5.n("Unable to bind a sample queue to TrackGroup with MIME type ", g85Var.e0.a(this.a).d[0].o, "."));
    }

    @Override // defpackage.gx9
    public final int c(s6f s6fVar, cr2 cr2Var, int i) {
        vq4 vq4Var;
        if (this.c == -3) {
            cr2Var.b(4);
            return -4;
        }
        if (e()) {
            int i2 = this.c;
            g85 g85Var = this.b;
            ArrayList arrayList = g85Var.J;
            if (!g85Var.E()) {
                int i3 = 0;
                if (!arrayList.isEmpty()) {
                    int i4 = 0;
                    loop0: while (i4 < arrayList.size() - 1) {
                        int i5 = ((g75) arrayList.get(i4)).G;
                        int length = g85Var.R.length;
                        for (int i6 = 0; i6 < length; i6++) {
                            if (g85Var.j0[i6] && g85Var.R[i6].D() == i5) {
                                break loop0;
                            }
                        }
                        i4++;
                    }
                    a2d.V(arrayList, 0, i4);
                    g75 g75Var = (g75) arrayList.get(0);
                    vq4 vq4Var2 = g75Var.d;
                    if (!vq4Var2.equals(g85Var.c0)) {
                        g85Var.G.b(g85Var.b, vq4Var2, g75Var.e, g75Var.f, g75Var.C);
                    }
                    g85Var.c0 = vq4Var2;
                }
                if (arrayList.isEmpty() || ((g75) arrayList.get(0)).h()) {
                    int E = g85Var.R[i2].E(s6fVar, cr2Var, i, g85Var.p0);
                    if (E == -5) {
                        vq4 vq4Var3 = (vq4) s6fVar.b;
                        vq4Var3.getClass();
                        if (i2 == g85Var.X) {
                            int g = hc2.g(g85Var.R[i2].D());
                            while (i3 < arrayList.size() && ((g75) arrayList.get(i3)).G != g) {
                                i3++;
                            }
                            if (i3 < arrayList.size()) {
                                vq4Var = ((g75) arrayList.get(i3)).d;
                            } else {
                                vq4Var = g85Var.b0;
                                vq4Var.getClass();
                            }
                            vq4Var3 = vq4Var3.d(vq4Var);
                        }
                        s6fVar.b = vq4Var3;
                    }
                    return E;
                }
            }
        }
        return -3;
    }

    public final void d() {
        boolean z;
        if (this.c == -1) {
            z = true;
        } else {
            z = false;
        }
        wq9.s(z);
        g85 g85Var = this.b;
        g85Var.b();
        g85Var.g0.getClass();
        int[] iArr = g85Var.g0;
        int i = this.a;
        int i2 = iArr[i];
        if (i2 == -1) {
            if (g85Var.f0.contains(g85Var.e0.a(i))) {
                i2 = -3;
            }
            i2 = -2;
        } else {
            boolean[] zArr = g85Var.j0;
            if (!zArr[i2]) {
                zArr[i2] = true;
            }
            i2 = -2;
        }
        this.c = i2;
    }

    public final boolean e() {
        int i = this.c;
        if (i != -1 && i != -3 && i != -2) {
            return true;
        }
        return false;
    }

    @Override // defpackage.gx9
    public final int m(long j) {
        Object next;
        Object obj;
        if (e()) {
            int i = this.c;
            g85 g85Var = this.b;
            if (!g85Var.E()) {
                f85 f85Var = g85Var.R[i];
                int w = f85Var.w(g85Var.p0, j);
                ArrayList arrayList = g85Var.J;
                if (arrayList != null) {
                    if (!arrayList.isEmpty()) {
                        obj = nk2.n(1, arrayList);
                    }
                    obj = null;
                } else {
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        do {
                            next = it.next();
                        } while (it.hasNext());
                        obj = next;
                    }
                    obj = null;
                }
                g75 g75Var = (g75) obj;
                if (g75Var != null && !g75Var.h()) {
                    w = Math.min(w, g75Var.g(i) - f85Var.u());
                }
                f85Var.J(w);
                return w;
            }
            return 0;
        }
        return 0;
    }
}
