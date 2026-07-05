package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f16  reason: default package */
/* loaded from: classes3.dex */
public final class f16 extends n42 {
    public int a;
    public final /* synthetic */ lu4 b;
    public final /* synthetic */ m42 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f16(m42 m42Var, d82 d82Var, lu4 lu4Var, m42 m42Var2) {
        super(m42Var, d82Var);
        this.b = lu4Var;
        this.c = m42Var2;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                this.a = 2;
                hre.r(obj);
                return obj;
            }
            vs.k("This coroutine had already completed");
            return null;
        }
        this.a = 1;
        hre.r(obj);
        lu4 lu4Var = this.b;
        lu4Var.getClass();
        jsc.u(2, lu4Var);
        return lu4Var.invoke(this.c, this);
    }
}
