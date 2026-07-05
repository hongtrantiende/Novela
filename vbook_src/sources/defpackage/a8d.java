package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a8d  reason: default package */
/* loaded from: classes3.dex */
public final class a8d extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a8d(Object obj, Object obj2, Object obj3, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                return new a8d((ArrayList) obj4, (aw7) obj3, (aw7) obj2, m42Var, 0);
            default:
                return new a8d((r13) obj4, (mrd) obj3, (su0) obj2, m42Var, 1);
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
                return ((a8d) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                ((a8d) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.d;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                aw7 aw7Var = (aw7) obj3;
                hre.r(obj);
                Iterable iterable = (ArrayList) obj4;
                if (((Boolean) ((aw7) obj2).getValue()).booleanValue()) {
                    iterable = sl1.p0(iterable);
                }
                if (!k4b.j0(((jub) aw7Var.getValue()).a.b)) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj5 : iterable) {
                        if (k4b.V(((lbd) obj5).b, ((jub) aw7Var.getValue()).a.b, true)) {
                            arrayList.add(obj5);
                        }
                    }
                    return arrayList;
                }
                return iterable;
            default:
                hre.r(obj);
                r13 r13Var = (r13) obj4;
                su0 su0Var = (su0) obj3;
                int A = k27.A(r13Var.L0(su0Var.d()));
                long A2 = k27.A(r13Var.L0(su0Var.c())) & 4294967295L;
                ((mrd) obj2).a.i(A2 | (A << 32));
                return pvc.a;
        }
    }
}
