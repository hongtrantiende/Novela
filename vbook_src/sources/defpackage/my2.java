package defpackage;

import java.nio.charset.Charset;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: my2  reason: default package */
/* loaded from: classes3.dex */
public final class my2 extends nf8 {
    public final /* synthetic */ int a = 0;
    public final long b;
    public final e32 c;
    public final Object d;

    public my2(tl8 tl8Var) {
        tl8Var.getClass();
        String u = kve.u(tl8Var);
        Charset charset = ed1.a;
        byte[] t = fre.t(u, charset);
        this.d = t;
        this.b = t.length;
        e32 e32Var = a32.d;
        Set set = h32.a;
        e32Var.getClass();
        charset.getClass();
        String name = charset.name();
        name.getClass();
        this.c = e32Var.c(name);
    }

    @Override // defpackage.rf8
    public final Long a() {
        int i = this.a;
        long j = this.b;
        switch (i) {
            case 0:
                return Long.valueOf(j);
            default:
                return Long.valueOf(j);
        }
    }

    @Override // defpackage.rf8
    public final e32 b() {
        switch (this.a) {
            case 0:
                return this.c;
            default:
                return this.c;
        }
    }

    @Override // defpackage.nf8
    public final byte[] e() {
        switch (this.a) {
            case 0:
                return (byte[]) this.d;
            default:
                return (byte[]) this.d;
        }
    }

    public my2(e32 e32Var, Object obj) {
        this.d = obj;
        if (e32Var == null) {
            e32 e32Var2 = a32.a;
            e32Var = a32.b;
        }
        this.c = e32Var;
        this.b = ((byte[]) obj).length;
    }
}
