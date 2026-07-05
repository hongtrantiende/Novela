package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uc1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class uc1 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ uc1(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        boolean z;
        int i = this.a;
        boolean z2 = this.b;
        switch (i) {
            case 0:
                char charValue = ((Character) obj).charValue();
                if (charValue != 0 && charValue != '&' && (!z2 ? charValue != '\"' : charValue != '\'')) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                pm1 pm1Var = (pm1) obj;
                pm1Var.getClass();
                if (z2) {
                    long j = zl1.e;
                    long j2 = zl1.b;
                    return pm1.a(pm1Var, j, j2, j, j2, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, j2, j, j2, j, j2, j, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, j2, j, j2, j2, j2, j2, j2, 536354800, 65520);
                }
                long j3 = zl1.b;
                long j4 = zl1.e;
                return pm1.a(pm1Var, j3, j4, j3, j4, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, j4, j3, j4, j3, j4, j3, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, j4, j3, j4, j4, j4, j4, j4, 536354800, 65520);
        }
    }
}
