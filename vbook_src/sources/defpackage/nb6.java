package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nb6  reason: default package */
/* loaded from: classes.dex */
public final class nb6 {
    public final Float a;

    public /* synthetic */ nb6(Float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if ((obj instanceof nb6) && hud.l(((nb6) obj).a, this.a) && hud.l(null, null)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, null});
    }
}
