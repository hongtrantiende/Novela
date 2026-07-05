package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ef6  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ef6 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ yya c;

    public /* synthetic */ ef6(float f, yya yyaVar, int i) {
        this.a = i;
        this.b = f;
        this.c = yyaVar;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        yya yyaVar = this.c;
        float f = this.b;
        switch (i) {
            case 0:
                float floatValue = ((Number) yyaVar.getValue()).floatValue();
                if (floatValue >= f) {
                    f = floatValue;
                }
                return Float.valueOf(f);
            case 1:
                float floatValue2 = ((Number) yyaVar.getValue()).floatValue();
                if (floatValue2 >= f) {
                    f = floatValue2;
                }
                return Float.valueOf(f);
            default:
                float floatValue3 = ((Number) yyaVar.getValue()).floatValue();
                if (floatValue3 >= f) {
                    f = floatValue3;
                }
                return Float.valueOf(f);
        }
    }
}
