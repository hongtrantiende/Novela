package defpackage;

import android.view.Window;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vjd  reason: default package */
/* loaded from: classes.dex */
public final class vjd extends ujd {
    @Override // defpackage.kwe
    public final boolean J() {
        if ((this.c.getDecorView().getSystemUiVisibility() & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.kwe
    public final void N(boolean z) {
        if (z) {
            Window window = this.c;
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            S(16);
            return;
        }
        T(16);
    }
}
