package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: eda  reason: default package */
/* loaded from: classes3.dex */
public final class eda implements xt4 {
    public final /* synthetic */ int a;

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        ls3 ls3Var = ls3.a;
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return ls3Var;
            default:
                return Long.valueOf(((Number) obj).longValue() / 1000000);
        }
    }
}
