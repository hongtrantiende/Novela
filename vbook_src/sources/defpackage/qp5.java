package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qp5  reason: default package */
/* loaded from: classes3.dex */
public final class qp5 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ wk3 d;
    public final /* synthetic */ ns2 e;
    public final /* synthetic */ r13 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qp5(wk3 wk3Var, ns2 ns2Var, r13 r13Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.d = wk3Var;
        this.e = ns2Var;
        this.f = r13Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                qp5 qp5Var = new qp5(this.d, this.e, this.f, m42Var, 0);
                qp5Var.c = obj;
                return qp5Var;
            default:
                qp5 qp5Var2 = new qp5(this.d, this.e, this.f, m42Var, 1);
                qp5Var2.c = obj;
                return qp5Var2;
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        sq9 sq9Var = (sq9) obj;
        m42 m42Var = (m42) obj2;
        switch (i) {
            case 0:
                ((qp5) create(sq9Var, m42Var)).invokeSuspend(pvcVar);
                return n82.a;
            default:
                return ((qp5) create(sq9Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        wk3 wk3Var = this.d;
        n82 n82Var = n82.a;
        switch (i) {
            case 0:
                sq9 sq9Var = (sq9) this.c;
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 != 1) {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hre.r(obj);
                } else {
                    hre.r(obj);
                    String str = vq9.a(wk3Var, sq9Var).b;
                    oi5 oi5Var = new oi5(10);
                    this.c = null;
                    this.b = 1;
                    obj = rp5.d.F(str, new dh2(oi5Var, this.e, str, null, 3), this);
                    if (obj == n82Var) {
                        return n82Var;
                    }
                }
                throw s21.i(obj);
            default:
                sq9 sq9Var2 = (sq9) this.c;
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    String str2 = vq9.a(wk3Var, sq9Var2).b;
                    fo4 fo4Var = new fo4(this.f, 10);
                    this.c = null;
                    this.b = 1;
                    obj = rp5.d.F(str2, new dh2(fo4Var, this.e, str2, null, 3), this);
                    if (obj == n82Var) {
                        return n82Var;
                    }
                }
                obj.getClass();
                return ((zl5) obj).a;
        }
    }
}
