package defpackage;

import android.content.Context;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j9b  reason: default package */
/* loaded from: classes.dex */
public final class j9b {
    public boolean a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;

    public j9b(Context context, Looper looper, xfb xfbVar) {
        this.c = new rwa(context.getApplicationContext(), 8);
        this.d = xfbVar.a(looper, null);
        this.e = xfbVar.a(Looper.getMainLooper(), null);
    }

    public void a(final boolean z, final boolean z2) {
        ggb ggbVar = (ggb) this.d;
        if (z && z2) {
            ggbVar.d(new Runnable() { // from class: cfd
                @Override // java.lang.Runnable
                public final void run() {
                    rwa.c((rwa) j9b.this.c, z, z2);
                }
            });
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        ((ggb) this.e).a.postDelayed(new v9d(2, this, atomicBoolean), 1000L);
        ggbVar.d(new Runnable() { // from class: dfd
            @Override // java.lang.Runnable
            public final void run() {
                atomicBoolean.set(false);
                rwa.c((rwa) j9b.this.c, z, z2);
            }
        });
    }

    public void b(boolean z) {
        if (this.b != z) {
            this.b = z;
            if (this.a) {
                a(true, z);
            }
        }
    }

    public j9b(Context context, String str, ny0 ny0Var, boolean z, boolean z2) {
        context.getClass();
        ny0Var.getClass();
        this.c = context;
        this.d = str;
        this.e = ny0Var;
        this.a = z;
        this.b = z2;
    }
}
