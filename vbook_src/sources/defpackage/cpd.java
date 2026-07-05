package defpackage;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cpd  reason: default package */
/* loaded from: classes.dex */
public final class cpd extends unc {
    public final rz l = new rz();

    @Override // defpackage.unc
    public final int c() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.unc
    public final String d() {
        return "http://www.w3.org/XML/1998/namespace";
    }

    @Override // defpackage.unc
    public final qm8 e() {
        return qm8.d;
    }

    @Override // defpackage.unc
    public final fkb f() {
        return new fkb(null, null);
    }

    @Override // defpackage.unc
    public final void n(StringReader stringReader, String str, t6f t6fVar) {
        super.n(stringReader, str, t6fVar);
        sc3 sc3Var = j().J;
        sc3Var.g = rc3.b;
        gu3 gu3Var = gu3.xhtml;
        gu3Var.getClass();
        sc3Var.a = gu3Var;
        gu3Var.getClass();
        sc3Var.a = gu3Var;
        sc3Var.c = false;
        rz rzVar = this.l;
        rzVar.clear();
        HashMap hashMap = new HashMap();
        hashMap.put("xml", "http://www.w3.org/XML/1998/namespace");
        hashMap.put("", "http://www.w3.org/XML/1998/namespace");
        rzVar.addLast(hashMap);
    }

    @Override // defpackage.unc
    public final unc o() {
        return new cpd();
    }

    @Override // defpackage.unc
    public final cp3 r() {
        this.l.b(0);
        return super.r();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, al6] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, al6] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, al6] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, al6] */
    @Override // defpackage.unc
    public final boolean s(dcc dccVar) {
        boolean z;
        rcc rccVar;
        String substring;
        String str;
        al6 al6Var;
        dccVar.getClass();
        this.g = dccVar;
        boolean z2 = true;
        cp3 cp3Var = null;
        switch (((acc) dccVar.c).ordinal()) {
            case 0:
                vbc vbcVar = (vbc) dccVar;
                fd3 fd3Var = new fd3(m().b(vbcVar.d.V()), vbcVar.f.V(), vbcVar.g.V());
                String str2 = vbcVar.e;
                if (str2 != null) {
                    fd3Var.d("pubSysKey", str2);
                }
                z(fd3Var);
                return true;
            case 1:
                ybc ybcVar = (ybc) dccVar;
                rz rzVar = this.l;
                HashMap hashMap = (HashMap) rzVar.e();
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                HashMap hashMap2 = new HashMap(hashMap);
                rzVar.addFirst(hashMap2);
                j40 j40Var = ybcVar.g;
                if (j40Var != null) {
                    m().a(j40Var);
                    j40Var.f(m());
                    i40 i40Var = new i40(j40Var);
                    while (i40Var.hasNext()) {
                        g40 g40Var = (g40) i40Var.next();
                        String str3 = g40Var.a;
                        String value = g40Var.getValue();
                        if (c16.i(str3, "xmlns")) {
                            hashMap2.put("", value);
                        } else if (r4b.Q(str3, "xmlns:", false)) {
                            hashMap2.put(str3.substring(6), value);
                        }
                    }
                    HashMap hashMap3 = new HashMap();
                    i40 i40Var2 = new i40(j40Var);
                    while (i40Var2.hasNext()) {
                        String str4 = ((g40) i40Var2.next()).a;
                        int f0 = k4b.f0(str4, ':', 0, 6);
                        if (f0 == -1) {
                            substring = "";
                        } else {
                            substring = str4.substring(0, f0);
                        }
                        if (substring.length() != 0 && !substring.equals("xmlns") && (str = (String) hashMap2.get(substring)) != null) {
                            hashMap3.put("ksoup.xmlns-".concat(substring), str);
                            z2 = z2;
                        }
                    }
                    z = z2;
                    for (Map.Entry entry : hashMap3.entrySet()) {
                        j40Var.s(entry.getValue(), (String) entry.getKey());
                    }
                } else {
                    z = true;
                }
                g();
                String V = ybcVar.d.V();
                String str5 = (String) hashMap2.get("");
                int f02 = k4b.f0(V, ':', 0, 6);
                if (f02 > 0) {
                    String substring2 = V.substring(0, f02);
                    if (hashMap2.containsKey(substring2)) {
                        str5 = (String) hashMap2.get(substring2);
                    }
                }
                String str6 = ybcVar.e;
                str6.getClass();
                str5.getClass();
                wjb y = y(V, str6, str5, m());
                cp3 cp3Var2 = new cp3(y, null, j40Var);
                a().H(cp3Var2);
                v(cp3Var2);
                if (ybcVar.f) {
                    y.d |= 32;
                    r();
                    return z;
                } else if (y.c()) {
                    r();
                    return z;
                } else {
                    ifc f = y.f();
                    if (f != null && (rccVar = this.c) != null) {
                        rccVar.p(f);
                        return z;
                    }
                    return z;
                }
            case 2:
                String b = m().b(((xbc) dccVar).d.V());
                ArrayList arrayList = this.e;
                arrayList.getClass();
                int size = arrayList.size();
                int i = size - 1 >= 256 ? size - 257 : 0;
                ArrayList arrayList2 = this.e;
                arrayList2.getClass();
                int size2 = arrayList2.size() - 1;
                if (i <= size2) {
                    while (true) {
                        ArrayList arrayList3 = this.e;
                        arrayList3.getClass();
                        cp3 cp3Var3 = (cp3) arrayList3.get(size2);
                        cp3Var3.getClass();
                        if (c16.i(cp3Var3.u(), b)) {
                            cp3Var = cp3Var3;
                        } else if (size2 != i) {
                            size2--;
                        }
                    }
                }
                if (cp3Var != null) {
                    ArrayList arrayList4 = this.e;
                    arrayList4.getClass();
                    for (int size3 = arrayList4.size() - 1; -1 < size3 && r() != cp3Var; size3--) {
                    }
                }
                break;
            case 3:
                String V2 = ((ubc) dccVar).d.V();
                ?? obj = new Object();
                obj.d = V2;
                z(obj);
                return true;
            case 4:
                tbc tbcVar = (tbc) dccVar;
                String V3 = tbcVar.d.V();
                if (tbcVar instanceof sbc) {
                    ?? obj2 = new Object();
                    obj2.d = V3;
                    al6Var = obj2;
                } else if (a().e.b(256)) {
                    ?? obj3 = new Object();
                    obj3.d = V3;
                    al6Var = obj3;
                } else {
                    ?? obj4 = new Object();
                    obj4.d = V3;
                    al6Var = obj4;
                }
                z(al6Var);
                return true;
            case 5:
                bcc bccVar = (bcc) dccVar;
                nod nodVar = new nod(bccVar.d.V(), bccVar.k);
                j40 j40Var2 = bccVar.g;
                if (j40Var2 != null) {
                    nodVar.e().a(j40Var2);
                }
                z(nodVar);
                return true;
            case 6:
                break;
            default:
                xk5.o();
                return false;
        }
        return true;
    }

    public final void z(al6 al6Var) {
        a().H(al6Var);
    }
}
