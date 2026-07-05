package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k36  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class k36 extends xu4 implements mu4 {
    public static final k36 a = new xu4(3, l36.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        Object I;
        pvc pvcVar;
        l36 l36Var = (l36) obj;
        w5a w5aVar = (w5a) obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l36.a;
        do {
            I = l36Var.I();
            boolean z = I instanceof gt5;
            pvcVar = pvc.a;
            if (!z) {
                w5aVar.e = pvcVar;
                return pvcVar;
            }
        } while (l36Var.d0(I) < 0);
        w5aVar.c = k27.t(l36Var, true, new h36(l36Var, w5aVar));
        return pvcVar;
    }
}
