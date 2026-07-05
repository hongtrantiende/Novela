package defpackage;

import android.graphics.RuntimeShader;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sl  reason: default package */
/* loaded from: classes.dex */
public final class sl implements sv9 {
    public final RuntimeShader a;

    public sl(RuntimeShader runtimeShader) {
        this.a = runtimeShader;
    }

    public final void a(long j) {
        this.a.setColorUniform("color", sve.x(j));
    }

    public final void b(String str, float f) {
        this.a.setFloatUniform(str, f);
    }

    public final void c(String str, float f, float f2) {
        this.a.setFloatUniform(str, f, f2);
    }

    public final void d(float[] fArr) {
        this.a.setFloatUniform("cornerRadii", fArr);
    }
}
