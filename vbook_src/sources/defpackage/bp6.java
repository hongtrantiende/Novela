package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bp6  reason: default package */
/* loaded from: classes3.dex */
public final class bp6 implements cp6 {
    public final w71 a;
    public final ym0 b;
    public final wm0 c;
    public final uo3 d;

    public bp6(w71 w71Var, ym0 ym0Var, wm0 wm0Var, uo3 uo3Var) {
        ym0Var.getClass();
        wm0Var.getClass();
        this.a = w71Var;
        this.b = ym0Var;
        this.c = wm0Var;
        this.d = uo3Var;
    }

    @Override // defpackage.cp6
    public final void a(xp6 xp6Var) {
        boolean z;
        ym0 ym0Var;
        String e;
        no3 no3Var;
        uo3 uo3Var;
        ym0 ym0Var2;
        Iterable r;
        uo3 uo3Var2;
        ym0 ym0Var3;
        no3 no3Var2;
        so3 e2;
        xl0 c;
        hn0 hn0Var;
        xp6Var.getClass();
        int i = xp6Var.b;
        String str = xp6Var.a;
        uo3 uo3Var3 = this.d;
        if (uo3Var3 != null && (e2 = uo3Var3.e()) != null && (c = e2.c(str)) != null && (hn0Var = c.b) != null) {
            z = !hn0Var.b();
        } else {
            z = false;
        }
        if (!z) {
            wm0 wm0Var = this.c;
            if (wm0Var.f(str) != null && (e = (ym0Var = this.b).e(str)) != null) {
                if (uo3Var3 != null) {
                    no3Var = gwe.g(uo3Var3, ym0Var, wm0Var);
                } else {
                    no3Var = null;
                }
                int length = e.length();
                int i2 = xp6Var.c;
                int n = dce.n(Math.min(i, i2), 0, length);
                int n2 = dce.n(Math.max(i, i2), 0, length);
                if (n == n2) {
                    return;
                }
                List i3 = wm0Var.i(str);
                aw7 aw7Var = (aw7) nk2.q(str, wm0Var.a);
                if (aw7Var == null) {
                    uo3Var2 = uo3Var3;
                    ym0Var3 = ym0Var;
                    no3Var2 = no3Var;
                } else {
                    List list = (List) aw7Var.getValue();
                    list.getClass();
                    int max = Math.max(0, Math.min(n, n2));
                    int max2 = Math.max(0, Math.max(n, n2));
                    if (max < max2) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            iyb iybVar = (iyb) it.next();
                            tva tvaVar = iybVar.c;
                            int i4 = iybVar.a;
                            Iterator it2 = it;
                            int i5 = iybVar.b;
                            no3 no3Var3 = no3Var;
                            if (!(tvaVar instanceof pva)) {
                                r = tl1.A(iybVar);
                                uo3Var = uo3Var3;
                                ym0Var2 = ym0Var;
                            } else {
                                jq6 t = tl1.t();
                                if (i4 < max && i5 > max) {
                                    ym0Var2 = ym0Var;
                                    uo3Var = uo3Var3;
                                    t.add(new iyb(i4, Math.min(i5, max), tvaVar));
                                } else {
                                    uo3Var = uo3Var3;
                                    ym0Var2 = ym0Var;
                                    if (i5 <= max) {
                                        t.add(iybVar);
                                    }
                                }
                                if (i5 > max2 && i4 < max2) {
                                    t.add(new iyb(Math.max(i4, max2), i5, tvaVar));
                                } else if (i4 >= max2) {
                                    t.add(iybVar);
                                }
                                r = tl1.r(t);
                            }
                            xl1.P(arrayList, r);
                            it = it2;
                            no3Var = no3Var3;
                            ym0Var = ym0Var2;
                            uo3Var3 = uo3Var;
                        }
                        list = arrayList;
                    }
                    uo3Var2 = uo3Var3;
                    ym0Var3 = ym0Var;
                    no3Var2 = no3Var;
                    aw7Var.setValue(list);
                }
                if (!wm0Var.i(str).equals(i3)) {
                    this.a.invoke(new sxc(str, new cm0(e, wm0Var.i(str))));
                    if (uo3Var2 != null && no3Var2 != null) {
                        uo3 uo3Var4 = uo3Var2;
                        uo3Var4.b(str);
                        no3 g = gwe.g(uo3Var4, ym0Var3, wm0Var);
                        uo3Var4.f(cwe.c(no3Var2, g), p97.a);
                        uo3Var4.l(str, g);
                    }
                }
            }
        }
    }

    @Override // defpackage.cp6
    public final cq6 b(xp6 xp6Var, String str, String str2) {
        cq6 bq6Var;
        boolean z;
        ym0 ym0Var;
        String e;
        no3 no3Var;
        String str3;
        int i;
        String str4;
        so3 e2;
        xl0 c;
        hn0 hn0Var;
        xp6Var.getClass();
        int i2 = xp6Var.c;
        int i3 = xp6Var.b;
        String str5 = xp6Var.a;
        str.getClass();
        String obj = k4b.N0(str).toString();
        if (obj.length() == 0) {
            bq6Var = new aq6();
        } else {
            if (!k4b.V(obj, "://", false)) {
                obj = "https://".concat(obj);
            }
            bq6Var = new bq6(obj);
        }
        String a = bq6Var.a();
        if (a != null) {
            uo3 uo3Var = this.d;
            if (uo3Var != null && (e2 = uo3Var.e()) != null && (c = e2.c(str5)) != null && (hn0Var = c.b) != null) {
                z = !hn0Var.b();
            } else {
                z = false;
            }
            if (!z) {
                wm0 wm0Var = this.c;
                if (wm0Var.f(str5) != null && (e = (ym0Var = this.b).e(str5)) != null) {
                    String str6 = null;
                    if (uo3Var != null) {
                        no3Var = gwe.g(uo3Var, ym0Var, wm0Var);
                    } else {
                        no3Var = null;
                    }
                    int length = e.length();
                    int n = dce.n(Math.min(i3, i2), 0, length);
                    int n2 = dce.n(Math.max(i3, i2), 0, length);
                    if (str2 != null && !k4b.j0(str2)) {
                        str3 = str2;
                    } else {
                        str3 = null;
                    }
                    if (str3 == null) {
                        if (i3 == i2) {
                            str6 = a;
                        }
                    } else {
                        str6 = str3;
                    }
                    if (i3 == i2 || n != n2 || str6 != null) {
                        List i4 = wm0Var.i(str5);
                        if (str6 != null) {
                            boolean equals = str6.equals(e.substring(n, n2));
                            i = n;
                            String str7 = str6;
                            if (!equals) {
                                str4 = this.b.f(str5, i, n2, str7, null);
                                if (str4 != null) {
                                    wm0Var.b(i, str5, n2 - i, str7.length());
                                }
                            } else {
                                str4 = e;
                            }
                            n2 = str7.length() + i;
                        } else {
                            i = n;
                            str4 = e;
                        }
                        if (i < n2) {
                            this.c.c(str5, i, n2, new pva(a), str4.length());
                            if (!str4.equals(e) || !wm0Var.i(str5).equals(i4)) {
                                this.a.invoke(new sxc(str5, new cm0(str4, wm0Var.i(str5))));
                                if (uo3Var != null && no3Var != null) {
                                    uo3Var.b(str5);
                                    no3 g = gwe.g(uo3Var, ym0Var, wm0Var);
                                    uo3Var.f(cwe.c(no3Var, g), p97.a);
                                    uo3Var.l(str5, g);
                                }
                            }
                        }
                    }
                }
            }
        }
        return bq6Var;
    }
}
