package defpackage;

import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: za7  reason: default package */
/* loaded from: classes3.dex */
public final class za7 extends jea {
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ List e;
    public final /* synthetic */ float f;

    public za7(int i, boolean z, jq6 jq6Var, float f) {
        this.c = i;
        this.d = z;
        this.e = jq6Var;
        this.f = f;
    }

    @Override // defpackage.jea
    public final Shader c(long j) {
        long floatToRawIntBits;
        int floatToRawIntBits2;
        int i = this.c;
        float f = 1.0f / i;
        int i2 = (i * 2) + 1;
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(Float.valueOf(dce.m(((i3 - i) * f) + this.f, nae.e, 1.0f)));
        }
        if (this.d) {
            float intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
            floatToRawIntBits = Float.floatToRawIntBits(nae.e);
            floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat);
        } else {
            int i4 = (int) (j >> 32);
            int i5 = (int) (j & 4294967295L);
            float max = Math.max(Float.intBitsToFloat(i4), Float.intBitsToFloat(i5));
            float max2 = Math.max(Float.intBitsToFloat(i4), Float.intBitsToFloat(i5));
            floatToRawIntBits = Float.floatToRawIntBits(max);
            floatToRawIntBits2 = Float.floatToRawIntBits(max2);
        }
        return eh.d(0, 0L, (floatToRawIntBits2 & 4294967295L) | (floatToRawIntBits << 32), this.e, arrayList);
    }
}
