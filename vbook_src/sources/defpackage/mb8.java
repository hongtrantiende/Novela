package defpackage;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mb8  reason: default package */
/* loaded from: classes.dex */
public abstract class mb8 extends e08 {
    public final OnBackInvokedDispatcher c;
    public final int d;
    public final OnBackInvokedCallback e;
    public boolean f;

    public mb8(OnBackInvokedDispatcher onBackInvokedDispatcher, int i) {
        OnBackInvokedCallback lb8Var;
        this.c = onBackInvokedDispatcher;
        this.d = i;
        if (Build.VERSION.SDK_INT == 33) {
            lb8Var = new OnBackInvokedCallback() { // from class: kb8
                public final void onBackInvoked() {
                    mb8.this.a();
                }
            };
        } else {
            lb8Var = new lb8(this);
        }
        this.e = lb8Var;
    }

    @Override // defpackage.e08
    public final void b(boolean z) {
        d(z);
    }

    @Override // defpackage.e08
    public final void c() {
        d(false);
    }

    public final void d(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback = this.e;
        if (z && !this.f) {
            this.c.registerOnBackInvokedCallback(this.d, onBackInvokedCallback);
            this.f = true;
        } else if (!z && this.f) {
            this.c.unregisterOnBackInvokedCallback(onBackInvokedCallback);
            this.f = false;
        }
    }
}
