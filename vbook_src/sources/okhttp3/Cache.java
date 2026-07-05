package okhttp3;

import java.io.Closeable;
import java.io.Flushable;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.platform.Platform;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class Cache implements Closeable, Flushable {

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class CacheResponseBody extends ResponseBody {

        /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
        /* renamed from: okhttp3.Cache$CacheResponseBody$1  reason: invalid class name */
        /* loaded from: classes3.dex */
        public final class AnonymousClass1 extends jr4 {
            @Override // defpackage.jr4, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                throw null;
            }
        }

        @Override // okhttp3.ResponseBody
        public final long o() {
            return -1L;
        }

        @Override // okhttp3.ResponseBody
        public final MediaType q() {
            return null;
        }

        @Override // okhttp3.ResponseBody
        public final bz0 v() {
            return null;
        }
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class Entry {

        /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
        /* loaded from: classes3.dex */
        public static final class Companion {
        }

        static {
            Platform platform = Platform.a;
            Platform.a.getClass();
            Platform.a.getClass();
        }
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public final class RealCacheRequest implements CacheRequest {

        /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
        /* renamed from: okhttp3.Cache$RealCacheRequest$1  reason: invalid class name */
        /* loaded from: classes3.dex */
        public final class AnonymousClass1 extends ir4 {
            @Override // defpackage.ir4, defpackage.yma, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                throw null;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // java.io.Flushable
    public final void flush() {
        throw null;
    }
}
