package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pv8  reason: default package */
/* loaded from: classes3.dex */
public abstract class pv8 {
    public final ArrayList a;
    public int b;
    public boolean c;
    public lie d;
    private volatile /* synthetic */ Object interceptors$delegate;

    public pv8(lie... lieVarArr) {
        xwe.a();
        this.a = tl1.C(Arrays.copyOf(lieVarArr, lieVarArr.length));
        this.interceptors$delegate = null;
    }

    public final Object a(Object obj, Object obj2, n42 n42Var) {
        qv8 mq2Var;
        qu8 qu8Var;
        int x;
        qu8 qu8Var2;
        d82 context = n42Var.getContext();
        if (((List) this.interceptors$delegate) == null) {
            int i = this.b;
            if (i == 0) {
                this.interceptors$delegate = ks3.a;
                this.c = false;
                this.d = null;
            } else {
                ArrayList arrayList = this.a;
                if (i == 1 && (x = tl1.x(arrayList)) >= 0) {
                    int i2 = 0;
                    while (true) {
                        Object obj3 = arrayList.get(i2);
                        if (obj3 instanceof qu8) {
                            qu8Var2 = (qu8) obj3;
                        } else {
                            qu8Var2 = null;
                        }
                        if (qu8Var2 != null && !qu8Var2.c.isEmpty()) {
                            List list = qu8Var2.c;
                            qu8Var2.d = true;
                            this.interceptors$delegate = list;
                            this.c = false;
                            this.d = qu8Var2.a;
                            break;
                        } else if (i2 == x) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                int x2 = tl1.x(arrayList);
                if (x2 >= 0) {
                    int i3 = 0;
                    while (true) {
                        Object obj4 = arrayList.get(i3);
                        if (obj4 instanceof qu8) {
                            qu8Var = (qu8) obj4;
                        } else {
                            qu8Var = null;
                        }
                        if (qu8Var != null) {
                            List list2 = qu8Var.c;
                            arrayList2.ensureCapacity(list2.size() + arrayList2.size());
                            int size = list2.size();
                            for (int i4 = 0; i4 < size; i4++) {
                                arrayList2.add(list2.get(i4));
                            }
                        }
                        if (i3 == x2) {
                            break;
                        }
                        i3++;
                    }
                }
                this.interceptors$delegate = arrayList2;
                this.c = false;
                this.d = null;
            }
        }
        this.c = true;
        List list3 = (List) this.interceptors$delegate;
        list3.getClass();
        boolean d = d();
        obj.getClass();
        obj2.getClass();
        context.getClass();
        if (!rv8.a && !d) {
            mq2Var = new z9b(obj2, obj, list3);
        } else {
            mq2Var = new mq2(obj, list3, obj2, context);
        }
        return mq2Var.a(obj2, n42Var);
    }

    public final qu8 b(lie lieVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj == lieVar) {
                qu8 qu8Var = new qu8(lieVar, uv8.j);
                arrayList.set(i, qu8Var);
                return qu8Var;
            }
            if (obj instanceof qu8) {
                qu8 qu8Var2 = (qu8) obj;
                if (qu8Var2.a == lieVar) {
                    return qu8Var2;
                }
            }
        }
        return null;
    }

    public final int c(lie lieVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj == lieVar || ((obj instanceof qu8) && ((qu8) obj).a == lieVar)) {
                return i;
            }
        }
        return -1;
    }

    public abstract boolean d();

    public final boolean e(lie lieVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj != lieVar) {
                if ((obj instanceof qu8) && ((qu8) obj).a == lieVar) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public final void f(lie lieVar, lie lieVar2) {
        qu8 qu8Var;
        pc2 pc2Var;
        lie lieVar3;
        lieVar.getClass();
        lieVar2.getClass();
        if (e(lieVar2)) {
            return;
        }
        int c = c(lieVar);
        if (c != -1) {
            int i = c + 1;
            ArrayList arrayList = this.a;
            int x = tl1.x(arrayList);
            if (i <= x) {
                while (true) {
                    Object obj = arrayList.get(i);
                    sv8 sv8Var = null;
                    if (obj instanceof qu8) {
                        qu8Var = (qu8) obj;
                    } else {
                        qu8Var = null;
                    }
                    if (qu8Var != null && (pc2Var = qu8Var.b) != null) {
                        if (pc2Var instanceof sv8) {
                            sv8Var = (sv8) pc2Var;
                        }
                        if (sv8Var != null && (lieVar3 = sv8Var.j) != null && lieVar3 == lieVar) {
                            c = i;
                        }
                        if (i == x) {
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
            }
            arrayList.add(c + 1, new qu8(lieVar2, new sv8(lieVar)));
            return;
        }
        throw new j1("Phase " + lieVar + " was not registered for this pipeline", 3);
    }

    public final void g(lie lieVar, mu4 mu4Var) {
        lieVar.getClass();
        qu8 b = b(lieVar);
        if (b != null) {
            List list = (List) this.interceptors$delegate;
            if (!this.a.isEmpty() && list != null && !this.c && (!(list instanceof j76) || (list instanceof l76))) {
                if (c16.i(this.d, lieVar)) {
                    list.add(mu4Var);
                } else if (lieVar == sl1.j0(this.a) || c(lieVar) == tl1.x(this.a)) {
                    qu8 b2 = b(lieVar);
                    b2.getClass();
                    if (b2.d) {
                        b2.c = sl1.E0(b2.c);
                        b2.d = false;
                    }
                    b2.c.add(mu4Var);
                    list.add(mu4Var);
                }
                this.b++;
                return;
            }
            if (b.d) {
                b.c = sl1.E0(b.c);
                b.d = false;
            }
            b.c.add(mu4Var);
            this.b++;
            this.interceptors$delegate = null;
            this.c = false;
            this.d = null;
            return;
        }
        throw new j1("Phase " + lieVar + " was not registered for this pipeline", 3);
    }
}
