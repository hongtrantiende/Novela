package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v5  reason: default package */
/* loaded from: classes.dex */
public final class v5 extends sha {
    public cga a;
    public final hm8 b;

    public v5(cga cgaVar, rk9 rk9Var) {
        this.a = cgaVar;
        this.b = yae.z(rk9Var);
    }

    @Override // defpackage.sha
    public final sha a(jga jgaVar, cga cgaVar, long j, long j2, long j3) {
        Object obj;
        oaa oaaVar = new oaa(j, y78.i(j2, j3), j3);
        rk9 c = c();
        if (c == null) {
            cga cgaVar2 = this.a;
            if (cgaVar2 == null) {
                List b = jgaVar.b();
                int size = b.size();
                int i = 0;
                while (true) {
                    if (i < size) {
                        obj = b.get(i);
                        if (jgaVar.c().contains((kga) obj)) {
                            break;
                        }
                        i++;
                    } else {
                        obj = null;
                        break;
                    }
                }
                kga kgaVar = (kga) obj;
                if (kgaVar != null) {
                    cgaVar2 = kgaVar.H;
                } else {
                    cgaVar2 = null;
                }
            }
            c = hc2.d(jgaVar, cgaVar2);
            if (c == null) {
                c = npe.n(j2, j);
            }
        }
        hc2.e(oaaVar, j, j2, j3, true);
        return new u5(oaaVar, cgaVar, c);
    }

    @Override // defpackage.sha
    public final boolean b() {
        return true;
    }

    @Override // defpackage.sha
    public final rk9 c() {
        return (rk9) this.b.getValue();
    }

    @Override // defpackage.sha
    public final oaa e() {
        return null;
    }

    @Override // defpackage.sha
    public final rk9 f(jga jgaVar) {
        Object obj;
        rk9 c = c();
        if (c != null) {
            return c;
        }
        if (c() == null) {
            cga cgaVar = this.a;
            if (cgaVar == null) {
                List b = jgaVar.b();
                int size = b.size();
                int i = 0;
                while (true) {
                    if (i < size) {
                        obj = b.get(i);
                        if (jgaVar.c().contains((kga) obj)) {
                            break;
                        }
                        i++;
                    } else {
                        obj = null;
                        break;
                    }
                }
                kga kgaVar = (kga) obj;
                if (kgaVar != null) {
                    cgaVar = kgaVar.H;
                } else {
                    cgaVar = null;
                }
            }
            rk9 d = hc2.d(jgaVar, cgaVar);
            if (d != null) {
                this.b.setValue(d);
            }
        }
        return c();
    }

    @Override // defpackage.sha
    public final sha g(cga cgaVar) {
        if (this.a == null) {
            this.a = cgaVar;
        }
        return this;
    }

    @Override // defpackage.sha
    public final sha h() {
        return t28.a;
    }

    @Override // defpackage.sha
    public final void i(rk9 rk9Var) {
        this.b.setValue(rk9Var);
    }
}
