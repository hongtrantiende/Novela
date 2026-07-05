package defpackage;

import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f15  reason: default package */
/* loaded from: classes.dex */
public final class f15 extends jea {
    public final /* synthetic */ int c;
    public final /* synthetic */ List d;
    public final /* synthetic */ lq e;

    public f15(int i, List list, lq lqVar) {
        this.c = i;
        this.d = list;
        this.e = lqVar;
    }

    @Override // defpackage.jea
    public final Shader c(long j) {
        int i = this.c;
        int i2 = (i * 2) + 1;
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(Float.valueOf(dce.m(((i3 - i) * (1.0f / i)) + ((Number) this.e.e()).floatValue(), nae.e, 1.0f)));
        }
        return eh.d(0, (Float.floatToRawIntBits(nae.e) << 32) | (Float.floatToRawIntBits(nae.e) & 4294967295L), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f) & 4294967295L), this.d, arrayList);
    }
}
