package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: asb  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class asb implements xt4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ vt4 b;
    public final /* synthetic */ aw7 c;

    public /* synthetic */ asb(vt4 vt4Var, aw7 aw7Var) {
        this.b = vt4Var;
        this.c = aw7Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        aw7 aw7Var = this.c;
        vt4 vt4Var = this.b;
        switch (i) {
            case 0:
                dna dnaVar = (dna) obj;
                float floatValue = ((Number) vt4Var.invoke()).floatValue();
                float intBitsToFloat = Float.intBitsToFloat((int) (dnaVar.a >> 32)) * floatValue;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (dnaVar.a & 4294967295L)) * floatValue;
                if (Float.intBitsToFloat((int) (((dna) aw7Var.getValue()).a >> 32)) != intBitsToFloat || Float.intBitsToFloat((int) (((dna) aw7Var.getValue()).a & 4294967295L)) != intBitsToFloat2) {
                    aw7Var.setValue(new dna((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32)));
                }
                return pvcVar;
            default:
                Float f = (Float) obj;
                f.getClass();
                aw7Var.setValue(f);
                vt4Var.invoke();
                return pvcVar;
        }
    }

    public /* synthetic */ asb(isb isbVar, vt4 vt4Var, aw7 aw7Var) {
        this.b = vt4Var;
        this.c = aw7Var;
    }
}
