package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kz4  reason: default package */
/* loaded from: classes.dex */
public final class kz4 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xt4 b;

    public /* synthetic */ kz4(int i, xt4 xt4Var) {
        this.a = i;
        this.b = xt4Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        long j;
        switch (this.a) {
            case 0:
                cra craVar = (cra) obj;
                synchronized (dra.c) {
                    j = dra.e;
                    dra.e = 1 + j;
                }
                return new ij9(j, craVar, this.b);
            default:
                return this.b.invoke(Long.valueOf(((Number) obj).longValue() / 1000000));
        }
    }
}
