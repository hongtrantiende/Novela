package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hs7  reason: default package */
/* loaded from: classes.dex */
public final class hs7 extends aab implements lu4 {
    public int a;
    public final /* synthetic */ is7 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs7(is7 is7Var, float f, long j, m42 m42Var) {
        super(2, m42Var);
        this.b = is7Var;
        this.c = f;
        this.d = j;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        return new hs7(this.b, this.c, this.d, m42Var);
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((hs7) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                hre.r(obj);
            } else {
                vs.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            hre.r(obj);
            btd btdVar = this.b.M;
            this.a = 1;
            yrd yrdVar = btdVar.c;
            long t = dye.t(this.d);
            yrdVar.getClass();
            Object p = k27.p(new vrd(yrdVar, this.c, t, true, null), this);
            n82 n82Var = n82.a;
            if (p == n82Var) {
                return n82Var;
            }
        }
        return pvc.a;
    }
}
