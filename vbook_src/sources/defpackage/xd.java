package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xd  reason: default package */
/* loaded from: classes3.dex */
public final class xd extends aab implements nu4 {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd(a22 a22Var, String str, m42 m42Var) {
        super(4, m42Var);
        this.a = 1;
        this.c = a22Var;
        this.d = str;
    }

    @Override // defpackage.nu4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                xd xdVar = new xd(4, (m42) obj4);
                xdVar.b = (le) obj;
                xdVar.c = (jt2) obj2;
                xdVar.d = obj3;
                xdVar.invokeSuspend(pvcVar);
                return pvcVar;
            case 1:
                ac8 ac8Var = (ac8) obj;
                xd xdVar2 = new xd((a22) this.c, (String) this.d, (m42) obj4);
                xdVar2.b = (gh5) obj2;
                xdVar2.invokeSuspend(pvcVar);
                return pvcVar;
            case 2:
                ((Number) obj).longValue();
                xd xdVar3 = new xd((br6) this.d, (m42) obj4, 2);
                xdVar3.b = (List) obj2;
                xdVar3.c = (oia) obj3;
                xdVar3.invokeSuspend(pvcVar);
                return pvcVar;
            default:
                m82 m82Var = (m82) obj;
                xd xdVar4 = new xd((eo3) this.d, (m42) obj4, 3);
                xdVar4.b = (gj6) obj2;
                xdVar4.c = (gj6) obj3;
                xdVar4.invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        Object value;
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                hre.r(obj);
                le leVar = (le) this.b;
                float c = ((jt2) this.c).c(this.d);
                if (!Float.isNaN(c)) {
                    le.b(leVar, c);
                }
                return pvcVar;
            case 1:
                String str = (String) this.d;
                gh5 gh5Var = (gh5) this.b;
                hre.r(obj);
                if (((a22) this.c).b) {
                    o45 o45Var = gh5Var.c;
                    o45Var.getClass();
                    if (!((Map) o45Var.a).containsKey("Accept-Encoding")) {
                        pw6 pw6Var = e22.a;
                        if (gwe.k(pw6Var)) {
                            StringBuilder o = a82.o("Adding Accept-Encoding=", str, " for ");
                            o.append(gh5Var.a);
                            pw6Var.i(o.toString());
                        }
                        gh5Var.c.H("Accept-Encoding", str);
                    }
                }
                return pvcVar;
            case 2:
                List list = (List) this.b;
                oia oiaVar = (oia) this.c;
                hre.r(obj);
                boolean isEmpty = list.isEmpty();
                cza czaVar = ((br6) this.d).X;
                if (!isEmpty) {
                    if (czaVar == null) {
                        return pvcVar;
                    }
                    while (true) {
                        Object value2 = czaVar.getValue();
                        pvc pvcVar2 = pvcVar;
                        if (!czaVar.l(value2, xq6.a((xq6) value2, 0L, false, false, null, false, oiaVar.b, oiaVar.c, false, null, list, 413))) {
                            pvcVar = pvcVar2;
                        } else {
                            return pvcVar2;
                        }
                    }
                } else if (czaVar == null) {
                    return pvcVar;
                } else {
                    do {
                        value = czaVar.getValue();
                    } while (!czaVar.l(value, xq6.a((xq6) value, 0L, false, false, null, false, oiaVar.b, oiaVar.c, false, null, list, 413)));
                    return pvcVar;
                }
            default:
                hre.r(obj);
                eo3 eo3Var = (eo3) this.d;
                int i2 = ((gj6) this.b).a;
                int i3 = ((gj6) this.c).a;
                if (i2 >= 0) {
                    if (i2 < eo3Var.c().size() && i3 >= 0 && i3 < eo3Var.c().size()) {
                        ArrayList E0 = sl1.E0(eo3Var.c());
                        E0.add(i3, E0.remove(i2));
                        eo3Var.f(E0);
                    }
                } else {
                    eo3Var.getClass();
                }
                return pvcVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xd(int i, m42 m42Var) {
        super(i, m42Var);
        this.a = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xd(Object obj, m42 m42Var, int i) {
        super(4, m42Var);
        this.a = i;
        this.d = obj;
    }
}
