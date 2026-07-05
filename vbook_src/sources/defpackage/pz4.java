package defpackage;

import android.graphics.Canvas;
import android.widget.EdgeEffect;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pz4  reason: default package */
/* loaded from: classes.dex */
public final class pz4 extends m03 implements zj3 {
    public final wi M;
    public final sn3 N;
    public final rh8 O;

    public pz4(hab habVar, wi wiVar, sn3 sn3Var, rh8 rh8Var) {
        this.M = wiVar;
        this.N = sn3Var;
        this.O = rh8Var;
        H1(habVar);
    }

    public static boolean K1(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    @Override // defpackage.zj3
    public final void V0(qd6 qd6Var) {
        boolean z;
        char c;
        long j;
        n61 n61Var = qd6Var.a;
        long b = n61Var.b();
        wi wiVar = this.M;
        wiVar.j(b);
        if (dna.d(n61Var.b())) {
            qd6Var.a();
            return;
        }
        qd6Var.a();
        wiVar.d.getValue();
        Canvas a = tf.a(n61Var.b.w());
        sn3 sn3Var = this.N;
        boolean f = sn3.f(sn3Var.f);
        rh8 rh8Var = this.O;
        boolean z2 = false;
        if (f) {
            EdgeEffect c2 = sn3Var.c();
            float L0 = qd6Var.L0(rh8Var.b(qd6Var.getLayoutDirection()));
            z = K1(270.0f, (Float.floatToRawIntBits(L0) & 4294967295L) | (Float.floatToRawIntBits(-Float.intBitsToFloat((int) (n61Var.b() & 4294967295L))) << 32), c2, a);
        } else {
            z = false;
        }
        if (sn3.f(sn3Var.d)) {
            c = ' ';
            j = 4294967295L;
            if (!K1(nae.e, (Float.floatToRawIntBits(nae.e) << 32) | (Float.floatToRawIntBits(qd6Var.L0(rh8Var.d())) & 4294967295L), sn3Var.e(), a) && !z) {
                z = false;
            } else {
                z = true;
            }
        } else {
            c = ' ';
            j = 4294967295L;
        }
        if (sn3.f(sn3Var.g)) {
            EdgeEffect d = sn3Var.d();
            int A = k27.A(Float.intBitsToFloat((int) (n61Var.b() >> c)));
            if (!K1(90.0f, (Float.floatToRawIntBits(qd6Var.L0(rh8Var.c(qd6Var.getLayoutDirection())) + (-A)) & j) | (Float.floatToRawIntBits(nae.e) << c), d, a) && !z) {
                z = false;
            } else {
                z = true;
            }
        }
        if (sn3.f(sn3Var.e)) {
            if (K1(180.0f, (Float.floatToRawIntBits(-Float.intBitsToFloat((int) (n61Var.b() >> c))) << c) | (Float.floatToRawIntBits((-Float.intBitsToFloat((int) (n61Var.b() & j))) + qd6Var.L0(rh8Var.a())) & j), sn3Var.b(), a) || z) {
                z2 = true;
            }
            z = z2;
        }
        if (z) {
            wiVar.d();
        }
    }
}
