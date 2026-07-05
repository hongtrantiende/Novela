package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cd2  reason: default package */
/* loaded from: classes3.dex */
public final class cd2 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aw7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cd2(aw7 aw7Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.b = aw7Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        aw7 aw7Var = this.b;
        switch (i) {
            case 0:
                return new cd2(aw7Var, m42Var, 0);
            case 1:
                return new cd2(aw7Var, m42Var, 1);
            case 2:
                return new cd2(aw7Var, m42Var, 2);
            case 3:
                return new cd2(aw7Var, m42Var, 3);
            default:
                return new cd2(aw7Var, m42Var, 4);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        m82 m82Var = (m82) obj;
        m42 m42Var = (m42) obj2;
        switch (i) {
            case 0:
                ((cd2) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 1:
                return ((cd2) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                ((cd2) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 3:
                ((cd2) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                return ((cd2) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        aw7 aw7Var = this.b;
        switch (i) {
            case 0:
                hre.r(obj);
                aw7Var.setValue(Boolean.TRUE);
                return pvcVar;
            case 1:
                hre.r(obj);
                jq6 t = tl1.t();
                if (!((tr3) aw7Var.getValue()).b.isEmpty()) {
                    t.add("");
                    int size = ((tr3) aw7Var.getValue()).b.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        t.add("");
                    }
                }
                List list = ((tr3) aw7Var.getValue()).c;
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    wp3 wp3Var = (wp3) list.get(i3);
                    t.add(wp3Var.a);
                    int size3 = wp3Var.d.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        t.add(wp3Var.a);
                    }
                }
                return tl1.r(t);
            case 2:
                hre.r(obj);
                aw7Var.setValue(Boolean.FALSE);
                return pvcVar;
            case 3:
                hre.r(obj);
                aw7Var.setValue(Boolean.FALSE);
                return pvcVar;
            default:
                hre.r(obj);
                List list2 = ((ymb) aw7Var.getValue()).a;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    if (((pmb) obj2).e == 0) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
        }
    }
}
