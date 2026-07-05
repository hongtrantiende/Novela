package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cl  reason: default package */
/* loaded from: classes.dex */
public final class cl implements p9b, nm {
    public final String a;
    public final it4 b;
    public final ArrayList c;

    public cl(String str, it4 it4Var, int i) {
        str.getClass();
        it4Var.getClass();
        this.a = str;
        this.b = it4Var;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(null);
        }
        this.c = arrayList;
    }

    @Override // defpackage.nm
    public final void g(int i, String str) {
        this.c.set(i, new bl(str, i, 0));
    }

    @Override // defpackage.nm
    public final long h() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.nm
    public final Object i(xt4 xt4Var) {
        xt4Var.getClass();
        Cursor g0 = this.b.g0(this);
        try {
            Object value = ((uf9) xt4Var.invoke(new ph(g0))).getValue();
            g0.close();
            return value;
        } finally {
        }
    }

    @Override // defpackage.nm
    public final void j(int i, Long l) {
        this.c.set(i, new al(l, i, 2));
    }

    @Override // defpackage.nm
    public final void k(int i, Double d) {
        this.c.set(i, new al(d, i, 1));
    }

    @Override // defpackage.nm
    public final void l(int i, Boolean bool) {
        this.c.set(i, new al(bool, i, 0));
    }

    @Override // defpackage.p9b
    public final String m() {
        return this.a;
    }

    @Override // defpackage.p9b
    public final void r(o9b o9bVar) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            xt4 xt4Var = (xt4) obj;
            xt4Var.getClass();
            xt4Var.invoke(o9bVar);
        }
    }

    public final String toString() {
        return this.a;
    }

    @Override // defpackage.nm
    public final void close() {
    }
}
