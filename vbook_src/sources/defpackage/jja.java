package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jja  reason: default package */
/* loaded from: classes3.dex */
public final class jja implements tj4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lja b;

    public /* synthetic */ jja(lja ljaVar, int i) {
        this.a = i;
        this.b = ljaVar;
    }

    @Override // defpackage.tj4
    public final Object b(Object obj, m42 m42Var) {
        Object value;
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        Object value2;
        Object value3;
        ArrayList arrayList;
        Object value4;
        ArrayList arrayList2;
        Object value5;
        ArrayList arrayList3;
        int i3 = this.a;
        pvc pvcVar = pvc.a;
        lja ljaVar = this.b;
        switch (i3) {
            case 0:
                Object[] objArr = (Object[]) obj;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                Object obj4 = objArr[2];
                Object obj5 = objArr[3];
                List list = (List) objArr[4];
                List list2 = (List) obj5;
                List list3 = (List) obj4;
                List list4 = (List) obj3;
                oia oiaVar = (oia) obj2;
                cza czaVar = ljaVar.f;
                if (czaVar != null) {
                    do {
                        value = czaVar.getValue();
                        i = oiaVar.b;
                        i2 = oiaVar.c;
                        z = oiaVar.h;
                        z2 = oiaVar.g;
                        z3 = oiaVar.f;
                        ((aia) value).getClass();
                        list4.getClass();
                        list2.getClass();
                        list3.getClass();
                        list.getClass();
                    } while (!czaVar.l(value, new aia(false, i, i2, z3, z2, z, list4, list2, list3, list)));
                    return pvcVar;
                }
                return pvcVar;
            case 1:
                ilc ilcVar = (ilc) obj;
                cza czaVar2 = ljaVar.G;
                if (czaVar2 != null) {
                    do {
                        value2 = czaVar2.getValue();
                        ilc ilcVar2 = (ilc) value2;
                    } while (!czaVar2.l(value2, ilcVar));
                    return pvcVar;
                }
                return pvcVar;
            case 2:
                yk8 yk8Var = (yk8) obj;
                Object obj6 = yk8Var.a;
                ilc ilcVar3 = (ilc) yk8Var.b;
                List<vl6> list5 = (List) obj6;
                cza czaVar3 = ljaVar.C;
                if (czaVar3 != null) {
                    do {
                        value3 = czaVar3.getValue();
                        List list6 = (List) value3;
                        arrayList = new ArrayList(tl1.s(list5, 10));
                        for (vl6 vl6Var : list5) {
                            arrayList.add(c16.z(vl6Var, ((plc) ljaVar.e).h(vl6Var.b, ilcVar3.a, vl6Var.C, ilcVar3.a(vl6Var.m), ilcVar3.c)));
                        }
                    } while (!czaVar3.l(value3, arrayList));
                    return pvcVar;
                }
                return pvcVar;
            case 3:
                yk8 yk8Var2 = (yk8) obj;
                Object obj7 = yk8Var2.a;
                ilc ilcVar4 = (ilc) yk8Var2.b;
                List<vl6> list7 = (List) obj7;
                cza czaVar4 = ljaVar.D;
                if (czaVar4 != null) {
                    do {
                        value4 = czaVar4.getValue();
                        List list8 = (List) value4;
                        arrayList2 = new ArrayList(tl1.s(list7, 10));
                        for (vl6 vl6Var2 : list7) {
                            arrayList2.add(c16.z(vl6Var2, ((plc) ljaVar.e).h(vl6Var2.b, ilcVar4.a, vl6Var2.C, ilcVar4.a(vl6Var2.m), ilcVar4.c)));
                        }
                    } while (!czaVar4.l(value4, arrayList2));
                    return pvcVar;
                }
                return pvcVar;
            default:
                yk8 yk8Var3 = (yk8) obj;
                Object obj8 = yk8Var3.a;
                ilc ilcVar5 = (ilc) yk8Var3.b;
                List<vl6> list9 = (List) obj8;
                cza czaVar5 = ljaVar.E;
                if (czaVar5 != null) {
                    do {
                        value5 = czaVar5.getValue();
                        List list10 = (List) value5;
                        arrayList3 = new ArrayList(tl1.s(list9, 10));
                        for (vl6 vl6Var3 : list9) {
                            arrayList3.add(c16.z(vl6Var3, ((plc) ljaVar.e).h(vl6Var3.b, ilcVar5.a, vl6Var3.C, ilcVar5.a(vl6Var3.m), ilcVar5.c)));
                        }
                    } while (!czaVar5.l(value5, arrayList3));
                    return pvcVar;
                }
                return pvcVar;
        }
    }
}
