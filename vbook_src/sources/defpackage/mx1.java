package defpackage;

import android.graphics.ComposeShader;
import android.graphics.Shader;
import android.os.Build;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mx1  reason: default package */
/* loaded from: classes.dex */
public final class mx1 extends jea {
    public final jea c;
    public final jea d;

    public mx1(jea jeaVar, jea jeaVar2) {
        this.c = jeaVar;
        this.d = jeaVar2;
    }

    @Override // defpackage.jea
    public final Shader c(long j) {
        Shader c = this.c.c(j);
        Shader c2 = this.d.c(j);
        if (Build.VERSION.SDK_INT >= 29) {
            return dm.b(c, c2, ff.D(5));
        }
        return new ComposeShader(c, c2, ff.F(5));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mx1) {
            mx1 mx1Var = (mx1) obj;
            if (this.c.equals(mx1Var.c) && this.d.equals(mx1Var.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.d.hashCode();
        return Integer.hashCode(5) + ((hashCode + (this.c.hashCode() * 31)) * 31);
    }

    public final String toString() {
        String a = vl0.a(5);
        StringBuilder sb = new StringBuilder("CompositeShaderBrush(dstBrush=");
        sb.append(this.c);
        sb.append(", srcBrush=");
        sb.append(this.d);
        sb.append(", blendMode=");
        return s21.q(sb, a, ")");
    }
}
