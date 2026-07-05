package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jh7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jh7 implements mu4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;

    public /* synthetic */ jh7(cyb cybVar, float f, float f2, float f3, float f4, float f5) {
        this.a = 2;
        this.C = cybVar;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        ls3 ls3Var = ls3.a;
        Object obj4 = this.C;
        switch (i) {
            case 0:
                aw7 aw7Var = (aw7) obj4;
                e37 e37Var = (e37) obj;
                w27 w27Var = (w27) obj2;
                x02 x02Var = (x02) obj3;
                e37Var.getClass();
                w27Var.getClass();
                mw8 M = w27Var.M(x02Var.a);
                return e37Var.q0(M.a, M.b, ls3Var, new kh7(M, x02Var, this.b, this.c, this.d, this.e, this.f, aw7Var, 0));
            case 1:
                aw7 aw7Var2 = (aw7) obj4;
                e37 e37Var2 = (e37) obj;
                w27 w27Var2 = (w27) obj2;
                x02 x02Var2 = (x02) obj3;
                e37Var2.getClass();
                w27Var2.getClass();
                mw8 M2 = w27Var2.M(x02Var2.a);
                return e37Var2.q0(M2.a, M2.b, ls3Var, new kh7(M2, x02Var2, this.b, this.c, this.d, this.e, this.f, aw7Var2, 1));
            default:
                cyb cybVar = (cyb) obj4;
                e37 e37Var3 = (e37) obj;
                w27 w27Var3 = (w27) obj2;
                x02 x02Var3 = (x02) obj3;
                e37Var3.getClass();
                w27Var3.getClass();
                mw8 M3 = w27Var3.M(x02Var3.a);
                return e37Var3.q0(M3.a, M3.b, ls3Var, new kh7(cybVar, M3, this.b, x02Var3, this.c, this.d, this.e, this.f));
        }
    }

    public /* synthetic */ jh7(float f, float f2, float f3, float f4, float f5, aw7 aw7Var, int i) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.C = aw7Var;
    }
}
