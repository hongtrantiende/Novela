package defpackage;

import android.util.Log;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.mozilla.javascript.Context;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bo0  reason: default package */
/* loaded from: classes3.dex */
public final class bo0 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo0(m42 m42Var, Object obj) {
        super(2, m42Var);
        this.a = 1;
        this.b = obj;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                bo0 bo0Var = new bo0(2, 0, m42Var);
                bo0Var.b = obj;
                return bo0Var;
            case 1:
                return new bo0(m42Var, this.b);
            case 2:
                bo0 bo0Var2 = new bo0(2, 2, m42Var);
                bo0Var2.b = obj;
                return bo0Var2;
            case 3:
                bo0 bo0Var3 = new bo0(2, 3, m42Var);
                bo0Var3.b = obj;
                return bo0Var3;
            case 4:
                bo0 bo0Var4 = new bo0(2, 4, m42Var);
                bo0Var4.b = obj;
                return bo0Var4;
            case 5:
                bo0 bo0Var5 = new bo0(2, 5, m42Var);
                bo0Var5.b = obj;
                return bo0Var5;
            case 6:
                bo0 bo0Var6 = new bo0(2, 6, m42Var);
                bo0Var6.b = obj;
                return bo0Var6;
            case 7:
                bo0 bo0Var7 = new bo0(2, 7, m42Var);
                bo0Var7.b = obj;
                return bo0Var7;
            case 8:
                bo0 bo0Var8 = new bo0(2, 8, m42Var);
                bo0Var8.b = obj;
                return bo0Var8;
            case 9:
                bo0 bo0Var9 = new bo0(2, 9, m42Var);
                bo0Var9.b = obj;
                return bo0Var9;
            case 10:
                bo0 bo0Var10 = new bo0(2, 10, m42Var);
                bo0Var10.b = obj;
                return bo0Var10;
            default:
                bo0 bo0Var11 = new bo0(2, 11, m42Var);
                bo0Var11.b = obj;
                return bo0Var11;
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                ((bo0) create((oh5) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return null;
            case 1:
                return ((bo0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 2:
                ((bo0) create((a06) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 3:
                return ((bo0) create((xya) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 4:
                return ((bo0) create((vp5) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 5:
                return ((bo0) create((rf8) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 6:
                return ((bo0) create((rz1) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 7:
                return ((bo0) create((zc6) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 8:
                ((bo0) create((pv7) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 9:
                return ((bo0) create((ik9) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 10:
                ((bo0) create((String) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                return ((bo0) create((tha) obj, (m42) obj2)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        r2 = false;
        boolean z4 = false;
        switch (i) {
            case 0:
                hre.r(obj);
                if (((oh5) this.b).y0().c().getAttributes().e(co0.b) != null) {
                    vm1.h();
                    return null;
                }
                return null;
            case 1:
                hre.r(obj);
                mj9 mj9Var = new mj9(new v01(1, (ByteBuffer) this.b));
                try {
                    byte[] K = mj9Var.K();
                    mj9Var.close();
                    return K;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        bue.d(mj9Var, th);
                        throw th2;
                    }
                }
            case 2:
                hre.r(obj);
                sue.K((a06) this.b, v46.b(o17.s(new yk8("code", new Integer((int) Context.VERSION_ES6)), new yk8("data", l53.c()))).toString());
                return pvcVar;
            case 3:
                hre.r(obj);
                return Boolean.valueOf(!(((xya) this.b) instanceof gf4));
            case 4:
                hre.r(obj);
                return Boolean.valueOf(!(((vp5) this.b) instanceof tp5));
            case 5:
                rf8 rf8Var = (rf8) this.b;
                hre.r(obj);
                if (rf8Var != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 6:
                hre.r(obj);
                return Boolean.valueOf(((rz1) this.b) instanceof dz1);
            case 7:
                hre.r(obj);
                List list = ((zc6) this.b).f;
                if (list == null || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            mi8 mi8Var = (mi8) it.next();
                            if (mi8Var.d.e() > 0 && mi8Var.d.b() > 0) {
                                z4 = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z4);
            case 8:
                pv7 pv7Var = (pv7) this.b;
                hre.r(obj);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : pv7Var.a().entrySet()) {
                    Map.Entry entry = (Map.Entry) obj2;
                    if ((entry.getValue() instanceof Float) || (entry.getValue() instanceof Integer)) {
                        arrayList.add(obj2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    int size = arrayList.size();
                    while (i2 < size) {
                        Object obj3 = arrayList.get(i2);
                        i2++;
                        Map.Entry entry2 = (Map.Entry) obj3;
                        e49 e49Var = (e49) entry2.getKey();
                        Object value = entry2.getValue();
                        if (value instanceof Float) {
                            pv7Var.f(s9e.o(e49Var.a), new Double(((Number) value).floatValue()));
                        } else if (value instanceof Integer) {
                            pv7Var.f(s9e.u(e49Var.a), new Long(((Number) value).intValue()));
                        }
                        pv7Var.d(e49Var);
                    }
                }
                return pvcVar;
            case 9:
                hre.r(obj);
                if (((ik9) this.b) == ik9.a) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            case 10:
                hre.r(obj);
                Log.e("FirebaseSessions", "Error failed to fetch the remote configs: " + ((String) this.b));
                return pvcVar;
            default:
                tha thaVar = (tha) this.b;
                hre.r(obj);
                if (thaVar != tha.a) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bo0(int i, int i2, m42 m42Var) {
        super(i, m42Var);
        this.a = i2;
    }
}
