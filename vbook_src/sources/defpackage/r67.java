package defpackage;

import android.util.Pair;
import java.io.IOException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r67  reason: default package */
/* loaded from: classes.dex */
public final class r67 implements k67, dl3 {
    public final t67 a;
    public final /* synthetic */ u67 b;

    public r67(u67 u67Var, t67 t67Var) {
        this.b = u67Var;
        this.a = t67Var;
    }

    @Override // defpackage.k67
    public final void G(int i, e67 e67Var, final cs6 cs6Var, final h57 h57Var, final int i2) {
        final Pair a = a(i, e67Var);
        if (a != null) {
            ((ggb) this.b.j).d(new Runnable() { // from class: p67
                @Override // java.lang.Runnable
                public final void run() {
                    ms2 ms2Var = (ms2) r67.this.b.i;
                    Pair pair = a;
                    ms2Var.G(((Integer) pair.first).intValue(), (e67) pair.second, cs6Var, h57Var, i2);
                }
            });
        }
    }

    public final Pair a(int i, e67 e67Var) {
        e67 e67Var2;
        t67 t67Var = this.a;
        e67 e67Var3 = null;
        if (e67Var != null) {
            int i2 = 0;
            while (true) {
                if (i2 < t67Var.c.size()) {
                    if (((e67) t67Var.c.get(i2)).d == e67Var.d) {
                        Object obj = e67Var.a;
                        Object obj2 = t67Var.b;
                        int i3 = l09.k;
                        e67Var2 = e67Var.a(Pair.create(obj2, obj));
                        break;
                    }
                    i2++;
                } else {
                    e67Var2 = null;
                    break;
                }
            }
            if (e67Var2 == null) {
                return null;
            }
            e67Var3 = e67Var2;
        }
        return Pair.create(Integer.valueOf(i + t67Var.d), e67Var3);
    }

    @Override // defpackage.k67
    public final void d(int i, e67 e67Var, h57 h57Var) {
        Pair a = a(i, e67Var);
        if (a != null) {
            ((ggb) this.b.j).d(new n67(this, a, h57Var, 1));
        }
    }

    @Override // defpackage.k67
    public final void e(int i, e67 e67Var, h57 h57Var) {
        Pair a = a(i, e67Var);
        if (a != null) {
            ((ggb) this.b.j).d(new n67(this, a, h57Var, 0));
        }
    }

    @Override // defpackage.k67
    public final void j(int i, e67 e67Var, cs6 cs6Var, h57 h57Var) {
        Pair a = a(i, e67Var);
        if (a != null) {
            ((ggb) this.b.j).d(new o67(this, a, cs6Var, h57Var, 0));
        }
    }

    @Override // defpackage.k67
    public final void m(int i, e67 e67Var, cs6 cs6Var, h57 h57Var) {
        Pair a = a(i, e67Var);
        if (a != null) {
            ((ggb) this.b.j).d(new o67(this, a, cs6Var, h57Var, 1));
        }
    }

    @Override // defpackage.k67
    public final void o(int i, e67 e67Var, final cs6 cs6Var, final h57 h57Var, final IOException iOException, final boolean z) {
        final Pair a = a(i, e67Var);
        if (a != null) {
            ((ggb) this.b.j).d(new Runnable() { // from class: q67
                @Override // java.lang.Runnable
                public final void run() {
                    ms2 ms2Var = (ms2) r67.this.b.i;
                    Pair pair = a;
                    ms2Var.o(((Integer) pair.first).intValue(), (e67) pair.second, cs6Var, h57Var, iOException, z);
                }
            });
        }
    }
}
