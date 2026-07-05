package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mz1  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class mz1 extends xu4 implements xt4 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mz1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        Object value8;
        n24 n24Var;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Object value9;
        n24 n24Var2;
        boolean z5;
        Object value10;
        n24 n24Var3;
        boolean z6;
        Object value11;
        n24 n24Var4;
        boolean z7;
        Object value12;
        Object value13;
        int i = this.a;
        boolean z8 = true;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                int intValue = ((Number) obj).intValue();
                pz1 pz1Var = (pz1) this.receiver;
                pz1Var.getClass();
                fdd.g(pz1Var, jdd.a(pz1Var), new oz1(pz1Var, intValue, null, 0));
                return pvcVar;
            case 1:
                int intValue2 = ((Number) obj).intValue();
                pz1 pz1Var2 = (pz1) this.receiver;
                pz1Var2.getClass();
                fdd.g(pz1Var2, jdd.a(pz1Var2), new oz1(pz1Var2, intValue2, null, 2));
                return pvcVar;
            case 2:
                int intValue3 = ((Number) obj).intValue();
                pz1 pz1Var3 = (pz1) this.receiver;
                pz1Var3.getClass();
                fdd.g(pz1Var3, jdd.a(pz1Var3), new oz1(pz1Var3, intValue3, null, 1));
                return pvcVar;
            case 3:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                pz1 pz1Var4 = (pz1) this.receiver;
                pz1Var4.getClass();
                fdd.g(pz1Var4, jdd.a(pz1Var4), new gx(pz1Var4, booleanValue, (m42) null, 1));
                return pvcVar;
            case 4:
                String str = (String) obj;
                str.getClass();
                lb2 lb2Var = (lb2) this.receiver;
                lb2Var.getClass();
                cza czaVar = lb2Var.e;
                if (czaVar != null) {
                    do {
                        value = czaVar.getValue();
                    } while (!czaVar.l(value, kb2.a((kb2) value, false, false, false, false, false, str, null, null, null, 479)));
                    return pvcVar;
                }
                return pvcVar;
            case 5:
                String str2 = (String) obj;
                str2.getClass();
                lb2 lb2Var2 = (lb2) this.receiver;
                lb2Var2.getClass();
                cza czaVar2 = lb2Var2.e;
                if (czaVar2 != null) {
                    do {
                        value2 = czaVar2.getValue();
                    } while (!czaVar2.l(value2, kb2.a((kb2) value2, false, false, false, false, false, null, str2, null, null, 447)));
                    return pvcVar;
                }
                return pvcVar;
            case 6:
                return (qq2) ((o89) this.receiver).a(obj);
            case 7:
                String str3 = (String) obj;
                str3.getClass();
                bic bicVar = (bic) this.receiver;
                bicVar.getClass();
                cza czaVar3 = bicVar.f;
                if (czaVar3 != null) {
                    do {
                        value3 = czaVar3.getValue();
                    } while (!czaVar3.l(value3, aic.a((aic) value3, str3, false, false, null, 30)));
                    return pvcVar;
                }
                return pvcVar;
            case 8:
                mo3 mo3Var = (mo3) obj;
                mo3Var.getClass();
                ((uo3) this.receiver).d(mo3Var);
                return pvcVar;
            case 9:
                String str4 = (String) obj;
                str4.getClass();
                p24 p24Var = (p24) this.receiver;
                p24Var.getClass();
                cza czaVar4 = p24Var.C;
                if (czaVar4 != null) {
                    do {
                        value4 = czaVar4.getValue();
                    } while (!czaVar4.l(value4, n24.a((n24) value4, false, null, 0, null, null, null, null, null, null, null, 0, 0, null, 0, 0L, str4, null, null, null, null, false, false, false, false, false, false, null, null, null, 1073676287)));
                    return pvcVar;
                }
                return pvcVar;
            case 10:
                String str5 = (String) obj;
                str5.getClass();
                p24 p24Var2 = (p24) this.receiver;
                p24Var2.getClass();
                cza czaVar5 = p24Var2.C;
                if (czaVar5 != null) {
                    do {
                        value5 = czaVar5.getValue();
                    } while (!czaVar5.l(value5, n24.a((n24) value5, false, null, 0, null, null, null, null, null, null, null, 0, 0, null, 0, 0L, null, null, null, null, null, false, false, false, false, false, false, str5, null, null, 939524095)));
                    return pvcVar;
                }
                return pvcVar;
            case 11:
                String str6 = (String) obj;
                str6.getClass();
                p24 p24Var3 = (p24) this.receiver;
                p24Var3.getClass();
                cza czaVar6 = p24Var3.C;
                if (czaVar6 != null) {
                    do {
                        value6 = czaVar6.getValue();
                    } while (!czaVar6.l(value6, n24.a((n24) value6, false, null, 0, null, null, null, null, null, null, null, 0, 0, null, 0, 0L, null, null, null, null, null, false, false, false, false, false, false, null, str6, null, 805306367)));
                    return pvcVar;
                }
                return pvcVar;
            case 12:
                byte[] bArr = (byte[]) obj;
                cza czaVar7 = ((p24) this.receiver).C;
                if (czaVar7 != null) {
                    do {
                        value7 = czaVar7.getValue();
                    } while (!czaVar7.l(value7, n24.a((n24) value7, false, null, 0, null, null, null, null, null, null, null, 0, 0, null, 0, 0L, null, null, null, null, null, false, false, false, false, false, false, null, null, bArr, 536870911)));
                    return pvcVar;
                }
                return pvcVar;
            case 13:
                e24 e24Var = (e24) obj;
                e24Var.getClass();
                p24 p24Var4 = (p24) this.receiver;
                p24Var4.getClass();
                cza czaVar8 = p24Var4.C;
                if (czaVar8 != null) {
                    do {
                        value8 = czaVar8.getValue();
                        n24Var = (n24) value8;
                        if (n24Var.e() && h9a.U(e24Var)) {
                            z = n24Var.v;
                        } else {
                            z = false;
                        }
                        if (n24Var.e() && h9a.W(e24Var)) {
                            z2 = n24Var.w;
                        } else {
                            z2 = false;
                        }
                        if (n24Var.e() && h9a.T(e24Var)) {
                            z3 = n24Var.x;
                        } else {
                            z3 = false;
                        }
                        if (h9a.V(e24Var)) {
                            z4 = n24Var.y;
                        } else {
                            z4 = true;
                        }
                    } while (!czaVar8.l(value8, n24.a(n24Var, false, null, 0, null, null, null, null, null, null, null, 0, 0, null, 0, 0L, null, e24Var, null, null, null, z, z2, z3, z4, false, false, null, null, null, 1042153471)));
                    return pvcVar;
                }
                return pvcVar;
            case 14:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                cza czaVar9 = ((p24) this.receiver).C;
                if (czaVar9 != null) {
                    do {
                        value9 = czaVar9.getValue();
                        n24Var2 = (n24) value9;
                        if (n24Var2.b()) {
                            z5 = booleanValue2;
                        } else {
                            z5 = false;
                        }
                    } while (!czaVar9.l(value9, n24.a(n24Var2, false, null, 0, null, null, null, null, null, null, null, 0, 0, null, 0, 0L, null, null, null, null, null, z5, false, false, false, false, false, null, null, null, 1071644671)));
                    return pvcVar;
                }
                return pvcVar;
            case 15:
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                cza czaVar10 = ((p24) this.receiver).C;
                if (czaVar10 != null) {
                    do {
                        value10 = czaVar10.getValue();
                        n24Var3 = (n24) value10;
                        if (n24Var3.c()) {
                            z6 = booleanValue3;
                        } else {
                            z6 = false;
                        }
                    } while (!czaVar10.l(value10, n24.a(n24Var3, false, null, 0, null, null, null, null, null, null, null, 0, 0, null, 0, 0L, null, null, null, null, null, false, z6, false, false, false, false, null, null, null, 1069547519)));
                    return pvcVar;
                }
                return pvcVar;
            case 16:
                boolean booleanValue4 = ((Boolean) obj).booleanValue();
                cza czaVar11 = ((p24) this.receiver).C;
                if (czaVar11 != null) {
                    do {
                        value11 = czaVar11.getValue();
                        n24Var4 = (n24) value11;
                        if (n24Var4.d()) {
                            z7 = booleanValue4;
                        } else {
                            z7 = false;
                        }
                    } while (!czaVar11.l(value11, n24.a(n24Var4, false, null, 0, null, null, null, null, null, null, null, 0, 0, null, 0, 0L, null, null, null, null, null, false, false, z7, false, false, false, null, null, null, 1065353215)));
                    return pvcVar;
                }
                return pvcVar;
            case 17:
                boolean booleanValue5 = ((Boolean) obj).booleanValue();
                cza czaVar12 = ((p24) this.receiver).C;
                if (czaVar12 != null) {
                    do {
                        value12 = czaVar12.getValue();
                    } while (!czaVar12.l(value12, n24.a((n24) value12, false, null, 0, null, null, null, null, null, null, null, 0, 0, null, 0, 0L, null, null, null, null, null, false, false, false, booleanValue5, false, false, null, null, null, 1056964607)));
                    return pvcVar;
                }
                return pvcVar;
            case 18:
                boolean booleanValue6 = ((Boolean) obj).booleanValue();
                cza czaVar13 = ((p24) this.receiver).C;
                if (czaVar13 != null) {
                    do {
                        value13 = czaVar13.getValue();
                    } while (!czaVar13.l(value13, n24.a((n24) value13, false, null, 0, null, null, null, null, null, null, null, 0, 0, null, 0, 0L, null, null, null, null, null, false, false, false, false, booleanValue6, false, null, null, null, 1040187391)));
                    return pvcVar;
                }
                return pvcVar;
            case 19:
                String str7 = (String) obj;
                str7.getClass();
                i44 i44Var = (i44) this.receiver;
                i44Var.getClass();
                hk1 a = jdd.a(i44Var);
                sw2 sw2Var = ab3.a;
                i44Var.f(a, ru2.c, new d53((fdd) i44Var, (Object) str7, (m42) null, 11));
                return pvcVar;
            case 20:
                int intValue4 = ((Number) obj).intValue();
                i44 i44Var2 = (i44) this.receiver;
                i44Var2.getClass();
                i44Var2.j("thread_num", String.valueOf(intValue4));
                return pvcVar;
            case 21:
                int intValue5 = ((Number) obj).intValue();
                i44 i44Var3 = (i44) this.receiver;
                i44Var3.getClass();
                i44Var3.j("delay", String.valueOf(intValue5));
                return pvcVar;
            case 22:
                boolean booleanValue7 = ((Boolean) obj).booleanValue();
                i44 i44Var4 = (i44) this.receiver;
                i44Var4.getClass();
                i44Var4.j("ignore", String.valueOf(booleanValue7));
                return pvcVar;
            case 23:
                boolean booleanValue8 = ((Boolean) obj).booleanValue();
                w65 w65Var = (w65) this.receiver;
                w65Var.getClass();
                hk1 a2 = jdd.a(w65Var);
                sw2 sw2Var2 = ab3.a;
                w65Var.f(a2, ru2.c, new v65(w65Var, booleanValue8, (m42) null, 0));
                return pvcVar;
            case 24:
                xl0 xl0Var = (xl0) obj;
                xl0Var.getClass();
                ((pc5) this.receiver).getClass();
                int i2 = xl0Var.d.a;
                if (i2 >= 0 && i2 <= 5) {
                    hn0 hn0Var = xl0Var.b;
                    if (!c16.i(hn0Var, en0.a)) {
                        if (!(hn0Var instanceof cn0)) {
                            break;
                        }
                    }
                    return Boolean.valueOf(z8);
                }
                z8 = false;
                return Boolean.valueOf(z8);
            case 25:
                tva tvaVar = (tva) obj;
                tvaVar.getClass();
                ((pc5) this.receiver).getClass();
                if (!c16.i(tvaVar, hva.a) && !c16.i(tvaVar, ova.a) && !c16.i(tvaVar, rva.a) && !c16.i(tvaVar, qva.a) && !c16.i(tvaVar, lva.a) && !(tvaVar instanceof jva) && !(tvaVar instanceof iva) && !(tvaVar instanceof mva) && !(tvaVar instanceof sva) && !(tvaVar instanceof nva) && !(tvaVar instanceof kva) && !(tvaVar instanceof pva)) {
                    xk5.o();
                    return null;
                }
                return Boolean.TRUE;
            case 26:
                ((Set) obj).getClass();
                w16 w16Var = (w16) this.receiver;
                ReentrantLock reentrantLock = w16Var.d;
                reentrantLock.lock();
                try {
                    List C0 = sl1.C0(w16Var.c.values());
                    reentrantLock.unlock();
                    Iterator it = C0.iterator();
                    if (!it.hasNext()) {
                        return pvcVar;
                    }
                    ((t78) it.next()).getClass();
                    throw null;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            case 27:
                ((b36) this.receiver).r((Throwable) obj);
                return pvcVar;
            case 28:
                String str8 = (String) obj;
                str8.getClass();
                xb6 xb6Var = (xb6) this.receiver;
                xb6Var.getClass();
                hk1 a3 = jdd.a(xb6Var);
                sw2 sw2Var3 = ab3.a;
                xb6Var.f(a3, ru2.c, new qq4(xb6Var, str8, null, 14));
                return pvcVar;
            default:
                jp6 jp6Var = (jp6) obj;
                jp6Var.getClass();
                kp6 kp6Var = (kp6) this.receiver;
                np6 np6Var = (np6) kp6Var.g.getValue();
                if (np6Var != null) {
                    kp6Var.g.setValue(null);
                    xp6 xp6Var = np6Var.a;
                    if (jp6Var != jp6.a) {
                        z8 = false;
                    }
                    uo3 uo3Var = kp6Var.b;
                    List list = uo3Var.e().a;
                    if (list == null || !list.isEmpty()) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                xl0 xl0Var2 = (xl0) it2.next();
                                String str9 = xl0Var2.a;
                                String str10 = xp6Var.a;
                                if (c16.i(str9, str10) && xl0Var2.b.d() && (xl0Var2.c instanceof cm0)) {
                                    if (z8) {
                                        ym0 ym0Var = kp6Var.c;
                                        int max = Math.max(xp6Var.b, xp6Var.c);
                                        ym0Var.g(sze.a(max, max), str10);
                                    }
                                    so3 e = uo3Var.e();
                                    e.getClass();
                                    uo3Var.j(so3.a(e, null, str10, rs3.a, null, null, 25).b());
                                    uo3Var.c(uo3Var.e().a);
                                }
                            }
                        }
                    }
                }
                return pvcVar;
        }
    }
}
