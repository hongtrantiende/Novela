package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jea  reason: default package */
/* loaded from: classes.dex */
public abstract class jea extends hy0 {
    public xk9 a;
    public long b = 9205357640488583168L;

    @Override // defpackage.hy0
    public final void a(float f, long j, ljc ljcVar) {
        Shader shader;
        xk9 xk9Var = this.a;
        Shader shader2 = null;
        if (xk9Var == null || !dna.a(this.b, j)) {
            if (dna.d(j)) {
                this.a = null;
                this.b = 9205357640488583168L;
                xk9Var = null;
            } else {
                xk9Var = this.a;
                if (xk9Var == null) {
                    xk9Var = new xk9(9);
                    this.a = xk9Var;
                }
                xk9Var.b = c(j);
                this.a = xk9Var;
                this.b = j;
            }
        }
        long g = ljcVar.g();
        long j2 = zl1.b;
        if (!zl1.c(g, j2)) {
            ljcVar.p(j2);
        }
        Shader shader3 = (Shader) ljcVar.c;
        if (xk9Var != null) {
            shader = (Shader) xk9Var.b;
        } else {
            shader = null;
        }
        if (!c16.i(shader3, shader)) {
            if (xk9Var != null) {
                shader2 = (Shader) xk9Var.b;
            }
            ljcVar.t(shader2);
        }
        if (((Paint) ljcVar.b).getAlpha() / 255.0f == f) {
            return;
        }
        ljcVar.n(f);
    }

    public abstract Shader c(long j);
}
