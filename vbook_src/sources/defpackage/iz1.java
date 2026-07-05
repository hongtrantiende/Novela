package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: iz1  reason: default package */
/* loaded from: classes.dex */
public final class iz1 implements fz1 {
    public final o19 a;
    public final o19 b;
    public final ThreadLocal c;
    public final AtomicBoolean d;
    public final long e;

    public iz1(final s6f s6fVar, final String str, int i) {
        str.getClass();
        this.c = new ThreadLocal();
        this.d = new AtomicBoolean(false);
        hq7 hq7Var = wl3.b;
        this.e = jue.O(30, am3.SECONDS);
        if (i > 0) {
            this.a = new o19(i, new vt4() { // from class: gz1
                @Override // defpackage.vt4
                public final Object invoke() {
                    int i2 = r3;
                    String str2 = str;
                    s6f s6fVar2 = s6fVar;
                    switch (i2) {
                        case 0:
                            cw9 o = s6fVar2.o(str2);
                            oue.C(o, "PRAGMA query_only = 1");
                            return o;
                        default:
                            return s6fVar2.o(str2);
                    }
                }
            });
            this.b = new o19(1, new vt4() { // from class: gz1
                @Override // defpackage.vt4
                public final Object invoke() {
                    int i2 = r3;
                    String str2 = str;
                    s6f s6fVar2 = s6fVar;
                    switch (i2) {
                        case 0:
                            cw9 o = s6fVar2.o(str2);
                            oue.C(o, "PRAGMA query_only = 1");
                            return o;
                        default:
                            return s6fVar2.o(str2);
                    }
                }
            });
            return;
        }
        vs.m("Maximum number of readers must be greater than 0");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01cb A[Catch: all -> 0x015f, TryCatch #9 {all -> 0x015f, blocks: (B:71:0x013c, B:73:0x0142, B:78:0x015b, B:82:0x0165, B:86:0x016f, B:97:0x01c2, B:98:0x01c9, B:99:0x01ca, B:100:0x01cb, B:101:0x01ce), top: B:140:0x013c }] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0142 A[Catch: all -> 0x015f, TryCatch #9 {all -> 0x015f, blocks: (B:71:0x013c, B:73:0x0142, B:78:0x015b, B:82:0x0165, B:86:0x016f, B:97:0x01c2, B:98:0x01c9, B:99:0x01ca, B:100:0x01cb, B:101:0x01ce), top: B:140:0x013c }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a9 A[Catch: all -> 0x01c1, TRY_LEAVE, TryCatch #0 {all -> 0x01c1, blocks: (B:90:0x01a3, B:92:0x01a9, B:94:0x01b3, B:95:0x01b8), top: B:122:0x01a3 }] */
    /* JADX WARN: Type inference failed for: r10v1, types: [zl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v0, types: [zl9, java.lang.Object] */
    @Override // defpackage.fz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N(boolean r18, defpackage.lu4 r19, defpackage.n42 r20) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iz1.N(boolean, lu4, n42):java.lang.Object");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.d.compareAndSet(false, true)) {
            this.a.b();
            this.b.b();
        }
    }

    public final void o(boolean z) {
        String str;
        if (z) {
            str = "reader";
        } else {
            str = "writer";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Timed out attempting to acquire a " + str + " connection.");
        sb.append("\n\nWriter pool:\n");
        this.b.c(sb);
        sb.append("Reader pool:");
        sb.append('\n');
        this.a.c(sb);
        oue.K(5, sb.toString());
        throw null;
    }

    public iz1(s6f s6fVar) {
        this.c = new ThreadLocal();
        this.d = new AtomicBoolean(false);
        hq7 hq7Var = wl3.b;
        this.e = jue.O(30, am3.SECONDS);
        o19 o19Var = new o19(1, new ve(s6fVar, 29));
        this.a = o19Var;
        this.b = o19Var;
    }
}
