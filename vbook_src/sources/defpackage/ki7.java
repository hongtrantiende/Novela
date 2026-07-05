package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ki7  reason: default package */
/* loaded from: classes3.dex */
public final class ki7 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ aw7 c;
    public final /* synthetic */ aw7 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ki7(List list, aw7 aw7Var, aw7 aw7Var2, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.b = list;
        this.c = aw7Var;
        this.d = aw7Var2;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new ki7(this.b, this.c, this.d, m42Var, 0);
            default:
                return new ki7(this.b, this.c, this.d, m42Var, 1);
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
                return ((ki7) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((ki7) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        aw7 aw7Var = this.d;
        List list = this.b;
        aw7 aw7Var2 = this.c;
        switch (i) {
            case 0:
                hre.r(obj);
                if (((Boolean) aw7Var2.getValue()).booleanValue()) {
                    list = sl1.p0(list);
                }
                if (!k4b.j0(((jub) aw7Var.getValue()).a.b)) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (k4b.V(((mq5) obj2).b, ((jub) aw7Var.getValue()).a.b, true)) {
                            arrayList.add(obj2);
                        }
                    }
                    return arrayList;
                }
                return list;
            default:
                hre.r(obj);
                if (((Boolean) aw7Var2.getValue()).booleanValue()) {
                    list = sl1.p0(list);
                }
                if (!k4b.j0(((jub) aw7Var.getValue()).a.b)) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : list) {
                        if (k4b.V(((u2c) obj3).b, ((jub) aw7Var.getValue()).a.b, true)) {
                            arrayList2.add(obj3);
                        }
                    }
                    return arrayList2;
                }
                return list;
        }
    }
}
