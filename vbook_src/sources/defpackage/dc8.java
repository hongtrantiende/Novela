package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dc8  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class dc8 extends xu4 implements mu4 {
    public static final dc8 a = new xu4(3, ec8.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        ec8 ec8Var = (ec8) obj;
        w5a w5aVar = (w5a) obj2;
        long j = ec8Var.a;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        pvc pvcVar = pvc.a;
        if (i <= 0) {
            w5aVar.e = pvcVar;
            return pvcVar;
        }
        ex2 ex2Var = new ex2(19, w5aVar, ec8Var);
        w5aVar.getClass();
        d82 d82Var = w5aVar.a;
        w5aVar.c = ade.s(d82Var).o(j, ex2Var, d82Var);
        return pvcVar;
    }
}
