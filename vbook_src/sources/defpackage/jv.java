package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jv  reason: default package */
/* loaded from: classes.dex */
public final class jv {
    public final int a;
    public final s6f b;
    public final xs c;
    public final String d;

    public jv(s6f s6fVar, xs xsVar, String str) {
        this.b = s6fVar;
        this.c = xsVar;
        this.d = str;
        this.a = Arrays.hashCode(new Object[]{s6fVar, xsVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jv)) {
            return false;
        }
        jv jvVar = (jv) obj;
        if (!hud.l(this.b, jvVar.b) || !hud.l(this.c, jvVar.c) || !hud.l(this.d, jvVar.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }
}
