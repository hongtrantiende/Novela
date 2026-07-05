package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z85  reason: default package */
/* loaded from: classes3.dex */
public final class z85 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ a95 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z85(a95 a95Var, String str, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = a95Var;
        this.d = str;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new z85(this.c, this.d, m42Var, 0);
            default:
                return new z85(this.c, this.d, m42Var, 1);
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
                return ((z85) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((z85) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        Object value;
        ArrayList arrayList;
        List list;
        int i = this.a;
        String str = this.d;
        a95 a95Var = this.c;
        n82 n82Var = n82.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    a4a a4aVar = a95Var.e;
                    this.b = 1;
                    ((b4a) a4aVar).d(str);
                    if (pvcVar == n82Var) {
                        return n82Var;
                    }
                }
                cza czaVar = a95Var.f;
                if (czaVar != null) {
                    do {
                        value = czaVar.getValue();
                        y85 y85Var = (y85) value;
                        List list2 = y85Var.b;
                        arrayList = new ArrayList();
                        for (Object obj2 : list2) {
                            if (!c16.i((String) obj2, str)) {
                                arrayList.add(obj2);
                            }
                        }
                        list = y85Var.a;
                        list.getClass();
                    } while (!czaVar.l(value, new y85(list, arrayList)));
                    return pvcVar;
                }
                return pvcVar;
            default:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    a4a a4aVar2 = a95Var.e;
                    this.b = 1;
                    ((b4a) a4aVar2).a.S.p0(new np2(str, by5.a.k().b()));
                    if (pvcVar == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
        }
    }
}
