package defpackage;

import java.io.StringReader;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: unc  reason: default package */
/* loaded from: classes.dex */
public abstract class unc {
    public t6f a;
    public vc1 b;
    public rcc c;
    public uc3 d;
    public ArrayList e;
    public String f;
    public dcc g;
    public qm8 h;
    public fkb i;
    public ybc j;
    public xbc k;

    public final cp3 a() {
        int i;
        ArrayList arrayList = this.e;
        if (arrayList != null) {
            i = arrayList.size();
        } else {
            i = 0;
        }
        if (i > 0) {
            ArrayList arrayList2 = this.e;
            arrayList2.getClass();
            Object obj = arrayList2.get(i - 1);
            obj.getClass();
            return (cp3) obj;
        }
        return j();
    }

    public final boolean b(String str) {
        int i;
        ArrayList arrayList = this.e;
        if (arrayList != null) {
            i = arrayList.size();
        } else {
            i = 0;
        }
        if (i != 0) {
            cp3 a = a();
            if (c16.i(a.e.b, str) && c16.i(a.e.c, "http://www.w3.org/1999/xhtml")) {
                return true;
            }
        }
        return false;
    }

    public int c() {
        return 512;
    }

    public String d() {
        return "http://www.w3.org/1999/xhtml";
    }

    public abstract qm8 e();

    public fkb f() {
        mfb mfbVar = fkb.d;
        return que.d();
    }

    public final void g() {
        int i = k().b;
        if (i == Integer.MAX_VALUE) {
            return;
        }
        while (true) {
            ArrayList arrayList = this.e;
            arrayList.getClass();
            if (arrayList.size() >= i) {
                cp3 r = r();
                if (r != null) {
                    p(r);
                }
            } else {
                return;
            }
        }
    }

    public final void h(String str) {
        iv7 iv7Var = (iv7) k().d;
        if (iv7Var.b()) {
            ((ArrayList) iv7Var.b).add(new nm8(l(), str));
        }
    }

    public final dcc i() {
        dcc dccVar = this.g;
        if (dccVar != null) {
            return dccVar;
        }
        c16.w("currentToken");
        throw null;
    }

    public final uc3 j() {
        uc3 uc3Var = this.d;
        if (uc3Var != null) {
            return uc3Var;
        }
        c16.w("doc");
        throw null;
    }

    public final t6f k() {
        t6f t6fVar = this.a;
        if (t6fVar != null) {
            return t6fVar;
        }
        c16.w("parser");
        throw null;
    }

    public final vc1 l() {
        vc1 vc1Var = this.b;
        if (vc1Var != null) {
            return vc1Var;
        }
        c16.w("reader");
        throw null;
    }

    public final qm8 m() {
        qm8 qm8Var = this.h;
        if (qm8Var != null) {
            return qm8Var;
        }
        c16.w("settings");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xbc, zbc] */
    /* JADX WARN: Type inference failed for: r3v7, types: [dcc, zbc, ybc] */
    public void n(StringReader stringReader, String str, t6f t6fVar) {
        this.k = new zbc(acc.c, this);
        this.d = new uc3(((unc) t6fVar.c).d(), str);
        j().I = t6fVar;
        this.a = t6fVar;
        this.h = (qm8) t6fVar.e;
        this.b = new vc1(stringReader);
        vc1 l = l();
        ((iv7) t6fVar.d).getClass();
        l.F = null;
        ((iv7) t6fVar.d).getClass();
        this.c = new rcc(this);
        this.e = new ArrayList(32);
        this.i = t6fVar.n();
        ?? zbcVar = new zbc(acc.b, this);
        this.j = zbcVar;
        this.g = zbcVar;
        this.f = str;
        j();
    }

    public abstract unc o();

    public final uc3 q(StringReader stringReader, String str, t6f t6fVar) {
        n(stringReader, str, t6fVar);
        w();
        return j();
    }

    public cp3 r() {
        Integer num;
        ArrayList arrayList;
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null) {
            num = Integer.valueOf(arrayList2.size());
        } else {
            num = null;
        }
        if (num == null || (arrayList = this.e) == null) {
            return null;
        }
        return (cp3) arrayList.remove(num.intValue() - 1);
    }

    public abstract boolean s(dcc dccVar);

    public final boolean t(String str) {
        str.getClass();
        dcc i = i();
        xbc xbcVar = this.k;
        if (xbcVar != null) {
            if (i == xbcVar) {
                zbc zbcVar = new zbc(acc.c, this);
                zbcVar.T(str);
                return s(zbcVar);
            }
            xbcVar.f();
            xbcVar.T(str);
            return s(xbcVar);
        }
        c16.w("end");
        throw null;
    }

    public final void u(String str) {
        ybc ybcVar = this.j;
        if (ybcVar != null) {
            if (i() == ybcVar) {
                zbc zbcVar = new zbc(acc.b, this);
                zbcVar.T(str);
                s(zbcVar);
                return;
            }
            ybcVar.f();
            ybcVar.T(str);
            s(ybcVar);
            return;
        }
        c16.w("start");
        throw null;
    }

    public final void v(cp3 cp3Var) {
        cp3Var.getClass();
        ArrayList arrayList = this.e;
        arrayList.getClass();
        arrayList.add(cp3Var);
    }

    public final void w() {
        while (true) {
            if (((acc) i().c) == acc.C) {
                ArrayList arrayList = this.e;
                if (arrayList == null) {
                    if (this.b == null) {
                        return;
                    }
                    l().close();
                    this.c = null;
                    this.e = null;
                    return;
                } else if (arrayList.isEmpty()) {
                    j();
                    this.e = null;
                } else {
                    r();
                }
            } else {
                rcc rccVar = this.c;
                rccVar.getClass();
                tbc tbcVar = rccVar.k;
                while (!rccVar.e) {
                    rccVar.c.a(rccVar, rccVar.a);
                }
                boolean A = tbcVar.d.A();
                tbc tbcVar2 = tbcVar;
                if (!A) {
                    rccVar.e = false;
                    dcc dccVar = rccVar.d;
                    tbcVar2 = dccVar;
                    if (dccVar == null) {
                        vs.k("Required value was null.");
                        return;
                    }
                }
                this.g = tbcVar2;
                s(tbcVar2);
                tbcVar2.f();
            }
        }
    }

    public final wjb x(ybc ybcVar) {
        ybcVar.getClass();
        fkb fkbVar = this.i;
        if (fkbVar != null) {
            String V = ybcVar.d.V();
            String str = ybcVar.e;
            str.getClass();
            return fkbVar.c(V, m().a, str, d());
        }
        c16.w("tagSet");
        throw null;
    }

    public final wjb y(String str, String str2, String str3, qm8 qm8Var) {
        rs8.w(str, str2, str3);
        fkb fkbVar = this.i;
        if (fkbVar != null) {
            return fkbVar.c(str, qm8Var.a, str2, str3);
        }
        c16.w("tagSet");
        throw null;
    }

    public void p(cp3 cp3Var) {
    }
}
