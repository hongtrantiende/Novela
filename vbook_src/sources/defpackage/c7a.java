package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c7a  reason: default package */
/* loaded from: classes.dex */
public final class c7a {
    public final long a;
    public final long b;
    public final sc6 c;
    public final boolean d;
    public final g6a e;
    public final b7a f;
    public final la3 g;
    public final av7 h;
    public final ArrayList i;
    public int j;
    public int k;
    public int l;

    public c7a(long j, long j2, sc6 sc6Var, boolean z, g6a g6aVar, b7a b7aVar, la3 la3Var) {
        this.a = j;
        this.b = j2;
        this.c = sc6Var;
        this.d = z;
        this.e = g6aVar;
        this.f = b7aVar;
        this.g = la3Var;
        int i = xx6.a;
        this.h = new av7(6);
        this.i = new ArrayList();
        this.j = -1;
        this.k = -1;
        this.l = -1;
    }

    public final int a(int i, i73 i73Var, i73 i73Var2) {
        if (i == -1) {
            int ordinal = nye.A(i73Var, i73Var2).ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        xk5.o();
                        return 0;
                    }
                } else {
                    return this.l;
                }
            } else {
                return this.l - 1;
            }
        }
        return i;
    }
}
