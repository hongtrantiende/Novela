package defpackage;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l1b  reason: default package */
/* loaded from: classes3.dex */
public final class l1b extends RequestBody {
    public final Long b;
    public final vt4 c;

    public l1b(d82 d82Var, Long l, vt4 vt4Var) {
        d82Var.getClass();
        this.b = l;
        this.c = vt4Var;
    }

    @Override // okhttp3.RequestBody
    public final long a() {
        Long l = this.b;
        if (l != null) {
            return l.longValue();
        }
        return -1L;
    }

    @Override // okhttp3.RequestBody
    public final MediaType b() {
        return null;
    }

    @Override // okhttp3.RequestBody
    public final boolean c() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5 */
    @Override // okhttp3.RequestBody
    public final void e(az0 az0Var) {
        Throwable th;
        az0Var.getClass();
        try {
            s11 s11Var = (s11) this.c.invoke();
            s11Var.getClass();
            qw5 K = tl1.K(new ln0(s11Var, 0));
            Long th2 = null;
            try {
                Long valueOf = Long.valueOf(az0Var.J(K));
                try {
                    K.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
                Long l = th2;
                th2 = valueOf;
                th = l;
            } catch (Throwable th4) {
                try {
                    K.close();
                    th = th4;
                } catch (Throwable th5) {
                    pye.e(th4, th5);
                    th = th4;
                }
            }
            if (th == null) {
                th2.getClass();
                return;
            }
            throw th;
        } catch (IOException e) {
            throw e;
        } catch (Throwable th6) {
            throw new IOException(th6);
        }
    }
}
