package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gs4  reason: default package */
/* loaded from: classes.dex */
public final class gs4 implements es4 {
    public final /* synthetic */ hs4 a;

    public gs4(hs4 hs4Var) {
        this.a = hs4Var;
    }

    @Override // defpackage.es4
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        boolean S;
        hs4 hs4Var = this.a;
        ArrayList arrayList3 = hs4Var.n;
        if (hs4.K(2)) {
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + hs4Var.a);
        }
        if (hs4Var.d.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            S = false;
        } else {
            uf0 uf0Var = (uf0) nk2.n(1, hs4Var.d);
            hs4Var.h = uf0Var;
            ArrayList arrayList4 = uf0Var.a;
            int size = arrayList4.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList4.get(i);
                i++;
                rr4 rr4Var = ((qs4) obj).b;
                if (rr4Var != null) {
                    rr4Var.I = true;
                }
            }
            S = hs4Var.S(arrayList, arrayList2, -1, 0);
        }
        if (!arrayList3.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList.get(i2);
                i2++;
                linkedHashSet.addAll(hs4.F((uf0) obj2));
            }
            int size3 = arrayList3.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj3 = arrayList3.get(i3);
                i3++;
                if (obj3 == null) {
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        rr4 rr4Var2 = (rr4) it.next();
                        throw null;
                    }
                } else {
                    vm1.h();
                    return false;
                }
            }
        }
        return S;
    }
}
