package defpackage;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: saf  reason: default package */
/* loaded from: classes.dex */
public final class saf implements z8f {
    public boolean a;

    static {
        new AtomicInteger();
    }

    @Override // defpackage.z8f
    public final Object d(x8f x8fVar) {
        if (this.a) {
            if (x8fVar.b.isEmpty()) {
                return x8fVar.a.c(x8fVar.d);
            }
            throw new IOException("Short circuit would skip transforms.");
        }
        InputStream u = r1d.u(x8fVar);
        try {
            if (u instanceof w9f) {
                File zza = ((w9f) u).zza();
                if (u != null) {
                    u.close();
                }
                return zza;
            }
            throw new IOException("Not convertible and fallback to pipe is disabled.");
        } catch (Throwable th) {
            if (u != null) {
                try {
                    u.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
