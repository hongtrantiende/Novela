package defpackage;

import android.os.SystemClock;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yje  reason: default package */
/* loaded from: classes.dex */
public abstract class yje implements Runnable {
    public final long a;
    public final long b;
    public final boolean c;
    public final /* synthetic */ qke d;

    public yje(qke qkeVar, boolean z) {
        Objects.requireNonNull(qkeVar);
        this.d = qkeVar;
        this.a = System.currentTimeMillis();
        this.b = SystemClock.elapsedRealtime();
        this.c = z;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        qke qkeVar = this.d;
        if (qkeVar.e) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e) {
            qkeVar.b(e, false, this.c);
            b();
        }
    }

    public void b() {
    }
}
