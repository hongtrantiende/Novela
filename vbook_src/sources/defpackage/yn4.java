package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yn4  reason: default package */
/* loaded from: classes3.dex */
public final class yn4 implements tj4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ao4 b;

    public /* synthetic */ yn4(ao4 ao4Var, int i) {
        this.a = i;
        this.b = ao4Var;
    }

    @Override // defpackage.tj4
    public final Object b(Object obj, m42 m42Var) {
        Object value;
        int i = this.a;
        pvc pvcVar = pvc.a;
        ao4 ao4Var = this.b;
        switch (i) {
            case 0:
                Object[] objArr = (Object[]) obj;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                Object obj4 = objArr[2];
                ilc ilcVar = (ilc) objArr[3];
                List list = (List) obj4;
                List<vl6> list2 = (List) obj3;
                oia oiaVar = (oia) obj2;
                cza czaVar = ao4Var.C;
                klc klcVar = ao4Var.c;
                if (czaVar == null) {
                    return pvcVar;
                }
                while (true) {
                    Object value2 = czaVar.getValue();
                    xn4 xn4Var = (xn4) value2;
                    int i2 = oiaVar.c;
                    ArrayList arrayList = new ArrayList(tl1.s(list2, 10));
                    for (vl6 vl6Var : list2) {
                        klc klcVar2 = klcVar;
                        arrayList.add(new qn4(vl6Var.a, ((plc) klcVar2).h(vl6Var.b, ilcVar.a, vl6Var.C, ilcVar.a(vl6Var.m), ilcVar.c), vl6Var.d, vl6Var.l, vl6Var.j, vl6Var.p, vl6Var.x, vl6Var.D, vl6Var.I));
                        klcVar = klcVar2;
                        pvcVar = pvcVar;
                        oiaVar = oiaVar;
                    }
                    klc klcVar3 = klcVar;
                    pvc pvcVar2 = pvcVar;
                    oia oiaVar2 = oiaVar;
                    ArrayList arrayList2 = new ArrayList(tl1.s(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        vl6 vl6Var2 = (vl6) it.next();
                        arrayList2.add(new qn4(vl6Var2.a, ((plc) klcVar3).h(vl6Var2.b, ilcVar.a, vl6Var2.C, ilcVar.a(vl6Var2.m), ilcVar.c), vl6Var2.d, vl6Var2.l, vl6Var2.j, vl6Var2.p, vl6Var2.x, vl6Var2.D, vl6Var2.I));
                        it = it;
                        ilcVar = ilcVar;
                    }
                    ilc ilcVar2 = ilcVar;
                    if (!czaVar.l(value2, xn4.a(xn4Var, i2, false, arrayList, arrayList2, 4))) {
                        klcVar = klcVar3;
                        pvcVar = pvcVar2;
                        oiaVar = oiaVar2;
                        ilcVar = ilcVar2;
                    } else {
                        return pvcVar2;
                    }
                }
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                cza czaVar2 = ao4Var.C;
                if (czaVar2 != null) {
                    do {
                        value = czaVar2.getValue();
                    } while (!czaVar2.l(value, xn4.a((xn4) value, 0, booleanValue, null, null, 27)));
                    return pvcVar;
                }
                return pvcVar;
        }
    }
}
