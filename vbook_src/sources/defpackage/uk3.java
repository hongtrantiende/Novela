package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uk3  reason: default package */
/* loaded from: classes.dex */
public final class uk3 extends vk8 implements bn9 {
    public final hm8 C;
    public final hm8 D;
    public final mfb E;
    public final Drawable f;

    public uk3(Drawable drawable) {
        drawable.getClass();
        this.f = drawable;
        this.C = yae.z(0);
        this.D = yae.z(new dna(vk3.a(drawable)));
        this.E = new mfb(new t42(this, 13));
        if (drawable.getIntrinsicWidth() >= 0 && drawable.getIntrinsicHeight() >= 0) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
    }

    @Override // defpackage.bn9
    public final void a() {
        b();
    }

    @Override // defpackage.bn9
    public final void b() {
        Drawable drawable = this.f;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    @Override // defpackage.bn9
    public final void c() {
        Drawable drawable = this.f;
        drawable.setCallback((Drawable.Callback) this.E.getValue());
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // defpackage.vk8
    public final boolean d(float f) {
        this.f.setAlpha(dce.n(k27.A(f * 255.0f), 0, 255));
        return true;
    }

    @Override // defpackage.vk8
    public final boolean e(em1 em1Var) {
        ColorFilter colorFilter;
        if (em1Var != null) {
            colorFilter = em1Var.a;
        } else {
            colorFilter = null;
        }
        this.f.setColorFilter(colorFilter);
        return true;
    }

    @Override // defpackage.vk8
    public final void f(tc6 tc6Var) {
        int i;
        tc6Var.getClass();
        int ordinal = tc6Var.ordinal();
        if (ordinal != 0) {
            i = 1;
            if (ordinal != 1) {
                xk5.o();
                return;
            }
        } else {
            i = 0;
        }
        this.f.setLayoutDirection(i);
    }

    @Override // defpackage.vk8
    public final long h() {
        return ((dna) this.D.getValue()).a;
    }

    @Override // defpackage.vk8
    public final void i(ak3 ak3Var) {
        ak3Var.getClass();
        k61 w = ak3Var.Q0().w();
        ((Number) this.C.getValue()).intValue();
        try {
            w.i();
            int i = Build.VERSION.SDK_INT;
            Drawable drawable = this.f;
            if (i >= 28 && i < 31 && (drawable instanceof AnimatedImageDrawable)) {
                w.c(Float.intBitsToFloat((int) (ak3Var.b() >> 32)) / Float.intBitsToFloat((int) (h() >> 32)), Float.intBitsToFloat((int) (ak3Var.b() & 4294967295L)) / Float.intBitsToFloat((int) (h() & 4294967295L)));
            } else {
                drawable.setBounds(0, 0, k27.A(Float.intBitsToFloat((int) (ak3Var.b() >> 32))), k27.A(Float.intBitsToFloat((int) (ak3Var.b() & 4294967295L))));
            }
            Canvas canvas = tf.a;
            drawable.draw(((sf) w).a);
            w.q();
        } catch (Throwable th) {
            w.q();
            throw th;
        }
    }
}
