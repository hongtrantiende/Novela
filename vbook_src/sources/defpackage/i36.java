package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i36  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class i36 extends xu4 implements mu4 {
    public static final i36 a = new xu4(3, l36.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        l36 l36Var = (l36) obj;
        w5a w5aVar = (w5a) obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l36.a;
        while (true) {
            Object I = l36Var.I();
            if (!(I instanceof gt5)) {
                if (!(I instanceof ft1)) {
                    I = m36.a(I);
                }
                w5aVar.e = I;
            } else if (l36Var.d0(I) >= 0) {
                w5aVar.c = k27.t(l36Var, true, new g36(l36Var, w5aVar));
                break;
            }
        }
        return pvc.a;
    }
}
