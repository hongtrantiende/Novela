package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fm9  reason: default package */
/* loaded from: classes3.dex */
public final class fm9 extends fs9 implements lu4 {
    public final /* synthetic */ xl9 C;
    public final /* synthetic */ boolean D;
    public int b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ tb1 e;
    public final /* synthetic */ zhe f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fm9(tb1 tb1Var, zhe zheVar, xl9 xl9Var, boolean z, m42 m42Var) {
        super(2, m42Var);
        this.e = tb1Var;
        this.f = zheVar;
        this.C = xl9Var;
        this.D = z;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        fm9 fm9Var = new fm9(this.e, this.f, this.C, this.D, m42Var);
        fm9Var.d = obj;
        return fm9Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((fm9) create((c9a) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        String str = this.f.b;
        c9a c9aVar = (c9a) this.d;
        int i = this.c;
        xl9 xl9Var = this.C;
        if (i != 0) {
            if (i == 1) {
                int i2 = this.b;
                hre.r(obj);
                xl9Var.a = i2;
            } else {
                vs.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            hre.r(obj);
        }
        int d0 = k4b.d0(this.e, str, xl9Var.a, this.D);
        if (d0 != -1) {
            int length = str.length() + d0;
            y17 y17Var = new y17(d0, length - 1);
            this.d = c9aVar;
            this.b = length;
            this.c = 1;
            c9aVar.c(this, y17Var);
            return n82.a;
        }
        return pvc.a;
    }
}
