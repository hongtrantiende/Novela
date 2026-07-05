package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uw1  reason: default package */
/* loaded from: classes.dex */
public final class uw1 implements ComponentCallbacks2, ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ vw1 a;

    public uw1(vw1 vw1Var) {
        this.a = vw1Var;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.a.e(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        vw1 vw1Var = this.a;
        vw1Var.g.a.clear();
        yq9 yq9Var = vw1Var.h;
        synchronized (yq9Var) {
            yq9Var.a.c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        vw1 vw1Var = this.a;
        vw1Var.g.a.clear();
        yq9 yq9Var = vw1Var.h;
        synchronized (yq9Var) {
            yq9Var.a.c();
        }
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        this.a.t.c.setValue(Boolean.valueOf(z));
    }
}
