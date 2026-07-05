package okhttp3.internal.ws;

import java.io.Closeable;
import java.util.Random;
import okhttp3.internal._UtilCommonKt;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class WebSocketWriter implements Closeable {
    public final my0 C;
    public boolean D;
    public MessageDeflater E;
    public final byte[] F;
    public final ky0 G;
    public final az0 a;
    public final Random b;
    public final boolean c;
    public final boolean d;
    public final long e;
    public final my0 f;

    /* JADX WARN: Type inference failed for: r2v1, types: [my0, java.lang.Object] */
    public WebSocketWriter(az0 az0Var, Random random, boolean z, boolean z2, long j) {
        az0Var.getClass();
        this.a = az0Var;
        this.b = random;
        this.c = z;
        this.d = z2;
        this.e = j;
        this.f = new Object();
        this.C = az0Var.b();
        this.F = new byte[4];
        this.G = new ky0();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        MessageDeflater messageDeflater = this.E;
        if (messageDeflater != null) {
            _UtilCommonKt.b(messageDeflater);
        }
        _UtilCommonKt.b(this.a);
    }

    public final void o(int i, e31 e31Var) {
        if (!this.D) {
            int e = e31Var.e();
            if (e <= 125) {
                int i2 = i | Token.CASE;
                my0 my0Var = this.C;
                my0Var.k1(i2);
                my0Var.k1(e | Token.CASE);
                byte[] bArr = this.F;
                bArr.getClass();
                this.b.nextBytes(bArr);
                my0Var.write(bArr, 0, bArr.length);
                if (e > 0) {
                    long j = my0Var.b;
                    my0Var.g1(e31Var);
                    ky0 ky0Var = this.G;
                    ky0Var.getClass();
                    my0Var.m0(ky0Var);
                    ky0Var.G(j);
                    WebSocketProtocol.b(ky0Var, bArr);
                    ky0Var.close();
                }
                this.a.flush();
                return;
            }
            vs.m("Payload size must be less than or equal to 125");
            return;
        }
        fb4.k("closed");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(int r22, defpackage.e31 r23) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.ws.WebSocketWriter.q(int, e31):void");
    }
}
