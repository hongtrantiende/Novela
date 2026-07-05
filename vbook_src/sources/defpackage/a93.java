package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a93  reason: default package */
/* loaded from: classes3.dex */
public final class a93 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ b93 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a93(b93 b93Var, String str, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = b93Var;
        this.d = str;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new a93(this.c, this.d, m42Var, 0);
            default:
                return new a93(this.c, this.d, m42Var, 1);
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
                return ((a93) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((a93) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        Object value;
        ArrayList arrayList;
        int i = this.a;
        String str = this.d;
        b93 b93Var = this.c;
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
                    a4a a4aVar = b93Var.c;
                    this.b = 1;
                    ((b4a) a4aVar).d(str);
                    if (pvcVar == n82Var) {
                        return n82Var;
                    }
                }
                cza czaVar = b93Var.d;
                if (czaVar != null) {
                    do {
                        value = czaVar.getValue();
                        List list = ((z83) value).a;
                        arrayList = new ArrayList();
                        for (Object obj2 : list) {
                            if (!c16.i((String) obj2, str)) {
                                arrayList.add(obj2);
                            }
                        }
                    } while (!czaVar.l(value, new z83(arrayList)));
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
                    a4a a4aVar2 = b93Var.c;
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
