package defpackage;

import android.view.Choreographer;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qo  reason: default package */
/* loaded from: classes.dex */
public final class qo extends aab implements lu4 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qo(int i, int i2, m42 m42Var) {
        super(i, m42Var);
        this.a = i2;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new qo(2, 0, m42Var);
            case 1:
                return new qo(2, 1, m42Var);
            case 2:
                return new qo(2, 2, m42Var);
            case 3:
                return new qo(2, 3, m42Var);
            default:
                return new qo(2, 4, m42Var);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                return ((qo) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 1:
                ((qo) create((i2a) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 2:
                ((qo) create((oh5) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 3:
                ((qo) create((i2a) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((qo) create((tj4) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                hre.r(obj);
                return Choreographer.getInstance();
            case 1:
                hre.r(obj);
                return pvcVar;
            case 2:
                hre.r(obj);
                return pvcVar;
            case 3:
                hre.r(obj);
                return pvcVar;
            default:
                hre.r(obj);
                return pvcVar;
        }
    }
}
