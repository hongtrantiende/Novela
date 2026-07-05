package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vw2  reason: default package */
/* loaded from: classes.dex */
public final class vw2 implements i2a {
    public final /* synthetic */ ww2 a;

    public vw2(ww2 ww2Var) {
        this.a = ww2Var;
    }

    @Override // defpackage.i2a
    public final float a(float f) {
        boolean z;
        if (Float.isNaN(f)) {
            return nae.e;
        }
        ww2 ww2Var = this.a;
        float floatValue = ((Number) ww2Var.a.invoke(Float.valueOf(f))).floatValue();
        hm8 hm8Var = ww2Var.e;
        boolean z2 = false;
        if (floatValue > nae.e) {
            z = true;
        } else {
            z = false;
        }
        hm8Var.setValue(Boolean.valueOf(z));
        hm8 hm8Var2 = ww2Var.f;
        if (floatValue < nae.e) {
            z2 = true;
        }
        hm8Var2.setValue(Boolean.valueOf(z2));
        return floatValue;
    }
}
