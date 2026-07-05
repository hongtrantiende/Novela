package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ob8  reason: default package */
/* loaded from: classes.dex */
public final class ob8 extends a08 {
    public final if0 h;
    public boolean i;

    public ob8(if0 if0Var, pb8 pb8Var) {
        super(pb8Var, if0Var.b, 0);
        this.h = if0Var;
        this.i = true;
    }

    @Override // defpackage.a08
    public final void c() {
        if0 if0Var = this.h;
        switch (if0Var.d) {
            case 0:
            default:
                return;
            case 1:
                hs4 hs4Var = (hs4) if0Var.e;
                if (hs4.K(3)) {
                    Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + hs4Var);
                }
                if (hs4.K(3)) {
                    Log.d("FragmentManager", "cancelBackStackTransition for transition " + hs4Var.h);
                }
                uf0 uf0Var = hs4Var.h;
                if (uf0Var != null) {
                    uf0Var.r = false;
                    uf0Var.d();
                    uf0 uf0Var2 = hs4Var.h;
                    x0 x0Var = new x0(hs4Var, 24);
                    if (uf0Var2.p == null) {
                        uf0Var2.p = new ArrayList();
                    }
                    uf0Var2.p.add(x0Var);
                    hs4Var.h.e(false, true);
                    hs4Var.i = true;
                    hs4Var.A(true);
                    hs4Var.E();
                    hs4Var.i = false;
                    hs4Var.h = null;
                    return;
                }
                return;
        }
    }

    @Override // defpackage.a08
    public final void d() {
        if0 if0Var = this.h;
        switch (if0Var.d) {
            case 0:
                ((xv1) if0Var.e).c.invoke();
                return;
            case 1:
                hs4 hs4Var = (hs4) if0Var.e;
                if (hs4.K(3)) {
                    Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + hs4Var);
                }
                if0 if0Var2 = hs4Var.j;
                ArrayList arrayList = hs4Var.n;
                hs4Var.i = true;
                hs4Var.A(true);
                int i = 0;
                hs4Var.i = false;
                if (hs4Var.h != null) {
                    if (!arrayList.isEmpty()) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet(hs4.F(hs4Var.h));
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            if (obj == null) {
                                Iterator it = linkedHashSet.iterator();
                                if (it.hasNext()) {
                                    rr4 rr4Var = (rr4) it.next();
                                    throw null;
                                }
                            } else {
                                vm1.h();
                                return;
                            }
                        }
                    }
                    ArrayList arrayList2 = hs4Var.h.a;
                    int size2 = arrayList2.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        Object obj2 = arrayList2.get(i3);
                        i3++;
                        rr4 rr4Var2 = ((qs4) obj2).b;
                        if (rr4Var2 != null) {
                            rr4Var2.I = false;
                        }
                    }
                    Iterator it2 = hs4Var.f(new ArrayList(Collections.singletonList(hs4Var.h)), 0, 1).iterator();
                    while (it2.hasNext()) {
                        nx2 nx2Var = (nx2) it2.next();
                        ArrayList<kwa> arrayList3 = nx2Var.c;
                        if (hs4.K(3)) {
                            Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
                        }
                        nx2Var.e(arrayList3);
                        arrayList3.getClass();
                        ArrayList arrayList4 = new ArrayList();
                        for (kwa kwaVar : arrayList3) {
                            kwaVar.getClass();
                            xl1.P(arrayList4, null);
                        }
                        List C0 = sl1.C0(sl1.H0(arrayList4));
                        int size3 = C0.size();
                        for (int i4 = 0; i4 < size3; i4++) {
                            ((jwa) C0.get(i4)).a(nx2Var.a);
                        }
                        int size4 = arrayList3.size();
                        for (int i5 = 0; i5 < size4; i5++) {
                            nx2Var.a((kwa) arrayList3.get(i5));
                        }
                        List C02 = sl1.C0(arrayList3);
                        if (C02.size() > 0) {
                            ((kwa) C02.get(0)).getClass();
                            throw null;
                        }
                    }
                    ArrayList arrayList5 = hs4Var.h.a;
                    int size5 = arrayList5.size();
                    while (i < size5) {
                        Object obj3 = arrayList5.get(i);
                        i++;
                        rr4 rr4Var3 = ((qs4) obj3).b;
                        if (rr4Var3 != null && rr4Var3.b0 == null) {
                            hs4Var.g(rr4Var3).j();
                        }
                    }
                    hs4Var.h = null;
                    hs4Var.f0();
                    if (hs4.K(3)) {
                        Log.d("FragmentManager", "Op is being set to null");
                        Log.d("FragmentManager", "OnBackPressedCallback enabled=" + if0Var2.b + " for  FragmentManager " + hs4Var);
                        return;
                    }
                    return;
                } else if (if0Var2.b) {
                    if (hs4.K(3)) {
                        Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                    }
                    hs4Var.R();
                    return;
                } else {
                    if (hs4.K(3)) {
                        Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                    }
                    hs4Var.g.b().a();
                    return;
                }
            default:
                ((zh) if0Var.e).invoke(if0Var);
                return;
        }
    }

    @Override // defpackage.a08
    public final void e(xz7 xz7Var) {
        ze0 ze0Var = new ze0(xz7Var);
        if0 if0Var = this.h;
        switch (if0Var.d) {
            case 0:
            default:
                return;
            case 1:
                hs4 hs4Var = (hs4) if0Var.e;
                if (hs4.K(2)) {
                    Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + hs4Var);
                }
                if (hs4Var.h != null) {
                    Iterator it = hs4Var.f(new ArrayList(Collections.singletonList(hs4Var.h)), 0, 1).iterator();
                    while (it.hasNext()) {
                        nx2 nx2Var = (nx2) it.next();
                        nx2Var.getClass();
                        if (hs4.K(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + ze0Var.c);
                        }
                        ArrayList arrayList = nx2Var.c;
                        ArrayList arrayList2 = new ArrayList();
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            ((kwa) obj).getClass();
                            xl1.P(arrayList2, null);
                        }
                        List C0 = sl1.C0(sl1.H0(arrayList2));
                        int size2 = C0.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            ((jwa) C0.get(i2)).b(ze0Var, nx2Var.a);
                        }
                    }
                    Iterator it2 = hs4Var.n.iterator();
                    if (it2.hasNext()) {
                        throw rs8.f(it2);
                    }
                    return;
                }
                return;
        }
    }

    @Override // defpackage.a08
    public final void f(xz7 xz7Var) {
        xz7Var.getClass();
        new ze0(xz7Var);
        if0 if0Var = this.h;
        switch (if0Var.d) {
            case 0:
            default:
                return;
            case 1:
                hs4 hs4Var = (hs4) if0Var.e;
                if (hs4.K(3)) {
                    Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + hs4Var);
                }
                hs4Var.x();
                hs4Var.y(new gs4(hs4Var), false);
                return;
        }
    }

    public final void j(boolean z) {
        boolean z2;
        this.i = z;
        if (z && this.h.b) {
            z2 = true;
        } else {
            z2 = false;
        }
        i(z2);
    }
}
