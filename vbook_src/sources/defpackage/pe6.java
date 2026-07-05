package defpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.logging.Logger;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pe6  reason: default package */
/* loaded from: classes.dex */
public final class pe6 implements w9a {
    public static final pe6 a = new Object();
    public static final ie6 b;

    /* JADX WARN: Type inference failed for: r0v0, types: [pe6, java.lang.Object] */
    static {
        ie6 n = ie6.n();
        n.getClass();
        b = n;
    }

    @Override // defpackage.w9a
    public final Object b() {
        return b;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [fz4, java.lang.Object] */
    @Override // defpackage.w9a
    public final void c(Object obj, kj9 kj9Var) {
        ie6 ie6Var = (ie6) obj;
        ie6Var.getClass();
        int a2 = ie6Var.a(null);
        Logger logger = el1.f;
        if (a2 > 4096) {
            a2 = 4096;
        }
        el1 el1Var = new el1(kj9Var, a2);
        w89 w89Var = w89.c;
        w89Var.getClass();
        h0a a3 = w89Var.a(ie6Var.getClass());
        fz4 fz4Var = el1Var.a;
        fz4 fz4Var2 = fz4Var;
        if (fz4Var == null) {
            ?? obj2 = new Object();
            Charset charset = uz5.a;
            obj2.a = el1Var;
            el1Var.a = obj2;
            fz4Var2 = obj2;
        }
        a3.g(ie6Var, fz4Var2);
        if (el1Var.d > 0) {
            el1Var.k();
        }
    }

    @Override // defpackage.w9a
    public final Object h(FileInputStream fileInputStream) {
        try {
            return ie6.q(fileInputStream);
        } catch (o16 e) {
            throw new IOException("Cannot read proto.", e);
        }
    }
}
