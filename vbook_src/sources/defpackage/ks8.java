package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ks8  reason: default package */
/* loaded from: classes3.dex */
public final class ks8 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ ss8 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ks8(ss8 ss8Var, String str, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = ss8Var;
        this.d = str;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        String str = this.d;
        ss8 ss8Var = this.c;
        switch (i) {
            case 0:
                return new ks8(ss8Var, str, m42Var, 0);
            default:
                return new ks8(ss8Var, str, m42Var, 1);
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
                return ((ks8) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((ks8) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        int i = this.a;
        pvc pvcVar = pvc.a;
        String str = this.d;
        n82 n82Var = n82.a;
        ss8 ss8Var = this.c;
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
                    fnb fnbVar = ss8Var.I;
                    this.b = 1;
                    obj = ((mnb) fnbVar).c(str, this);
                    if (obj == n82Var) {
                        return n82Var;
                    }
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (Iterable) obj) {
                    m32 m32Var = (m32) obj2;
                    boolean z = m32Var.d;
                    String str2 = m32Var.a;
                    if (z && !c16.i(str2, "edit") && !c16.i(str2, "delete")) {
                        arrayList.add(obj2);
                    }
                }
                cza czaVar = ss8Var.V;
                if (czaVar != null) {
                    do {
                        value = czaVar.getValue();
                        List list = (List) value;
                    } while (!czaVar.l(value, arrayList));
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
                    qvb qvbVar = ss8Var.J;
                    this.b = 1;
                    obj = ((svb) qvbVar).a(this);
                    if (obj == n82Var) {
                        return n82Var;
                    }
                }
                List list2 = (List) obj;
                cza czaVar2 = ss8Var.b0;
                if (czaVar2 != null) {
                    do {
                        value2 = czaVar2.getValue();
                        ((tvb) value2).getClass();
                        list2.getClass();
                    } while (!czaVar2.l(value2, new tvb(str, list2)));
                    return pvcVar;
                }
                return pvcVar;
        }
    }
}
