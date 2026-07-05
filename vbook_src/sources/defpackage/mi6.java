package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mi6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class mi6 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oi6 b;

    public /* synthetic */ mi6(oi6 oi6Var, int i) {
        this.a = i;
        this.b = oi6Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        oi6 oi6Var = this.b;
        switch (i) {
            case 0:
                th6 th6Var = (th6) oi6Var.K.invoke();
                int a = th6Var.a();
                int i2 = 0;
                while (true) {
                    if (i2 < a) {
                        if (!th6Var.b(i2).equals(obj)) {
                            i2++;
                        }
                    } else {
                        i2 = -1;
                    }
                }
                return Integer.valueOf(i2);
            default:
                int intValue = ((Integer) obj).intValue();
                th6 th6Var2 = (th6) oi6Var.K.invoke();
                if (intValue < 0 || intValue >= th6Var2.a()) {
                    int a2 = th6Var2.a();
                    ov5.a("Can't scroll to index " + intValue + ", it is out of bounds [0, " + a2 + ")");
                }
                z87.v(oi6Var.v1(), null, null, new rr0(oi6Var, intValue, (m42) null, 5), 3);
                return Boolean.TRUE;
        }
    }
}
