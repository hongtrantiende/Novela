package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nx2  reason: default package */
/* loaded from: classes.dex */
public final class nx2 {
    public final ViewGroup a;
    public final ArrayList b;
    public final ArrayList c;
    public boolean d;
    public boolean e;
    public boolean f;

    public nx2(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.a = viewGroup;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public final void a(kwa kwaVar) {
        kwaVar.getClass();
        if (!kwaVar.b) {
            return;
        }
        throw null;
    }

    public final void b(ArrayList arrayList, boolean z) {
        if (hs4.K(2)) {
            Log.v("FragmentManager", "Collecting Effects");
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            if (!listIterator.hasPrevious()) {
                if (hs4.K(2)) {
                    Log.v("FragmentManager", "Executing operations from " + ((Object) null) + " to " + ((Object) null));
                }
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ((kwa) sl1.j0(arrayList)).getClass();
                if (arrayList.size() <= 0) {
                    if (arrayList.size() > 0) {
                        kwa kwaVar = (kwa) arrayList.get(0);
                        arrayList2.add(new hx2(kwaVar, z));
                        new jce(kwaVar);
                        if (z) {
                            throw null;
                        }
                        throw null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    int size = arrayList3.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList3.get(i);
                        i++;
                        if (!((mx2) obj).y()) {
                            arrayList4.add(obj);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList();
                    int size2 = arrayList4.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj2 = arrayList4.get(i2);
                        i2++;
                        ((mx2) obj2).getClass();
                    }
                    int size3 = arrayList5.size();
                    int i3 = 0;
                    while (i3 < size3) {
                        Object obj3 = arrayList5.get(i3);
                        i3++;
                        ((mx2) obj3).getClass();
                    }
                    ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = new ArrayList();
                    if (arrayList2.size() <= 0) {
                        arrayList7.isEmpty();
                        int size4 = arrayList2.size();
                        int i4 = 0;
                        while (i4 < size4) {
                            Object obj4 = arrayList2.get(i4);
                            i4++;
                            hx2 hx2Var = (hx2) obj4;
                            Context context = this.a.getContext();
                            hx2Var.getClass();
                            context.getClass();
                            kw5 J = hx2Var.J(context);
                            if (J != null) {
                                if (((AnimatorSet) J.c) == null) {
                                    arrayList6.add(hx2Var);
                                } else {
                                    throw null;
                                }
                            }
                        }
                        if (arrayList6.size() <= 0) {
                            return;
                        }
                        ((hx2) arrayList6.get(0)).getClass();
                        throw null;
                    }
                    ((hx2) arrayList2.get(0)).getClass();
                    throw null;
                }
                ((kwa) arrayList.get(0)).getClass();
                throw null;
            }
            ((kwa) listIterator.previous()).getClass();
            throw null;
        }
        ((kwa) it.next()).getClass();
        throw null;
    }

    public final void c() {
        if (this.f) {
            return;
        }
        if (!this.a.isAttachedToWindow()) {
            d();
            this.e = false;
            return;
        }
        synchronized (this.b) {
            try {
                ArrayList E0 = sl1.E0(this.c);
                this.c.clear();
                int size = E0.size();
                int i = 0;
                while (i < size) {
                    Object obj = E0.get(i);
                    i++;
                    kwa kwaVar = (kwa) obj;
                    if (this.b.isEmpty()) {
                        kwaVar.getClass();
                    } else {
                        kwaVar.getClass();
                        throw null;
                    }
                }
                int size2 = E0.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = E0.get(i2);
                    i2++;
                    kwa kwaVar2 = (kwa) obj2;
                    if (this.d) {
                        if (hs4.K(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + kwaVar2);
                        }
                        kwaVar2.b();
                        throw null;
                    }
                    if (hs4.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + kwaVar2);
                    }
                    kwaVar2.a(this.a);
                    this.d = false;
                    this.c.add(kwaVar2);
                }
                if (!this.b.isEmpty()) {
                    f();
                    ArrayList E02 = sl1.E0(this.b);
                    if (E02.isEmpty()) {
                        return;
                    }
                    this.b.clear();
                    this.c.addAll(E02);
                    if (hs4.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    b(E02, this.e);
                    if (E02.size() <= 0) {
                        ArrayList arrayList = new ArrayList();
                        int size3 = E02.size();
                        int i3 = 0;
                        while (i3 < size3) {
                            Object obj3 = E02.get(i3);
                            i3++;
                            ((kwa) obj3).getClass();
                            xl1.P(arrayList, null);
                        }
                        boolean isEmpty = arrayList.isEmpty();
                        boolean z = !isEmpty;
                        if (E02.size() <= 0) {
                            this.d = !z;
                            if (hs4.K(2)) {
                                Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + z + " \ntransition = true");
                            }
                            if (!isEmpty) {
                                e(E02);
                                int size4 = E02.size();
                                for (int i4 = 0; i4 < size4; i4++) {
                                    a((kwa) E02.get(i4));
                                }
                            }
                            this.e = false;
                            if (hs4.K(2)) {
                                Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                            }
                        } else {
                            ((kwa) E02.get(0)).getClass();
                            throw null;
                        }
                    } else {
                        ((kwa) E02.get(0)).getClass();
                        throw null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        String str;
        String str2;
        if (hs4.K(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean isAttachedToWindow = this.a.isAttachedToWindow();
        synchronized (this.b) {
            try {
                f();
                e(this.b);
                ArrayList E0 = sl1.E0(this.c);
                int size = E0.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = E0.get(i2);
                    i2++;
                    ((kwa) obj).getClass();
                }
                int size2 = E0.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = E0.get(i3);
                    i3++;
                    kwa kwaVar = (kwa) obj2;
                    if (hs4.K(2)) {
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + kwaVar);
                    }
                    kwaVar.a(this.a);
                }
                ArrayList E02 = sl1.E0(this.b);
                int size3 = E02.size();
                int i4 = 0;
                while (i4 < size3) {
                    Object obj3 = E02.get(i4);
                    i4++;
                    ((kwa) obj3).getClass();
                }
                int size4 = E02.size();
                while (i < size4) {
                    Object obj4 = E02.get(i);
                    i++;
                    kwa kwaVar2 = (kwa) obj4;
                    if (hs4.K(2)) {
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + kwaVar2);
                    }
                    kwaVar2.a(this.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            kwa kwaVar = (kwa) list.get(i);
            kwaVar.getClass();
            if (!kwaVar.a) {
                kwaVar.a = true;
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((kwa) it.next()).getClass();
            xl1.P(arrayList, null);
        }
        List C0 = sl1.C0(sl1.H0(arrayList));
        int size2 = C0.size();
        for (int i2 = 0; i2 < size2; i2++) {
            jwa jwaVar = (jwa) C0.get(i2);
            jwaVar.getClass();
            ViewGroup viewGroup = this.a;
            viewGroup.getClass();
            if (!jwaVar.a) {
                jwaVar.c(viewGroup);
            }
            jwaVar.a = true;
        }
    }

    public final void f() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((kwa) obj).getClass();
        }
    }
}
