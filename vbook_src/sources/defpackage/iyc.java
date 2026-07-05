package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: iyc  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class iyc implements Runnable {
    public final /* synthetic */ tc0 a;
    public final /* synthetic */ ld0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ iyc(tc0 tc0Var, ld0 ld0Var, int i, Runnable runnable) {
        this.a = tc0Var;
        this.b = ld0Var;
        this.c = i;
        this.d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ld0 ld0Var = this.b;
        int i = this.c;
        Runnable runnable = this.d;
        tc0 tc0Var = this.a;
        hw9 hw9Var = (hw9) tc0Var.f;
        try {
            try {
                hw9 hw9Var2 = (hw9) tc0Var.c;
                Objects.requireNonNull(hw9Var2);
                hw9Var.S(new jyc(hw9Var2, 1));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) tc0Var.a).getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    tc0Var.c(ld0Var, i);
                } else {
                    hw9Var.S(new zz3(tc0Var, ld0Var, i));
                }
                runnable.run();
            } catch (kfb unused) {
                ((zg4) tc0Var.d).i0(ld0Var, i + 1, false);
                runnable.run();
            }
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }
}
