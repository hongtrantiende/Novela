package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xm  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class xm implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn b;
    public final /* synthetic */ oob c;

    public /* synthetic */ xm(cn cnVar, oob oobVar, int i) {
        this.a = i;
        this.b = cnVar;
        this.c = oobVar;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [zl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [zl9, java.lang.Object] */
    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        sc6 sc6Var = null;
        oob oobVar = this.c;
        cn cnVar = this.b;
        switch (i) {
            case 0:
                wm wmVar = cnVar.f;
                ve veVar = new ve(oobVar, 8);
                ?? obj = new Object();
                cnVar.e.d("dataBuilder", wmVar, new t7(6, obj, veVar));
                Object obj2 = obj.a;
                if (obj2 != null) {
                    return (nob) obj2;
                }
                c16.w("result");
                throw null;
            case 1:
                wm wmVar2 = cnVar.g;
                xm xmVar = new xm(cnVar, oobVar, 2);
                ?? obj3 = new Object();
                cnVar.e.d("positioner", wmVar2, new t7(6, obj3, xmVar));
                Object obj4 = obj3.a;
                if (obj4 != null) {
                    return (rk9) obj4;
                }
                c16.w("result");
                throw null;
            default:
                Object invoke = cnVar.c.invoke();
                if (((sc6) invoke).t()) {
                    sc6Var = invoke;
                }
                sc6 sc6Var2 = sc6Var;
                if (sc6Var2 == null) {
                    return rk9.e;
                }
                return oobVar.J(sc6Var2).o(sc6Var2.h0(0L));
        }
    }
}
