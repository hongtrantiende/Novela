package defpackage;

import java.io.IOException;
import java.io.InputStream;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n0e  reason: default package */
/* loaded from: classes.dex */
public final class n0e implements f2e {
    public final o0e a;

    static {
        h0e h0eVar = h0e.a;
        int i = kzd.a;
    }

    public n0e(o0e o0eVar) {
        this.a = o0eVar;
    }

    public final o0e a(InputStream inputStream, h0e h0eVar) {
        dcc n = dcc.n(inputStream, 4096);
        int i = o0e.zzd;
        o0e i2 = this.a.i();
        try {
            m2e a = i2e.c.a(i2.getClass());
            vh1 vh1Var = (vh1) n.c;
            if (vh1Var == null) {
                vh1Var = new vh1(n);
            }
            a.f(i2, vh1Var, h0eVar);
            a.c(i2);
            n.s(0);
            if (o0e.q(i2, true)) {
                return i2;
            }
            throw new s2e().a();
        } catch (i1e e) {
            if (e.a) {
                throw new IOException(e.getMessage(), e);
            }
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof i1e) {
                throw ((i1e) e2.getCause());
            }
            throw new IOException(e2.getMessage(), e2);
        } catch (s2e e3) {
            throw e3.a();
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof i1e) {
                throw ((i1e) e4.getCause());
            }
            throw e4;
        }
    }
}
