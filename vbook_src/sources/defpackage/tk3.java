package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tk3  reason: default package */
/* loaded from: classes.dex */
public final class tk3 implements Drawable.Callback {
    public final /* synthetic */ uk3 a;

    public tk3(uk3 uk3Var) {
        this.a = uk3Var;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        drawable.getClass();
        uk3 uk3Var = this.a;
        hm8 hm8Var = uk3Var.C;
        hm8Var.setValue(Integer.valueOf(((Number) hm8Var.getValue()).intValue() + 1));
        uk3Var.D.setValue(new dna(vk3.a(uk3Var.f)));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        drawable.getClass();
        runnable.getClass();
        ((Handler) vk3.a.getValue()).postAtTime(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        drawable.getClass();
        runnable.getClass();
        ((Handler) vk3.a.getValue()).removeCallbacks(runnable);
    }
}
