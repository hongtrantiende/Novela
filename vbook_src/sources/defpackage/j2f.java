package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j2f  reason: default package */
/* loaded from: classes.dex */
public final class j2f {
    public final String a;
    public final String b;
    public final boolean c;

    public j2f(String str, boolean z) {
        am8.p(str);
        this.a = str;
        am8.p("com.google.android.gms");
        this.b = "com.google.android.gms";
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2f)) {
            return false;
        }
        j2f j2fVar = (j2f) obj;
        if (hud.l(this.a, j2fVar.a) && hud.l(this.b, j2fVar.b) && hud.l(null, null) && this.c == j2fVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, 4225, Boolean.valueOf(this.c)});
    }

    public final String toString() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        am8.s(null);
        throw null;
    }
}
