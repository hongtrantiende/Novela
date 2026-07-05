package defpackage;

import android.widget.Magnifier;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kx8  reason: default package */
/* loaded from: classes.dex */
public final class kx8 extends jx8 {
    @Override // defpackage.jx8, defpackage.hx8
    public final void a(float f, long j, long j2) {
        if (!Float.isNaN(f)) {
            this.a.setZoom(f);
        }
        int i = ((9223372034707292159L & j2) > 9205357640488583168L ? 1 : ((9223372034707292159L & j2) == 9205357640488583168L ? 0 : -1));
        Magnifier magnifier = this.a;
        if (i != 0) {
            magnifier.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
        } else {
            magnifier.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }
}
