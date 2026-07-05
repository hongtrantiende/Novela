package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: opd  reason: default package */
/* loaded from: classes3.dex */
public final class opd extends d1 {
    public final f51 a;

    public opd(f51 f51Var) {
        this.a = f51Var;
    }

    @Override // defpackage.d1
    public final f51 a() {
        return this.a;
    }

    @Override // defpackage.d1
    public final b72 b() {
        return ppd.a;
    }

    @Override // defpackage.d1
    public final Object d(b72 b72Var) {
        mt5 mt5Var = (mt5) b72Var;
        mt5Var.getClass();
        Integer num = mt5Var.a;
        ppd.a(num, "year");
        int intValue = num.intValue();
        Integer num2 = mt5Var.b;
        ppd.a(num2, "monthNumber");
        return new ipd(intValue, num2.intValue());
    }
}
