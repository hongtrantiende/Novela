package defpackage;

import java.util.Iterator;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m0  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class m0 extends xu4 implements xt4 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        Object[] objArr;
        Object[] objArr2;
        int i;
        Object obj2;
        String str;
        String str2;
        int i2 = this.a;
        pvc pvcVar = pvc.a;
        switch (i2) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                t0 t0Var = (t0) this.receiver;
                cv7 cv7Var = t0Var.a0;
                if (booleanValue) {
                    t0Var.S1();
                } else {
                    if (t0Var.M != null) {
                        Object[] objArr3 = cv7Var.c;
                        long[] jArr = cv7Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i3 = 0;
                            while (true) {
                                long j = jArr[i3];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i4 = 8;
                                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                                    int i6 = 0;
                                    while (i6 < i5) {
                                        if ((255 & j) < 128) {
                                            i = i4;
                                            objArr2 = objArr3;
                                            z87.v(t0Var.v1(), null, null, new r0(t0Var, (l59) objArr3[(i3 << 3) + i6], null, 0), 3);
                                        } else {
                                            objArr2 = objArr3;
                                            i = i4;
                                        }
                                        j >>= i;
                                        i6++;
                                        i4 = i;
                                        objArr3 = objArr2;
                                    }
                                    objArr = objArr3;
                                    if (i5 != i4) {
                                    }
                                } else {
                                    objArr = objArr3;
                                }
                                if (i3 != length) {
                                    i3++;
                                    objArr3 = objArr;
                                }
                            }
                        }
                        l59 l59Var = t0Var.c0;
                        if (l59Var != null) {
                            z87.v(t0Var.v1(), null, null, new r0(t0Var, l59Var, null, 1), 3);
                        }
                    }
                    cv7Var.a();
                    t0Var.c0 = null;
                    t0Var.T1();
                }
                return pvcVar;
            case 1:
                fb fbVar = (fb) obj;
                fbVar.getClass();
                eb ebVar = (eb) this.receiver;
                ebVar.getClass();
                hk1 a = jdd.a(ebVar);
                sw2 sw2Var = ab3.a;
                ebVar.f(a, ru2.c, new l0(ebVar, fbVar, null, 4));
                return pvcVar;
            case 2:
                String str3 = (String) obj;
                str3.getClass();
                eb ebVar2 = (eb) this.receiver;
                ebVar2.getClass();
                Iterator it = ((za) ebVar2.d.getValue()).d.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (c16.i(((t9) obj2).a, str3)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                t9 t9Var = (t9) obj2;
                if (t9Var != null && (str2 = t9Var.b) != null) {
                    str = str2;
                } else {
                    str = str3;
                }
                hk1 a2 = jdd.a(ebVar2);
                sw2 sw2Var2 = ab3.a;
                ebVar2.f(a2, ru2.c, new l((Object) ebVar2, str3, (Object) str, (m42) null, 1));
                return pvcVar;
            case 3:
                return ((f31) this.receiver).g((m42) obj);
            case 4:
                return ((f31) this.receiver).g((m42) obj);
            case 5:
                mo3 mo3Var = (mo3) obj;
                mo3Var.getClass();
                ((uo3) this.receiver).d(mo3Var);
                return pvcVar;
            case 6:
                String str4 = (String) obj;
                str4.getClass();
                ng1 ng1Var = (ng1) this.receiver;
                ng1Var.getClass();
                hk1 a3 = jdd.a(ng1Var);
                sw2 sw2Var3 = ab3.a;
                ng1Var.f(a3, ru2.c, new cv0(ng1Var, str4, null, 12));
                return pvcVar;
            case 7:
                String str5 = (String) obj;
                str5.getClass();
                ng1 ng1Var2 = (ng1) this.receiver;
                ng1Var2.getClass();
                Long U = r4b.U(ng1Var2.c);
                if (U != null) {
                    long longValue = U.longValue();
                    if (k4b.j0(((cg1) ng1Var2.C.getValue()).A)) {
                        hk1 a4 = jdd.a(ng1Var2);
                        sw2 sw2Var4 = ab3.a;
                        ng1Var2.f(a4, ru2.c, new gg1(ng1Var2, str5, longValue, (m42) null));
                    }
                }
                return pvcVar;
            case 8:
                String str6 = (String) obj;
                str6.getClass();
                ng1 ng1Var3 = (ng1) this.receiver;
                ng1Var3.getClass();
                cza czaVar = ng1Var3.C;
                Set G0 = sl1.G0(((cg1) czaVar.getValue()).z);
                if (!G0.add(str6)) {
                    G0.remove(str6);
                }
                if (czaVar != null) {
                    while (true) {
                        Object value = czaVar.getValue();
                        Set set = G0;
                        if (!czaVar.l(value, cg1.a((cg1) value, false, false, false, false, null, null, null, null, null, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, null, set, null, 0, null, null, 2080374783))) {
                            G0 = set;
                        }
                    }
                }
                return pvcVar;
            case 9:
                long longValue2 = ((Number) obj).longValue();
                ng1 ng1Var4 = (ng1) this.receiver;
                ng1Var4.getClass();
                hk1 a5 = jdd.a(ng1Var4);
                sw2 sw2Var5 = ab3.a;
                ng1Var4.f(a5, ru2.c, new eg1(ng1Var4, longValue2, null));
                return pvcVar;
            case 10:
                sm3 sm3Var = (sm3) obj;
                sm3Var.getClass();
                return ((en1) this.receiver).l(sm3Var);
            case 11:
                sm3 sm3Var2 = (sm3) obj;
                sm3Var2.getClass();
                return ((en1) this.receiver).l(sm3Var2);
            case 12:
                sm3 sm3Var3 = (sm3) obj;
                sm3Var3.getClass();
                return ((en1) this.receiver).l(sm3Var3);
            case 13:
                sm3 sm3Var4 = (sm3) obj;
                sm3Var4.getClass();
                return ((en1) this.receiver).l(sm3Var4);
            case 14:
                sm3 sm3Var5 = (sm3) obj;
                sm3Var5.getClass();
                return ((en1) this.receiver).l(sm3Var5);
            case 15:
                sm3 sm3Var6 = (sm3) obj;
                sm3Var6.getClass();
                return ((en1) this.receiver).l(sm3Var6);
            case 16:
                sm3 sm3Var7 = (sm3) obj;
                sm3Var7.getClass();
                return ((en1) this.receiver).l(sm3Var7);
            case 17:
                sm3 sm3Var8 = (sm3) obj;
                sm3Var8.getClass();
                return ((en1) this.receiver).l(sm3Var8);
            case 18:
                sm3 sm3Var9 = (sm3) obj;
                sm3Var9.getClass();
                return ((en1) this.receiver).l(sm3Var9);
            case 19:
                sm3 sm3Var10 = (sm3) obj;
                sm3Var10.getClass();
                return ((en1) this.receiver).l(sm3Var10);
            case 20:
                sm3 sm3Var11 = (sm3) obj;
                sm3Var11.getClass();
                return ((en1) this.receiver).l(sm3Var11);
            case 21:
                sm3 sm3Var12 = (sm3) obj;
                sm3Var12.getClass();
                return ((en1) this.receiver).l(sm3Var12);
            case 22:
                sm3 sm3Var13 = (sm3) obj;
                sm3Var13.getClass();
                return ((en1) this.receiver).l(sm3Var13);
            case 23:
                sm3 sm3Var14 = (sm3) obj;
                sm3Var14.getClass();
                return ((en1) this.receiver).l(sm3Var14);
            case 24:
                sm3 sm3Var15 = (sm3) obj;
                sm3Var15.getClass();
                return ((en1) this.receiver).l(sm3Var15);
            case 25:
                sm3 sm3Var16 = (sm3) obj;
                sm3Var16.getClass();
                return ((en1) this.receiver).l(sm3Var16);
            case 26:
                sm3 sm3Var17 = (sm3) obj;
                sm3Var17.getClass();
                return ((en1) this.receiver).l(sm3Var17);
            case 27:
                sm3 sm3Var18 = (sm3) obj;
                sm3Var18.getClass();
                return ((en1) this.receiver).l(sm3Var18);
            case 28:
                mo3 mo3Var2 = (mo3) obj;
                mo3Var2.getClass();
                ((uo3) this.receiver).d(mo3Var2);
                return pvcVar;
            default:
                int intValue = ((Number) obj).intValue();
                pz1 pz1Var = (pz1) this.receiver;
                pz1Var.getClass();
                fdd.g(pz1Var, jdd.a(pz1Var), new oz1(pz1Var, intValue, null, 3));
                return pvcVar;
        }
    }
}
