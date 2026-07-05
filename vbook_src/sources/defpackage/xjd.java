package defpackage;

import android.view.WindowInsetsController;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xjd  reason: default package */
/* loaded from: classes.dex */
public final class xjd extends wjd {
    @Override // defpackage.wjd, defpackage.kwe
    public final int F() {
        return this.c.getSystemBarsBehavior();
    }

    @Override // defpackage.wjd, defpackage.kwe
    public final boolean J() {
        if ((this.c.getSystemBarsAppearance() & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.wjd, defpackage.kwe
    public final boolean K() {
        if ((this.c.getSystemBarsAppearance() & 8) != 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.wjd, defpackage.kwe
    public final void N(boolean z) {
        int i;
        WindowInsetsController windowInsetsController = this.c;
        if (z) {
            i = 16;
        } else {
            i = 0;
        }
        windowInsetsController.setSystemBarsAppearance(i, 16);
    }

    @Override // defpackage.wjd, defpackage.kwe
    public final void O(boolean z) {
        int i;
        WindowInsetsController windowInsetsController = this.c;
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        windowInsetsController.setSystemBarsAppearance(i, 8);
    }

    @Override // defpackage.wjd, defpackage.kwe
    public final void P(int i) {
        this.c.setSystemBarsBehavior(i);
    }
}
