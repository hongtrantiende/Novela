package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a42  reason: default package */
/* loaded from: classes3.dex */
public final class a42 extends aab implements nu4 {
    public final /* synthetic */ int a;
    public /* synthetic */ gj6 b;
    public /* synthetic */ gj6 c;
    public final /* synthetic */ aw7 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a42(aw7 aw7Var, m42 m42Var, int i) {
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
        gj6 gj6Var = (gj6) obj2;
        gj6 gj6Var2 = (gj6) obj3;
        m42 m42Var = (m42) obj4;
        switch (i) {
            case 0:
                a42 a42Var = new a42(aw7Var, m42Var, 0);
                a42Var.b = gj6Var;
                a42Var.c = gj6Var2;
                a42Var.invokeSuspend(pvcVar);
                return pvcVar;
            case 1:
                a42 a42Var2 = new a42(aw7Var, m42Var, 1);
                a42Var2.b = gj6Var;
                a42Var2.c = gj6Var2;
                a42Var2.invokeSuspend(pvcVar);
                return pvcVar;
            case 2:
                a42 a42Var3 = new a42(aw7Var, m42Var, 2);
                a42Var3.b = gj6Var;
                a42Var3.c = gj6Var2;
                a42Var3.invokeSuspend(pvcVar);
                return pvcVar;
            case 3:
                a42 a42Var4 = new a42(aw7Var, m42Var, 3);
                a42Var4.b = gj6Var;
                a42Var4.c = gj6Var2;
                a42Var4.invokeSuspend(pvcVar);
                return pvcVar;
            default:
                a42 a42Var5 = new a42(aw7Var, m42Var, 4);
                a42Var5.b = gj6Var;
                a42Var5.c = gj6Var2;
                a42Var5.invokeSuspend(pvcVar);
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
                gj6 gj6Var = this.b;
                gj6 gj6Var2 = this.c;
                hre.r(obj);
                ArrayList E0 = sl1.E0((List) aw7Var.getValue());
                E0.add(gj6Var2.a - 1, E0.remove(gj6Var.a - 1));
                aw7Var.setValue(E0);
                return pvcVar;
            case 1:
                gj6 gj6Var3 = this.b;
                gj6 gj6Var4 = this.c;
                hre.r(obj);
                ArrayList E02 = sl1.E0((List) aw7Var.getValue());
                E02.add(gj6Var4.a, E02.remove(gj6Var3.a));
                aw7Var.setValue(E02);
                return pvcVar;
            case 2:
                gj6 gj6Var5 = this.b;
                gj6 gj6Var6 = this.c;
                hre.r(obj);
                ArrayList E03 = sl1.E0((List) aw7Var.getValue());
                E03.add(gj6Var6.a, E03.remove(gj6Var5.a));
                aw7Var.setValue(E03);
                return pvcVar;
            case 3:
                gj6 gj6Var7 = this.b;
                gj6 gj6Var8 = this.c;
                hre.r(obj);
                ArrayList E04 = sl1.E0((List) aw7Var.getValue());
                E04.add(gj6Var8.a, E04.remove(gj6Var7.a));
                aw7Var.setValue(E04);
                return pvcVar;
            default:
                gj6 gj6Var9 = this.b;
                gj6 gj6Var10 = this.c;
                hre.r(obj);
                ArrayList E05 = sl1.E0((List) aw7Var.getValue());
                E05.add(gj6Var10.a, E05.remove(gj6Var9.a));
                aw7Var.setValue(E05);
                return pvcVar;
        }
    }
}
