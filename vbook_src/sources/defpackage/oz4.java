package defpackage;

import android.content.Context;
import android.widget.EdgeEffect;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oz4  reason: default package */
/* loaded from: classes.dex */
public final class oz4 extends EdgeEffect {
    public final float a;
    public float b;

    public oz4(Context context) {
        super(context);
        this.a = rqe.a(context).a * 1.0f;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i) {
        this.b = nae.e;
        super.onAbsorb(i);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f, float f2) {
        this.b = nae.e;
        super.onPull(f, f2);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.b = nae.e;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f) {
        this.b = nae.e;
        super.onPull(f);
    }
}
