package defpackage;

import java.io.IOException;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o2f  reason: default package */
/* loaded from: classes.dex */
public final class o2f {
    public static final o2f c = new o2f(f2f.b, b2f.A());
    public final f2f a;
    public final b2f b;

    public o2f(f2f f2fVar, b2f b2fVar) {
        f2fVar.getClass();
        this.a = f2fVar;
        this.b = b2fVar;
    }

    public static o2f a(dcc dccVar, boolean z) {
        f2f a;
        int min;
        int I = dccVar.I();
        if (I <= 1) {
            dccVar.I();
            int g = dccVar.g(dccVar.G());
            h0e h0eVar = h0e.a;
            int i = kzd.a;
            b2f z2 = b2f.z(dccVar, h0e.b);
            dccVar.h(g);
            d2f d2fVar = new d2f();
            Inflater inflater = d2fVar.a;
            try {
                if (z) {
                    int g2 = dccVar.g(dccVar.G());
                    int i2 = dccVar.i();
                    if (i2 < 0) {
                        min = 4096;
                    } else {
                        min = Math.min(i2, 4096);
                    }
                    a = f2f.a(dcc.n(new InflaterInputStream(new ln0(d2fVar, dccVar), inflater, min), 4096));
                    inflater.reset();
                    if (dccVar.i() == 0) {
                        dccVar.h(g2);
                    } else {
                        throw new IOException("Unexpected bytes remaining after FlagsBlob parsing.");
                    }
                } else {
                    inflater.setInput(dccVar.F());
                    a = f2f.a(dcc.n(new ln0(d2fVar, 4), 4096));
                    inflater.reset();
                }
                d2fVar.close();
                return new o2f(a, z2);
            } catch (Throwable th) {
                try {
                    d2fVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(I).length() + 44);
        sb.append("Unsupported version: ");
        sb.append(I);
        sb.append(". Current version is: 1");
        throw new IOException(sb.toString());
    }
}
