package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: flb  reason: default package */
/* loaded from: classes.dex */
public final class flb implements xs {
    public static final flb b = new flb(null);
    public final String a;

    public /* synthetic */ flb(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof flb)) {
            return false;
        }
        return hud.l(this.a, ((flb) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}
