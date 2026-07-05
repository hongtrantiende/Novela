package defpackage;

import android.widget.Magnifier;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jx8  reason: default package */
/* loaded from: classes.dex */
public class jx8 implements hx8 {
    public final Magnifier a;

    public jx8(Magnifier magnifier) {
        this.a = magnifier;
    }

    @Override // defpackage.hx8
    public void a(float f, long j, long j2) {
        this.a.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public final void b() {
        this.a.dismiss();
    }

    public final long c() {
        return (this.a.getWidth() << 32) | (this.a.getHeight() & 4294967295L);
    }

    public final void d() {
        this.a.update();
    }
}
