package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rr3  reason: default package */
/* loaded from: classes.dex */
public final class rr3 extends aab implements nu4 {
    public final /* synthetic */ int a;
    public /* synthetic */ fg6 b;
    public /* synthetic */ fg6 c;
    public final /* synthetic */ aw7 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rr3(aw7 aw7Var, m42 m42Var, int i) {
        super(4, m42Var);
        this.a = i;
        this.d = aw7Var;
    }

    @Override // defpackage.nu4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        aw7 aw7Var = this.d;
        m82 m82Var = (m82) obj;
        fg6 fg6Var = (fg6) obj2;
        fg6 fg6Var2 = (fg6) obj3;
        m42 m42Var = (m42) obj4;
        switch (i) {
            case 0:
                rr3 rr3Var = new rr3(aw7Var, m42Var, 0);
                rr3Var.b = fg6Var;
                rr3Var.c = fg6Var2;
                rr3Var.invokeSuspend(pvcVar);
                return pvcVar;
            default:
                rr3 rr3Var2 = new rr3(aw7Var, m42Var, 1);
                rr3Var2.b = fg6Var;
                rr3Var2.c = fg6Var2;
                rr3Var2.invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        aw7 aw7Var = this.d;
        switch (i) {
            case 0:
                fg6 fg6Var = this.b;
                fg6 fg6Var2 = this.c;
                hre.r(obj);
                ArrayList E0 = sl1.E0((List) aw7Var.getValue());
                E0.add(fg6Var2.a, E0.remove(fg6Var.a));
                aw7Var.setValue(E0);
                return pvcVar;
            default:
                fg6 fg6Var3 = this.b;
                fg6 fg6Var4 = this.c;
                hre.r(obj);
                ArrayList E02 = sl1.E0((List) aw7Var.getValue());
                E02.add(fg6Var4.a, E02.remove(fg6Var3.a));
                aw7Var.setValue(E02);
                return pvcVar;
        }
    }
}
