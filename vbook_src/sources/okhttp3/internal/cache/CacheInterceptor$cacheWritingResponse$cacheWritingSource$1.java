package okhttp3.internal.cache;

import java.io.IOException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import okhttp3.internal._UtilJvmKt;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class CacheInterceptor$cacheWritingResponse$cacheWritingSource$1 implements osa {
    public boolean a;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        if (!this.a) {
            TimeZone timeZone = _UtilJvmKt.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                z = _UtilJvmKt.f(this, 100);
            } catch (IOException unused) {
                z = false;
            }
            if (!z) {
                this.a = true;
                throw null;
            }
        }
        throw null;
    }

    @Override // defpackage.osa
    public final long read(my0 my0Var, long j) {
        my0Var.getClass();
        throw null;
    }

    @Override // defpackage.osa
    public final dac timeout() {
        throw null;
    }
}
