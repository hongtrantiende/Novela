package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kga  reason: default package */
/* loaded from: classes.dex */
public final class kga implements bn9 {
    public final hm8 C;
    public final hm8 D;
    public final hm8 E;
    public yj F;
    public kga G;
    public cga H;
    public final hm8 d;
    public final hm8 e;
    public final hm8 a = yae.z(Boolean.FALSE);
    public final dm8 b = new dm8(nae.e);
    public final hm8 c = yae.z(Boolean.TRUE);
    public final hm8 f = yae.z(gha.b);
    public final hm8 I = yae.z(null);

    public kga(jga jgaVar, vt0 vt0Var, boolean z, mha mhaVar, iha ihaVar) {
        this.d = yae.z(jgaVar);
        this.e = yae.z(vt0Var);
        this.C = yae.z(Boolean.valueOf(z));
        this.D = yae.z(mhaVar);
        this.E = yae.z(ihaVar);
    }

    @Override // defpackage.bn9
    public final void b() {
        lha lhaVar = e().b;
        jga e = e();
        e.d.setValue(sl1.l0(e.b(), this));
        e.e.setValue(sl1.l0(e.c(), this));
        e.e();
        lhaVar.f();
        hm8 hm8Var = lhaVar.C;
        hm8Var.setValue(sl1.l0((List) hm8Var.getValue(), this));
        if (e.b().isEmpty()) {
            z87.v(e.b.b, null, null, new iz7(e, this, null, 9), 3);
        }
        e().c.e();
    }

    @Override // defpackage.bn9
    public final void c() {
        lha lhaVar = e().b;
        jga e = e();
        e.d.setValue(sl1.o0(e.b(), this));
        e.e();
        lhaVar.f();
        hm8 hm8Var = lhaVar.C;
        List list = (List) hm8Var.getValue();
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                kga kgaVar = (kga) it.next();
                jga jgaVar = null;
                if (!(kgaVar instanceof kga)) {
                    kgaVar = null;
                }
                if (kgaVar != null) {
                    jgaVar = kgaVar.e();
                }
                if (c16.i(jgaVar, e())) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i != -1 && i < list.size() - 1) {
            jq6 t = tl1.t();
            int i2 = i + 1;
            t.addAll(list.subList(0, i2));
            t.add(this);
            t.addAll(list.subList(i2, list.size()));
            hm8Var.setValue(tl1.r(t));
        } else {
            hm8Var.setValue(sl1.o0((List) hm8Var.getValue(), this));
        }
        e().c.e();
    }

    public final vt0 d() {
        return (vt0) this.e.getValue();
    }

    public final jga e() {
        return (jga) this.d.getValue();
    }

    public final boolean f() {
        if (!d().b()) {
            if ((!e().c.d().d() || e().c.d().b()) && ((Boolean) this.C.getValue()).booleanValue()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean g() {
        if (f() && e().c.d().d() && h() && ((Boolean) this.c.getValue()).booleanValue() && e().b.b()) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        iha ihaVar = (iha) this.E.getValue();
        if (((Boolean) this.a.getValue()).booleanValue()) {
            ((fha) ihaVar.b.getValue()).getClass();
            return true;
        }
        return false;
    }

    @Override // defpackage.bn9
    public final void a() {
    }
}
