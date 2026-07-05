package okhttp3.internal.publicsuffix;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public abstract class BasePublicSuffixList implements PublicSuffixList {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final CountDownLatch b = new CountDownLatch(1);
    public e31 c;
    public e31 d;
    public IOException e;

    public final e31 a() {
        e31 e31Var = this.c;
        if (e31Var != null) {
            return e31Var;
        }
        c16.w("bytes");
        throw null;
    }

    public abstract osa b();

    public final void c() {
        try {
            mj9 q = tl1.q(b());
            e31 B = q.B(q.readInt());
            e31 B2 = q.B(q.readInt());
            q.close();
            synchronized (this) {
                B.getClass();
                this.c = B;
                B2.getClass();
                this.d = B2;
            }
        } finally {
            this.b.countDown();
        }
    }
}
