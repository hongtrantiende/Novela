package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hmc  reason: default package */
/* loaded from: classes3.dex */
public final class hmc extends aab implements pu4 {
    public /* synthetic */ Boolean a;
    public /* synthetic */ String b;
    public /* synthetic */ boolean c;
    public /* synthetic */ String d;
    public /* synthetic */ String e;
    public final /* synthetic */ rmc f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hmc(rmc rmcVar, m42 m42Var) {
        super(6, m42Var);
        this.f = rmcVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2;
        Object obj2;
        Object obj3;
        Object obj4;
        Boolean bool = this.a;
        String str = this.b;
        boolean z3 = this.c;
        String str2 = this.d;
        String str3 = this.e;
        hre.r(obj);
        rmc rmcVar = this.f;
        List list = rmcVar.F;
        ArrayList arrayList = new ArrayList();
        for (Object obj5 : list) {
            if (((vmc) obj5).c) {
                arrayList.add(obj5);
            }
        }
        List list2 = rmcVar.F;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj6 : list2) {
            if (((vmc) obj6).d) {
                arrayList2.add(obj6);
            }
        }
        cza czaVar = rmcVar.d;
        if (czaVar != null) {
            while (true) {
                Object value = czaVar.getValue();
                cza czaVar2 = czaVar;
                amc amcVar = (amc) value;
                if (str.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (bool != null) {
                    z2 = bool.booleanValue();
                } else {
                    z2 = false;
                }
                String str4 = (String) rmcVar.N.getValue();
                if (str4 == null) {
                    str4 = "";
                }
                Iterator it = rmcVar.G.iterator();
                while (true) {
                    obj2 = null;
                    if (it.hasNext()) {
                        obj3 = it.next();
                        if (((tmc) obj3).a.equals(str)) {
                            break;
                        }
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                tmc tmcVar = (tmc) obj3;
                int size = arrayList.size();
                rmc rmcVar2 = rmcVar;
                int i = 0;
                while (true) {
                    if (i < size) {
                        obj4 = arrayList.get(i);
                        int i2 = i + 1;
                        if (((vmc) obj4).a.equals(str2)) {
                            break;
                        }
                        i = i2;
                    } else {
                        obj4 = null;
                        break;
                    }
                }
                vmc vmcVar = (vmc) obj4;
                int size2 = arrayList2.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        break;
                    }
                    Object obj7 = arrayList2.get(i3);
                    i3++;
                    int i4 = size2;
                    if (((vmc) obj7).a.equals(str3)) {
                        obj2 = obj7;
                        break;
                    }
                    size2 = i4;
                }
                vmc vmcVar2 = (vmc) obj2;
                ArrayList arrayList3 = arrayList2;
                Boolean bool2 = bool;
                if (czaVar2.l(value, amc.a(amcVar, z, false, z3, z2, str4, tmcVar, vmcVar, vmcVar2, 2))) {
                    break;
                }
                arrayList2 = arrayList3;
                czaVar = czaVar2;
                rmcVar = rmcVar2;
                bool = bool2;
            }
        }
        return pvc.a;
    }

    @Override // defpackage.pu4
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        hmc hmcVar = new hmc(this.f, (m42) obj6);
        hmcVar.a = (Boolean) obj;
        hmcVar.b = (String) obj2;
        hmcVar.c = booleanValue;
        hmcVar.d = (String) obj4;
        hmcVar.e = (String) obj5;
        pvc pvcVar = pvc.a;
        hmcVar.invokeSuspend(pvcVar);
        return pvcVar;
    }
}
