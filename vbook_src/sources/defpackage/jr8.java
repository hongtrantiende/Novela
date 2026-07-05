package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jr8  reason: default package */
/* loaded from: classes3.dex */
public final class jr8 implements PointerInputEventHandler {
    public final /* synthetic */ lu4 C;
    public final /* synthetic */ vt4 a;
    public final /* synthetic */ sk8 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ xt4 d;
    public final /* synthetic */ xt4 e;
    public final /* synthetic */ m82 f;

    public jr8(vt4 vt4Var, sk8 sk8Var, int i, xt4 xt4Var, xt4 xt4Var2, m82 m82Var, lu4 lu4Var) {
        this.a = vt4Var;
        this.b = sk8Var;
        this.c = i;
        this.d = xt4Var;
        this.e = xt4Var2;
        this.f = m82Var;
        this.C = lu4Var;
    }

    public static final long a(float f, float f2, long j) {
        return (Float.floatToRawIntBits(dce.m(Float.intBitsToFloat((int) (j >> 32)) / f, nae.e, 1.0f)) << 32) | (Float.floatToRawIntBits(dce.m(Float.intBitsToFloat((int) (j & 4294967295L)) / f2, nae.e, 1.0f)) & 4294967295L);
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(d19 d19Var, m42 m42Var) {
        float f = (int) (((hab) d19Var).U >> 32);
        hab habVar = (hab) d19Var;
        float f2 = (int) (habVar.U & 4294967295L);
        if (f > nae.e && f2 > nae.e) {
            float floatValue = ((Number) this.a.invoke()).floatValue();
            if (floatValue < 0.01f) {
                floatValue = 0.01f;
            }
            return yae.h(d19Var, new ir8(this.b, this.c, f, f2, (habVar.f() * 28.0f) / floatValue, (habVar.f() * 6.0f) / floatValue, this.d, this.e, this.f, this.C, null), m42Var);
        }
        return pvc.a;
    }
}
