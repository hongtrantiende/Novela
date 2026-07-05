package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: js4  reason: default package */
/* loaded from: classes.dex */
public final class js4 extends gdd {
    public static final xy2 D = new xy2(1);
    public final boolean e;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public boolean f = false;
    public boolean C = false;

    public js4(boolean z) {
        this.e = z;
    }

    @Override // defpackage.gdd
    public final void d() {
        if (hs4.K(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f = true;
    }

    public final void e(rr4 rr4Var, boolean z) {
        if (hs4.K(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + rr4Var);
        }
        g(rr4Var.e, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && js4.class == obj.getClass()) {
            js4 js4Var = (js4) obj;
            if (this.b.equals(js4Var.b) && this.c.equals(js4Var.c) && this.d.equals(js4Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final void f(String str, boolean z) {
        if (hs4.K(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        g(str, z);
    }

    public final void g(String str, boolean z) {
        HashMap hashMap = this.c;
        js4 js4Var = (js4) hashMap.get(str);
        if (js4Var != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(js4Var.c.keySet());
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    js4Var.f((String) obj, true);
                }
            }
            js4Var.d();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.d;
        qdd qddVar = (qdd) hashMap2.get(str);
        if (qddVar != null) {
            qddVar.a();
            hashMap2.remove(str);
        }
    }

    public final void h(rr4 rr4Var) {
        if (this.C) {
            if (hs4.K(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.b.remove(rr4Var.e) != null && hs4.K(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + rr4Var);
        }
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode();
        return this.d.hashCode() + ((hashCode + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
