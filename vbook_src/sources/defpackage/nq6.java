package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nq6  reason: default package */
/* loaded from: classes.dex */
public final class nq6 extends oq6 {
    @Override // defpackage.oq6
    public final void a(Object obj, long j) {
        ((g3) fxc.c.i(obj, j)).a = false;
    }

    @Override // defpackage.oq6
    public final void b(Object obj, long j, Object obj2) {
        cxc cxcVar = fxc.c;
        g3 g3Var = (g3) cxcVar.i(obj, j);
        g3 g3Var2 = (g3) cxcVar.i(obj2, j);
        int size = g3Var.size();
        int size2 = g3Var2.size();
        if (size > 0 && size2 > 0) {
            if (!g3Var.a) {
                g3Var = g3Var.b(size2 + size);
            }
            g3Var.addAll(g3Var2);
        }
        if (size > 0) {
            g3Var2 = g3Var;
        }
        fxc.o(obj, j, g3Var2);
    }

    @Override // defpackage.oq6
    public final List c(Object obj, long j) {
        int i;
        g3 g3Var = (g3) fxc.c.i(obj, j);
        if (!g3Var.a) {
            int size = g3Var.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size * 2;
            }
            g3 b = g3Var.b(i);
            fxc.o(obj, j, b);
            return b;
        }
        return g3Var;
    }
}
