package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wd3  reason: default package */
/* loaded from: classes3.dex */
public final class wd3 extends aab implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wd3(ArrayList arrayList, m42 m42Var, int i) {
        super(1, m42Var);
        this.a = i;
        this.b = arrayList;
    }

    @Override // defpackage.hh0
    public final m42 create(m42 m42Var) {
        int i = this.a;
        ArrayList arrayList = this.b;
        switch (i) {
            case 0:
                return new wd3(arrayList, m42Var, 0);
            case 1:
                return new wd3(arrayList, m42Var, 1);
            case 2:
                return new wd3(arrayList, m42Var, 2);
            default:
                return new wd3(arrayList, m42Var, 3);
        }
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        m42 m42Var = (m42) obj;
        switch (i) {
            case 0:
                return ((wd3) create(m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((wd3) create(m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((wd3) create(m42Var)).invokeSuspend(pvcVar);
            default:
                return ((wd3) create(m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        ArrayList arrayList = this.b;
        switch (i) {
            case 0:
                hre.r(obj);
                q36 q36Var = r36.d;
                q36Var.getClass();
                return r4b.H(q36Var.b(new sz(nd3.Companion.serializer(), 0), arrayList));
            case 1:
                hre.r(obj);
                q36 q36Var2 = r36.d;
                q36Var2.getClass();
                return r4b.H(q36Var2.b(new sz(rrc.Companion.serializer(), 0), arrayList));
            case 2:
                hre.r(obj);
                q36 q36Var3 = r36.d;
                q36Var3.getClass();
                return r4b.H(q36Var3.b(new sz(rx7.Companion.serializer(), 0), arrayList));
            default:
                hre.r(obj);
                q36 q36Var4 = r36.d;
                q36Var4.getClass();
                return r4b.H(q36Var4.b(new sz(pnc.Companion.serializer(), 0), arrayList));
        }
    }
}
