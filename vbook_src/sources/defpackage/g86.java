package defpackage;

import android.view.KeyEvent;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g86  reason: default package */
/* loaded from: classes.dex */
public final class g86 {
    public final KeyEvent a;

    public final boolean equals(Object obj) {
        if (obj instanceof g86) {
            if (!c16.i(this.a, ((g86) obj).a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.a + ")";
    }
}
