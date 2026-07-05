package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j3a  reason: default package */
/* loaded from: classes3.dex */
public final class j3a extends aab implements xt4 {
    @Override // defpackage.hh0
    public final m42 create(m42 m42Var) {
        return new aab(1, m42Var);
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        pvc pvcVar = pvc.a;
        ((j3a) create((m42) obj)).invokeSuspend(pvcVar);
        return pvcVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        hre.r(obj);
        return pvc.a;
    }
}
