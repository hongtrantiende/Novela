package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jga  reason: default package */
/* loaded from: classes.dex */
public final class jga {
    public final Object a;
    public final lha b;
    public final kl9 c = new kl9(this);
    public final hm8 d;
    public final hm8 e;
    public final lq f;
    public boolean g;
    public final iga h;
    public final iga i;

    public jga(Object obj, lha lhaVar) {
        this.a = obj;
        this.b = lhaVar;
        ks3 ks3Var = ks3.a;
        this.d = yae.z(ks3Var);
        this.e = yae.z(ks3Var);
        this.f = new lq(new y78(0L), fca.k, null, 12);
        this.h = new iga(this, 0);
        this.i = new iga(this, 1);
    }

    public final boolean a() {
        kl9 kl9Var = this.c;
        if (!kl9Var.d().b() && !kl9Var.d().d() && ((zya) kl9Var.f) != zya.b) {
            return false;
        }
        return true;
    }

    public final List b() {
        return (List) this.d.getValue();
    }

    public final List c() {
        return (List) this.e.getValue();
    }

    public final boolean d() {
        List c = c();
        int size = c.size();
        for (int i = 0; i < size; i++) {
            tkc tkcVar = ((kga) c.get(i)).d().b;
            while (true) {
                tkc tkcVar2 = tkcVar.b;
                if (tkcVar2 == null) {
                    break;
                }
                tkcVar = tkcVar2;
            }
            if (!c16.i(tkcVar.a.z(), tkcVar.d.getValue())) {
                return true;
            }
        }
        return false;
    }

    public final void e() {
        List b = b();
        ArrayList arrayList = new ArrayList();
        int size = b.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            kga kgaVar = (kga) b.get(i);
            if (kgaVar.h()) {
                arrayList.add(kgaVar);
                if (kgaVar.d().b()) {
                    z = true;
                }
            }
        }
        this.e.setValue(arrayList);
        kl9 kl9Var = this.c;
        jga jgaVar = (jga) kl9Var.c;
        em8 em8Var = (em8) kl9Var.e;
        if (jgaVar.c().size() > 1 && z) {
            kl9Var.f = zya.b;
            em8Var.i(kl9Var.a + 1);
        } else if (jgaVar.b.b()) {
            if (!z) {
                kl9Var.f = zya.c;
                em8Var.i(kl9Var.a + 1);
            }
        } else {
            kl9Var.f = zya.a;
            kl9Var.a = em8Var.h();
            ((hm8) kl9Var.d).setValue(t28.a);
        }
        kl9Var.e();
    }
}
