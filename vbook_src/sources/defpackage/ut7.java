package defpackage;

import java.util.List;
import java.util.NoSuchElementException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ut7  reason: default package */
/* loaded from: classes.dex */
public final class ut7 implements b7a {
    public final av7 a;
    public final List b;
    public final int c;
    public final int d;
    public final boolean e;
    public final g6a f;
    public cv7 g;

    public ut7(av7 av7Var, List list, int i, int i2, boolean z, g6a g6aVar) {
        this.a = av7Var;
        this.b = list;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = g6aVar;
        if (!(list.size() > 1)) {
            int size = list.size();
            ov5.c("MultiSelectionLayout requires an infoList size greater than 1, was " + size + ".");
        }
    }

    @Override // defpackage.b7a
    public final boolean a() {
        return this.e;
    }

    @Override // defpackage.b7a
    public final z5a b() {
        if (this.e) {
            return k();
        }
        return h();
    }

    @Override // defpackage.b7a
    public final z5a c(long j) {
        cv7 cv7Var = this.g;
        if (cv7Var == null) {
            cv7Var = new cv7();
            List list = this.b;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                z5a z5aVar = (z5a) list.get(i);
                long j2 = z5aVar.a;
                int c = cv7Var.c(j2);
                Object[] objArr = cv7Var.c;
                Object obj = objArr[c];
                cv7Var.b[c] = j2;
                objArr[c] = z5aVar;
            }
            this.g = cv7Var;
        }
        return (z5a) cv7Var.e(j);
    }

    @Override // defpackage.b7a
    public final g6a d() {
        return this.f;
    }

    @Override // defpackage.b7a
    public final z5a e() {
        if (i() == jd2.a) {
            return h();
        }
        return k();
    }

    @Override // defpackage.b7a
    public final int f() {
        return this.b.size();
    }

    @Override // defpackage.b7a
    public final int g() {
        return this.d;
    }

    @Override // defpackage.b7a
    public final z5a h() {
        return (z5a) this.b.get(p(this.d, false));
    }

    @Override // defpackage.b7a
    public final jd2 i() {
        int i = this.c;
        int i2 = this.d;
        if (i < i2) {
            return jd2.b;
        }
        if (i > i2) {
            return jd2.a;
        }
        return ((z5a) this.b.get(i / 2)).b();
    }

    @Override // defpackage.b7a
    public final void j(h66 h66Var) {
        z5a h;
        int o = o(e().a);
        if (i() == jd2.a) {
            h = k();
        } else {
            h = h();
        }
        int o2 = o(h.a);
        int i = o + 1;
        if (i < o2) {
            while (i < o2) {
                h66Var.invoke(this.b.get(i));
                i++;
            }
        }
    }

    @Override // defpackage.b7a
    public final z5a k() {
        return (z5a) this.b.get(p(this.c, true));
    }

    @Override // defpackage.b7a
    public final int l() {
        return this.c;
    }

    @Override // defpackage.b7a
    public final boolean m(b7a b7aVar) {
        if (this.f != null && b7aVar != null && (b7aVar instanceof ut7)) {
            ut7 ut7Var = (ut7) b7aVar;
            List list = ut7Var.b;
            if (this.e == ut7Var.e && this.c == ut7Var.c && this.d == ut7Var.d) {
                List list2 = this.b;
                if (list2.size() == list.size()) {
                    int size = list2.size();
                    for (int i = 0; i < size; i++) {
                        z5a z5aVar = (z5a) list2.get(i);
                        z5a z5aVar2 = (z5a) list.get(i);
                        if (z5aVar.a != z5aVar2.a || z5aVar.c != z5aVar2.c || z5aVar.d != z5aVar2.d) {
                            return true;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    @Override // defpackage.b7a
    public final cv7 n(g6a g6aVar) {
        return nye.p(g6aVar, this.b, new bo7(7), new el7(g6aVar, 2), new tt7(g6aVar, 0));
    }

    public final int o(long j) {
        try {
            return this.a.c(j);
        } catch (NoSuchElementException e) {
            throw new IllegalStateException(hl5.k(j, "Invalid selectableId: "), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int p(int i, boolean z) {
        int ordinal = i().ordinal();
        int i2 = z;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    xk5.o();
                    return 0;
                }
                i2 = 1;
            }
            return (i - (i2 ^ 1)) / 2;
        }
        if (z != 0) {
            i2 = 0;
            return (i - (i2 ^ 1)) / 2;
        }
        i2 = 1;
        return (i - (i2 ^ 1)) / 2;
    }

    public final String toString() {
        boolean z = true;
        float f = (this.c + 1) / 2.0f;
        float f2 = (this.d + 1) / 2.0f;
        jd2 i = i();
        StringBuilder sb = new StringBuilder("[\n\t");
        List list = this.b;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            z5a z5aVar = (z5a) list.get(i2);
            if (z) {
                z = false;
            } else {
                sb.append(",\n\t");
            }
            i2++;
            sb.append(i2 + " -> " + z5aVar);
        }
        sb.append("\n]");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder("MultiSelectionLayout(isStartHandle=");
        sb3.append(this.e);
        sb3.append(", startPosition=");
        sb3.append(f);
        sb3.append(", endPosition=");
        sb3.append(f2);
        sb3.append(", crossed=");
        sb3.append(i);
        sb3.append(", infos=");
        return s21.q(sb3, sb2, ")");
    }
}
