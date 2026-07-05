package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wm0  reason: default package */
/* loaded from: classes3.dex */
public final class wm0 {
    public final qra a = new qra();
    public final em8 b = new em8(0);
    public final qra c = new qra();

    public static LinkedHashSet j(Set set) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : set) {
            tva tvaVar = (tva) obj;
            if (!(tvaVar instanceof pva) && !(tvaVar instanceof mva) && !(tvaVar instanceof sva) && !(tvaVar instanceof nva) && !(tvaVar instanceof kva)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    public final Set a(int i, String str) {
        str.getClass();
        aw7 aw7Var = (aw7) nk2.q(str, this.a);
        if (aw7Var == null) {
            return rs3.a;
        }
        List list = (List) aw7Var.getValue();
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            iyb iybVar = (iyb) obj;
            if (iybVar.a <= i && iybVar.b > i) {
                arrayList.add(obj);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            linkedHashSet.add(((iyb) obj2).c);
        }
        return linkedHashSet;
    }

    public final void b(int i, String str, int i2, int i3) {
        iyb iybVar;
        str.getClass();
        aw7 aw7Var = (aw7) nk2.q(str, this.a);
        if (aw7Var == null) {
            return;
        }
        List<iyb> list = (List) aw7Var.getValue();
        list.getClass();
        if (i >= 0) {
            if (i2 >= 0) {
                if (i3 >= 0) {
                    int i4 = i + i2;
                    int i5 = i3 - i2;
                    ArrayList arrayList = new ArrayList();
                    for (iyb iybVar2 : list) {
                        int i6 = iybVar2.a;
                        if (i6 >= i) {
                            if (i6 >= i4) {
                                i6 += i5;
                            } else {
                                i6 = i;
                            }
                        }
                        int i7 = iybVar2.b;
                        if (i7 > i) {
                            if (i7 > i4) {
                                i7 += i5;
                            } else {
                                i7 = i;
                            }
                        }
                        if (i6 < i7) {
                            iybVar = new iyb(i6, i7, iybVar2.c);
                        } else {
                            iybVar = null;
                        }
                        if (iybVar != null) {
                            arrayList.add(iybVar);
                        }
                    }
                    aw7Var.setValue(zbe.p(arrayList));
                    return;
                }
                p1a.k(a82.j(i3, "insertedLength must be non-negative, got "));
                return;
            }
            p1a.k(a82.j(i2, "deletedLength must be non-negative, got "));
            return;
        }
        p1a.k(a82.j(i, "editStart must be non-negative, got "));
    }

    public final void c(String str, int i, int i2, tva tvaVar, int i3) {
        str.getClass();
        tvaVar.getClass();
        aw7 aw7Var = (aw7) nk2.q(str, this.a);
        if (aw7Var == null) {
            return;
        }
        List list = (List) aw7Var.getValue();
        list.getClass();
        if (i3 >= 0) {
            int n = dce.n(Math.min(i, i2), 0, i3);
            int n2 = dce.n(Math.max(i, i2), 0, i3);
            if (n < n2) {
                if (tvaVar instanceof pva) {
                    list = zbe.G(list, n, n2, tvaVar);
                }
                list = zbe.w(i3, sl1.o0(list, new iyb(n, n2, tvaVar)));
            }
            aw7Var.setValue(list);
            return;
        }
        p1a.k(a82.j(i3, "textLength must be non-negative, got "));
    }

    public final void d(Set set) {
        qra qraVar = this.a;
        Set set2 = set;
        for (pm0 pm0Var : fca.t(qraVar.c, set2)) {
            qraVar.remove(new pm0(pm0Var.a));
        }
        qra qraVar2 = this.c;
        for (pm0 pm0Var2 : fca.t(qraVar2.c, set2)) {
            qraVar2.remove(new pm0(pm0Var2.a));
        }
    }

    public final void e(String str) {
        str.getClass();
        this.c.remove(new pm0(str));
    }

    public final yya f(String str) {
        str.getClass();
        return (yya) nk2.q(str, this.a);
    }

    public final yya g(int i, String str, List list) {
        str.getClass();
        list.getClass();
        if (i >= 0) {
            pm0 pm0Var = new pm0(str);
            qra qraVar = this.a;
            Object obj = qraVar.get(pm0Var);
            if (obj == null) {
                obj = yae.z(zbe.w(i, sl1.C0(list)));
                qraVar.put(pm0Var, obj);
            }
            return (yya) obj;
        }
        p1a.k(a82.j(i, "textLength must be non-negative, got "));
        return null;
    }

    public final Set h(String str) {
        str.getClass();
        Set set = (Set) nk2.q(str, this.c);
        if (set != null) {
            return sl1.H0(set);
        }
        return null;
    }

    public final List i(String str) {
        List list;
        str.getClass();
        aw7 aw7Var = (aw7) nk2.q(str, this.a);
        if (aw7Var != null && (list = (List) aw7Var.getValue()) != null) {
            return list;
        }
        return ks3.a;
    }

    public final void k(String str, int i, int i2, tva tvaVar) {
        str.getClass();
        tvaVar.getClass();
        aw7 aw7Var = (aw7) nk2.q(str, this.a);
        if (aw7Var == null) {
            return;
        }
        aw7Var.setValue(zbe.G((List) aw7Var.getValue(), i, i2, tvaVar));
    }

    public final void l(int i, String str, List list) {
        str.getClass();
        list.getClass();
        if (i >= 0) {
            aw7 aw7Var = (aw7) nk2.q(str, this.a);
            if (aw7Var != null) {
                aw7Var.setValue(zbe.w(i, sl1.C0(list)));
                return;
            }
            return;
        }
        p1a.k(a82.j(i, "textLength must be non-negative, got "));
    }

    public final void m(String str, Set set) {
        str.getClass();
        set.getClass();
        this.c.put(new pm0(str), sl1.H0(set));
    }

    public final void n(String str, String str2, int i) {
        str.getClass();
        qra qraVar = this.a;
        aw7 aw7Var = (aw7) nk2.q(str, qraVar);
        if (aw7Var == null) {
            return;
        }
        yk8 I = zbe.I(i, (List) aw7Var.getValue());
        List list = (List) I.b;
        aw7Var.setValue((List) I.a);
        pm0 pm0Var = new pm0(str2);
        Object obj = qraVar.get(pm0Var);
        if (obj == null) {
            obj = yae.z(ks3.a);
            qraVar.put(pm0Var, obj);
        }
        ((aw7) obj).setValue(list);
        pm0 pm0Var2 = new pm0(str);
        qra qraVar2 = this.c;
        qraVar2.remove(pm0Var2);
        qraVar2.remove(new pm0(str2));
    }
}
