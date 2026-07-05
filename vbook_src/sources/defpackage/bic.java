package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bic  reason: default package */
/* loaded from: classes3.dex */
public final class bic extends fdd {
    public final s02 C;
    public final oc5 D;
    public final int c;
    public final Integer d;
    public final zq1 e;
    public final cza f;

    public bic(int i, Integer num, zq1 zq1Var) {
        Object value;
        this.c = i;
        this.d = num;
        this.e = zq1Var;
        cza a = dza.a(new aic("", false, true, false, null));
        this.f = a;
        this.C = new s02();
        this.D = axe.i();
        int intValue = num.intValue();
        if (!((aic) a.getValue()).d && ((aic) a.getValue()).e == null) {
            do {
                value = a.getValue();
            } while (!a.l(value, aic.a((aic) value, null, false, true, null, 23)));
            hk1 a2 = jdd.a(this);
            sw2 sw2Var = ab3.a;
            f(a2, ru2.c, new u(this, intValue, null, 10));
        }
    }
}
